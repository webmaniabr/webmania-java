package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_estadual", "ibs_municipal", "cbs");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularIbsEstadual getIbsEstadual() { return (field("ibs_estadual")).isNull() || (field("ibs_estadual")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularIbsEstadual(field("ibs_estadual")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular setIbsEstadual(MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularIbsEstadual value) { put("ibs_estadual", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularIbsMunicipal getIbsMunicipal() { return (field("ibs_municipal")).isNull() || (field("ibs_municipal")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularIbsMunicipal(field("ibs_municipal")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular setIbsMunicipal(MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularIbsMunicipal value) { put("ibs_municipal", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularCbs(field("cbs")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegular setCbs(MonitorDocumentNfeProdutosItemImpostosIbsCbsTributacaoRegularCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
}
