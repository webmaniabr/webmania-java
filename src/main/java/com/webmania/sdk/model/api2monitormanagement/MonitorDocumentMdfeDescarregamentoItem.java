package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeDescarregamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_municipio", "documentos_fiscais", "uf", "cidade", "nome_municipio", "documentos");
 public MonitorDocumentMdfeDescarregamentoItem() { super(FIELDS); }
 public MonitorDocumentMdfeDescarregamentoItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public MonitorDocumentMdfeDescarregamentoItem setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentMdfeDescarregamentoItemDocumentosFiscaisItem> getDocumentosFiscais() { return list(field("documentos_fiscais"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeDescarregamentoItemDocumentosFiscaisItem(v)); }
 public MonitorDocumentMdfeDescarregamentoItem setDocumentosFiscais(java.util.List<MonitorDocumentMdfeDescarregamentoItemDocumentosFiscaisItem> value) { put("documentos_fiscais", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentMdfeDescarregamentoItem setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public MonitorDocumentMdfeDescarregamentoItem setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getNomeMunicipio() { return stringValue(field("nome_municipio")); }
 public MonitorDocumentMdfeDescarregamentoItem setNomeMunicipio(String value) { put("nome_municipio", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentMdfeDescarregamentoItemDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeDescarregamentoItemDocumentosItem(v)); }
 public MonitorDocumentMdfeDescarregamentoItem setDocumentos(java.util.List<MonitorDocumentMdfeDescarregamentoItemDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
}
