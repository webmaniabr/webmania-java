package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_cbs", "valor_ibs");
 public EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbsEstornoCreditoValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsEstornoCreditoValorCbs(field("valor_cbs")); }
 public EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito setValorCbs(EmitterIssueCtePayloadImpostosIbsCbsEstornoCreditoValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsEstornoCreditoValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsEstornoCreditoValorIbs(field("valor_ibs")); }
 public EmitterIssueCtePayloadImpostosIbsCbsEstornoCredito setValorIbs(EmitterIssueCtePayloadImpostosIbsCbsEstornoCreditoValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
}
