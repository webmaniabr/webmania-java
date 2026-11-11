package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeComplementTaxes extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("icms", "icms_st", "ipi", "issqn", "ibs_cbs");
 public NfeComplementTaxes() { super(FIELDS); }
 public NfeComplementTaxes(JsonNode node) { super(node, FIELDS); }
 public G115 getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new G115(field("icms")); }
 public NfeComplementTaxes setIcms(G115 value) { put("icms", value == null ? null : value.toJson()); return this; }
 public G116 getIcmsSt() { return (field("icms_st")).isNull() || (field("icms_st")).isMissingNode() ? null : new G116(field("icms_st")); }
 public NfeComplementTaxes setIcmsSt(G116 value) { put("icms_st", value == null ? null : value.toJson()); return this; }
 public G117 getIpi() { return (field("ipi")).isNull() || (field("ipi")).isMissingNode() ? null : new G117(field("ipi")); }
 public NfeComplementTaxes setIpi(G117 value) { put("ipi", value == null ? null : value.toJson()); return this; }
 public G118 getIssqn() { return (field("issqn")).isNull() || (field("issqn")).isMissingNode() ? null : new G118(field("issqn")); }
 public NfeComplementTaxes setIssqn(G118 value) { put("issqn", value == null ? null : value.toJson()); return this; }
 public NfeComplementIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new NfeComplementIbsCbs(field("ibs_cbs")); }
 public NfeComplementTaxes setIbsCbs(NfeComplementIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
