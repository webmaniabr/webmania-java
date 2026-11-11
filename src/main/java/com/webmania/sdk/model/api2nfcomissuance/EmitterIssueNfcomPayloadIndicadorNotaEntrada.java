package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadIndicadorNotaEntrada extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1]},{\"type\":\"null\"}],\"description\":\"Indica se \\u00e9 nota de entrada 0 - N\\u00e3o (padr\\u00e3o) 1 - Nota de entrada\",\"x-documented-condition\":\"Indica se \\u00e9 nota de entrada 0 - N\\u00e3o (padr\\u00e3o) 1 - Nota de entrada\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadIndicadorNotaEntrada(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadIndicadorNotaEntrada ofVariant0(EmitterIssueNfcomPayloadIndicadorNotaEntradaVariant0 value) { return new EmitterIssueNfcomPayloadIndicadorNotaEntrada(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadIndicadorNotaEntradaVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadIndicadorNotaEntradaVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadIndicadorNotaEntrada ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadIndicadorNotaEntrada(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
