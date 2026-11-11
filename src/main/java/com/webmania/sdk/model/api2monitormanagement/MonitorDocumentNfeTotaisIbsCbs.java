package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeTotaisIbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bc", "valor_ibs", "aliquota_ibs", "aliquota_cbs", "cbs");
 public MonitorDocumentNfeTotaisIbsCbs() { super(FIELDS); }
 public MonitorDocumentNfeTotaisIbsCbs(JsonNode node) { super(node, FIELDS); }
 public MonitorDocumentNfeTotaisIbsCbsBc getBc() { return (field("bc")).isNull() || (field("bc")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIbsCbsBc(field("bc")); }
 public MonitorDocumentNfeTotaisIbsCbs setBc(MonitorDocumentNfeTotaisIbsCbsBc value) { put("bc", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeTotaisIbsCbsValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIbsCbsValorIbs(field("valor_ibs")); }
 public MonitorDocumentNfeTotaisIbsCbs setValorIbs(MonitorDocumentNfeTotaisIbsCbsValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeTotaisIbsCbsAliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIbsCbsAliquotaIbs(field("aliquota_ibs")); }
 public MonitorDocumentNfeTotaisIbsCbs setAliquotaIbs(MonitorDocumentNfeTotaisIbsCbsAliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeTotaisIbsCbsAliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIbsCbsAliquotaCbs(field("aliquota_cbs")); }
 public MonitorDocumentNfeTotaisIbsCbs setAliquotaCbs(MonitorDocumentNfeTotaisIbsCbsAliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeTotaisIbsCbsCbs getCbs() { return (field("cbs")).isNull() || (field("cbs")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIbsCbsCbs(field("cbs")); }
 public MonitorDocumentNfeTotaisIbsCbs setCbs(MonitorDocumentNfeTotaisIbsCbsCbs value) { put("cbs", value == null ? null : value.toJson()); return this; }
}
