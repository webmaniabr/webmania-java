package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_cbs", "valor_ibs");
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito() { super(FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCreditoValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCreditoValorCbs(field("valor_cbs")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito setValorCbs(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCreditoValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCreditoValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCreditoValorIbs(field("valor_ibs")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCredito setValorIbs(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0EstornoCreditoValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
}
