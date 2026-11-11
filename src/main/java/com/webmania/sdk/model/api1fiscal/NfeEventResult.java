package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeEventResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "status", "evento", "modelo", "chave", "cod_evento", "xml", "dacce", "protocolo_evento", "log", "motivo");
 public NfeEventResult() { super(FIELDS); }
 public NfeEventResult(JsonNode node) { super(node, FIELDS); }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeEventResult setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfeEventResult setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public NfeEventResultEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new NfeEventResultEvento(field("evento")); }
 public NfeEventResult setEvento(NfeEventResultEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfeEventResult setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public NfeEventResult setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getCodEvento() { return stringValue(field("cod_evento")); }
 public NfeEventResult setCodEvento(String value) { put("cod_evento", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfeEventResult setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getDacce() { return stringValue(field("dacce")); }
 public NfeEventResult setDacce(String value) { put("dacce", Json.scalar(value)); return this; }
 public String getProtocoloEvento() { return stringValue(field("protocolo_evento")); }
 public NfeEventResult setProtocoloEvento(String value) { put("protocolo_evento", Json.scalar(value)); return this; }
 public NfeEventResultLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfeEventResultLog(field("log")); }
 public NfeEventResult setLog(NfeEventResultLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfeEventResult setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
}
