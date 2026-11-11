#!/usr/bin/env python3
"""Deterministic typed models and operation facade from the pinned local contract snapshot."""
import json,pathlib,re,hashlib,shutil
ROOT=pathlib.Path(__file__).resolve().parents[1]
OUT=ROOT/'src/main/java/com/webmania/sdk'
RES=ROOT/'src/main/resources/contracts'
KEYWORDS={'abstract','assert','boolean','break','byte','case','catch','char','class','const','continue','default','do','double','else','enum','extends','final','finally','float','for','goto','if','implements','import','instanceof','int','interface','long','native','new','package','private','protected','public','return','short','static','strictfp','super','switch','synchronized','this','throw','throws','transient','try','void','volatile','while','record','var','yield','null','true','false'}
def upper(n):
 x=''.join(p[:1].upper()+p[1:] for p in re.split('[^A-Za-z0-9]+',n) if p)
 return ('N'+x if x[:1].isdigit() else x) or 'Value'
def field(n):
 x=re.sub('[^A-Za-z0-9_]','_',n)
 if x[:1].isdigit() or x in KEYWORDS:x='value_'+x
 return x
shutil.rmtree(OUT/'model',ignore_errors=True)
operations=[];catalog=[];model_count=0;component_count=0
for path in json.loads((RES/'manifest.json').read_text())['contracts']:
 rel=path.removeprefix('contracts/');d=json.loads((RES/rel).read_text());pkg='model.'+re.sub('[^a-z0-9]','',rel.removesuffix('.openapi.json'))
 dest=OUT/pkg.replace('.','/');dest.mkdir(parents=True,exist_ok=True)
 schemas=d['components']['schemas'];component_count+=len(schemas);pending=dict(schemas);done={}
 def resolve(s):
  return schemas[s['$ref'].split('/')[-1]] if '$ref' in s else s
 def properties(s,seen=()):
  if '$ref' in s:
   name=s['$ref'].split('/')[-1]
   if name in seen:return {}
   return properties(schemas[name],seen+(name,))
  p={}
  for kind in ['allOf','anyOf','oneOf']:
   for sub in s.get(kind,[]):p.update(properties(sub,seen))
  p.update(s.get('properties',{}));return p
 def is_object(s):
  if '$ref' in s:return is_object(resolve(s))
  return s.get('type')=='object' or 'properties' in s or any(is_object(x) for x in s.get('allOf',[]))
 def register(name,s):
  name=upper(name)
  if name not in pending:pending[name]=s
  elif pending[name]!=s:
   name=name+hashlib.sha256(json.dumps(s,sort_keys=True).encode()).hexdigest()[:8]
   pending[name]=s
  return name
 def typ(s,name):
  if '$ref' in s:return upper(s['$ref'].split('/')[-1])
  if is_object(s):return register(name,s)
  if 'anyOf' in s or 'oneOf' in s or isinstance(s.get('type'),list):return register(name,s)
  if s.get('type')=='array':return 'java.util.List<'+typ(s.get('items',{}),name+'Item')+'>'
  return {'string':'String','integer':'java.math.BigInteger','number':'java.math.BigDecimal','boolean':'Boolean'}.get(s.get('type'),'JsonValue')
 def read(t,expr):
  if t.startswith('java.util.List<'):
   it=t[len('java.util.List<'):-1];return 'list('+expr+', v -> '+read(it,'v')+')'
  if t in ['String','java.math.BigInteger','java.math.BigDecimal','Boolean']:
   fn={'String':'stringValue','java.math.BigInteger':'integerValue','java.math.BigDecimal':'decimalValue','Boolean':'booleanValue'}[t]
   return fn+'('+expr+')'
  return '('+expr+').isNull() || ('+expr+').isMissingNode() ? null : new '+t+'('+expr+')'
 def write(t,expr):
  if t.startswith('java.util.List<'):
   it=t[len('java.util.List<'):-1];return 'array('+expr+', v -> '+write(it,'v')+')'
  if t in ['String','java.math.BigInteger','java.math.BigDecimal','Boolean']:return 'Json.scalar('+expr+')'
  return expr+' == null ? null : '+expr+'.toJson()'
 # Prepare operation signatures; each request includes strongly typed body and typed path/query fields.
 for route,ms in d['paths'].items():
  for method,op in ms.items():
   if method not in ['get','post','put','delete','patch']:continue
   oid=op['operationId'];reqname=upper(oid)+('Parameters' if upper(oid)+'Request' in schemas else 'Request');reqprops={x['name']:x.get('schema',{}) for x in op.get('parameters',[])}
   bs=op.get('requestBody',{}).get('content',{}).get('application/json',{}).get('schema')
   if bs is not None:reqprops['body']=bs
   reqname=register(reqname,{'type':'object','properties':reqprops})
   content=op.get('responses',{}).get('200',op.get('responses',{}).get('201',{})).get('content',{})
   # Use the first explicit 2xx response if the contract does not have200/201.
   if not content:
    for code,response in op.get('responses',{}).items():
     if code.startswith('2'):content=response.get('content',{});break
   binary=any(k!='application/json' for k in content)
   rs=content.get('application/json',{}).get('schema',{})
   rt='Download' if binary else typ(rs,upper(oid)+'Response')
   if rt not in ['Download','String','java.math.BigInteger','java.math.BigDecimal','Boolean','JsonValue'] and not rt.startswith('java.util.List<'):pass
   operations.append({'id':oid,'module':rel,'method':method.upper(),'path':route,'origin':d['servers'][0]['url'],'request':reqname,'package':pkg,'response':rt,'binary':binary,'enabled':op.get('x-sdk-generation-enabled',True),'security':op.get('security',d.get('security',[]))})
 # Process every component and every discovered inline object/union.
 while len(done)<len(pending):
  name=next(n for n in pending if n not in done);s=pending[name];done[name]=s;p=properties(s)
  obj=is_object(s);p=p if obj else {};base='JsonModel' if obj else 'JsonValue'
  lines=['package com.webmania.sdk.'+pkg+';','import com.webmania.sdk.*;','import com.fasterxml.jackson.databind.JsonNode;','/** Generated from '+rel+'; see contract-provenance.json. */','public final class '+name+' extends '+base+' {']
  if obj:
   keys=', '.join(json.dumps(k) for k in p)
   lines += [' private static final java.util.Set<String> FIELDS = java.util.Set.of('+keys+');',' public '+name+'() { super(FIELDS); }',' public '+name+'(JsonNode node) { super(node, FIELDS); }']
   used=set()
   for k,sub in p.items():
    mn=upper(k)
    if mn in used:mn+=hashlib.sha256(k.encode()).hexdigest()[:6]
    used.add(mn);t=typ(sub,name+mn)
    lines += [' public '+t+' get'+mn+'() { return '+read(t,'field('+json.dumps(k)+')')+'; }',' public '+name+' set'+mn+'('+t+' value) { put('+json.dumps(k)+', '+write(t,'value')+'); return this; }']
   if isinstance(s.get('additionalProperties'),dict):
    entry=typ(s['additionalProperties'],name+'Entry')
    lines+=[' public '+entry+' getEntry(String key) { return '+read(entry,'field(key)')+'; }',' public '+name+' setEntry(String key, '+entry+' value) { if(FIELDS.contains(key)) throw new IllegalArgumentException("Use typed field"); put(key, '+write(entry,'value')+'); return this; }']
  else:
   literal=json.dumps(s,separators=(',',':'),ensure_ascii=True)
   chunks=[json.dumps(literal[i:i+12000]) for i in range(0,len(literal),12000)]
   expression=chunks[0] if len(chunks)==1 else 'String.join("", '+', '.join(chunks)+')'
   lines += [' private static final JsonNode SCHEMA = Json.parse('+expression+');',' public '+name+'(JsonNode node) { super(node); }']
   variants=s.get('anyOf',s.get('oneOf'))
   keyword='anyOf' if 'anyOf' in s else 'oneOf' if 'oneOf' in s else None
   if variants is None:
    types=s.get('type',[]);types=types if isinstance(types,list) else [types]
    variants=[dict(s,type=t) for t in types] if types else [{}]
   for idx,variant in enumerate(variants):
    # A union alternative may itself contain a typed object, array or scalar.
    t=typ(variant,name+'Variant'+str(idx))
    if t==name:continue
    if keyword:fragment='SCHEMA.path('+json.dumps(keyword)+').path('+str(idx)+')'
    else:
     literal=json.dumps(variant,separators=(',',':'),ensure_ascii=True);chunks=[json.dumps(literal[i:i+12000]) for i in range(0,len(literal),12000)]
     fragment='Json.parse('+(chunks[0] if len(chunks)==1 else 'String.join("", '+', '.join(chunks)+')')+')'
    lines+=[' private static final JsonNode VARIANT_'+str(idx)+' = '+fragment+';',' public static '+name+' ofVariant'+str(idx)+'('+t+' value) { return new '+name+'('+write(t,'value')+'); }',' public boolean matchesVariant'+str(idx)+'() { return matchesVariant('+json.dumps(rel)+', SCHEMA, VARIANT_'+str(idx)+'); }',' public '+t+' asVariant'+str(idx)+'() { JsonNode value = checkedVariant('+json.dumps(rel)+', SCHEMA, VARIANT_'+str(idx)+'); return '+read(t,'value')+'; }']
  lines+=['}'];(dest/(name+'.java')).write_text('\n'.join(lines)+'\n');model_count+=1
  catalog.append({'module':rel,'schema':name,'class':'com.webmania.sdk.'+pkg+'.'+name,'generated_fields':list(p)})
