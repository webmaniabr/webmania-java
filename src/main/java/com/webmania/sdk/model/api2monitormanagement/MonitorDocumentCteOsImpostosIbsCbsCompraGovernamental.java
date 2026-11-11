package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_estadual", "ibs_municipal", "cbs");
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental() { super(FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental setIbsEstadual(MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental setIbsMunicipal(MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs(field("cbs")); }
 public MonitorDocumentCteOsImpostosIbsCbsCompraGovernamental setCbs(MonitorDocumentCteOsImpostosIbsCbsCompraGovernamentalCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
}
