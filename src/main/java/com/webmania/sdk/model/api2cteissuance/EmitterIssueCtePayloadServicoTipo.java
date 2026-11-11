package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadServicoTipo extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"0\",0,\"1\",1,\"2\",2,\"3\",3,\"4\",4]},{\"type\":[\"number\",\"string\"],\"pattern\":\"^-?(?:\\\\d+\\\\.?\\\\d*|\\\\.\\\\d+)(?:[eE][+-]?\\\\d+)?$\",\"enum\":[\"6\",6,\"7\",7,\"8\",8]}],\"description\":\"Tipo do servi\\u00e7o que est\\u00e1 sendo prestado. 0 - Normal (Padr\\u00e3o) 1 - Subcontrata\\u00e7\\u00e3o 2 - Redespacho 3 - Redespacho Intermedi\\u00e1rio 4 - Servi\\u00e7o Vinculado a Multimodal\",\"x-documented-condition\":\"Tipo do servi\\u00e7o que est\\u00e1 sendo prestado. 0 - Normal (Padr\\u00e3o) 1 - Subcontrata\\u00e7\\u00e3o 2 - Redespacho 3 - Redespacho Intermedi\\u00e1rio 4 - Servi\\u00e7o Vinculado a Multimodal\",\"x-documented-size\":\"1\"}");
 public EmitterIssueCtePayloadServicoTipo(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static EmitterIssueCtePayloadServicoTipo ofVariant0(EmitterIssueCtePayloadServicoTipoVariant0 value) { return new EmitterIssueCtePayloadServicoTipo(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public EmitterIssueCtePayloadServicoTipoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueCtePayloadServicoTipoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static EmitterIssueCtePayloadServicoTipo ofVariant1(EmitterIssueCtePayloadServicoTipoVariant1 value) { return new EmitterIssueCtePayloadServicoTipo(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public EmitterIssueCtePayloadServicoTipoVariant1 asVariant1() { JsonNode value = checkedVariant("api2/cte-issuance.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new EmitterIssueCtePayloadServicoTipoVariant1(value); }
}
