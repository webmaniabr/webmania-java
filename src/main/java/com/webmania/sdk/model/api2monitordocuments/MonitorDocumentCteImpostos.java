package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_cbs", "icms");
 public MonitorDocumentCteImpostos() { super(FIELDS); }
 public MonitorDocumentCteImpostos(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentCteImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new MonitorDocumentCteImpostosIbsCbs(field("ibs_cbs")); }
 public MonitorDocumentCteImpostos setIbsCbs(MonitorDocumentCteImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteImpostosIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new MonitorDocumentCteImpostosIcms(field("icms")); }
 public MonitorDocumentCteImpostos setIcms(MonitorDocumentCteImpostosIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
}