# Facade lives in the SDK package; imports are always qualified because modules deliberately preserve alias names.
lines=['package com.webmania.sdk;','import java.util.concurrent.CompletableFuture;','/** Generated operation facade; synchronous and cancellable asynchronous calls share one transport. */','public final class WebmaniaClient extends ClientCore {',' public WebmaniaClient(ClientConfig config, Credentials credentials) { super(config, credentials); }']
for o in operations:
 qual='com.webmania.sdk.'+o['package']+'.';req=qual+o['request'];rt=o['response'];fullrt=rt
 if rt not in ['Download','String','java.math.BigInteger','java.math.BigDecimal','Boolean','JsonValue']:
  if rt.startswith('java.util.List<'):
   it=rt[len('java.util.List<'):-1];fullrt='java.util.List<'+(it if it.startswith('java.') or it in ['String','Boolean','JsonValue'] else qual+it)+'>'
  else:fullrt=qual+rt
 if o['binary']:factory='Download::new'
 elif rt.startswith('java.util.List<'):
  it=fullrt[len('java.util.List<'):-1]
  factory='node -> JsonValue.list(node, v -> new '+it+'(v))' if it not in ['String','Boolean'] and not it.startswith('java.math.') else 'node -> JsonValue.list(node, v -> JsonValue.'+{'String':'stringValue','Boolean':'booleanValue','java.math.BigInteger':'integerValue','java.math.BigDecimal':'decimalValue'}[it]+'(v))'
 elif rt=='JsonValue':factory='JsonValue::new'
 elif rt in ['String','Boolean','java.math.BigInteger','java.math.BigDecimal']:
  factory='node -> JsonValue.'+{'String':'stringValue','Boolean':'booleanValue','java.math.BigInteger':'integerValue','java.math.BigDecimal':'decimalValue'}[rt]+'(node)'
 else:factory=fullrt+'::new'
 if o['binary']:call='downloadAsync('+json.dumps(o['id'])+', request)'
 else:call='executeAsync('+json.dumps(o['id'])+', request, '+factory+')'
 lines+=[' public CompletableFuture<ApiResult<'+fullrt+'>> '+o['id']+'Async('+req+' request) { return '+call+'; }',' public ApiResult<'+fullrt+'> '+o['id']+'('+req+' request) { return await('+o['id']+'Async(request)); }']
lines+=[' public MonitorPaginationHelper pagination() { return new MonitorPaginationHelper(this); }',' public ProcessingWaiter processing() { return new ProcessingWaiter(this); }','}'];(OUT/'WebmaniaClient.java').write_text('\n'.join(lines)+'\n')
(RES/'operations.json').write_text(json.dumps(operations,indent=2)+'\n')
(ROOT/'model-catalog.json').write_text(json.dumps({'components':component_count,'generated_types':model_count,'models':catalog},indent=2)+'\n')
print('Generated',model_count,'types and',len(operations),'operations')
