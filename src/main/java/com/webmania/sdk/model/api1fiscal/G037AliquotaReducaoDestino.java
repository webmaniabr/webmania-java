package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G037AliquotaReducaoDestino extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,3}(?:\\\\.[0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":3,\"x-decimal-scale-maximum\":2,\"description\":\"Percentual de redu\\u00e7\\u00e3o da base de c\\u00e1lculo do ICMS no destino (DIFAL), diferente da redu\\u00e7\\u00e3o da origem. Na cria\\u00e7\\u00e3o/edi\\u00e7\\u00e3o da classe, \\u00e9 normalizado para 2 casas decimais nos c\\u00f3digos 20, 70, 90, 201, 202, 203 e 900. | 0.00\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"3v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"svg_optional\"]}]}");
 public G037AliquotaReducaoDestino(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G037AliquotaReducaoDestino ofVariant0(String value) { return new G037AliquotaReducaoDestino(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G037AliquotaReducaoDestino ofVariant1(java.math.BigDecimal value) { return new G037AliquotaReducaoDestino(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
