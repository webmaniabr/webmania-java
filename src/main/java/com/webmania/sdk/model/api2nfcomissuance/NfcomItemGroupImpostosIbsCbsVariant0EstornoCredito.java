package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIbsCbsVariant0EstornoCredito extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_cbs", "valor_ibs");
 public NfcomItemGroupImpostosIbsCbsVariant0EstornoCredito() { super(FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0EstornoCredito(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0EstornoCreditoValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0EstornoCreditoValorCbs(field("valor_cbs")); }
 public NfcomItemGroupImpostosIbsCbsVariant0EstornoCredito setValorCbs(NfcomItemGroupImpostosIbsCbsVariant0EstornoCreditoValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbsVariant0EstornoCreditoValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0EstornoCreditoValorIbs(field("valor_ibs")); }
 public NfcomItemGroupImpostosIbsCbsVariant0EstornoCredito setValorIbs(NfcomItemGroupImpostosIbsCbsVariant0EstornoCreditoValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
}
