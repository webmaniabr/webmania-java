import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.webmania.sdk.*;
import com.webmania.sdk.model.api1files.*;
import com.webmania.sdk.model.api1fiscal.*;
import com.webmania.sdk.model.api2emitterfiles.*;
import com.webmania.sdk.model.api2emitterreads.*;
import com.webmania.sdk.model.api2nfseissuance.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.HexFormat;
import java.util.Set;
import java.util.function.Supplier;

/**
 * Optional homologation walk-through (ambiente 2): reads, then the NF-e and NFS-e lifecycles
 * (issue, bounded consult, files, cancel, final consult). Configuration comes only from the
 * WEBMANIA_* environment. Output is one JSON line per step with statuses, sizes and digests;
 * identifiers, payload values and credentials are never printed. A mutation is never resent.
 */
public final class Homologacao {
 // Decimal numbers are read as BigDecimal: the SDK refuses binary floating point in request bodies.
 private static final ObjectMapper JSON=new ObjectMapper().enable(com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
 private static final Set<String> PROCESSING=Set.of("processando","processamento","contingencia","pendente");
 private static final Set<String> CANCELLING=Set.of("processando","processamento","contingencia","pendente","processando_cancelamento");
 private static int step;
 private static boolean failed;
 private static Path ledger;

 /** A sent mutation whose result is unknown: stop the run, never resend. */
 private static final class Unknown extends RuntimeException { private static final long serialVersionUID=1L; Unknown(){super(null,null,false,false);} }

 public static void main(String[] args) throws Exception {
  if(!"1".equals(System.getenv("WEBMANIA_LIVE")))blocked(null);
  String scope=env("WEBMANIA_LIVE_SCOPE","readonly");
  if(!Set.of("readonly","nfe","nfse","all").contains(scope))blocked("scope");
  URI api1=origin("WEBMANIA_API1_BASE_URL","https://webmania.com.br/api"),files=origin("WEBMANIA_FILES_BASE_URL","https://nfe.webmania.com.br"),api2=origin("WEBMANIA_API2_BASE_URL","https://api.webmania.com.br");
  // The host allow-list is mandatory: absent or empty, no origin is trusted and nothing is sent.
  var hosts=new java.util.HashSet<String>();
  for(String h:env("WEBMANIA_LIVE_ALLOWED_HOSTS","").split(","))if(!h.isBlank())hosts.add(h.strip().toLowerCase(java.util.Locale.ROOT));
  if(hosts.isEmpty())blocked("allowed_hosts");
  for(URI u:new URI[]{api1,files,api2})if(!hosts.contains(u.getHost().toLowerCase(java.util.Locale.ROOT)))blocked("host_not_allowed");
  boolean nfe=scope.equals("nfe") || scope.equals("all"),nfse=scope.equals("nfse") || scope.equals("all");
  JsonNode nfePayload=nfe?payload("WEBMANIA_LIVE_NFE_PAYLOAD"):null,nfsePayload=nfse?payload("WEBMANIA_LIVE_NFSE_PAYLOAD"):null;
  if(nfe || nfse) {
   String path=System.getenv("WEBMANIA_LIVE_LEDGER");if(path==null || path.isBlank())blocked("ledger");
   // The ledger must be writable before any mutation; existing content is preserved.
   try{Files.writeString(Path.of(path),"",StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);}catch(java.io.IOException | RuntimeException e){blocked("ledger");}
   ledger=Path.of(path);
  }
  for(String name:new String[]{"WEBMANIA_CONSUMER_KEY","WEBMANIA_CONSUMER_SECRET","WEBMANIA_ACCESS_TOKEN","WEBMANIA_ACCESS_TOKEN_SECRET","WEBMANIA_ISSUER_TOKEN"})
   if(System.getenv(name)==null || System.getenv(name).isBlank())blocked("credentials");
  var config=ClientConfig.builder().deadline(Duration.ofSeconds(60))
   .origin("api1/fiscal.openapi.json",api1).origin("api1/files.openapi.json",files)
   .origin("api2/emitter-reads.openapi.json",api2).origin("api2/nfse-issuance.openapi.json",api2).origin("api2/emitter-files.openapi.json",api2).build();
  String issuer=System.getenv("WEBMANIA_ISSUER_TOKEN");
  try(var company=new WebmaniaClient(config,Credentials.company(System.getenv("WEBMANIA_CONSUMER_KEY"),System.getenv("WEBMANIA_CONSUMER_SECRET"),System.getenv("WEBMANIA_ACCESS_TOKEN"),System.getenv("WEBMANIA_ACCESS_TOKEN_SECRET")));
      var emitter=new WebmaniaClient(config,Credentials.issuer(issuer));
      var nfseFiles=new WebmaniaClient(config,Credentials.fileCompany(issuer))) {
   read("nfeGetSefazStatus",()->company.nfeGetSefazStatus(new NfeGetSefazStatusRequest()));
   read("nfeGetCertificateValidity",()->company.nfeGetCertificateValidity(new NfeGetCertificateValidityRequest()));
   read("nfeListTaxClasses",()->company.nfeListTaxClasses(new NfeListTaxClassesRequest()));
   read("emitterGetNfseProviderStatus",()->emitter.emitterGetNfseProviderStatus(new EmitterGetNfseProviderStatusRequest()));
   if(nfe)nfeCycle(company,nfePayload);
   if(nfse)nfseCycle(emitter,nfseFiles,nfsePayload);
  } catch(Unknown stop) {
   System.exit(1);
  } catch(IllegalArgumentException invalidConfiguration) {
   emit(object("configuration",false,0,"failure","configuration",null));System.exit(1);
  }
  System.exit(failed?1:0);
 }

 private static void nfeCycle(WebmaniaClient c,JsonNode payload)throws Exception {
  JsonNode issued=mutation("nfe","nfeIssueDocument",()->c.nfeIssueDocument(new NfeIssueDocumentRequest(wrap("body",payload))));
  String uuid=text(issued,"uuid");
  if(uuid==null){failed=true;return;}
  String status=text(issued,"status");record("nfe",uuid,status,"nfeIssueDocument");
  status=poll("nfe",uuid,"nfeGetDocument",()->c.nfeGetDocument(new NfeGetDocumentRequest(field("uuid",uuid))),status);
  if(!approved("nfe",uuid,"nfeGetDocument",status))return;
  try {
   read("nfeQueryDocument",()->c.nfeQueryDocument(new NfeQueryDocumentRequest(wrap("body",field("uuid",uuid)))),uuid);
   file("nfeDownloadDanfe",()->c.nfeDownloadDanfe(new NfeDownloadDanfeRequest(field("identifier",uuid))),uuid);
   file("nfeDownloadSimpleDanfe",()->c.nfeDownloadSimpleDanfe(new NfeDownloadSimpleDanfeRequest(field("identifier",uuid))),uuid);
   file("nfeDownloadXml",()->c.nfeDownloadXml(new NfeDownloadXmlRequest(field("identifier",uuid))),uuid);
  } finally {
   {
    var body=field("uuid",uuid);body.put("motivo","Cancelamento de teste em homologacao");
    JsonNode cancelled=mutation("nfe","nfeCancelDocument",()->c.nfeCancelDocument(new NfeCancelDocumentRequest(wrap("body",body))),uuid);
    if(cancelled!=null) {
     record("nfe",uuid,"cancelamento_solicitado","nfeCancelDocument");
     String finalStatus=poll("nfe",uuid,"nfeGetDocument",()->c.nfeGetDocument(new NfeGetDocumentRequest(field("uuid",uuid))),"processando");
     if(!"cancelado".equals(finalStatus))failed=true;
     else file("nfeDownloadCancellationXml",()->c.nfeDownloadCancellationXml(new NfeDownloadCancellationXmlRequest(field("identifier",uuid))),uuid);
    }
   }
  }
 }

 private static void nfseCycle(WebmaniaClient emitter,WebmaniaClient files,JsonNode payload)throws Exception {
  JsonNode issued=mutation("nfse","emitterIssueNfse",()->emitter.emitterIssueNfse(new EmitterIssueNfseRequest(wrap("body",payload))));
  String uuid=text(issued,"uuid");
  if(uuid==null){failed=true;return;}
  String status=text(issued,"status");record("nfse",uuid,status,"emitterIssueNfse");
  status=poll("nfse",uuid,"emitterGetNfse",()->emitter.emitterGetNfse(new EmitterGetNfseRequest(field("identifier",uuid))),status);
  if(!approved("nfse",uuid,"emitterGetNfse",status))return;
  try {
   file("fileGetNfseXml",()->files.fileGetNfseXml(new FileGetNfseXmlRequest(field("identifier",uuid))),uuid);
   file("fileGetNfsePdf",()->files.fileGetNfsePdf(new FileGetNfsePdfRequest(field("identifier",uuid))),uuid);
   file("fileGetNfseRpsPdf",()->files.fileGetNfseRpsPdf(new FileGetNfseRpsPdfRequest(field("identifier",uuid))),uuid);
  } finally {
   {
    var body=field("uuid",uuid);body.put("motivo","1");body.put("justificativa","Cancelamento de teste em homologacao");
    JsonNode cancelled=mutation("nfse","emitterCancelNfse",()->emitter.emitterCancelNfse(new EmitterCancelNfseRequest(wrap("body",body))),uuid);
    if(cancelled!=null) {
     record("nfse",uuid,text(cancelled,"status"),"emitterCancelNfse");
     // An NFS-e cancellation can stay in processando_cancelamento until a later consult completes it.
     String finalStatus=poll("nfse",uuid,"emitterGetNfse",()->emitter.emitterGetNfse(new EmitterGetNfseRequest(field("identifier",uuid))),"processando",CANCELLING);
     if(!"cancelado".equals(finalStatus))failed=true;
    }
   }
  }
 }

 /**
  * Whether the consults after the issue ended on aprovado: only then is the document cancelled, whether the issue call
  * approved it or it was approved later. A refused document gets no other mutation; one without a terminal status
  * within the bound is ledgered as unknown for reconciliation, and the issue is never resent.
  */
 private static boolean approved(String model,String uuid,String operation,String status)throws Exception {
  if("aprovado".equals(status))return true;
  if(status==null || PROCESSING.contains(status))record(model,uuid,"unknown",operation);
  failed=true;return false;
 }

 /** Bounded consult while the document is processing; the last observed status is returned. */
 private static String poll(String model,String uuid,String operation,Supplier<ApiResult<?>> call,String status)throws Exception{return poll(model,uuid,operation,call,status,PROCESSING);}
 private static String poll(String model,String uuid,String operation,Supplier<ApiResult<?>> call,String status,Set<String> pending)throws Exception {
  // At least one consult; then poll only while the document is in a pending status.
  for(int attempt=0;attempt<30 && (attempt==0 || status==null || pending.contains(status));attempt++) {
   if(attempt>0)Thread.sleep(10_000);
   JsonNode data=read(operation,call,uuid);
   String observed=data==null?null:text(data.isArray() && data.size()>0?data.get(0):data,"status");
   if(observed!=null && !observed.equals(status))record(model,uuid,observed,operation);
   if(observed!=null)status=observed;
  }
  return status;
 }

 private static JsonNode read(String operation,Supplier<ApiResult<?>> call){return read(operation,call,null);}
 private static JsonNode read(String operation,Supplier<ApiResult<?>> call,String identifier) {
  try {
   ApiResult<?> r=call.get();JsonNode data=r.data() instanceof JsonValue v?v.toJson():null;
   emit(object(operation,true,r.status(),"success",null,identifier));return data;
  } catch(ApiException e) {
   failed=true;emit(object(operation,false,e.status(),e.outcomeUncertain()?"unknown":"failure",e.kind().name().toLowerCase(java.util.Locale.ROOT),identifier));return null;
  }
 }
 private static JsonNode mutation(String model,String operation,Supplier<ApiResult<?>> call)throws Exception{return mutation(model,operation,call,null);}
 private static JsonNode mutation(String model,String operation,Supplier<ApiResult<?>> call,String identifier)throws Exception {
  try {
   ApiResult<?> r=call.get();JsonNode data=r.data() instanceof JsonValue v?v.toJson():JSON.createObjectNode();
   String id=identifier!=null?identifier:text(data,"uuid");
   emit(object(operation,true,r.status(),"success",null,id));return data;
  } catch(ApiException e) {
   String id=identifier!=null?identifier:e.reference()==null?null:e.reference().value();
   if(e.outcomeUncertain()) {
    emit(object(operation,false,e.status(),"unknown",e.kind().name().toLowerCase(java.util.Locale.ROOT),id));
    record(model,id,"unknown",operation);throw new Unknown();
   }
   failed=true;emit(object(operation,false,e.status(),"failure",e.kind().name().toLowerCase(java.util.Locale.ROOT),id));return null;
  }
 }
 private static void file(String operation,Supplier<ApiResult<Download>> call,String identifier) {
  try {
   ApiResult<Download> r=call.get();Download d=r.data();ObjectNode line=object(operation,!d.pending() && !d.isRedirect(),r.status(),d.pending() || d.isRedirect()?"pending":"success",null,identifier);
   byte[] bytes=d.bytes();line.put("size",bytes.length);line.put("sha256",sha256(bytes));line.put("format",d.kind()==null?(String)null:d.kind().name().toLowerCase(java.util.Locale.ROOT));
   if(d.pending() || d.isRedirect())failed=true;
   emit(line);
  } catch(ApiException e) {
   failed=true;emit(object(operation,false,e.status(),e.outcomeUncertain()?"unknown":"failure",e.kind().name().toLowerCase(java.util.Locale.ROOT),identifier));
  }
 }

 private static ObjectNode object(String operation,boolean ok,int status,String outcome,String kind,String identifier) {
  var line=JSON.createObjectNode();line.put("step",++step);line.put("operation",operation);line.put("ok",ok);line.put("http_status",status);line.put("outcome",outcome);line.put("kind",kind);line.put("ref",identifier==null?null:sha256(identifier.getBytes(StandardCharsets.UTF_8)).substring(0,12));return line;
 }
 private static void emit(ObjectNode line){System.out.println(line.toString());System.out.flush();}
 private static void record(String model,String identifier,String status,String operation)throws Exception {
  if(ledger==null)return;var line=JSON.createObjectNode();line.put("model",model);line.put("identifier",identifier);line.put("status",status);line.put("operation",operation);
  Files.writeString(ledger,line+"\n",StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
 }
 private static void blocked(String reason) {
  var line=JSON.createObjectNode();line.put("result","blocked");if(reason!=null)line.put("reason",reason);System.out.println(line.toString());System.exit(77);
 }
 private static String env(String name,String fallback){String v=System.getenv(name);return v==null || v.isBlank()?fallback:v;}
 private static URI origin(String name,String fallback) {
  try{URI u=URI.create(env(name,fallback));if(!"https".equals(u.getScheme()) || u.getHost()==null || u.getUserInfo()!=null || u.getQuery()!=null || u.getFragment()!=null)blocked("origin");return u;}
  catch(IllegalArgumentException e){blocked("origin");return null;}
 }
 private static JsonNode payload(String name) {
  try {
   String path=System.getenv(name);if(path==null || path.isBlank())blocked("payload");
   byte[] raw=Files.readAllBytes(Path.of(path));if(raw.length>8*1024*1024)blocked("payload");
   // Only the decoded top-level JSON integer 2 is homologation: the text "2", 2.0 or a nested value is refused.
   JsonNode node=JSON.readTree(raw);JsonNode ambiente=node==null?null:node.get("ambiente");
   if(node==null || !node.isObject() || ambiente==null || !(ambiente.isInt() && ambiente.intValue()==2))blocked("ambiente");
   return node;
  } catch(java.io.IOException e){blocked("payload");return null;}
 }
 private static ObjectNode field(String name,String value){var n=JSON.createObjectNode();n.put(name,value);return n;}
 private static ObjectNode wrap(String name,JsonNode value){var n=JSON.createObjectNode();n.set(name,value);return n;}
 private static String text(JsonNode node,String name){return node==null || !node.path(name).isTextual()?null:node.path(name).textValue();}
 private static String sha256(byte[] bytes){try{return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));}catch(java.security.NoSuchAlgorithmException e){throw new IllegalStateException(e);}}
}
