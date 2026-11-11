package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsFornecedorVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("razao_social", "documento", "uf");
 public MonitorDocumentCteOsFornecedorVariant0() { super(FIELDS); }
 public MonitorDocumentCteOsFornecedorVariant0(JsonNode node) { super(node, FIELDS); }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentCteOsFornecedorVariant0 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsFornecedorVariant0Documento getDocumento() { return (field("documento")).isNull() || (field("documento")).isMissingNode() ? null : new MonitorDocumentCteOsFornecedorVariant0Documento(field("documento")); }
 public MonitorDocumentCteOsFornecedorVariant0 setDocumento(MonitorDocumentCteOsFornecedorVariant0Documento value) { put("documento", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsFornecedorVariant0Uf getUf() { return (field("uf")).isNull() || (field("uf")).isMissingNode() ? null : new MonitorDocumentCteOsFornecedorVariant0Uf(field("uf")); }
 public MonitorDocumentCteOsFornecedorVariant0 setUf(MonitorDocumentCteOsFornecedorVariant0Uf value) { put("uf", value == null ? null : value.toJson()); return this; }
}
