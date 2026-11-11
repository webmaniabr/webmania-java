package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1]},{\"type\":\"null\"}],\"description\":\"Indica cess\\u00e3o de meios de rede 0 - N\\u00e3o (padr\\u00e3o) 1 - Cess\\u00e3o de meios de rede Nota: Quando = 1, dispensa grupo Fatura\",\"x-documented-condition\":\"Indica cess\\u00e3o de meios de rede 0 - N\\u00e3o (padr\\u00e3o) 1 - Cess\\u00e3o de meios de rede Nota: Quando = 1, dispensa grupo Fatura\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede ofVariant0(EmitterIssueNfcomPayloadIndicadorCessaoMeiosRedeVariant0 value) { return new EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadIndicadorCessaoMeiosRedeVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadIndicadorCessaoMeiosRedeVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadIndicadorCessaoMeiosRede(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
