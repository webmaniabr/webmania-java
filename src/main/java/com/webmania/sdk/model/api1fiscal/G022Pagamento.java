package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G022Pagamento extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"integer\",\"description\":\"Indicador da forma de pagamento | 0 - Pagamento \\u00e0 vista | 1 - Pagamento a prazo\"},{\"type\":\"array\",\"items\":{\"type\":\"integer\",\"description\":\"Indicador da forma de pagamento | 0 - Pagamento \\u00e0 vista | 1 - Pagamento a prazo\"},\"minItems\":1}]}");
 public G022Pagamento(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G022Pagamento ofVariant0(java.math.BigInteger value) { return new G022Pagamento(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigInteger asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return integerValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G022Pagamento ofVariant1(java.util.List<java.math.BigInteger> value) { return new G022Pagamento(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<java.math.BigInteger> asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> integerValue(v)); }
}
