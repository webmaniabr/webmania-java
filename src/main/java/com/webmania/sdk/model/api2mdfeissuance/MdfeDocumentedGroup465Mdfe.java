package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeDocumentedGroup465Mdfe extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"N\\u00famero da MDF-e Gerenciado automaticamente pelo emissor.\"}");
 public MdfeDocumentedGroup465Mdfe(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"N\\u00famero da MDF-e Gerenciado automaticamente pelo emissor.\"}");
 public static MdfeDocumentedGroup465Mdfe ofVariant0(java.math.BigDecimal value) { return new MdfeDocumentedGroup465Mdfe(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"N\\u00famero da MDF-e Gerenciado automaticamente pelo emissor.\"}");
 public static MdfeDocumentedGroup465Mdfe ofVariant1(String value) { return new MdfeDocumentedGroup465Mdfe(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
