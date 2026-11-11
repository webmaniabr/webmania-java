package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G075AliquotaImportacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"pattern\":\"^-?[0-9]{1,3}(?:[.,][0-9]{1,2})?$\"},{\"type\":\"number\"}],\"x-sdk-scalar\":\"decimal-input\",\"x-sdk-preferred-representation\":\"string\",\"x-decimal-digits\":3,\"x-decimal-scale-maximum\":2,\"description\":\"*Obrigat\\u00f3rio para Nota Fiscal de importa\\u00e7\\u00e3o: | Al\\u00edquota do ICMS de importa\\u00e7\\u00e3o | 0.00\",\"x-documentation-type\":\"string\",\"x-documentation-size\":\"3v2\",\"x-documentation-requirements\":[{\"column\":\"NF-e / NFC-e\",\"markers\":[\"recomendado\",\"svg_required_optional\"]}]}");
 public G075AliquotaImportacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static G075AliquotaImportacao ofVariant0(String value) { return new G075AliquotaImportacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static G075AliquotaImportacao ofVariant1(java.math.BigDecimal value) { return new G075AliquotaImportacao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public java.math.BigDecimal asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return decimalValue(value); }
}
