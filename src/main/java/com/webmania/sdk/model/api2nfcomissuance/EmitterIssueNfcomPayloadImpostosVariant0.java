package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_cbs");
 public EmitterIssueNfcomPayloadImpostosVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbs(field("ibs_cbs")); }
 public EmitterIssueNfcomPayloadImpostosVariant0 setIbsCbs(EmitterIssueNfcomPayloadImpostosVariant0IbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
