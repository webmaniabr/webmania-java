package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteFornecedorVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("razao_social", "documento", "uf");
 public MonitorDocumentCteFornecedorVariant0() { super(FIELDS); }
 public MonitorDocumentCteFornecedorVariant0(JsonNode node) { super(node, FIELDS); }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentCteFornecedorVariant0 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public MonitorDocumentCteFornecedorVariant0Documento getDocumento() { return (field("documento")).isNull() || (field("documento")).isMissingNode() ? null : new MonitorDocumentCteFornecedorVariant0Documento(field("documento")); }
 public MonitorDocumentCteFornecedorVariant0 setDocumento(MonitorDocumentCteFornecedorVariant0Documento value) { put("documento", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteFornecedorVariant0Uf getUf() { return (field("uf")).isNull() || (field("uf")).isMissingNode() ? null : new MonitorDocumentCteFornecedorVariant0Uf(field("uf")); }
 public MonitorDocumentCteFornecedorVariant0 setUf(MonitorDocumentCteFornecedorVariant0Uf value) { put("uf", value == null ? null : value.toJson()); return this; }
}
