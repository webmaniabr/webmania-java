package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class FiscalEventResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "chave", "evento", "status", "motivo", "xml", "xml_cancelamento", "dacce", "log", "codigo", "protocolo_evento", "data_evento");
 public FiscalEventResponse() { super(FIELDS); }
 public FiscalEventResponse(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public FiscalEventResponse setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public FiscalEventResponse setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public FiscalEventResponseEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new FiscalEventResponseEvento(field("evento")); }
 public FiscalEventResponse setEvento(FiscalEventResponseEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public FiscalEventResponse setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public FiscalEventResponseMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new FiscalEventResponseMotivo(field("motivo")); }
 public FiscalEventResponse setMotivo(FiscalEventResponseMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public FiscalEventResponseXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new FiscalEventResponseXml(field("xml")); }
 public FiscalEventResponse setXml(FiscalEventResponseXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public FiscalEventResponseXmlCancelamento getXmlCancelamento() { return (field("xml_cancelamento")).isNull() || (field("xml_cancelamento")).isMissingNode() ? null : new FiscalEventResponseXmlCancelamento(field("xml_cancelamento")); }
 public FiscalEventResponse setXmlCancelamento(FiscalEventResponseXmlCancelamento value) { put("xml_cancelamento", value == null ? null : value.toJson()); return this; }
 public String getDacce() { return stringValue(field("dacce")); }
 public FiscalEventResponse setDacce(String value) { put("dacce", Json.scalar(value)); return this; }
 public FiscalEventResponseLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new FiscalEventResponseLog(field("log")); }
 public FiscalEventResponse setLog(FiscalEventResponseLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public FiscalEventResponseCodigo getCodigo() { return (field("codigo")).isNull() || (field("codigo")).isMissingNode() ? null : new FiscalEventResponseCodigo(field("codigo")); }
 public FiscalEventResponse setCodigo(FiscalEventResponseCodigo value) { put("codigo", value == null ? null : value.toJson()); return this; }
 public String getProtocoloEvento() { return stringValue(field("protocolo_evento")); }
 public FiscalEventResponse setProtocoloEvento(String value) { put("protocolo_evento", Json.scalar(value)); return this; }
 public String getDataEvento() { return stringValue(field("data_evento")); }
 public FiscalEventResponse setDataEvento(String value) { put("data_evento", Json.scalar(value)); return this; }
}
