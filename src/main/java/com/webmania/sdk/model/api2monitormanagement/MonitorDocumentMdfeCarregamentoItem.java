package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeCarregamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_municipio", "uf", "cidade", "nome_municipio", "documentos");
 public MonitorDocumentMdfeCarregamentoItem() { super(FIELDS); }
 public MonitorDocumentMdfeCarregamentoItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public MonitorDocumentMdfeCarregamentoItem setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentMdfeCarregamentoItem setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public MonitorDocumentMdfeCarregamentoItem setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getNomeMunicipio() { return stringValue(field("nome_municipio")); }
 public MonitorDocumentMdfeCarregamentoItem setNomeMunicipio(String value) { put("nome_municipio", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentMdfeCarregamentoItemDocumentosItem> getDocumentos() { return list(field("documentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeCarregamentoItemDocumentosItem(v)); }
 public MonitorDocumentMdfeCarregamentoItem setDocumentos(java.util.List<MonitorDocumentMdfeCarregamentoItemDocumentosItem> value) { put("documentos", array(value, v -> v == null ? null : v.toJson())); return this; }
}
