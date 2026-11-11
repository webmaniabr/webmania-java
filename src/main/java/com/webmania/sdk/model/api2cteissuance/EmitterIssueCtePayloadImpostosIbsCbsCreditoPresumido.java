package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "aliquota_cbs");
 public EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public String getAliquotaIbs() { return stringValue(field("aliquota_ibs")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido setAliquotaIbs(String value) { put("aliquota_ibs", Json.scalar(value)); return this; }
 public String getAliquotaCbs() { return stringValue(field("aliquota_cbs")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCreditoPresumido setAliquotaCbs(String value) { put("aliquota_cbs", Json.scalar(value)); return this; }
}
