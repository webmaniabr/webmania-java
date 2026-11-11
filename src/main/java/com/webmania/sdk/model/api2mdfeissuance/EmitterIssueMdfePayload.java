package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aereo", "ambiente", "aquaviario", "carregamento", "data_inicio_viagem", "descarregamento", "emitente", "ferroviario", "ind_canal_verde", "informacoes_complementares", "informacoes_fisco", "lacres", "modalidade", "origem", "percurso", "peso_bruto", "produto_predominante", "rodoviario", "seguro", "transportador", "uf_carregamento", "uf_descarregamento", "unidade", "valor_carga", "url_notificacao");
 public EmitterIssueMdfePayload() { super(FIELDS); }
 public EmitterIssueMdfePayload(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueMdfePayloadAereo getAereo() { return (field("aereo")).isNull() || (field("aereo")).isMissingNode() ? null : new EmitterIssueMdfePayloadAereo(field("aereo")); }
 public EmitterIssueMdfePayload setAereo(EmitterIssueMdfePayloadAereo value) { put("aereo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new EmitterIssueMdfePayloadAmbiente(field("ambiente")); }
 public EmitterIssueMdfePayload setAmbiente(EmitterIssueMdfePayloadAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadAquaviario getAquaviario() { return (field("aquaviario")).isNull() || (field("aquaviario")).isMissingNode() ? null : new EmitterIssueMdfePayloadAquaviario(field("aquaviario")); }
 public EmitterIssueMdfePayload setAquaviario(EmitterIssueMdfePayloadAquaviario value) { put("aquaviario", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueMdfePayloadCarregamentoItem> getCarregamento() { return list(field("carregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadCarregamentoItem(v)); }
 public EmitterIssueMdfePayload setCarregamento(java.util.List<EmitterIssueMdfePayloadCarregamentoItem> value) { put("carregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getDataInicioViagem() { return stringValue(field("data_inicio_viagem")); }
 public EmitterIssueMdfePayload setDataInicioViagem(String value) { put("data_inicio_viagem", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueMdfePayloadDescarregamentoItem> getDescarregamento() { return list(field("descarregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItem(v)); }
 public EmitterIssueMdfePayload setDescarregamento(java.util.List<EmitterIssueMdfePayloadDescarregamentoItem> value) { put("descarregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueMdfePayloadEmitente getEmitente() { return (field("emitente")).isNull() || (field("emitente")).isMissingNode() ? null : new EmitterIssueMdfePayloadEmitente(field("emitente")); }
 public EmitterIssueMdfePayload setEmitente(EmitterIssueMdfePayloadEmitente value) { put("emitente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadFerroviario getFerroviario() { return (field("ferroviario")).isNull() || (field("ferroviario")).isMissingNode() ? null : new EmitterIssueMdfePayloadFerroviario(field("ferroviario")); }
 public EmitterIssueMdfePayload setFerroviario(EmitterIssueMdfePayloadFerroviario value) { put("ferroviario", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadIndCanalVerde getIndCanalVerde() { return (field("ind_canal_verde")).isNull() || (field("ind_canal_verde")).isMissingNode() ? null : new EmitterIssueMdfePayloadIndCanalVerde(field("ind_canal_verde")); }
 public EmitterIssueMdfePayload setIndCanalVerde(EmitterIssueMdfePayloadIndCanalVerde value) { put("ind_canal_verde", value == null ? null : value.toJson()); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public EmitterIssueMdfePayload setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public EmitterIssueMdfePayload setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public java.util.List<String> getLacres() { return list(field("lacres"), v -> stringValue(v)); }
 public EmitterIssueMdfePayload setLacres(java.util.List<String> value) { put("lacres", array(value, v -> Json.scalar(v))); return this; }
 public EmitterIssueMdfePayloadModalidade getModalidade() { return (field("modalidade")).isNull() || (field("modalidade")).isMissingNode() ? null : new EmitterIssueMdfePayloadModalidade(field("modalidade")); }
 public EmitterIssueMdfePayload setModalidade(EmitterIssueMdfePayloadModalidade value) { put("modalidade", value == null ? null : value.toJson()); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterIssueMdfePayload setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public java.util.List<String> getPercurso() { return list(field("percurso"), v -> stringValue(v)); }
 public EmitterIssueMdfePayload setPercurso(java.util.List<String> value) { put("percurso", array(value, v -> Json.scalar(v))); return this; }
 public String getPesoBruto() { return stringValue(field("peso_bruto")); }
 public EmitterIssueMdfePayload setPesoBruto(String value) { put("peso_bruto", Json.scalar(value)); return this; }
 public EmitterIssueMdfePayloadProdutoPredominante getProdutoPredominante() { return (field("produto_predominante")).isNull() || (field("produto_predominante")).isMissingNode() ? null : new EmitterIssueMdfePayloadProdutoPredominante(field("produto_predominante")); }
 public EmitterIssueMdfePayload setProdutoPredominante(EmitterIssueMdfePayloadProdutoPredominante value) { put("produto_predominante", value == null ? null : value.toJson()); return this; }
 public EmitterIssueMdfePayloadRodoviario getRodoviario() { return (field("rodoviario")).isNull() || (field("rodoviario")).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviario(field("rodoviario")); }
 public EmitterIssueMdfePayload setRodoviario(EmitterIssueMdfePayloadRodoviario value) { put("rodoviario", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueMdfePayloadSeguroItem> getSeguro() { return list(field("seguro"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadSeguroItem(v)); }
 public EmitterIssueMdfePayload setSeguro(java.util.List<EmitterIssueMdfePayloadSeguroItem> value) { put("seguro", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueMdfePayloadTransportador getTransportador() { return (field("transportador")).isNull() || (field("transportador")).isMissingNode() ? null : new EmitterIssueMdfePayloadTransportador(field("transportador")); }
 public EmitterIssueMdfePayload setTransportador(EmitterIssueMdfePayloadTransportador value) { put("transportador", value == null ? null : value.toJson()); return this; }
 public String getUfCarregamento() { return stringValue(field("uf_carregamento")); }
 public EmitterIssueMdfePayload setUfCarregamento(String value) { put("uf_carregamento", Json.scalar(value)); return this; }
 public String getUfDescarregamento() { return stringValue(field("uf_descarregamento")); }
 public EmitterIssueMdfePayload setUfDescarregamento(String value) { put("uf_descarregamento", Json.scalar(value)); return this; }
 public JsonValue getUnidade() { return (field("unidade")).isNull() || (field("unidade")).isMissingNode() ? null : new JsonValue(field("unidade")); }
 public EmitterIssueMdfePayload setUnidade(JsonValue value) { put("unidade", value == null ? null : value.toJson()); return this; }
 public String getValorCarga() { return stringValue(field("valor_carga")); }
 public EmitterIssueMdfePayload setValorCarga(String value) { put("valor_carga", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public EmitterIssueMdfePayload setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
