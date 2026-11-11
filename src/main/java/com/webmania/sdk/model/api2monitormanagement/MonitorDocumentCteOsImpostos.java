package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_cbs", "icms");
 public MonitorDocumentCteOsImpostos() { super(FIELDS); }
 public MonitorDocumentCteOsImpostos(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIbsCbs(field("ibs_cbs")); }
 public MonitorDocumentCteOsImpostos setIbsCbs(MonitorDocumentCteOsImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsImpostosIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new MonitorDocumentCteOsImpostosIcms(field("icms")); }
 public MonitorDocumentCteOsImpostos setIcms(MonitorDocumentCteOsImpostosIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
}
