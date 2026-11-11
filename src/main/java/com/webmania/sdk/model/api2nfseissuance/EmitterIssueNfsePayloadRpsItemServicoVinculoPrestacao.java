package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"V\\u00ednculo entre as partes no neg\\u00f3cio. 0 - Sem v\\u00ednculo com o Tomador/Prestador 1 - Controlada 2 - Controladora 3 - Coligada 4 - Matriz 5 - Filial ou sucursal 6 - Outro v\\u00ednculo\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"V\\u00ednculo entre as partes no neg\\u00f3cio. 0 - Sem v\\u00ednculo com o Tomador/Prestador 1 - Controlada 2 - Controladora 3 - Coligada 4 - Matriz 5 - Filial ou sucursal 6 - Outro v\\u00ednculo\"}");
 public EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"V\\u00ednculo entre as partes no neg\\u00f3cio. 0 - Sem v\\u00ednculo com o Tomador/Prestador 1 - Controlada 2 - Controladora 3 - Coligada 4 - Matriz 5 - Filial ou sucursal 6 - Outro v\\u00ednculo\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"V\\u00ednculo entre as partes no neg\\u00f3cio. 0 - Sem v\\u00ednculo com o Tomador/Prestador 1 - Controlada 2 - Controladora 3 - Coligada 4 - Matriz 5 - Filial ou sucursal 6 - Outro v\\u00ednculo\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao ofVariant0(java.math.BigDecimal value) { return new EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"V\\u00ednculo entre as partes no neg\\u00f3cio. 0 - Sem v\\u00ednculo com o Tomador/Prestador 1 - Controlada 2 - Controladora 3 - Coligada 4 - Matriz 5 - Filial ou sucursal 6 - Outro v\\u00ednculo\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"V\\u00ednculo entre as partes no neg\\u00f3cio. 0 - Sem v\\u00ednculo com o Tomador/Prestador 1 - Controlada 2 - Controladora 3 - Coligada 4 - Matriz 5 - Filial ou sucursal 6 - Outro v\\u00ednculo\"}");
 public static EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao ofVariant1(String value) { return new EmitterIssueNfsePayloadRpsItemServicoVinculoPrestacao(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/nfse-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
