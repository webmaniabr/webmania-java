package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorEvent extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "documento_uuid", "protocolo", "registrado_em", "data_captura", "descricao_evento", "cnpj_autor", "cpf_autor", "justificativa", "correcao", "chave_cte", "protocolo_cte", "data_entrega", "documento_recebedor", "nome_recebedor", "data_encerramento", "cidade_encerramento", "uf_encerramento", "tipo_evento", "resumo", "alteracoes", "latitude", "longitude", "chaves_nfe", "mdfe", "log", "chave_substituta", "cpf_condutor", "nome_condutor");
 public MonitorEvent() { super(FIELDS); }
 public MonitorEvent(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorEvent setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getDocumentoUuid() { return stringValue(field("documento_uuid")); }
 public MonitorEvent setDocumentoUuid(String value) { put("documento_uuid", Json.scalar(value)); return this; }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public MonitorEvent setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public String getRegistradoEm() { return stringValue(field("registrado_em")); }
 public MonitorEvent setRegistradoEm(String value) { put("registrado_em", Json.scalar(value)); return this; }
 public String getDataCaptura() { return stringValue(field("data_captura")); }
 public MonitorEvent setDataCaptura(String value) { put("data_captura", Json.scalar(value)); return this; }
 public String getDescricaoEvento() { return stringValue(field("descricao_evento")); }
 public MonitorEvent setDescricaoEvento(String value) { put("descricao_evento", Json.scalar(value)); return this; }
 public String getCnpjAutor() { return stringValue(field("cnpj_autor")); }
 public MonitorEvent setCnpjAutor(String value) { put("cnpj_autor", Json.scalar(value)); return this; }
 public String getCpfAutor() { return stringValue(field("cpf_autor")); }
 public MonitorEvent setCpfAutor(String value) { put("cpf_autor", Json.scalar(value)); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public MonitorEvent setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
 public String getCorrecao() { return stringValue(field("correcao")); }
 public MonitorEvent setCorrecao(String value) { put("correcao", Json.scalar(value)); return this; }
 public String getChaveCte() { return stringValue(field("chave_cte")); }
 public MonitorEvent setChaveCte(String value) { put("chave_cte", Json.scalar(value)); return this; }
 public String getProtocoloCte() { return stringValue(field("protocolo_cte")); }
 public MonitorEvent setProtocoloCte(String value) { put("protocolo_cte", Json.scalar(value)); return this; }
 public String getDataEntrega() { return stringValue(field("data_entrega")); }
 public MonitorEvent setDataEntrega(String value) { put("data_entrega", Json.scalar(value)); return this; }
 public String getDocumentoRecebedor() { return stringValue(field("documento_recebedor")); }
 public MonitorEvent setDocumentoRecebedor(String value) { put("documento_recebedor", Json.scalar(value)); return this; }
 public String getNomeRecebedor() { return stringValue(field("nome_recebedor")); }
 public MonitorEvent setNomeRecebedor(String value) { put("nome_recebedor", Json.scalar(value)); return this; }
 public String getDataEncerramento() { return stringValue(field("data_encerramento")); }
 public MonitorEvent setDataEncerramento(String value) { put("data_encerramento", Json.scalar(value)); return this; }
 public String getCidadeEncerramento() { return stringValue(field("cidade_encerramento")); }
 public MonitorEvent setCidadeEncerramento(String value) { put("cidade_encerramento", Json.scalar(value)); return this; }
 public String getUfEncerramento() { return stringValue(field("uf_encerramento")); }
 public MonitorEvent setUfEncerramento(String value) { put("uf_encerramento", Json.scalar(value)); return this; }
 public java.math.BigDecimal getTipoEvento() { return decimalValue(field("tipo_evento")); }
 public MonitorEvent setTipoEvento(java.math.BigDecimal value) { put("tipo_evento", Json.scalar(value)); return this; }
 public Boolean getResumo() { return booleanValue(field("resumo")); }
 public MonitorEvent setResumo(Boolean value) { put("resumo", Json.scalar(value)); return this; }
 public java.util.List<MonitorEventAlteracoesItem> getAlteracoes() { return list(field("alteracoes"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorEventAlteracoesItem(v)); }
 public MonitorEvent setAlteracoes(java.util.List<MonitorEventAlteracoesItem> value) { put("alteracoes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigDecimal getLatitude() { return decimalValue(field("latitude")); }
 public MonitorEvent setLatitude(java.math.BigDecimal value) { put("latitude", Json.scalar(value)); return this; }
 public java.math.BigDecimal getLongitude() { return decimalValue(field("longitude")); }
 public MonitorEvent setLongitude(java.math.BigDecimal value) { put("longitude", Json.scalar(value)); return this; }
 public java.util.List<String> getChavesNfe() { return list(field("chaves_nfe"), v -> stringValue(v)); }
 public MonitorEvent setChavesNfe(java.util.List<String> value) { put("chaves_nfe", array(value, v -> Json.scalar(v))); return this; }
 public MonitorEventMdfe getMdfe() { return (field("mdfe")).isNull() || (field("mdfe")).isMissingNode() ? null : new MonitorEventMdfe(field("mdfe")); }
 public MonitorEvent setMdfe(MonitorEventMdfe value) { put("mdfe", value == null ? null : value.toJson()); return this; }
 public MonitorEventLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new MonitorEventLog(field("log")); }
 public MonitorEvent setLog(MonitorEventLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public String getChaveSubstituta() { return stringValue(field("chave_substituta")); }
 public MonitorEvent setChaveSubstituta(String value) { put("chave_substituta", Json.scalar(value)); return this; }
 public String getCpfCondutor() { return stringValue(field("cpf_condutor")); }
 public MonitorEvent setCpfCondutor(String value) { put("cpf_condutor", Json.scalar(value)); return this; }
 public String getNomeCondutor() { return stringValue(field("nome_condutor")); }
 public MonitorEvent setNomeCondutor(String value) { put("nome_condutor", Json.scalar(value)); return this; }
}
