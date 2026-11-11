package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class EmitterGetNfcomResponse extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/NfcomFiscalResponse\"},{\"$ref\":\"#/components/schemas/EmitterFunctionalError\"}]}");
 public EmitterGetNfcomResponse(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterGetNfcomResponse ofVariant0(NfcomFiscalResponse value) { return new EmitterGetNfcomResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_0); }
 public NfcomFiscalResponse asVariant0() { JsonNode value = checkedVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new NfcomFiscalResponse(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterGetNfcomResponse ofVariant1(EmitterFunctionalError value) { return new EmitterGetNfcomResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_1); }
 public EmitterFunctionalError asVariant1() { JsonNode value = checkedVariant("api2/emitter-reads.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new EmitterFunctionalError(value); }
}
