package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/** Collected from the single effective serialized snapshot, without a shallow traversal cutoff. */
final class Secrets {
    private static final Pattern UUID=Pattern.compile("(?i)(?:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}|[0-9a-f]{32})");
    private static final Pattern URL=Pattern.compile("(?i)https?://[^\\s\"'<>]+");
    private static final Pattern PERCENT=Pattern.compile("(?:%[0-9A-Fa-f]{2})+");
    private static final Pattern NUMERIC=Pattern.compile("(?<![\\p{L}\\p{N}_.])[-+]?(?:[0-9]+(?:\\.[0-9]*)?|\\.[0-9]+)(?:[eE][-+]?[0-9]+)?(?![\\p{L}\\p{N}_.])");
    private static final Pattern BEARER=Pattern.compile("(?i)Bearer\\s+([^\\s,;]+)");
    private static final Pattern LABELLED=Pattern.compile("(?i)(?:token|senha|password|secret|authorization|consumer[_-]?key)\\s*[=:]\\s*([^\\s,;]+)");
    private static final Pattern LONG_NUMBER=Pattern.compile("[\\p{Nd}]{11,}");
    // A projection may decline expensive text; it must never retain a partially sanitized value.
    private static final int MAX_DIAGNOSTIC_INPUT=8192;
    private static final long MAX_MATCH_WORK=8_388_608;
    private static final Set<String> PUBLIC_FIELDS=publicFields();
    private final Set<String> literals=new HashSet<>();
    private final Set<String> opaqueValues=new HashSet<>();
    private final Set<String> capabilities=new HashSet<>();
    private final Set<String> snapshotValues=new HashSet<>();
    private final Set<BigDecimal> numericValues=new HashSet<>();
    Secrets(Credentials credentials,JsonNode snapshot) { literals.addAll(credentials.secrets()); collect(snapshot,false); }
    private void collect(JsonNode node,boolean sensitive) {
        if (node.isObject()) {
            for (var e : node.properties()) {
                // Declared member names describe structure. Unknown extension keys can contain private data.
                if(!PUBLIC_FIELDS.contains(e.getKey()))snapshotValues.add(e.getKey());
                String key=java.text.Normalizer.normalize(e.getKey(),java.text.Normalizer.Form.NFKC).toLowerCase(java.util.Locale.ROOT);
                collect(e.getValue(),sensitive || key.matches(".*(senha|password|secret|token|certificad|authorization|consumer|access.key|cpf|cnpj|email|telefone|phone).*"));

            }
        } else if (node.isArray()) { for (JsonNode child:node) collect(child,sensitive); }
        else if (!node.isNull()) {
            String value=node.asText();
            if(!node.isBoolean() && !value.isEmpty()) {
                BigDecimal number=number(value);
                if(number!=null)numericValues.add(number);else snapshotValues.add(value);
            }
            if(sensitive && !node.isBoolean() && !value.isEmpty())literals.add(value);
            if (value.matches("(?is).*https?://.*")) {
                literals.add(value);
                var urls=Pattern.compile("(?i)https?://[^\\s\"'<>]+").matcher(value);
                while(urls.find())observeLocation(urls.group());
            }
        }
    }
    private static Set<String> publicFields() {
        var names=new HashSet<String>();names.add("body");var modules=new HashSet<String>();
        for(String id:Contract.operationIds())modules.add(Contract.operation(id).path("module").asText());
        for(String module:modules)collectPublicFields(Contract.document(module),names);
        return Set.copyOf(names);
    }
    private static void collectPublicFields(JsonNode node,Set<String> names) {
        if(node.isObject()) {
            if(node.path("properties").isObject())for(var e:node.path("properties").properties())names.add(e.getKey());
            if(node.has("in") && node.path("name").isTextual())names.add(node.path("name").asText());
            for(JsonNode child:node)collectPublicFields(child,names);
        } else if(node.isArray())for(JsonNode child:node)collectPublicFields(child,names);
    }
    void inheritProtections(Secrets previous) { literals.addAll(previous.literals);opaqueValues.addAll(previous.opaqueValues);capabilities.addAll(previous.capabilities); }
    void capability(String value) { addCapability(value); }
    private void addCapability(String value) { if(UUID.matcher(value).matches())capabilities.add(asciiLower(value));else if(!value.isEmpty())opaqueValues.add(value); }
    boolean contains(String text) {
        if (text==null)return false;
        for(String secret:literals)if(!secret.isEmpty() && text.contains(secret))return true;
        for(String secret:opaqueValues)if(hasLiteral(text,secret,secret.length()<=2))return true;
        String lower=asciiLower(text);for(String capability:capabilities)if(lower.contains(capability))return true;
        return false;
    }
    boolean isCredential(String text,Credentials credentials) { for(String secret:credentials.secrets())if(text.contains(secret))return true;return false; }
    String correlation(String value) {
        if(value==null || value.length()>64 || !value.matches("[A-Za-z0-9_-]{1,64}") || contains(value) || snapshotValues.stream().anyMatch(x -> hasLiteral(value,x,x.length()<=2)) || value.codePoints().filter(Character::isDigit).count()>=11)return null;
        var numeric=NUMERIC.matcher(value);while(numeric.find())if(numericKnown(numeric.group()))return null;
        return value;
    }
    void observeResponse(JsonNode value) { observeResponse(value,false); }
    private void observeResponse(JsonNode node,boolean sensitive) {
        if(node.isObject())for(var e:node.properties())observeResponse(e.getValue(),sensitive || e.getKey().toLowerCase(java.util.Locale.ROOT).matches(".*(senha|password|secret|token|certificad|authorization|consumer|access.key|cpf|cnpj|email|telefone|phone).*"));
        else if(node.isArray())for(JsonNode child:node)observeResponse(child,sensitive);
        else if(node.isValueNode() && !node.isNull()) {
            String text=node.asText();if(sensitive && !node.isBoolean() && !text.isEmpty())literals.add(text);
            var urls=Pattern.compile("(?i)https?://[^\\s\"'<>]+").matcher(text);
            while(urls.find())observeLocation(urls.group());
        }
    }
    void observeLocation(String value) {
        if(value==null || value.isEmpty())return;
        opaqueValues.add(value);
        observeLocationParts(value,true);
        String decoded=decodeRuns(value);
        if(!decoded.equals(value))observeLocationParts(decoded,false);
    }
    private void observeLocationParts(String value,boolean decodeComponents) {
        // This lexical split protects diagnostics; it never validates, resolves or accepts a destination.
        int fragment=value.indexOf('#');int end=fragment>=0?fragment:value.length();
        int query=value.indexOf('?');if(query<0 || query>=end)query=-1;
        int pathEnd=query>=0?query:end;int pathStart=0;int authorityStart=-1;
        if(value.startsWith("//"))authorityStart=2;
        else {
            int marker=value.indexOf("://");
            if(marker>0 && marker<pathEnd && value.substring(0,marker).matches("[^/\\?#\\s]+"))authorityStart=marker+3;
            else {
                int colon=value.indexOf(':');
                if(colon>=0 && colon<pathEnd && value.substring(0,colon).matches("[A-Za-z][A-Za-z0-9+.-]*"))pathStart=colon+1<pathEnd && value.charAt(colon+1)=='/'?colon+1:pathEnd;
            }
        }
        if(authorityStart>=0) {
            int slash=value.indexOf('/',authorityStart);pathStart=slash>=0 && slash<pathEnd?slash:pathEnd;
            String authority=value.substring(Math.min(authorityStart,pathEnd),pathStart);protectOpaque(authority,false,decodeComponents);protectAssignments(authority,false,decodeComponents);
            int at=authority.lastIndexOf('@');
            if(at>=0) {
                String userInfo=authority.substring(0,at);protectOpaque(userInfo,false,decodeComponents);int colon=userInfo.indexOf(':');
                if(colon>=0){protectOpaque(userInfo.substring(0,colon),false,decodeComponents);protectOpaque(userInfo.substring(colon+1),false,decodeComponents);}
            }
        }
        String path=value.substring(Math.min(pathStart,pathEnd),pathEnd);
        var raw=UUID.matcher(path);while(raw.find())addCapability(raw.group());
        int matrix=path.indexOf(';');if(matrix>=0)protectAssignments(path.substring(matrix+1),false,decodeComponents);
        if(query>=0)protectAssignments(value.substring(query+1,end),true,decodeComponents);
        if(fragment>=0){String tail=value.substring(fragment+1);protectOpaque(tail,false,decodeComponents);protectAssignments(tail,false,decodeComponents);}
    }
    private static String decodeRuns(String value) {
        // Valid runs decode independently; malformed neighbors do not hide delimiters or path UUIDs.
        var encoded=PERCENT.matcher(value);StringBuilder decoded=new StringBuilder();int previous=0;
        while(encoded.find()){decoded.append(value,previous,encoded.start()).append(URLDecoder.decode(encoded.group(),StandardCharsets.UTF_8));previous=encoded.end();}
        return decoded.append(value,previous,value.length()).toString();
    }
    private void protectAssignments(String value,boolean formEncoded,boolean decodeComponents) {
        for(String pair:value.split("[&;]")){int equal=pair.indexOf('=');if(equal>=0)protectOpaque(pair.substring(equal+1),formEncoded,decodeComponents);}
    }
    private void protectOpaque(String value,boolean formEncoded,boolean decodeComponents) {
        if(value.isEmpty())return;
        opaqueValues.add(value);
        if(decodeComponents)opaqueValues.add(decodeRuns(formEncoded?value.replace("+"," "):value));
    }
    String redact(String text,int maximum) {
        if(text.length()>MAX_DIAGNOSTIC_INPUT)return "[truncated]";
        // Display cleanup is length-preserving. Search both representations before
        // rendering so cleanup cannot create a known private value after matching.
        char[] displayChars=null;
        for(int i=0;i<text.length();i++) {
            char ch=text.charAt(i);
            if(Character.isISOControl(ch)&&ch!='\n'&&ch!='\t') {
                if(displayChars==null)displayChars=text.toCharArray();
                displayChars[i]=' ';
            }
        }
        String display=displayChars==null?text:new String(displayChars);
        var inputs=displayChars==null?java.util.List.of(text):java.util.List.of(text,display);
        long work=1;for(BigDecimal value:numericValues)work+=1L+value.precision();
        for(var group:java.util.List.of(literals,opaqueValues,capabilities,snapshotValues))for(String value:group)work+=1L+value.length();
        if(work*text.length()*inputs.size()>MAX_MATCH_WORK)return "[truncated]";
        // Each index stores the furthest original end of a match starting there. No marker is searched.
        int[] ends=new int[text.length()+1],urls=new int[text.length()+1],numbers=new int[text.length()+1];
        for(String input:inputs) {
            for(String value:literals)markLiteral(input,value,false,ends);
            for(String value:opaqueValues)markLiteral(input,value,value.length()<=2,ends);
            String lower=asciiLower(input);for(String value:capabilities)markLiteral(lower,value,false,ends);
            for(String value:snapshotValues)markLiteral(input,value,value.length()<=2,ends);
            var numeric=NUMERIC.matcher(input);while(numeric.find())if(numericKnown(numeric.group()))mark(ends,numeric.start(),numeric.end());
            var url=URL.matcher(input);while(url.find())mark(urls,url.start(),url.end());
            for(Pattern pattern:java.util.List.of(BEARER,LABELLED)){var match=pattern.matcher(input);while(match.find())mark(ends,match.start(1),match.end(1));}
            var digits=LONG_NUMBER.matcher(input);while(digits.find())mark(numbers,digits.start(),digits.end());
        }
        var safe=new StringBuilder();int cursor=0;
        while(cursor<text.length()) {
            int end=Math.max(ends[cursor],Math.max(urls[cursor],numbers[cursor]));
            if(end==0){safe.append(display.charAt(cursor++));continue;}
            boolean isUrl=urls[cursor]>0,privateValue=ends[cursor]>0;
            // Extend only across actual overlap; adjacent independent values retain separate markers.
            for(int next=cursor+1;next<end;next++){end=Math.max(end,Math.max(ends[next],Math.max(urls[next],numbers[next])));isUrl|=urls[next]>0;privateValue|=ends[next]>0;}
            safe.append(isUrl?"[redacted-url]":privateValue?"[redacted]":"[redacted-number]");cursor=end;
        }
        return safe.length()>maximum?safe.substring(0,maximum)+"…":safe.toString();
    }
    private static void mark(int[] ends,int start,int end){ends[start]=Math.max(ends[start],end);}
    private static boolean word(int point){return Character.isLetterOrDigit(point)||point=='_';}
    private static boolean boundary(String text,int start,int end){return (start==0||!word(text.codePointBefore(start)))&&(end==text.length()||!word(text.codePointAt(end)));}
    private static boolean hasLiteral(String text,String value,boolean bounded) {
        if(value.isEmpty())return false;
        for(int start=text.indexOf(value);start>=0;start=text.indexOf(value,start+1))if(!bounded||boundary(text,start,start+value.length()))return true;
        return false;
    }
    private static void markLiteral(String text,String value,boolean bounded,int[] ends) {
        if(!value.isEmpty())for(int start=text.indexOf(value);start>=0;start=text.indexOf(value,start+1))if(!bounded||boundary(text,start,start+value.length()))mark(ends,start,start+value.length());
    }
    private static String asciiLower(String value) {
        var result=new StringBuilder(value.length());for(int i=0;i<value.length();i++){char ch=value.charAt(i);result.append(ch>='A'&&ch<='Z'?(char)(ch+('a'-'A')):ch);}return result.toString();
    }
    private static BigDecimal number(String value) {
        if(value.length()>Json.MAX_NUMBER_LENGTH || !NUMERIC.matcher(value).matches())return null;
        try{return new BigDecimal(value);}catch(NumberFormatException e){return null;}
    }
    private boolean numericKnown(String value) {
        BigDecimal candidate=number(value);if(candidate==null)return false;
        for(BigDecimal known:numericValues)if(known.compareTo(candidate)==0)return true;
        return false;
    }
    Reference reference(JsonNode snapshot,Credentials credentials) {
        JsonNode body=snapshot.path("body");
        for(String field:new String[]{"ID","id","uuid","chave","key","fd","report","identifier"}) {
            JsonNode v=body.has(field)?body.get(field):snapshot.get(field);
            if(v!=null && v.isValueNode() && !v.isNull()) {
                String text=v.asText();
                if(text.length()<=256 && !text.isEmpty() && text.codePoints().noneMatch(Character::isISOControl) && !isCredential(text,credentials) && !contains(text))return new Reference(field,text);
            }
        }
        return null;
    }
}
