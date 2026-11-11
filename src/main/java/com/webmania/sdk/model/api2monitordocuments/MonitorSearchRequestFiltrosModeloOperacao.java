package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFiltrosModeloOperacao extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":[\"integer\",\"string\"],\"enum\":[0,1,\"0\",\"1\"]},{\"type\":\"array\",\"items\":{\"type\":[\"integer\",\"string\"],\"enum\":[0,1,\"0\",\"1\"]},\"minItems\":1}]}");
 public MonitorSearchRequestFiltrosModeloOperacao(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorSearchRequestFiltrosModeloOperacao ofVariant0(MonitorSearchRequestFiltrosModeloOperacaoVariant0 value) { return new MonitorSearchRequestFiltrosModeloOperacao(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorSearchRequestFiltrosModeloOperacaoVariant0 asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorSearchRequestFiltrosModeloOperacaoVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorSearchRequestFiltrosModeloOperacao ofVariant1(java.util.List<MonitorSearchRequestFiltrosModeloOperacaoVariant1Item> value) { return new MonitorSearchRequestFiltrosModeloOperacao(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<MonitorSearchRequestFiltrosModeloOperacaoVariant1Item> asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorSearchRequestFiltrosModeloOperacaoVariant1Item(v)); }
}
