package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class CteFiscalResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "uuid", "chave", "serie", "status", "motivo", "modelo", "xml", "xml_cancelamento", "log", "cte", "epec", "dacte", "eventos_pagamento", "total_eventos", "consulta_eventos_pagamento");
 public CteFiscalResponse() { super(FIELDS); }
 public CteFiscalResponse(JsonNode node) { super(node, FIELDS); }
 public CteFiscalResponseID getID() { return (field("ID")).isNull() || (field("ID")).isMissingNode() ? null : new CteFiscalResponseID(field("ID")); }
 public CteFiscalResponse setID(CteFiscalResponseID value) { put("ID", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteFiscalResponse setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public CteFiscalResponseChave getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new CteFiscalResponseChave(field("chave")); }
 public CteFiscalResponse setChave(CteFiscalResponseChave value) { put("chave", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new CteFiscalResponseSerie(field("serie")); }
 public CteFiscalResponse setSerie(CteFiscalResponseSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public CteFiscalResponse setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public CteFiscalResponseMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new CteFiscalResponseMotivo(field("motivo")); }
 public CteFiscalResponse setMotivo(CteFiscalResponseMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public CteFiscalResponse setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public CteFiscalResponseXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new CteFiscalResponseXml(field("xml")); }
 public CteFiscalResponse setXml(CteFiscalResponseXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseXmlCancelamento getXmlCancelamento() { return (field("xml_cancelamento")).isNull() || (field("xml_cancelamento")).isMissingNode() ? null : new CteFiscalResponseXmlCancelamento(field("xml_cancelamento")); }
 public CteFiscalResponse setXmlCancelamento(CteFiscalResponseXmlCancelamento value) { put("xml_cancelamento", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new CteFiscalResponseLog(field("log")); }
 public CteFiscalResponse setLog(CteFiscalResponseLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseCte getCte() { return (field("cte")).isNull() || (field("cte")).isMissingNode() ? null : new CteFiscalResponseCte(field("cte")); }
 public CteFiscalResponse setCte(CteFiscalResponseCte value) { put("cte", value == null ? null : value.toJson()); return this; }
 public Boolean getEpec() { return booleanValue(field("epec")); }
 public CteFiscalResponse setEpec(Boolean value) { put("epec", Json.scalar(value)); return this; }
 public CteFiscalResponseDacte getDacte() { return (field("dacte")).isNull() || (field("dacte")).isMissingNode() ? null : new CteFiscalResponseDacte(field("dacte")); }
 public CteFiscalResponse setDacte(CteFiscalResponseDacte value) { put("dacte", value == null ? null : value.toJson()); return this; }
 public java.util.List<CteFiscalResponseEventosPagamentoItem> getEventosPagamento() { return list(field("eventos_pagamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItem(v)); }
 public CteFiscalResponse setEventosPagamento(java.util.List<CteFiscalResponseEventosPagamentoItem> value) { put("eventos_pagamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigInteger getTotalEventos() { return integerValue(field("total_eventos")); }
 public CteFiscalResponse setTotalEventos(java.math.BigInteger value) { put("total_eventos", Json.scalar(value)); return this; }
 public String getConsultaEventosPagamento() { return stringValue(field("consulta_eventos_pagamento")); }
 public CteFiscalResponse setConsultaEventosPagamento(String value) { put("consulta_eventos_pagamento", Json.scalar(value)); return this; }
}
