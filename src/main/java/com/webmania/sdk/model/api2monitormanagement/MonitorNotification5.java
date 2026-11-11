package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorNotification5 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_notificacao", "data");
 public MonitorNotification5() { super(FIELDS); }
 public MonitorNotification5(JsonNode node) { super(node, FIELDS); }
 public JsonValue getTipoNotificacao() { return (field("tipo_notificacao")).isNull() || (field("tipo_notificacao")).isMissingNode() ? null : new JsonValue(field("tipo_notificacao")); }
 public MonitorNotification5 setTipoNotificacao(JsonValue value) { put("tipo_notificacao", value == null ? null : value.toJson()); return this; }
 public MonitorImportNotificationData getData() { return (field("data")).isNull() || (field("data")).isMissingNode() ? null : new MonitorImportNotificationData(field("data")); }
 public MonitorNotification5 setData(MonitorImportNotificationData value) { put("data", value == null ? null : value.toJson()); return this; }
}
