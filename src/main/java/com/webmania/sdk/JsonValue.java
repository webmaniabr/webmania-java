package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.util.List;
import java.util.function.Function;

/** A JSON value with defensive copies and deliberately redacted string rendering. */
public class JsonValue {
    protected JsonNode node;
    public JsonValue(JsonNode value) { if (value == null) value = JsonNodeFactory.instance.nullNode(); Json.checkDepth(value, 0); node = value.deepCopy(); }
    public final JsonNode toJson() { return node.deepCopy(); }
    public final byte[] toJsonBytes() { return Json.bytes(node); }
    @Override public final String toString() { return getClass().getSimpleName() + "[redacted]"; }
    protected final JsonNode field(String name) { return node.path(name); }
    protected final void put(String name, JsonNode value) {
        Json.checkText(name);
        if (!node.isObject()) throw new IllegalStateException("Expected an object model");
        if (value != null) Json.checkDepth(value, 1);
        ((com.fasterxml.jackson.databind.node.ObjectNode) node).set(name, value == null ? JsonNodeFactory.instance.nullNode() : value.deepCopy());
    }
    protected final void remove(String name) { ((com.fasterxml.jackson.databind.node.ObjectNode) node).remove(name); }
    private static boolean absent(JsonNode value) { return value==null || value.isMissingNode() || value.isNull(); }
    protected static String stringValue(JsonNode value) {
        if(absent(value))return null;
        if(!value.isTextual())throw new IllegalStateException("Expected JSON string");
        return value.textValue();
    }
    protected static Boolean booleanValue(JsonNode value) {
        if(absent(value))return null;
        if(!value.isBoolean())throw new IllegalStateException("Expected JSON boolean");
        return value.booleanValue();
    }
    private static java.math.BigDecimal exactNumber(JsonNode value) {
        if(!value.isNumber() || value.isFloatingPointNumber() && !value.isBigDecimal())throw new IllegalStateException("Expected exact JSON number");
        return value.decimalValue();
    }
    protected static java.math.BigDecimal decimalValue(JsonNode value) { return absent(value)?null:exactNumber(value); }
    protected static java.math.BigInteger integerValue(JsonNode value) {
        if(absent(value))return null;
        java.math.BigDecimal number=exactNumber(value);
        if(number.signum()==0)return java.math.BigInteger.ZERO;
        // Already materialized integers need no expansion or division.
        if(value.isIntegralNumber())return value.bigIntegerValue();
        if(number.scale()==0)return number.unscaledValue();
        if((long)number.precision()-number.scale()>Json.MAX_EXPANDED_INTEGER_DIGITS)throw new IllegalStateException("Typed integer exceeds expanded digit limit");
        if((long)number.precision()-number.scale()<=0)throw new IllegalStateException("Expected mathematical JSON integer");
        if(number.scale()>Json.MAX_INTEGER_CONVERSION_SCALE)throw new IllegalStateException("Typed integer conversion exceeds work limit");
        try{return number.toBigIntegerExact();}catch(ArithmeticException e){throw new IllegalStateException("Expected mathematical JSON integer");}
    }
    private boolean acceptsVariant(String module,JsonNode schema,JsonNode branch) {
        try {
            JsonNode document=Contract.document(module);
            Contract.validate(schema,node,document);
            if(schema!=branch)Contract.validate(branch,node,document);
            return true;
        }catch(RuntimeException e){return false;}
    }
    /** Neither these predicates nor generated matchesVariantN methods are JavaBean properties. */
    protected final boolean matchesVariant(String module,JsonNode schema,JsonNode branch) {
        try{Json.checkDepth(node,0);return acceptsVariant(module,schema,branch);}catch(RuntimeException e){return false;}
    }
    protected final JsonNode checkedVariant(String module,JsonNode schema,JsonNode branch) {
        Json.checkDepth(node,0);
        if(!acceptsVariant(module,schema,branch))throw new IllegalStateException("JSON value does not match requested variant");
        return node;
    }
    protected static <T> List<T> list(JsonNode n, Function<JsonNode,T> factory) {
        if (n.isMissingNode() || n.isNull()) return null;
        if (!n.isArray()) throw new IllegalStateException("Expected array");
        java.util.ArrayList<T> out = new java.util.ArrayList<>(); for (JsonNode v : n) out.add(factory.apply(v)); return java.util.Collections.unmodifiableList(out);
    }
    protected static <T> JsonNode array(List<T> values, Function<T,JsonNode> factory) {
        if (values == null) return JsonNodeFactory.instance.nullNode();
        var out = JsonNodeFactory.instance.arrayNode(); for (T v : values) out.add(v == null ? JsonNodeFactory.instance.nullNode() : factory.apply(v)); return out;
    }
    public static JsonValue fromJson(JsonNode value) { return new JsonValue(value); }
}
