package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorManifestationRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("evento", "manifestacao", "justificativa");
 public MonitorManifestationRequest() { super(FIELDS); }
 public MonitorManifestationRequest(JsonNode node) { super(node, FIELDS); }
 public MonitorManifestationRequestEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new MonitorManifestationRequestEvento(field("evento")); }
 public MonitorManifestationRequest setEvento(MonitorManifestationRequestEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public MonitorManifestationRequestManifestacao getManifestacao() { return (field("manifestacao")).isNull() || (field("manifestacao")).isMissingNode() ? null : new MonitorManifestationRequestManifestacao(field("manifestacao")); }
 public MonitorManifestationRequest setManifestacao(MonitorManifestationRequestManifestacao value) { put("manifestacao", value == null ? null : value.toJson()); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public MonitorManifestationRequest setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
