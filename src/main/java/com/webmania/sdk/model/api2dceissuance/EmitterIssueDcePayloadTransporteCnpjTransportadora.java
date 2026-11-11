package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadTransporteCnpjTransportadora extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"x-conditional-rules\":[\"Server cpf_cnpj validation and documented normalization apply; retain identifier strings.\"]},{\"type\":\"null\"}],\"description\":\"CNPJ da transportadora. Utilize quando a modalidade for 2 (empresa transportadora).\",\"x-documented-condition\":\"CNPJ da transportadora. Utilize quando a modalidade for 2 (empresa transportadora).\",\"x-documented-size\":\"14\"}");
 public EmitterIssueDcePayloadTransporteCnpjTransportadora(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueDcePayloadTransporteCnpjTransportadora ofVariant0(String value) { return new EmitterIssueDcePayloadTransporteCnpjTransportadora(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueDcePayloadTransporteCnpjTransportadora ofVariant1(JsonValue value) { return new EmitterIssueDcePayloadTransporteCnpjTransportadora(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/dce-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
