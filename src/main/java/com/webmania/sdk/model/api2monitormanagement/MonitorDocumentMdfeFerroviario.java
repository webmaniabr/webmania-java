package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeFerroviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("trem", "vagoes");
 public MonitorDocumentMdfeFerroviario() { super(FIELDS); }
 public MonitorDocumentMdfeFerroviario(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentMdfeFerroviarioTrem getTrem() { return (field("trem")).isNull() || (field("trem")).isMissingNode() ? null : new MonitorDocumentMdfeFerroviarioTrem(field("trem")); }
 public MonitorDocumentMdfeFerroviario setTrem(MonitorDocumentMdfeFerroviarioTrem value) { put("trem", value == null ? null : value.toJson()); return this; }
 public java.util.List<MonitorDocumentMdfeFerroviarioVagoesItem> getVagoes() { return list(field("vagoes"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeFerroviarioVagoesItem(v)); }
 public MonitorDocumentMdfeFerroviario setVagoes(java.util.List<MonitorDocumentMdfeFerroviarioVagoesItem> value) { put("vagoes", array(value, v -> v == null ? null : v.toJson())); return this; }
}
