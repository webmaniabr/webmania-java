package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorNotification4 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_notificacao", "data");
 public MonitorNotification4() { super(FIELDS); }
 public MonitorNotification4(JsonNode node) { super(node, FIELDS); }
 public JsonValue getTipoNotificacao() { return (field("tipo_notificacao")).isNull() || (field("tipo_notificacao")).isMissingNode() ? null : new JsonValue(field("tipo_notificacao")); }
 public MonitorNotification4 setTipoNotificacao(JsonValue value) { put("tipo_notificacao", value == null ? null : value.toJson()); return this; }
 public MonitorNotification4Data getData() { return (field("data")).isNull() || (field("data")).isMissingNode() ? null : new MonitorNotification4Data(field("data")); }
 public MonitorNotification4 setData(MonitorNotification4Data value) { put("data", value == null ? null : value.toJson()); return this; }
}
