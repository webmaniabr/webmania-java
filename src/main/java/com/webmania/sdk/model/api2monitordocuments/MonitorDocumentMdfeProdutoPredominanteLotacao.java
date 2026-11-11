package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeProdutoPredominanteLotacao extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("carregamento", "descarregamento");
 public MonitorDocumentMdfeProdutoPredominanteLotacao() { super(FIELDS); }
 public MonitorDocumentMdfeProdutoPredominanteLotacao(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento getCarregamento() { return (field("carregamento")).isNull() || (field("carregamento")).isMissingNode() ? null : new MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento(field("carregamento")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacao setCarregamento(MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento value) { put("carregamento", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento getDescarregamento() { return (field("descarregamento")).isNull() || (field("descarregamento")).isMissingNode() ? null : new MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento(field("descarregamento")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacao setDescarregamento(MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento value) { put("descarregamento", value == null ? null : value.toJson()); return this; }
}
