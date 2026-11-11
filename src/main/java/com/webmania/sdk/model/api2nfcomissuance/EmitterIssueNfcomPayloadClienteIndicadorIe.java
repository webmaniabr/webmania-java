package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadClienteIndicadorIe extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"pattern\":\"^-?\\\\d+$\",\"enum\":[\"1\",1,\"2\",2,\"9\",9]},{\"type\":\"null\"}],\"description\":\"Indicador de Inscri\\u00e7\\u00e3o Estadual Obrigat\\u00f3rio para CNPJ 1 - Contribuinte ICMS 2 - Contribuinte isento 9 - N\\u00e3o Contribuinte (padr\\u00e3o para CPF)\",\"x-documented-condition\":\"Indicador de Inscri\\u00e7\\u00e3o Estadual Obrigat\\u00f3rio para CNPJ 1 - Contribuinte ICMS 2 - Contribuinte isento 9 - N\\u00e3o Contribuinte (padr\\u00e3o para CPF)\",\"x-documented-size\":\"1\"}");
 public EmitterIssueNfcomPayloadClienteIndicadorIe(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueNfcomPayloadClienteIndicadorIe ofVariant0(EmitterIssueNfcomPayloadClienteIndicadorIeVariant0 value) { return new EmitterIssueNfcomPayloadClienteIndicadorIe(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueNfcomPayloadClienteIndicadorIeVariant0 asVariant0() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteIndicadorIeVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueNfcomPayloadClienteIndicadorIe ofVariant1(JsonValue value) { return new EmitterIssueNfcomPayloadClienteIndicadorIe(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public JsonValue asVariant1() { JsonNode value = checkedVariant("api2/nfcom-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new JsonValue(value); }
}
