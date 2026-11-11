package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class NfcomFiscalResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "chave", "serie", "nfcom", "status", "motivo", "modelo", "contingencia", "xml", "danfecom", "xml_cancelamento", "protocolo", "data_autorizacao", "eventos_pagamento", "total_eventos", "consulta_eventos_pagamento", "log");
 public NfcomFiscalResponse() { super(FIELDS); }
 public NfcomFiscalResponse(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfcomFiscalResponse setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public NfcomFiscalResponseChave getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new NfcomFiscalResponseChave(field("chave")); }
 public NfcomFiscalResponse setChave(NfcomFiscalResponseChave value) { put("chave", value == null ? null : value.toJson()); return this; }
 public NfcomFiscalResponseSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new NfcomFiscalResponseSerie(field("serie")); }
 public NfcomFiscalResponse setSerie(NfcomFiscalResponseSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public NfcomFiscalResponseNfcom getNfcom() { return (field("nfcom")).isNull() || (field("nfcom")).isMissingNode() ? null : new NfcomFiscalResponseNfcom(field("nfcom")); }
 public NfcomFiscalResponse setNfcom(NfcomFiscalResponseNfcom value) { put("nfcom", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfcomFiscalResponse setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfcomFiscalResponse setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public JsonValue getModelo() { return (field("modelo")).isNull() || (field("modelo")).isMissingNode() ? null : new JsonValue(field("modelo")); }
 public NfcomFiscalResponse setModelo(JsonValue value) { put("modelo", value == null ? null : value.toJson()); return this; }
 public Boolean getContingencia() { return booleanValue(field("contingencia")); }
 public NfcomFiscalResponse setContingencia(Boolean value) { put("contingencia", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfcomFiscalResponse setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getDanfecom() { return stringValue(field("danfecom")); }
 public NfcomFiscalResponse setDanfecom(String value) { put("danfecom", Json.scalar(value)); return this; }
 public NfcomFiscalResponseXmlCancelamento getXmlCancelamento() { return (field("xml_cancelamento")).isNull() || (field("xml_cancelamento")).isMissingNode() ? null : new NfcomFiscalResponseXmlCancelamento(field("xml_cancelamento")); }
 public NfcomFiscalResponse setXmlCancelamento(NfcomFiscalResponseXmlCancelamento value) { put("xml_cancelamento", value == null ? null : value.toJson()); return this; }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public NfcomFiscalResponse setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public NfcomFiscalResponseDataAutorizacao getDataAutorizacao() { return (field("data_autorizacao")).isNull() || (field("data_autorizacao")).isMissingNode() ? null : new NfcomFiscalResponseDataAutorizacao(field("data_autorizacao")); }
 public NfcomFiscalResponse setDataAutorizacao(NfcomFiscalResponseDataAutorizacao value) { put("data_autorizacao", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfcomPaymentEvent> getEventosPagamento() { return list(field("eventos_pagamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfcomPaymentEvent(v)); }
 public NfcomFiscalResponse setEventosPagamento(java.util.List<NfcomPaymentEvent> value) { put("eventos_pagamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigInteger getTotalEventos() { return integerValue(field("total_eventos")); }
 public NfcomFiscalResponse setTotalEventos(java.math.BigInteger value) { put("total_eventos", Json.scalar(value)); return this; }
 public String getConsultaEventosPagamento() { return stringValue(field("consulta_eventos_pagamento")); }
 public NfcomFiscalResponse setConsultaEventosPagamento(String value) { put("consulta_eventos_pagamento", Json.scalar(value)); return this; }
 public NfcomFiscalResponseLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfcomFiscalResponseLog(field("log")); }
 public NfcomFiscalResponse setLog(NfcomFiscalResponseLog value) { put("log", value == null ? null : value.toJson()); return this; }
}
