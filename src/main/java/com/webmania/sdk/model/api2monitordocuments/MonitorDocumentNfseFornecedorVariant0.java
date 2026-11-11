package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseFornecedorVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("razao_social", "documento", "uf");
 public MonitorDocumentNfseFornecedorVariant0() { super(FIELDS); }
 public MonitorDocumentNfseFornecedorVariant0(JsonNode node) { super(node, FIELDS); }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentNfseFornecedorVariant0 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public MonitorDocumentNfseFornecedorVariant0Documento getDocumento() { return (field("documento")).isNull() || (field("documento")).isMissingNode() ? null : new MonitorDocumentNfseFornecedorVariant0Documento(field("documento")); }
 public MonitorDocumentNfseFornecedorVariant0 setDocumento(MonitorDocumentNfseFornecedorVariant0Documento value) { put("documento", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseFornecedorVariant0Uf getUf() { return (field("uf")).isNull() || (field("uf")).isMissingNode() ? null : new MonitorDocumentNfseFornecedorVariant0Uf(field("uf")); }
 public MonitorDocumentNfseFornecedorVariant0 setUf(MonitorDocumentNfseFornecedorVariant0Uf value) { put("uf", value == null ? null : value.toJson()); return this; }
}
