package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadAquaviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("carga_vazia", "codigo_embarcacao", "codigo_porto_destino", "codigo_porto_embarque", "embarcacao_comboio", "irin", "nome_embarcacao", "numero_viagem", "porto_transbordo", "terminal_carregamento", "terminal_descarregamento", "tipo_embarcacao", "tipo_navegacao", "transporte_vazio", "mmsi");
 public EmitterIssueMdfePayloadAquaviario() { super(FIELDS); }
 public EmitterIssueMdfePayloadAquaviario(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueMdfePayloadAquaviarioCargaVaziaItem> getCargaVazia() { return list(field("carga_vazia"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadAquaviarioCargaVaziaItem(v)); }
 public EmitterIssueMdfePayloadAquaviario setCargaVazia(java.util.List<EmitterIssueMdfePayloadAquaviarioCargaVaziaItem> value) { put("carga_vazia", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getCodigoEmbarcacao() { return stringValue(field("codigo_embarcacao")); }
 public EmitterIssueMdfePayloadAquaviario setCodigoEmbarcacao(String value) { put("codigo_embarcacao", Json.scalar(value)); return this; }
 public String getCodigoPortoDestino() { return stringValue(field("codigo_porto_destino")); }
 public EmitterIssueMdfePayloadAquaviario setCodigoPortoDestino(String value) { put("codigo_porto_destino", Json.scalar(value)); return this; }
 public String getCodigoPortoEmbarque() { return stringValue(field("codigo_porto_embarque")); }
 public EmitterIssueMdfePayloadAquaviario setCodigoPortoEmbarque(String value) { put("codigo_porto_embarque", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem> getEmbarcacaoComboio() { return list(field("embarcacao_comboio"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem(v)); }
 public EmitterIssueMdfePayloadAquaviario setEmbarcacaoComboio(java.util.List<EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem> value) { put("embarcacao_comboio", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getIrin() { return stringValue(field("irin")); }
 public EmitterIssueMdfePayloadAquaviario setIrin(String value) { put("irin", Json.scalar(value)); return this; }
 public String getNomeEmbarcacao() { return stringValue(field("nome_embarcacao")); }
 public EmitterIssueMdfePayloadAquaviario setNomeEmbarcacao(String value) { put("nome_embarcacao", Json.scalar(value)); return this; }
 public String getNumeroViagem() { return stringValue(field("numero_viagem")); }
 public EmitterIssueMdfePayloadAquaviario setNumeroViagem(String value) { put("numero_viagem", Json.scalar(value)); return this; }
 public String getPortoTransbordo() { return stringValue(field("porto_transbordo")); }
 public EmitterIssueMdfePayloadAquaviario setPortoTransbordo(String value) { put("porto_transbordo", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem> getTerminalCarregamento() { return list(field("terminal_carregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem(v)); }
 public EmitterIssueMdfePayloadAquaviario setTerminalCarregamento(java.util.List<EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem> value) { put("terminal_carregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueMdfePayloadAquaviarioTerminalDescarregamentoItem> getTerminalDescarregamento() { return list(field("terminal_descarregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadAquaviarioTerminalDescarregamentoItem(v)); }
 public EmitterIssueMdfePayloadAquaviario setTerminalDescarregamento(java.util.List<EmitterIssueMdfePayloadAquaviarioTerminalDescarregamentoItem> value) { put("terminal_descarregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getTipoEmbarcacao() { return stringValue(field("tipo_embarcacao")); }
 public EmitterIssueMdfePayloadAquaviario setTipoEmbarcacao(String value) { put("tipo_embarcacao", Json.scalar(value)); return this; }
 public JsonValue getTipoNavegacao() { return (field("tipo_navegacao")).isNull() || (field("tipo_navegacao")).isMissingNode() ? null : new JsonValue(field("tipo_navegacao")); }
 public EmitterIssueMdfePayloadAquaviario setTipoNavegacao(JsonValue value) { put("tipo_navegacao", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueMdfePayloadAquaviarioTransporteVazioItem> getTransporteVazio() { return list(field("transporte_vazio"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadAquaviarioTransporteVazioItem(v)); }
 public EmitterIssueMdfePayloadAquaviario setTransporteVazio(java.util.List<EmitterIssueMdfePayloadAquaviarioTransporteVazioItem> value) { put("transporte_vazio", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getMmsi() { return stringValue(field("mmsi")); }
 public EmitterIssueMdfePayloadAquaviario setMmsi(String value) { put("mmsi", Json.scalar(value)); return this; }
}
