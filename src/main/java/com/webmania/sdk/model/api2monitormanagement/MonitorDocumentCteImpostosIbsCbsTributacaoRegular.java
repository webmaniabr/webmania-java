package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteImpostosIbsCbsTributacaoRegular extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_estadual", "ibs_municipal", "cbs");
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegular() { super(FIELDS); }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegular(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegularIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsTributacaoRegularIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegular setIbsEstadual(MonitorDocumentCteImpostosIbsCbsTributacaoRegularIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegularIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsTributacaoRegularIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegular setIbsMunicipal(MonitorDocumentCteImpostosIbsCbsTributacaoRegularIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegularCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsTributacaoRegularCbs(field("cbs")); }
 public MonitorDocumentCteImpostosIbsCbsTributacaoRegular setCbs(MonitorDocumentCteImpostosIbsCbsTributacaoRegularCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
}
