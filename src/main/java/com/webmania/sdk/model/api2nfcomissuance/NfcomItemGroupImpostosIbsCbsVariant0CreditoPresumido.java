package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_cbs", "aliquota_ibs", "base_calculo", "classificacao");
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumido() { super(FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoAliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoAliquotaCbs(field("aliquota_cbs")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumido setAliquotaCbs(NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoAliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoAliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoAliquotaIbs(field("aliquota_ibs")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumido setAliquotaIbs(NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoAliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoBaseCalculo(field("base_calculo")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumido setBaseCalculo(NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumidoBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
}
