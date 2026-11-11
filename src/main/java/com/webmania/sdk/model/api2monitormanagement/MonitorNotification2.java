package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorNotification2 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_notificacao", "data", "documento");
 public MonitorNotification2() { super(FIELDS); }
 public MonitorNotification2(JsonNode node) { super(node, FIELDS); }
 public JsonValue getTipoNotificacao() { return (field("tipo_notificacao")).isNull() || (field("tipo_notificacao")).isMissingNode() ? null : new JsonValue(field("tipo_notificacao")); }
 public MonitorNotification2 setTipoNotificacao(JsonValue value) { put("tipo_notificacao", value == null ? null : value.toJson()); return this; }
 public MonitorEvent getData() { return (field("data")).isNull() || (field("data")).isMissingNode() ? null : new MonitorEvent(field("data")); }
 public MonitorNotification2 setData(MonitorEvent value) { put("data", value == null ? null : value.toJson()); return this; }
 public MonitorDocument getDocumento() { return (field("documento")).isNull() || (field("documento")).isMissingNode() ? null : new MonitorDocument(field("documento")); }
 public MonitorNotification2 setDocumento(MonitorDocument value) { put("documento", value == null ? null : value.toJson()); return this; }
}
