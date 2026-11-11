package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeNotification extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "status", "motivo", "nfe", "serie", "recibo", "chave", "modelo", "epec", "xml", "xml_cancelamento", "danfe", "danfe_simples", "danfe_etiqueta", "log", "log_cancelamento", "data", "evento", "dacce", "protocolo_evento", "url_notificacao");
 public NfeNotification() { super(FIELDS); }
 public NfeNotification(JsonNode node) { super(node, FIELDS); }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeNotification setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfeNotification setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfeNotification setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public NfeNotificationNfe getNfe() { return (field("nfe")).isNull() || (field("nfe")).isMissingNode() ? null : new NfeNotificationNfe(field("nfe")); }
 public NfeNotification setNfe(NfeNotificationNfe value) { put("nfe", value == null ? null : value.toJson()); return this; }
 public NfeNotificationSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new NfeNotificationSerie(field("serie")); }
 public NfeNotification setSerie(NfeNotificationSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getRecibo() { return stringValue(field("recibo")); }
 public NfeNotification setRecibo(String value) { put("recibo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public NfeNotification setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfeNotification setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public Boolean getEpec() { return booleanValue(field("epec")); }
 public NfeNotification setEpec(Boolean value) { put("epec", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfeNotification setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getXmlCancelamento() { return stringValue(field("xml_cancelamento")); }
 public NfeNotification setXmlCancelamento(String value) { put("xml_cancelamento", Json.scalar(value)); return this; }
 public String getDanfe() { return stringValue(field("danfe")); }
 public NfeNotification setDanfe(String value) { put("danfe", Json.scalar(value)); return this; }
 public String getDanfeSimples() { return stringValue(field("danfe_simples")); }
 public NfeNotification setDanfeSimples(String value) { put("danfe_simples", Json.scalar(value)); return this; }
 public String getDanfeEtiqueta() { return stringValue(field("danfe_etiqueta")); }
 public NfeNotification setDanfeEtiqueta(String value) { put("danfe_etiqueta", Json.scalar(value)); return this; }
 public NfeNotificationLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfeNotificationLog(field("log")); }
 public NfeNotification setLog(NfeNotificationLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public NfeNotificationLogCancelamento getLogCancelamento() { return (field("log_cancelamento")).isNull() || (field("log_cancelamento")).isMissingNode() ? null : new NfeNotificationLogCancelamento(field("log_cancelamento")); }
 public NfeNotification setLogCancelamento(NfeNotificationLogCancelamento value) { put("log_cancelamento", value == null ? null : value.toJson()); return this; }
 public NfeIssueRequest getData() { return (field("data")).isNull() || (field("data")).isMissingNode() ? null : new NfeIssueRequest(field("data")); }
 public NfeNotification setData(NfeIssueRequest value) { put("data", value == null ? null : value.toJson()); return this; }
 public NfeNotificationEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new NfeNotificationEvento(field("evento")); }
 public NfeNotification setEvento(NfeNotificationEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public String getDacce() { return stringValue(field("dacce")); }
 public NfeNotification setDacce(String value) { put("dacce", Json.scalar(value)); return this; }
 public String getProtocoloEvento() { return stringValue(field("protocolo_evento")); }
 public NfeNotification setProtocoloEvento(String value) { put("protocolo_evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public NfeNotification setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
