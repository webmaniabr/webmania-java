package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFiltrosCategoria extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"string\",\"enum\":[\"emitidas\",\"recebidas\",\"transportadas\",\"citadas\",\"transportes_contratados\",\"proprietario_veiculos\"]},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"enum\":[\"emitidas\",\"recebidas\",\"transportadas\",\"citadas\",\"transportes_contratados\",\"proprietario_veiculos\"]},\"minItems\":1}]}");
 public MonitorSearchRequestFiltrosCategoria(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorSearchRequestFiltrosCategoria ofVariant0(String value) { return new MonitorSearchRequestFiltrosCategoria(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public String asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return stringValue(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorSearchRequestFiltrosCategoria ofVariant1(java.util.List<String> value) { return new MonitorSearchRequestFiltrosCategoria(array(value, v -> Json.scalar(v))); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<String> asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> stringValue(v)); }
}
