package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseLocalPrestacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\"},{\"type\":\"object\",\"properties\":{\"cidade\":{\"type\":\"string\"},\"uf\":{\"type\":\"string\"},\"codigo_municipio\":{\"type\":\"string\"}},\"additionalProperties\":true}]}");
 public MonitorDocumentNfseLocalPrestacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentNfseLocalPrestacao ofVariant0(String value) { return new MonitorDocumentNfseLocalPrestacao(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentNfseLocalPrestacao ofVariant1(MonitorDocumentNfseLocalPrestacaoVariant1 value) { return new MonitorDocumentNfseLocalPrestacao(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); }
 public MonitorDocumentNfseLocalPrestacaoVariant1 asVariant1() { JsonNode value = checkedVariant("api2/monitor-management.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentNfseLocalPrestacaoVariant1(value); }
}
