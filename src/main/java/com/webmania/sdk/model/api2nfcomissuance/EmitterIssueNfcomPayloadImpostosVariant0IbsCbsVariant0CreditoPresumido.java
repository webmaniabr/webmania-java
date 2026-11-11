package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_cbs", "aliquota_ibs", "base_calculo", "classificacao");
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido() { super(FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoAliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoAliquotaCbs(field("aliquota_cbs")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido setAliquotaCbs(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoAliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoAliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoAliquotaIbs(field("aliquota_ibs")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido setAliquotaIbs(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoAliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoBaseCalculo(field("base_calculo")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido setBaseCalculo(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumidoBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
}
