package com.webmania.sdk;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.io.IOException;

/** Explicit JSON conversion. No polymorphic Java deserialization is enabled. */
public final class Json {
    public static final int MAX_DEPTH = 128;
    public static final int MAX_NUMBER_LENGTH = 1000;
    /** Only decimal-to-integer materialization is bounded; compact decimals keep their scale. */
    public static final int MAX_INTEGER_CONVERSION_SCALE = MAX_NUMBER_LENGTH;
    public static final int MAX_EXPANDED_INTEGER_DIGITS = MAX_NUMBER_LENGTH;
    private static final ObjectMapper MAPPER = new ObjectMapper(JsonFactory.builder()
        .streamReadConstraints(StreamReadConstraints.builder().maxNestingDepth(MAX_DEPTH)
            .maxStringLength(8_388_608).maxNumberLength(MAX_NUMBER_LENGTH).build())
        .enable(StreamReadFeature.STRICT_DUPLICATE_DETECTION).build())
        .enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)
        .enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)
        .enable(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
    // Token-only emitted-text inspection uses the same JSON engine without
    // imposing the reader's numeric/materialization limits on the writer.
    private static final JsonFactory EMITTED_TEXT = MAPPER.getFactory().copy().setStreamReadConstraints(
        StreamReadConstraints.builder().maxNestingDepth(Integer.MAX_VALUE)
            .maxStringLength(Integer.MAX_VALUE).maxNumberLength(Integer.MAX_VALUE).build());
    private Json() { }
    public static JsonNode parse(String value) { checkText(value);return parse(value.getBytes(java.nio.charset.StandardCharsets.UTF_8)); }
    public static JsonNode parse(byte[] value) {
        try { JsonNode node = MAPPER.readTree(value); if (node == null) throw new IOException();checkDepth(node,0);return node; }
        catch (IOException | RuntimeException e) { throw new IllegalArgumentException("Invalid JSON"); }
    }
    public static byte[] bytes(JsonNode value) {
        checkDepth(value, 0);
        try {
            byte[] written=MAPPER.writeValueAsBytes(value);
            // Inspect the actual emitted snapshot, including custom serializers,
            // without invoking a serializer, converter or caller getter twice.
            try(var parser=EMITTED_TEXT.createParser(written)) {
                while(parser.nextToken()!=null)if(parser.currentToken()==com.fasterxml.jackson.core.JsonToken.FIELD_NAME || parser.currentToken()==com.fasterxml.jackson.core.JsonToken.VALUE_STRING)checkText(parser.getText());
            }
            return written;
        }
        catch (IOException | RuntimeException e) { throw new IllegalArgumentException("JSON cannot be serialized"); }
    }
    static void checkDepth(JsonNode value, int depth) {
        if (depth > MAX_DEPTH) throw new IllegalArgumentException("JSON depth exceeds limit");
        if (value.isFloatingPointNumber() && !value.isBigDecimal()) {
            throw new IllegalArgumentException("Use BigDecimal instead of floating point");
        }
        if(value.isTextual())checkText(value.textValue());
        if(value.isObject())for(var entry:value.properties()){checkText(entry.getKey());checkDepth(entry.getValue(),depth+1);}
        else if (value.isContainerNode()) for (JsonNode child : value) checkDepth(child, depth + 1);
    }
    static void checkText(String value) {
        if(value==null)throw new IllegalArgumentException("Invalid Unicode text");
        for(int i=0;i<value.length();i++) {
            char unit=value.charAt(i);
            if(Character.isHighSurrogate(unit)){if(++i>=value.length() || !Character.isLowSurrogate(value.charAt(i)))throw new IllegalArgumentException("Invalid Unicode text");}
            else if(Character.isLowSurrogate(unit))throw new IllegalArgumentException("Invalid Unicode text");
        }
    }
    public static JsonNode scalar(String value) { if(value==null)return JsonNodeFactory.instance.nullNode();checkText(value);return JsonNodeFactory.instance.textNode(value); }
    public static JsonNode scalar(java.math.BigInteger value) { return value == null ? JsonNodeFactory.instance.nullNode() : JsonNodeFactory.instance.numberNode(value); }
    public static JsonNode scalar(java.math.BigDecimal value) { return value == null ? JsonNodeFactory.instance.nullNode() : JsonNodeFactory.instance.numberNode(value); }
    public static JsonNode scalar(Boolean value) { return value == null ? JsonNodeFactory.instance.nullNode() : JsonNodeFactory.instance.booleanNode(value); }
}
