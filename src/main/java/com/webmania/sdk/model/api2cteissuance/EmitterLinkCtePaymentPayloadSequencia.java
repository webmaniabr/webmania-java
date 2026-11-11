package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterLinkCtePaymentPayloadSequencia extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"minimum\":1,\"x-sdk-numeric-minimum\":\"1\",\"maximum\":999,\"x-sdk-numeric-maximum\":\"999\"},{\"type\":\"null\"}]}");
 public EmitterLinkCtePaymentPayloadSequencia(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterLinkCtePaymentPayloadSequencia ofVariant0(EmitterLinkCtePaymentPayloadSequenciaVariant0 value) { return new EmitterLinkCtePaymentPayloadSequencia(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterLinkCtePaymentPayloadSequenciaVariant0 asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterLinkCtePaymentPayloadSequenciaVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterLinkCtePaymentPayloadSequencia ofVariant1(JsonValue value) { return new EmitterLinkCtePaymentPayloadSequencia(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
