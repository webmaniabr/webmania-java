package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeAquaviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("irin", "tipo_embarcacao", "codigo_embarcacao", "nome_embarcacao", "numero_viagem", "codigo_porto_embarque", "codigo_porto_destino", "porto_transbordo", "tipo_navegacao", "terminal_carregamento", "terminal_descarregamento", "embarcacao_comboio", "carga_vazia", "transporte_vazio");
 public MonitorDocumentMdfeAquaviario() { super(FIELDS); }
 public MonitorDocumentMdfeAquaviario(JsonNode node) { super(node, FIELDS); }
 public String getIrin() { return stringValue(field("irin")); }
 public MonitorDocumentMdfeAquaviario setIrin(String value) { put("irin", Json.scalar(value)); return this; }
 public String getTipoEmbarcacao() { return stringValue(field("tipo_embarcacao")); }
 public MonitorDocumentMdfeAquaviario setTipoEmbarcacao(String value) { put("tipo_embarcacao", Json.scalar(value)); return this; }
 public String getCodigoEmbarcacao() { return stringValue(field("codigo_embarcacao")); }
 public MonitorDocumentMdfeAquaviario setCodigoEmbarcacao(String value) { put("codigo_embarcacao", Json.scalar(value)); return this; }
 public String getNomeEmbarcacao() { return stringValue(field("nome_embarcacao")); }
 public MonitorDocumentMdfeAquaviario setNomeEmbarcacao(String value) { put("nome_embarcacao", Json.scalar(value)); return this; }
 public String getNumeroViagem() { return stringValue(field("numero_viagem")); }
 public MonitorDocumentMdfeAquaviario setNumeroViagem(String value) { put("numero_viagem", Json.scalar(value)); return this; }
 public String getCodigoPortoEmbarque() { return stringValue(field("codigo_porto_embarque")); }
 public MonitorDocumentMdfeAquaviario setCodigoPortoEmbarque(String value) { put("codigo_porto_embarque", Json.scalar(value)); return this; }
 public String getCodigoPortoDestino() { return stringValue(field("codigo_porto_destino")); }
 public MonitorDocumentMdfeAquaviario setCodigoPortoDestino(String value) { put("codigo_porto_destino", Json.scalar(value)); return this; }
 public String getPortoTransbordo() { return stringValue(field("porto_transbordo")); }
 public MonitorDocumentMdfeAquaviario setPortoTransbordo(String value) { put("porto_transbordo", Json.scalar(value)); return this; }
 public String getTipoNavegacao() { return stringValue(field("tipo_navegacao")); }
 public MonitorDocumentMdfeAquaviario setTipoNavegacao(String value) { put("tipo_navegacao", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentMdfeAquaviarioTerminalCarregamentoItem> getTerminalCarregamento() { return list(field("terminal_carregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeAquaviarioTerminalCarregamentoItem(v)); }
 public MonitorDocumentMdfeAquaviario setTerminalCarregamento(java.util.List<MonitorDocumentMdfeAquaviarioTerminalCarregamentoItem> value) { put("terminal_carregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem> getTerminalDescarregamento() { return list(field("terminal_descarregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem(v)); }
 public MonitorDocumentMdfeAquaviario setTerminalDescarregamento(java.util.List<MonitorDocumentMdfeAquaviarioTerminalDescarregamentoItem> value) { put("terminal_descarregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem> getEmbarcacaoComboio() { return list(field("embarcacao_comboio"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem(v)); }
 public MonitorDocumentMdfeAquaviario setEmbarcacaoComboio(java.util.List<MonitorDocumentMdfeAquaviarioEmbarcacaoComboioItem> value) { put("embarcacao_comboio", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeAquaviarioCargaVaziaItem> getCargaVazia() { return list(field("carga_vazia"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeAquaviarioCargaVaziaItem(v)); }
 public MonitorDocumentMdfeAquaviario setCargaVazia(java.util.List<MonitorDocumentMdfeAquaviarioCargaVaziaItem> value) { put("carga_vazia", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeAquaviarioTransporteVazioItem> getTransporteVazio() { return list(field("transporte_vazio"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeAquaviarioTransporteVazioItem(v)); }
 public MonitorDocumentMdfeAquaviario setTransporteVazio(java.util.List<MonitorDocumentMdfeAquaviarioTransporteVazioItem> value) { put("transporte_vazio", array(value, v -> v == null ? null : v.toJson())); return this; }
}
