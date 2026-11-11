package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeDocument extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "status", "motivo", "nfe", "serie", "recibo", "chave", "modelo", "epec", "xml", "xml_cancelamento", "danfe", "danfe_simples", "danfe_etiqueta", "log", "log_cancelamento", "data", "evento", "dacce", "protocolo_evento", "url_notificacao");
 public NfeDocument() { super(FIELDS); }
 public NfeDocument(JsonNode node) { super(node, FIELDS); }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeDocument setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfeDocument setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfeDocument setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public NfeDocumentNfe getNfe() { return (field("nfe")).isNull() || (field("nfe")).isMissingNode() ? null : new NfeDocumentNfe(field("nfe")); }
 public NfeDocument setNfe(NfeDocumentNfe value) { put("nfe", value == null ? null : value.toJson()); return this; }
 public NfeDocumentSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new NfeDocumentSerie(field("serie")); }
 public NfeDocument setSerie(NfeDocumentSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getRecibo() { return stringValue(field("recibo")); }
 public NfeDocument setRecibo(String value) { put("recibo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public NfeDocument setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfeDocument setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public Boolean getEpec() { return booleanValue(field("epec")); }
 public NfeDocument setEpec(Boolean value) { put("epec", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfeDocument setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getXmlCancelamento() { return stringValue(field("xml_cancelamento")); }
 public NfeDocument setXmlCancelamento(String value) { put("xml_cancelamento", Json.scalar(value)); return this; }
 public String getDanfe() { return stringValue(field("danfe")); }
 public NfeDocument setDanfe(String value) { put("danfe", Json.scalar(value)); return this; }
 public String getDanfeSimples() { return stringValue(field("danfe_simples")); }
 public NfeDocument setDanfeSimples(String value) { put("danfe_simples", Json.scalar(value)); return this; }
 public String getDanfeEtiqueta() { return stringValue(field("danfe_etiqueta")); }
 public NfeDocument setDanfeEtiqueta(String value) { put("danfe_etiqueta", Json.scalar(value)); return this; }
 public NfeDocumentLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfeDocumentLog(field("log")); }
 public NfeDocument setLog(NfeDocumentLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public NfeDocumentLogCancelamento getLogCancelamento() { return (field("log_cancelamento")).isNull() || (field("log_cancelamento")).isMissingNode() ? null : new NfeDocumentLogCancelamento(field("log_cancelamento")); }
 public NfeDocument setLogCancelamento(NfeDocumentLogCancelamento value) { put("log_cancelamento", value == null ? null : value.toJson()); return this; }
 public String getData() { return stringValue(field("data")); }
 public NfeDocument setData(String value) { put("data", Json.scalar(value)); return this; }
 public NfeDocumentEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new NfeDocumentEvento(field("evento")); }
 public NfeDocument setEvento(NfeDocumentEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public String getDacce() { return stringValue(field("dacce")); }
 public NfeDocument setDacce(String value) { put("dacce", Json.scalar(value)); return this; }
 public String getProtocoloEvento() { return stringValue(field("protocolo_evento")); }
 public NfeDocument setProtocoloEvento(String value) { put("protocolo_evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public NfeDocument setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
