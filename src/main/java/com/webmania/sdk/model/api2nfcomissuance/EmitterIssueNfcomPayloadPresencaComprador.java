package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadPresencaComprador extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1,\"2\",2,\"3\",3,\"4\",4,\"9\",9]},{\"type\":\"null\"}],\"description\":\"Presen\\u00e7a do comprador 1 - Presencial 2 - Internet (padr\\u00e3o) 3 - Teleatendimento 4 - NFC-e entrega domic\\u00edlio 9 - Outros\",\"x-documented-condition\":\"Presen\\u00e7a do comprador 1 - Presencial 2 - Internet (padr\\u00e3o) 3 - Teleatendimento 4 - NFC-e entrega domic\\u00edlio 9 - Outros\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadPresencaComprador(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadPresencaComprador ofVariant0(EmitterIssueNfcomPayloadPresencaCompradorVariant0 value) { return new EmitterIssueNfcomPayloadPresencaComprador(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadPresencaCompradorVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadPresencaCompradorVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadPresencaComprador ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadPresencaComprador(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
