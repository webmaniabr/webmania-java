package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorEventLog extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nProt", "dhRegEvento", "cStat", "xEvento", "xMotivo", "tpEvento");
 public MonitorEventLog() { super(FIELDS); }
 public MonitorEventLog(JsonNode node) { super(node, FIELDS); }
 public String getNProt() { return stringValue(field("nProt")); }
 public MonitorEventLog setNProt(String value) { put("nProt", Json.scalar(value)); return this; }
 public String getDhRegEvento() { return stringValue(field("dhRegEvento")); }
 public MonitorEventLog setDhRegEvento(String value) { put("dhRegEvento", Json.scalar(value)); return this; }
 public String getCStat() { return stringValue(field("cStat")); }
 public MonitorEventLog setCStat(String value) { put("cStat", Json.scalar(value)); return this; }
 public String getXEvento() { return stringValue(field("xEvento")); }
 public MonitorEventLog setXEvento(String value) { put("xEvento", Json.scalar(value)); return this; }
 public String getXMotivo() { return stringValue(field("xMotivo")); }
 public MonitorEventLog setXMotivo(String value) { put("xMotivo", Json.scalar(value)); return this; }
 public String getTpEvento() { return stringValue(field("tpEvento")); }
 public MonitorEventLog setTpEvento(String value) { put("tpEvento", Json.scalar(value)); return this; }
}
