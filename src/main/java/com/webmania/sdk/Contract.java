package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/** Runtime validation of the executable subset used in the pinned OpenAPI contracts. */
public final class Contract {
    private static final Map<String,JsonNode> DOCUMENTS = new HashMap<>();
    private static final Map<String,JsonNode> OPERATIONS = new HashMap<>();
    static {
        JsonNode manifest = resource("manifest.json");
        for (JsonNode file : manifest.path("contracts")) {
            String rel = file.asText().substring("contracts/".length()); DOCUMENTS.put(rel, resource(rel));
        }
        for (JsonNode op : resource("operations.json")) OPERATIONS.put(op.path("id").asText(), op);
    }
    private Contract() { }
    private static JsonNode resource(String path) {
        try (var in = Contract.class.getResourceAsStream("/contracts/" + path)) {
            if (in == null) throw new IOException(); return Json.parse(in.readAllBytes());
        } catch (IOException e) { throw new IllegalStateException("Missing bundled contract"); }
    }
    public static java.util.Set<String> operationIds() { return java.util.Set.copyOf(OPERATIONS.keySet()); }
    static JsonNode operation(String id) { JsonNode op = OPERATIONS.get(id); if (op == null) throw new IllegalArgumentException("Unknown operation"); return op; }
    static JsonNode document(String module) { JsonNode d = DOCUMENTS.get(module); if (d == null) throw new IllegalArgumentException("Unknown contract module"); return d; }
    static JsonNode operationSchema(JsonNode metadata) { return document(metadata.path("module").asText()).path("paths").path(metadata.path("path").asText()).path(metadata.path("method").asText().toLowerCase(java.util.Locale.ROOT)); }
    static boolean declares(JsonNode schema,String property,JsonNode doc,int depth) {
        if(depth>256)return false;
        if(schema.path("properties").has(property))return true;
        if(schema.has("$ref") && declares(doc.at(schema.path("$ref").asText().substring(1)),property,doc,depth+1))return true;
        for(String group:new String[]{"allOf","anyOf","oneOf"})for(JsonNode branch:schema.path(group))if(declares(branch,property,doc,depth+1))return true;
        return false;
    }
    public static boolean accepts(String module, String pointer, JsonValue value) { return valid(document(module).at(pointer.substring(1)), value.toJson(), document(module), 0); }
    static void validate(JsonNode schema, JsonNode value, JsonNode document) {
        if (!valid(schema, value, document, 0)) throw new IllegalArgumentException("Request does not satisfy the bundled contract");
        ConditionalRules.validate(schema,value,document);
    }
    static boolean valid(JsonNode s, JsonNode v, JsonNode doc, int depth) { return valid(s,v,doc,depth,false); }
    static boolean validResponse(JsonNode s,JsonNode v,JsonNode doc) { return valid(s,v,doc,0,true); }
    private static boolean valid(JsonNode s, JsonNode v, JsonNode doc, int depth, boolean forward) {
        if (depth > 256) return false;
        if (s.isBoolean()) return s.booleanValue();
        if (!s.isObject()) return true;
        if (s.has("$ref") && !valid(doc.at(s.path("$ref").asText().substring(1)), v, doc, depth+1, forward)) return false;
        if (s.has("type")) {
            boolean matched = false;
            if (s.path("type").isArray()) { for (JsonNode t : s.path("type")) matched |= type(t.asText(), v); }
            else matched = type(s.path("type").asText(), v);
            if (!matched) return false;
        }
        if (!forward && s.has("enum")) { boolean matched = false; for (JsonNode c : s.path("enum")) matched |= equal(c,v); if (!matched) return false; }
        if (s.has("const") && !equal(s.get("const"),v)) return false;
        if (s.has("allOf")) for (JsonNode x : s.get("allOf")) if (!valid(x,v,doc,depth+1,forward)) return false;
        for (String keyword : new String[]{"anyOf", "oneOf"}) if (s.has(keyword)) {
            int matched = 0; for (JsonNode x : s.get(keyword)) if (valid(x,v,doc,depth+1,forward)) matched++;
            if (matched == 0 || (!forward && keyword.equals("oneOf") && matched != 1)) return false;
        }
        if (s.has("not") && valid(s.get("not"),v,doc,depth+1,forward)) return false;
        if (s.has("if")) {
            String branch = valid(s.get("if"),v,doc,depth+1,forward) ? "then" : "else";
            if (s.has(branch) && !valid(s.get(branch),v,doc,depth+1,forward)) return false;
        }
        if (v.isObject()) {
            for (JsonNode key : s.path("required")) if (!v.has(key.asText())) return false;
            var fields = v.properties().iterator();
            while (fields.hasNext()) {
                var field = fields.next(); JsonNode child = s.path("properties").get(field.getKey());
                if (child != null) { if (!valid(child,field.getValue(),doc,depth+1,forward)) return false; }
                else if (s.has("additionalProperties")) {
                    if (!valid(s.get("additionalProperties"),field.getValue(),doc,depth+1,forward)) return false;
                }
            }
            var dependent = s.path("dependentRequired").properties().iterator();
            while (dependent.hasNext()) { var x = dependent.next(); if (v.has(x.getKey())) for (JsonNode k : x.getValue()) if (!v.has(k.asText())) return false; }
            if (s.has("minProperties") && v.size() < s.get("minProperties").intValue()) return false;
            if (s.has("maxProperties") && v.size() > s.get("maxProperties").intValue()) return false;
        }
        if (v.isArray()) {
            if (s.has("minItems") && v.size() < s.get("minItems").intValue()) return false;
            if (s.has("maxItems") && v.size() > s.get("maxItems").intValue()) return false;
            if (s.has("items")) for (JsonNode child : v) if (!valid(s.get("items"),child,doc,depth+1,forward)) return false;
            if (s.path("uniqueItems").asBoolean()) for (int i=0;i<v.size();i++) for (int j=i+1;j<v.size();j++) if (equal(v.get(i),v.get(j))) return false;
        }
        if (v.isTextual()) {
            String text=v.textValue(); int size=text.codePointCount(0,text.length());
            if (s.has("minLength") && size < s.get("minLength").intValue()) return false;
            if (s.has("maxLength") && size > s.get("maxLength").intValue()) return false;
            if (s.has("pattern") && !Pattern.compile(s.get("pattern").asText()).matcher(text).find()) return false;
            if (s.has("format") && !format(s.get("format").asText(),text)) return false;
        }
        if (v.isNumber()) {
            BigDecimal n=v.decimalValue();
            if (s.has("minimum") && n.compareTo(s.get("minimum").decimalValue()) < 0) return false;
            if (s.has("maximum") && n.compareTo(s.get("maximum").decimalValue()) > 0) return false;
            if (s.has("exclusiveMinimum") && n.compareTo(s.get("exclusiveMinimum").decimalValue()) <= 0) return false;
            if (s.has("exclusiveMaximum") && n.compareTo(s.get("exclusiveMaximum").decimalValue()) >= 0) return false;
            if (s.has("multipleOf") && !multipleOf(n,s.get("multipleOf").decimalValue())) return false;
        }
        if ((v.isNumber() || v.isTextual()) && (s.has("x-sdk-numeric-minimum") || s.has("x-sdk-numeric-maximum"))) {
            try {
                BigDecimal n=new BigDecimal(v.asText());
                if (s.has("x-sdk-numeric-minimum") && n.compareTo(new BigDecimal(s.get("x-sdk-numeric-minimum").asText())) < 0) return false;
                if (s.has("x-sdk-numeric-maximum") && n.compareTo(new BigDecimal(s.get("x-sdk-numeric-maximum").asText())) > 0) return false;
            } catch (NumberFormatException e) { return false; }
        }
        return true;
    }
    private static boolean equal(JsonNode a,JsonNode b) { return a.isNumber() && b.isNumber() ? a.decimalValue().compareTo(b.decimalValue())==0 : a.equals(b); }
    private static boolean type(String type, JsonNode n) { return switch(type) { case "object" -> n.isObject(); case "array" -> n.isArray(); case "string" -> n.isTextual(); case "integer" -> n.isNumber() && (n.decimalValue().scale()<=0 || n.decimalValue().stripTrailingZeros().scale() <= 0); case "number" -> n.isNumber(); case "boolean" -> n.isBoolean(); case "null" -> n.isNull(); default -> false; }; }
    /** Exact decimal divisibility without constructing 10^scale for compact exponents. */
    private static boolean multipleOf(BigDecimal number,BigDecimal divisor) {
        if(divisor.signum()<=0)return false;
        if(number.signum()==0)return true;
        var numerator=number.unscaledValue().abs();var denominator=divisor.unscaledValue().abs();
        var common=numerator.gcd(denominator);numerator=numerator.divide(common);denominator=denominator.divide(common);
        long shift=(long)divisor.scale()-number.scale();
        var five=java.math.BigInteger.valueOf(5);
        if(shift>=0) {
            int twos=denominator.getLowestSetBit();if(twos>shift)return false;denominator=denominator.shiftRight(twos);
            long fives=0;while(!denominator.equals(java.math.BigInteger.ONE) && denominator.remainder(five).signum()==0){if(++fives>shift)return false;denominator=denominator.divide(five);}
            return denominator.equals(java.math.BigInteger.ONE);
        }
        if(!denominator.equals(java.math.BigInteger.ONE))return false;
        long places=-shift;if(places>numerator.getLowestSetBit())return false;
        // places is now bounded by the physically present coefficient, not its exponent.
        return numerator.remainder(five.pow((int)places)).signum()==0;
    }
    private static boolean format(String format,String text) {
        try { switch (format) {
            case "uuid": return text.matches("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
            case "date": LocalDate.parse(text); return true;
            case "date-time": OffsetDateTime.parse(text); return true;
            case "email": return text.matches("[^\\s@]+@[^\\s@]+\\.[^\\s@]+");
            case "uri": return java.net.URI.create(text).isAbsolute();
            default: return true;
        }} catch (RuntimeException e) { return false; }
    }
}
