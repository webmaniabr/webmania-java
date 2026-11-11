package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_estadual", "ibs_municipal", "cbs");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental setIbsEstadual(MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental setIbsMunicipal(MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalCbs(field("cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamental setCbs(MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
}
