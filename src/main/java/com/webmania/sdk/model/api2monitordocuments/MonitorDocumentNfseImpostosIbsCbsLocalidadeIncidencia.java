package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "descricao");
 public MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia() { super(FIELDS); }
 public MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia(JsonNode node) { super(node, FIELDS); }
 public String getCodigo() { return stringValue(field("codigo")); }
 public MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public MonitorDocumentNfseImpostosIbsCbsLocalidadeIncidencia setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
}
