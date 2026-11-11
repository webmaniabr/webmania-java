package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeProdutoPredominante extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_carga", "nome", "gtin", "ncm", "lotacao");
 public MonitorDocumentMdfeProdutoPredominante() { super(FIELDS); }
 public MonitorDocumentMdfeProdutoPredominante(JsonNode node) { super(node, FIELDS); }
 public String getTipoCarga() { return stringValue(field("tipo_carga")); }
 public MonitorDocumentMdfeProdutoPredominante setTipoCarga(String value) { put("tipo_carga", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public MonitorDocumentMdfeProdutoPredominante setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getGtin() { return stringValue(field("gtin")); }
 public MonitorDocumentMdfeProdutoPredominante setGtin(String value) { put("gtin", Json.scalar(value)); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public MonitorDocumentMdfeProdutoPredominante setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeProdutoPredominanteLotacao getLotacao() { return (field("lotacao")).isNull() || (field("lotacao")).isMissingNode() ? null : new MonitorDocumentMdfeProdutoPredominanteLotacao(field("lotacao")); }
 public MonitorDocumentMdfeProdutoPredominante setLotacao(MonitorDocumentMdfeProdutoPredominanteLotacao value) { put("lotacao", value == null ? null : value.toJson()); return this; }
}
