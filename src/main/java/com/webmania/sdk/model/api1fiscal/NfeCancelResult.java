package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCancelResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "xml", "xml_cancelamento", "log", "motivo");
 public NfeCancelResult() { super(FIELDS); }
 public NfeCancelResult(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public NfeCancelResult setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfeCancelResult setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getXmlCancelamento() { return stringValue(field("xml_cancelamento")); }
 public NfeCancelResult setXmlCancelamento(String value) { put("xml_cancelamento", Json.scalar(value)); return this; }
 public NfeCancelResultLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new NfeCancelResultLog(field("log")); }
 public NfeCancelResult setLog(NfeCancelResultLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfeCancelResult setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
}
