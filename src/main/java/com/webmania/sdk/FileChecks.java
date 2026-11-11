package com.webmania.sdk;

import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;

/** Bounded representation inspection; never extracts, decrypts or follows relationships. */
final class FileChecks {
    private FileChecks() {}
    private static final long U32=0xffff_ffffL;
    private static final int MAX_PART=8*1024*1024, MAX_XLSX=32*1024*1024;
    private static final String XLSX="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    private static final String XHTML="http://www.w3.org/1999/xhtml";
    private static final String REL="http://schemas.openxmlformats.org/package/2006/relationships";
    private static final String MAIN="http://schemas.openxmlformats.org/spreadsheetml/2006/main";
    private static final String STRICT_MAIN="http://purl.oclc.org/ooxml/spreadsheetml/main";
    private static final String OFFICE_REL="http://schemas.openxmlformats.org/officeDocument/2006/relationships/";
    private static final String STRICT_OFFICE_REL="http://purl.oclc.org/ooxml/officeDocument/relationships/";
    private static final String WORKSHEET_TYPE="application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml";
    private static final class Invalid extends RuntimeException {}
    private static void require(boolean condition) { if(!condition)throw new Invalid(); }
    static Download.Kind inspect(String media,byte[] bytes) {
        try {
            require(bytes.length>0);
            return switch(media) {
                case "application/pdf" -> pdf(bytes);
                case "application/zip", "application/x-zip-compressed" -> zip(bytes).stream().anyMatch(Entry::encrypted)?Download.Kind.ENCRYPTED_ZIP:Download.Kind.ZIP;
                case XLSX -> { xlsx(bytes);yield Download.Kind.XLSX; }
                case "text/csv", "application/csv" -> { csv(bytes);yield Download.Kind.CSV; }
                case "application/xml", "text/xml" -> { fiscalXml(bytes);yield Download.Kind.XML; }
                case "text/html" -> { html(bytes);yield Download.Kind.HTML; }
                case "application/octet-stream" -> generic(bytes);
                default -> { require(media.endsWith("+xml"));fiscalXml(bytes);yield Download.Kind.XML; }
            };
        } catch(Invalid e) { return null; }
    }
    /**
     * Legacy fiscalDownloadReport only: CSV and XLSX arrive labeled text/xml. A ZIP local-file
     * signature must be a valid XLSX workbook; any other body must be a valid CSV kept byte-exact.
     * An XML document, HTML page or JSON body is never a report (null = typed protocol failure).
     */
    static Download.Kind legacyReport(byte[] bytes) {
        try {
            require(bytes.length>0);
            if(bytes.length>=4 && bytes[0]=='P' && bytes[1]=='K' && bytes[2]==3 && bytes[3]==4){xlsx(bytes);return Download.Kind.XLSX;}
            csv(bytes);return Download.Kind.CSV;
        } catch(Invalid e) { return null; }
    }
    private static Download.Kind generic(byte[] bytes) {
        if(bytes.length>=5 && new String(bytes,0,5,StandardCharsets.US_ASCII).equals("%PDF-"))return pdf(bytes);
        if(bytes.length>=2 && bytes[0]=='P' && bytes[1]=='K') {
            List<Entry> entries=zip(bytes);
            if(entries.stream().anyMatch(e->e.name().equals("[Content_Types].xml"))){xlsx(bytes);return Download.Kind.XLSX;}
            return entries.stream().anyMatch(Entry::encrypted)?Download.Kind.ENCRYPTED_ZIP:Download.Kind.ZIP;
        }
        String value=text(bytes).stripLeading();
        if(value.startsWith("<")){fiscalXml(bytes);return Download.Kind.XML;}
        csv(bytes);return Download.Kind.CSV;
    }
    private record Element(String local,String namespace,Map<String,String> attributes,int parent) {}
    private record Xml(Element root,List<Element> elements) {}
    private static String text(byte[] bytes) {
        try {
            int start=0;var charset=StandardCharsets.UTF_8;
            if(bytes.length>=2 && bytes[0]==(byte)0xff && bytes[1]==(byte)0xfe){charset=StandardCharsets.UTF_16LE;start=2;}
            else if(bytes.length>=2 && bytes[0]==(byte)0xfe && bytes[1]==(byte)0xff){charset=StandardCharsets.UTF_16BE;start=2;}
            else if(bytes.length>=4 && bytes[0]==0 && bytes[1]=='<'){charset=StandardCharsets.UTF_16BE;}
            else if(bytes.length>=4 && bytes[0]=='<' && bytes[1]==0){charset=StandardCharsets.UTF_16LE;}
            else if(bytes.length>=3 && bytes[0]==(byte)0xef && bytes[1]==(byte)0xbb && bytes[2]==(byte)0xbf)start=3;
            String value=charset.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bytes,start,bytes.length-start)).toString();
            var declaration=java.util.regex.Pattern.compile("^<\\?xml\\s[^?]*encoding\\s*=\\s*(['\"])([^'\"]+)\\1",java.util.regex.Pattern.CASE_INSENSITIVE).matcher(value);
            if(declaration.find()) {
                String declared=declaration.group(2).toUpperCase(Locale.ROOT);
                require(charset==StandardCharsets.UTF_8?declared.equals("UTF-8"):declared.equals("UTF-16") || declared.equals(charset.name()));
            }
            return value;
        }catch(CharacterCodingException e){throw new Invalid();}
    }
    private static Xml xml(byte[] bytes) {
        String value=text(bytes);require(!value.toUpperCase(Locale.ROOT).contains("<!DOCTYPE"));
        var factory=XMLInputFactory.newFactory();
        factory.setProperty(XMLInputFactory.SUPPORT_DTD,false);
        factory.setProperty("javax.xml.stream.isSupportingExternalEntities",false);
        factory.setProperty("jdk.xml.maxElementDepth",128);
        // Namespace declarations may share the parser's attribute counter;
        // the 256 ordinary-attribute bound below remains authoritative.
        factory.setProperty("jdk.xml.elementAttributeLimit",512);
        factory.setXMLResolver((a,b,c,d)->{throw new javax.xml.stream.XMLStreamException("External entity disabled");});
        var elements=new ArrayList<Element>();var parents=new java.util.ArrayDeque<Integer>();int depth=0;
        try {
            var reader=factory.createXMLStreamReader(new StringReader(value));
            try {
                while(reader.hasNext()) {
                    int event=reader.next();require(event!=XMLStreamConstants.DTD && event!=XMLStreamConstants.ENTITY_REFERENCE);
                    if(event==XMLStreamConstants.START_ELEMENT) {
                        require(++depth<=128 && elements.size()<100_000 && reader.getAttributeCount()<=256);
                        var attributes=new HashMap<String,String>();
                        for(int i=0;i<reader.getAttributeCount();i++) {
                            attributes.put("{"+reader.getAttributeNamespace(i)+"}"+reader.getAttributeLocalName(i),reader.getAttributeValue(i));
                            if(reader.getAttributeNamespace(i)==null || reader.getAttributeNamespace(i).isEmpty())attributes.put(reader.getAttributeLocalName(i),reader.getAttributeValue(i));
                        }
                        int parent=parents.isEmpty()?-1:parents.peek();parents.push(elements.size());
                        elements.add(new Element(reader.getLocalName(),reader.getNamespaceURI()==null?"":reader.getNamespaceURI(),Map.copyOf(attributes),parent));
                    } else if(event==XMLStreamConstants.END_ELEMENT){depth--;parents.pop();}
                }
            }finally{reader.close();}
        }catch(javax.xml.stream.XMLStreamException e){throw new Invalid();}
        require(!elements.isEmpty() && depth==0);return new Xml(elements.get(0),elements);
    }
    private static void fiscalXml(byte[] bytes) {
        Element root=xml(bytes).root();String name=root.local().toLowerCase(Locale.ROOT);
        require(!root.namespace().equalsIgnoreCase(XHTML) && !Set.of("html","xhtml","body","head","script","error","erro","errors").contains(name));
    }
    private static void html(byte[] bytes) {
        String value=text(bytes).stripLeading();
        require(java.util.regex.Pattern.compile("(?is)^(?:<!doctype\\s+html[^>]*>\\s*)?<html(?:\\s|>)").matcher(value).find());
        require(java.util.regex.Pattern.compile("(?is)</html\\s*>\\s*$").matcher(value).find());
    }

    private record Token(String value,int start,int end) {}
    private static boolean white(int c){return c==0 || c==9 || c==10 || c==12 || c==13 || c==32;}
    private static boolean delimiter(int c){return white(c) || "()<>[]{}/%".indexOf(c)>=0;}
    private static List<Token> pdfTokens(byte[] bytes) {
        String s=new String(bytes,StandardCharsets.ISO_8859_1);var out=new ArrayList<Token>();int i=0;
        while(i<s.length()) {
            int start=i;char c=s.charAt(i++);if(white(c))continue;
            if(c=='%'){while(i<s.length() && s.charAt(i)!='\n' && s.charAt(i)!='\r')i++;continue;}
            if(c=='(') {
                int depth=1;while(i<s.length() && depth>0){char k=s.charAt(i++);if(k=='\\'){require(i<s.length());i++;}else if(k=='(')depth++;else if(k==')')depth--;}
                require(depth==0);out.add(new Token("STRING",start,i));continue;
            }
            if(c=='<' && (i>=s.length() || s.charAt(i)!='<')){while(i<s.length() && s.charAt(i)!='>'){require(white(s.charAt(i)) || Character.digit(s.charAt(i),16)>=0);i++;}require(i<s.length());out.add(new Token("STRING",start,++i));continue;}
            if((c=='<' || c=='>') && i<s.length() && s.charAt(i)==c){i++;out.add(new Token(""+c+c,start,i));continue;}
            if(c=='/') {
                var name=new StringBuilder("/");while(i<s.length() && !delimiter(s.charAt(i))) {
                    char k=s.charAt(i++);if(k=='#'){require(i+2<=s.length());int a=Character.digit(s.charAt(i++),16),b=Character.digit(s.charAt(i++),16);require(a>=0 && b>=0);k=(char)(16*a+b);}name.append(k);
                }out.add(new Token(name.toString(),start,i));continue;
            }
            if(c=='[' || c==']'){out.add(new Token(""+c,start,i));continue;}
            require(!delimiter(c));while(i<s.length() && !delimiter(s.charAt(i)))i++;
            String word=s.substring(start,i);out.add(new Token(word,start,i));
            if(word.equals("stream")) {
                if(i<s.length() && s.charAt(i)=='\r')i++;require(i<s.length() && s.charAt(i)=='\n');i++;
                int end=-1;
                // Only the direct top-level Length can delimit binary data in this subset.
                for(int k=out.size()-2;k>=0;k--)if(out.get(k).value().equals("obj")){Map<String,String> metadata=dictionary(out,k+1);int length=pdfInt(metadata.get("/Length"),0,s.length()-i);end=i+length;if(end<s.length() && s.charAt(end)=='\r')end++;if(end<s.length() && s.charAt(end)=='\n')end++;require(s.startsWith("endstream",end));break;}
                // Indirect stream lengths and xref/object streams are outside this bounded subset.
                require(end>=i);i=end+9;out.add(new Token("endstream",end,i));
            }
            require(out.size()<=1_000_000);
        }return out;
    }
    private static int valueEnd(List<Token> t,int p,int depth) {
        require(p<t.size() && depth<=128);String v=t.get(p).value();
        if(v.equals("<<")){p++;while(p<t.size() && !t.get(p).value().equals(">>")){require(t.get(p++).value().startsWith("/"));p=valueEnd(t,p,depth+1);}require(p<t.size());return p+1;}
        if(v.equals("[")){p++;while(p<t.size() && !t.get(p).value().equals("]"))p=valueEnd(t,p,depth+1);require(p<t.size());return p+1;}
        require(!v.equals(">>") && !v.equals("]"));
        if(p+2<t.size() && v.matches("[0-9]+") && t.get(p+1).value().matches("[0-9]+") && t.get(p+2).value().equals("R"))return p+3;
        return p+1;
    }
    private static Map<String,String> dictionary(List<Token> t,int p) {
        require(t.get(p++).value().equals("<<"));var result=new HashMap<String,String>();
        while(p<t.size() && !t.get(p).value().equals(">>")){String key=t.get(p++).value();require(key.startsWith("/") && p<t.size() && !result.containsKey(key));int end=valueEnd(t,p,0);String value=t.get(p).value();if(end==p+3 && t.get(p+2).value().equals("R"))value+=" "+t.get(p+1).value()+" R";result.put(key,value);p=end;}
        require(p<t.size());return result;
    }
    private static Download.Kind pdf(byte[] bytes) {
        String s=new String(bytes,StandardCharsets.ISO_8859_1);require(s.matches("(?s)^%PDF-[12]\\.[0-9](?:\\r\\n|\\r|\\n).*"));
        int end=s.length();while(end>0 && white(s.charAt(end-1)))end--;require(s.substring(0,end).endsWith("%%EOF"));
        var footer=java.util.regex.Pattern.compile("startxref\\s+([0-9]+)\\s+%%EOF\\s*$").matcher(s.substring(0,end));require(footer.find());
        long offset;try{offset=Long.parseLong(footer.group(1));}catch(NumberFormatException e){throw new Invalid();}require(offset>=0 && offset<footer.start());
        List<Token> tokens=pdfTokens(bytes);var objects=new HashMap<Integer,PdfObject>();int p=0;
        // Only physical top-level objects count. Strings, comments and stream bytes are opaque.
        while(p<tokens.size() && tokens.get(p).start()<offset) {
            int first=p;require(p+3<tokens.size());int id=pdfInt(tokens.get(p++).value(),1,100_000),generation=pdfInt(tokens.get(p++).value(),0,65535);
            require(tokens.get(p++).value().equals("obj"));int value=p;p=valueEnd(tokens,p,0);
            if(tokens.get(value).value().equals("<<"))require(!Set.of("/ObjStm","/XRef").contains(dictionary(tokens,value).getOrDefault("/Type","")));
            if(p<tokens.size() && tokens.get(p).value().equals("stream")){require(tokens.get(value).value().equals("<<") && p+1<tokens.size() && tokens.get(p+1).value().equals("endstream"));p+=2;}
            require(p<tokens.size() && tokens.get(p++).value().equals("endobj"));
            require(objects.putIfAbsent(id,new PdfObject(id,generation,tokens.get(first).start(),value))==null);
        }
        require(p<tokens.size() && tokens.get(p).start()==offset && tokens.get(p++).value().equals("xref"));
        var live=new HashMap<Integer,PdfObject>();var listed=new HashSet<Integer>();
        while(p<tokens.size() && !tokens.get(p).value().equals("trailer")) {
            int first=pdfInt(tokens.get(p++).value(),0,100_000);require(p<tokens.size());int count=pdfInt(tokens.get(p++).value(),1,100_001-first);
            for(int id=first;id<first+count;id++) {
                require(p+2<tokens.size() && listed.add(id));String position=tokens.get(p++).value(),gen=tokens.get(p++).value(),state=tokens.get(p++).value();
                require(position.matches("[0-9]{10}") && gen.matches("[0-9]{5}"));int generation=pdfInt(gen,0,65535);
                if(state.equals("n")){PdfObject object=objects.get(id);require(object!=null && object.generation()==generation && object.offset()==Long.parseLong(position));live.put(id,object);}
                else {require(state.equals("f") && !objects.containsKey(id));if(id==0)require(generation==65535);}
            }
        }
        require(live.size()==objects.size() && listed.contains(0) && p+2<tokens.size() && tokens.get(p++).value().equals("trailer"));
        int trailerStart=p;Map<String,String> trailer=dictionary(tokens,p);p=valueEnd(tokens,p,0);
        require(!trailer.containsKey("/Prev") && !trailer.containsKey("/XRefStm"));
        int size=pdfInt(trailer.get("/Size"),1,100_001);require(listed.size()==size && listed.stream().allMatch(id->id<size));
        require(p+1<tokens.size() && tokens.get(p++).value().equals("startxref") && Long.toString(offset).equals(tokens.get(p++).value()) && p==tokens.size());
        PdfObject root=pdfReference(trailer.get("/Root"),live);Map<String,String> catalog=dictionary(tokens,root.value());require("/Catalog".equals(catalog.get("/Type")));
        PdfObject pages=pdfReference(catalog.get("/Pages"),live);pdfPages(tokens,live,pages,null,new HashSet<>(),0);
        boolean encrypted=trailer.containsKey("/Encrypt") && !trailer.get("/Encrypt").equals("null");
        if(encrypted){
            String encryption=trailer.get("/Encrypt");int metadataStart=encryption.equals("<<")?pdfValue(tokens,trailerStart,"/Encrypt"):pdfReference(encryption,live).value();Map<String,String> metadata=dictionary(tokens,metadataStart);
            require("/Standard".equals(metadata.get("/Filter")));
            // Supported protection metadata is deliberately narrower than a crypto engine.
            require(pdfInt(metadata.get("/V"),1,5)==1 && pdfInt(metadata.get("/R"),2,6)==2 && pdfInt(metadata.getOrDefault("/Length","40"),40,40)==40);
            require(pdfHexLength(s,tokens.get(pdfValue(tokens,metadataStart,"/O")))==32 && pdfHexLength(s,tokens.get(pdfValue(tokens,metadataStart,"/U")))==32);
            String permission=metadata.getOrDefault("/P","");require(permission.matches("-?[0-9]{1,10}"));try{require((Integer.parseInt(permission)&3)==0);}catch(NumberFormatException e){throw new Invalid();}
            int identifiers=pdfValue(tokens,trailerStart,"/ID");require(identifiers+3<tokens.size() && tokens.get(identifiers).value().equals("[") && tokens.get(identifiers+3).value().equals("]"));
            require(pdfHexLength(s,tokens.get(identifiers+1))==16 && pdfHexLength(s,tokens.get(identifiers+2))==16);
        }
        return encrypted?Download.Kind.ENCRYPTED_PDF:Download.Kind.PDF;
    }
    private record PdfObject(int id,int generation,int offset,int value) {String reference(){return id+" "+generation+" R";}}
    private static int pdfHexLength(String source,Token token){require(token.value().equals("STRING") && source.charAt(token.start())=='<');int digits=0;for(int p=token.start()+1;p<token.end()-1;p++)if(!white(source.charAt(p)))digits++;return (digits+1)/2;}
    private static int pdfInt(String value,int minimum,int maximum){require(value!=null && value.matches("[0-9]{1,10}"));try{long n=Long.parseLong(value);require(n>=minimum && n<=maximum);return (int)n;}catch(NumberFormatException e){throw new Invalid();}}
    private static PdfObject pdfReference(String value,Map<Integer,PdfObject> live){require(value!=null && value.matches("[0-9]+ [0-9]+ R"));String[] fields=value.split(" ");PdfObject object=live.get(pdfInt(fields[0],1,100_000));require(object!=null && object.generation()==pdfInt(fields[1],0,65535));return object;}
    private static int pdfValue(List<Token> tokens,int dictionary,String key){int p=dictionary+1;require(tokens.get(dictionary).value().equals("<<"));while(p<tokens.size() && !tokens.get(p).value().equals(">>")){String name=tokens.get(p++).value();if(name.equals(key))return p;p=valueEnd(tokens,p,0);}throw new Invalid();}
    private static int pdfPages(List<Token> tokens,Map<Integer,PdfObject> live,PdfObject object,PdfObject parent,Set<Integer> visited,int depth){
        require(depth<=128 && visited.add(object.id()));Map<String,String> dict=dictionary(tokens,object.value());String type=dict.get("/Type");
        if(parent==null)require("/Pages".equals(type) && !dict.containsKey("/Parent"));else require(parent.reference().equals(dict.get("/Parent")));
        if("/Page".equals(type))return 1;
        require("/Pages".equals(type));int p=pdfValue(tokens,object.value(),"/Kids");require(tokens.get(p++).value().equals("["));int count=0;
        while(p<tokens.size() && !tokens.get(p).value().equals("]")){int end=valueEnd(tokens,p,0);require(end==p+3);String ref=tokens.get(p).value()+" "+tokens.get(p+1).value()+" "+tokens.get(p+2).value();count+=pdfPages(tokens,live,pdfReference(ref,live),object,visited,depth+1);require(count<=100_000);p=end;}
        require(p<tokens.size() && count==pdfInt(dict.get("/Count"),0,100_000));return count;
    }

    private static long number(byte[] b,long offset,int size) {
        require(offset>=0 && offset<=b.length-size);long value=0;
        for(int j=0;j<size;j++)value|=(b[(int)offset+j]&255L)<<(8*j);
        require(value>=0);return value;
    }
    private static long u16(byte[] b,long p){return number(b,p,2);}
    private static long u32(byte[] b,long p){return number(b,p,4);}
    private static long u64(byte[] b,long p){return number(b,p,8);}
    private static int index(long p,byte[] b){require(p>=0 && p<=b.length);return (int)p;}
    private static byte[] slice(byte[] b,long start,long end){require(start>=0 && end>=start && end<=b.length);return Arrays.copyOfRange(b,(int)start,(int)end);}
    private static long[] extra(byte[] b,long start,long end,long[] fields,boolean disk) {
        require(start<=end && end<=b.length);boolean found=false;long p=start;
        while(p<end){long id=u16(b,p),size=u16(b,p+2),next=p+4+size;require(next<=end);if(id==1){require(!found);found=true;long q=p+4;for(int j=0;j<fields.length;j++){long sentinel=disk && j==fields.length-1?65535:U32;if(fields[j]==sentinel){int width=disk && j==fields.length-1?4:8;require(q+width<=next);fields[j]=number(b,q,width);q+=width;}}}p=next;}
        for(int j=0;j<fields.length;j++)require(fields[j]!=(disk && j==fields.length-1?65535:U32));return fields;
    }
    private record Entry(String name,boolean encrypted,int method,long crc,long compressed,long expanded,int data) {}
    private static List<Entry> zip(byte[] b) {
        require(b.length>=22);long signature=u32(b,0);require(signature==0x04034b50 || signature==0x06054b50 || signature==0x06064b50);
        int e=-1;for(int p=b.length-22;p>=Math.max(0,b.length-65557);p--)if(u32(b,p)==0x06054b50 && p+22+u16(b,p+20)==b.length){e=p;break;}require(e>=0);
        long disk=u16(b,e+4),cdDisk=u16(b,e+6),diskCount=u16(b,e+8),count=u16(b,e+10),size=u32(b,e+12),offset=u32(b,e+16),limit=e;
        boolean locator=e>=20 && u32(b,e-20)==0x07064b50;
        if(locator || disk==65535 || cdDisk==65535 || diskCount==65535 || count==65535 || size==U32 || offset==U32) {
            require(locator && u32(b,e-16)==0 && u32(b,e-4)==1);long z=u64(b,e-12),length=u64(b,z+4);require(u32(b,z)==0x06064b50 && length>=44 && z+12+length==e-20 && u32(b,z+16)==0 && u32(b,z+20)==0);
            long n=u64(b,z+32),sz=u64(b,z+40),off=u64(b,z+48);require(u64(b,z+24)==n && (disk==0 || disk==65535) && (cdDisk==0 || cdDisk==65535));
            require((diskCount==65535 || diskCount==n) && (count==65535 || count==n) && (size==U32 || size==sz) && (offset==U32 || offset==off));count=n;size=sz;offset=off;limit=z;
        }else require(disk==0 && cdDisk==0 && diskCount==count);
        require(count<=10_000 && offset<=limit && size==limit-offset && (count!=0 || offset==0));
        long p=offset,expanded=0;var entries=new ArrayList<Entry>();var spans=new ArrayList<long[]>();var names=new HashSet<String>();
        for(int n=0;n<count;n++) {
            require(p+46<=limit && u32(b,p)==0x02014b50);int flags=(int)u16(b,p+8),method=(int)u16(b,p+10);long crc=u32(b,p+16),rawC=u32(b,p+20),rawU=u32(b,p+24),nl=u16(b,p+28),xl=u16(b,p+30),cl=u16(b,p+32);
            long nameStart=p+46,extraStart=nameStart+nl,extraEnd=extraStart+xl,next=extraEnd+cl;require(nl>0 && next<=limit);
            byte[] name=slice(b,nameStart,extraStart);require(names.add(java.util.Base64.getEncoder().encodeToString(name)));
            long[] fields=extra(b,extraStart,extraEnd,new long[]{rawU,rawC,u32(b,p+42),u16(b,p+34)},true);long uncompressed=fields[0],compressed=fields[1],local=fields[2];require(fields[3]==0 && local+30<=offset);
            require(u32(b,local)==0x04034b50 && u16(b,local+4)==u16(b,p+6) && u16(b,local+6)==flags && u16(b,local+8)==method && u32(b,local+10)==u32(b,p+12));
            long localCrc=u32(b,local+14),localC=u32(b,local+18),localU=u32(b,local+22),lnl=u16(b,local+26),lxl=u16(b,local+28),lextra=local+30+lnl,data=lextra+lxl;
            require(data<=offset && Arrays.equals(name,slice(b,local+30,lextra)));long[] sizes=extra(b,lextra,data,new long[]{localU,localC},false);require(compressed<=offset-data);long end=data+compressed;
            if((flags&8)==0)require(localCrc==crc && sizes[0]==uncompressed && sizes[1]==compressed);
            else {
                require((localCrc==0 || localCrc==crc) && (sizes[0]==0 || sizes[0]==uncompressed) && (sizes[1]==0 || sizes[1]==compressed));
                boolean wide=rawC==U32 || rawU==U32 || localC==U32 || localU==U32;long matched=-1;
                for(int signed=1;signed>=0;signed--){long q=end+(signed==1?4:0),width=wide?8:4;if(q+4+width*2>offset)continue;if(signed==1 && u32(b,end)!=0x08074b50)continue;if(u32(b,q)==crc && number(b,q+4,(int)width)==compressed && number(b,q+4+width,(int)width)==uncompressed){matched=q+4+width*2;break;}}
                require(matched>=0);end=matched;
            }
            require(end<=offset && uncompressed<=512L*1024*1024-expanded);expanded+=uncompressed;spans.add(new long[]{local,end});
            String decoded;if((flags&0x800)!=0) {try{decoded=StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(name)).toString();}catch(CharacterCodingException ex){throw new Invalid();}}else decoded=new String(name,java.nio.charset.Charset.forName("IBM437"));
            entries.add(new Entry(decoded,(flags&0x41)!=0,method,crc,compressed,uncompressed,index(data,b)));p=next;
        }
        require(p==limit);spans.sort(java.util.Comparator.comparingLong(s->s[0]));long previous=0;for(long[] span:spans){require(span[0]>=previous);previous=span[1];}return entries;
    }
    private static byte[] read(byte[] b,Entry e,long remaining) {
        long budget=Math.min(MAX_PART,Math.min(e.expanded(),remaining));
        require(!e.encrypted() && e.expanded()<=budget);
        if(e.method()==0)require(e.compressed()==e.expanded());
        byte[] compressed=slice(b,e.data(),e.data()+e.compressed());byte[] out;
        if(e.method()==0)out=compressed;
        else {
            require(e.method()==8);var inflater=new Inflater(true);out=new byte[(int)budget];int written=0;
            try{inflater.setInput(compressed);while(!inflater.finished()){int n=inflater.inflate(out,written,out.length-written);require(n>0 || inflater.finished());written+=n;}require(inflater.getRemaining()==0 && written==e.expanded());}catch(java.util.zip.DataFormatException ex){throw new Invalid();}finally{inflater.end();}
        }
        require(out.length==e.expanded());var crc=new CRC32();crc.update(out);require(crc.getValue()==e.crc());return out;
    }
    private static boolean clean(String name){return !name.isEmpty() && !name.startsWith("/") && !name.contains("\\") && !name.contains("\u0000") && Arrays.stream(name.split("/",-1)).noneMatch(s->s.equals(".") || s.equals(".."));}
    private static String attr(Element e,String name){return e.attributes().getOrDefault(name,"");}
    private static boolean main(Element e,String local){return e.local().equals(local) && (e.namespace().equals(MAIN) || e.namespace().equals(STRICT_MAIN));}
    private static boolean relationship(Element e,String kind){String type=attr(e,"Type");return type.equals(OFFICE_REL+kind) || type.equals(STRICT_OFFICE_REL+kind);}
    private record ContentTypes(Map<String,String> overrides,Map<String,String> defaults) {
        String resolve(String path) {
            String explicit=overrides.get("/"+path);if(explicit!=null)return explicit;
            int dot=path.lastIndexOf('.');return dot>=0?defaults.getOrDefault(path.substring(dot+1).toLowerCase(Locale.ROOT),""):"";
        }
    }
    private static ContentTypes contentTypes(Xml types) {
        require(types.root().local().equals("Types") && types.root().namespace().equals("http://schemas.openxmlformats.org/package/2006/content-types"));
        var overrides=new HashMap<String,String>();var defaults=new HashMap<String,String>();
        for(Element e:types.elements())if(e!=types.root()) {
            require(e.parent()==0 && e.namespace().equals(types.root().namespace()) && Set.of("Override","Default").contains(e.local()));
            if(e.local().equals("Override")){String name=attr(e,"PartName"),type=attr(e,"ContentType");require(name.startsWith("/") && clean(name.substring(1)) && !type.isEmpty() && overrides.putIfAbsent(name,type)==null);}
            if(e.local().equals("Default")){String extension=attr(e,"Extension").toLowerCase(Locale.ROOT),type=attr(e,"ContentType");require(!extension.isEmpty() && !extension.contains("/") && !extension.contains(".") && !type.isEmpty() && defaults.putIfAbsent(extension,type)==null);}
        }
        return new ContentTypes(Map.copyOf(overrides),Map.copyOf(defaults));
    }
    private static Xml part(Map<String,byte[]> parts,String name){require(parts.containsKey(name));return xml(parts.get(name));}
    private static void worksheet(Xml sheet){
        require(main(sheet.root(),"worksheet"));int data=0;
        for(Element e:sheet.elements()) {
            if(main(e,"sheetData")){require(e.parent()==0);data++;}
            if(main(e,"row"))require(e.parent()>=0 && main(sheet.elements().get(e.parent()),"sheetData"));
            if(main(e,"c"))require(e.parent()>=0 && main(sheet.elements().get(e.parent()),"row"));
        }
        require(data==1);
    }
    private static void xlsx(byte[] b) {
        var parts=new HashMap<String,byte[]>();var folded=new HashSet<String>();long total=0;
        for(Entry e:zip(b)){require(!e.encrypted() && clean(e.name()) && folded.add(e.name().toLowerCase(Locale.ROOT)) && e.expanded()<=MAX_XLSX-total);byte[] data=read(b,e,MAX_XLSX-total);total+=data.length;parts.put(e.name(),data);}
        ContentTypes types=contentTypes(part(parts,"[Content_Types].xml"));require(types.resolve("xl/workbook.xml").equals(XLSX+".main+xml"));
        Xml rels=part(parts,"_rels/.rels");require(rels.root().local().equals("Relationships") && rels.root().namespace().equals(REL));
        int office=0;var rootIds=new HashSet<String>();
        for(Element e:rels.elements())if(e!=rels.root()) {
            require(e.parent()==0 && e.namespace().equals(REL) && e.local().equals("Relationship") && !attr(e,"Id").isEmpty() && rootIds.add(attr(e,"Id")));
            if(relationship(e,"officeDocument")){require(attr(e,"Target").replaceFirst("^/","").equals("xl/workbook.xml") && !attr(e,"TargetMode").equalsIgnoreCase("External"));office++;}
        }
        require(office==1);
        Xml workbook=part(parts,"xl/workbook.xml"),wrels=part(parts,"xl/_rels/workbook.xml.rels");require(main(workbook.root(),"workbook") && wrels.root().local().equals("Relationships") && wrels.root().namespace().equals(REL));
        var links=new HashMap<String,String>();
        for(Element e:wrels.elements())if(e!=wrels.root()){require(e.parent()==0 && e.local().equals("Relationship") && e.namespace().equals(REL));String id=attr(e,"Id");require(!id.isEmpty() && !links.containsKey(id));links.put(id,"");if(relationship(e,"worksheet") && !attr(e,"TargetMode").equalsIgnoreCase("External")){String target=attr(e,"Target"),path=target.startsWith("/")?target.substring(1):"xl/"+target;require(clean(path) && path.startsWith("xl/worksheets/"));links.put(id,path);}}
        int sheets=0,containers=0;var sheetIds=new HashSet<String>();var sheetNames=new HashSet<String>();var inspected=new HashSet<String>();
        for(Element e:workbook.elements()) {
            if(main(e,"sheets")){require(e.parent()==0);containers++;}
            if(main(e,"sheet")){
                require(e.parent()>=0 && main(workbook.elements().get(e.parent()),"sheets") && workbook.elements().get(e.parent()).parent()==0);
                String id=e.attributes().getOrDefault("{http://schemas.openxmlformats.org/officeDocument/2006/relationships}id",e.attributes().getOrDefault("{http://purl.oclc.org/ooxml/officeDocument/relationships}id",""));String path=links.get(id);
                String sheetId=attr(e,"sheetId");
                require(!attr(e,"name").isEmpty() && sheetNames.add(attr(e,"name")) && sheetId.matches("[1-9][0-9]{0,9}") && Long.parseLong(sheetId)<=4_294_967_295L && sheetIds.add(sheetId));
                require(path!=null && !path.isEmpty() && types.resolve(path).equals(WORKSHEET_TYPE));if(inspected.add(path))worksheet(part(parts,path));sheets++;
            }
        }
        require(sheets>0 && containers==1);
    }
    private static void csv(byte[] b) {
        String value;try{int skip=b.length>=3 && b[0]==(byte)0xef && b[1]==(byte)0xbb && b[2]==(byte)0xbf?3:0;value=StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(b,skip,b.length-skip)).toString();}catch(CharacterCodingException ex){throw new Invalid();}
        require(!value.strip().isEmpty() && !"<{[".contains(value.stripLeading().substring(0,1)) && !value.startsWith("%PDF-"));
        for(int i=0;i<value.length();i++){char c=value.charAt(i);require(c>=32 && c!=127 || c=='\r' || c=='\n' || c=='\t');}
        require(csvWidth(value,',') || csvWidth(value,';') || csvWidth(value,'\t'));
    }
    private static boolean csvWidth(String s,char delimiter) {
        int width=-1,fields=1,rows=0;boolean quoted=false,start=true,closed=false,any=false;
        for(int i=0;i<s.length();i++){char c=s.charAt(i);any=true;if(quoted){if(c=='"'){if(i+1<s.length() && s.charAt(i+1)=='"')i++;else{quoted=false;closed=true;}}continue;}if(c=='"'){if(!start)return false;quoted=true;start=false;continue;}if(c==delimiter){fields++;start=true;closed=false;continue;}if(c=='\r' || c=='\n'){if(c=='\r' && i+1<s.length() && s.charAt(i+1)=='\n')i++;if(width<0)width=fields;else if(width!=fields)return false;rows++;fields=1;start=true;closed=false;any=false;continue;}if(closed)return false;start=false;}
        if(quoted)return false;if(any){if(width<0)width=fields;else if(width!=fields)return false;rows++;}return rows>=2 && width>=2;
    }
}
