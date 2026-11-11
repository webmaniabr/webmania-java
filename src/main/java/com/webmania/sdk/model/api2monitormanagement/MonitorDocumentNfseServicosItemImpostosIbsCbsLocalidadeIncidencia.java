package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "descricao");
 public MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia() { super(FIELDS); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia(JsonNode node) { super(node, FIELDS); }
 public String getCodigo() { return stringValue(field("codigo")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public MonitorDocumentNfseServicosItemImpostosIbsCbsLocalidadeIncidencia setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
}
