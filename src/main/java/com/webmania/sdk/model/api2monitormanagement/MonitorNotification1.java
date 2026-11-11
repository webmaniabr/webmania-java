package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorNotification1 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_notificacao", "data");
 public MonitorNotification1() { super(FIELDS); }
 public MonitorNotification1(JsonNode node) { super(node, FIELDS); }
 public JsonValue getTipoNotificacao() { return (field("tipo_notificacao")).isNull() || (field("tipo_notificacao")).isMissingNode() ? null : new JsonValue(field("tipo_notificacao")); }
 public MonitorNotification1 setTipoNotificacao(JsonValue value) { put("tipo_notificacao", value == null ? null : value.toJson()); return this; }
 public MonitorDocument getData() { return (field("data")).isNull() || (field("data")).isMissingNode() ? null : new MonitorDocument(field("data")); }
 public MonitorNotification1 setData(MonitorDocument value) { put("data", value == null ? null : value.toJson()); return this; }
}
