package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFiltrosModelo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("finalidade", "operacao", "ncm", "cfop", "codigo_verificacao", "serie_rps", "numero_rps", "codigo_cnae", "codigo_servico", "modalidade", "uf_carregamento", "uf_descarregamento", "placa_veiculo", "uf_inicio_prestacao", "uf_termino_prestacao");
 public MonitorSearchRequestFiltrosModelo() { super(FIELDS); }
 public MonitorSearchRequestFiltrosModelo(JsonNode node) { super(node, FIELDS); }
 public MonitorSearchRequestFiltrosModeloFinalidade getFinalidade() { return (field("finalidade")).isNull() || (field("finalidade")).isMissingNode() ? null : new MonitorSearchRequestFiltrosModeloFinalidade(field("finalidade")); }
 public MonitorSearchRequestFiltrosModelo setFinalidade(MonitorSearchRequestFiltrosModeloFinalidade value) { put("finalidade", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestFiltrosModeloOperacao getOperacao() { return (field("operacao")).isNull() || (field("operacao")).isMissingNode() ? null : new MonitorSearchRequestFiltrosModeloOperacao(field("operacao")); }
 public MonitorSearchRequestFiltrosModelo setOperacao(MonitorSearchRequestFiltrosModeloOperacao value) { put("operacao", value == null ? null : value.toJson()); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public MonitorSearchRequestFiltrosModelo setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public String getCfop() { return stringValue(field("cfop")); }
 public MonitorSearchRequestFiltrosModelo setCfop(String value) { put("cfop", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public MonitorSearchRequestFiltrosModelo setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getSerieRps() { return stringValue(field("serie_rps")); }
 public MonitorSearchRequestFiltrosModelo setSerieRps(String value) { put("serie_rps", Json.scalar(value)); return this; }
 public MonitorSearchRequestFiltrosModeloNumeroRps getNumeroRps() { return (field("numero_rps")).isNull() || (field("numero_rps")).isMissingNode() ? null : new MonitorSearchRequestFiltrosModeloNumeroRps(field("numero_rps")); }
 public MonitorSearchRequestFiltrosModelo setNumeroRps(MonitorSearchRequestFiltrosModeloNumeroRps value) { put("numero_rps", value == null ? null : value.toJson()); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public MonitorSearchRequestFiltrosModelo setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public MonitorSearchRequestFiltrosModelo setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public MonitorSearchRequestFiltrosModeloModalidade getModalidade() { return (field("modalidade")).isNull() || (field("modalidade")).isMissingNode() ? null : new MonitorSearchRequestFiltrosModeloModalidade(field("modalidade")); }
 public MonitorSearchRequestFiltrosModelo setModalidade(MonitorSearchRequestFiltrosModeloModalidade value) { put("modalidade", value == null ? null : value.toJson()); return this; }
 public String getUfCarregamento() { return stringValue(field("uf_carregamento")); }
 public MonitorSearchRequestFiltrosModelo setUfCarregamento(String value) { put("uf_carregamento", Json.scalar(value)); return this; }
 public String getUfDescarregamento() { return stringValue(field("uf_descarregamento")); }
 public MonitorSearchRequestFiltrosModelo setUfDescarregamento(String value) { put("uf_descarregamento", Json.scalar(value)); return this; }
 public String getPlacaVeiculo() { return stringValue(field("placa_veiculo")); }
 public MonitorSearchRequestFiltrosModelo setPlacaVeiculo(String value) { put("placa_veiculo", Json.scalar(value)); return this; }
 public String getUfInicioPrestacao() { return stringValue(field("uf_inicio_prestacao")); }
 public MonitorSearchRequestFiltrosModelo setUfInicioPrestacao(String value) { put("uf_inicio_prestacao", Json.scalar(value)); return this; }
 public String getUfTerminoPrestacao() { return stringValue(field("uf_termino_prestacao")); }
 public MonitorSearchRequestFiltrosModelo setUfTerminoPrestacao(String value) { put("uf_termino_prestacao", Json.scalar(value)); return this; }
}
