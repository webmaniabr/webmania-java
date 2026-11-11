package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeFornecedorVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("razao_social", "documento", "uf");
 public MonitorDocumentMdfeFornecedorVariant0() { super(FIELDS); }
 public MonitorDocumentMdfeFornecedorVariant0(JsonNode node) { super(node, FIELDS); }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentMdfeFornecedorVariant0 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeFornecedorVariant0Documento getDocumento() { return (field("documento")).isNull() || (field("documento")).isMissingNode() ? null : new MonitorDocumentMdfeFornecedorVariant0Documento(field("documento")); }
 public MonitorDocumentMdfeFornecedorVariant0 setDocumento(MonitorDocumentMdfeFornecedorVariant0Documento value) { put("documento", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeFornecedorVariant0Uf getUf() { return (field("uf")).isNull() || (field("uf")).isMissingNode() ? null : new MonitorDocumentMdfeFornecedorVariant0Uf(field("uf")); }
 public MonitorDocumentMdfeFornecedorVariant0 setUf(MonitorDocumentMdfeFornecedorVariant0Uf value) { put("uf", value == null ? null : value.toJson()); return this; }
}
