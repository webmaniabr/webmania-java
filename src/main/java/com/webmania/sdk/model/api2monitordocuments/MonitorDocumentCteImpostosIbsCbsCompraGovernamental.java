package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteImpostosIbsCbsCompraGovernamental extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_estadual", "ibs_municipal", "cbs");
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamental() { super(FIELDS); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamental(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamental setIbsEstadual(MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamental setIbsMunicipal(MonitorDocumentCteImpostosIbsCbsCompraGovernamentalIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamentalCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbsCompraGovernamentalCbs(field("cbs")); }
 public MonitorDocumentCteImpostosIbsCbsCompraGovernamental setCbs(MonitorDocumentCteImpostosIbsCbsCompraGovernamentalCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
}
