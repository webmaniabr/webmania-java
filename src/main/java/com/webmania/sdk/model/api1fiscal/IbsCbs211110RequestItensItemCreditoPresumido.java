package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211110RequestItensItemCreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "aliquota_cbs", "valor_ibs", "valor_cbs");
 public IbsCbs211110RequestItensItemCreditoPresumido() { super(FIELDS); }
 public IbsCbs211110RequestItensItemCreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public IbsCbs211110RequestItensItemCreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public IbsCbs211110RequestItensItemCreditoPresumidoAliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new IbsCbs211110RequestItensItemCreditoPresumidoAliquotaIbs(field("aliquota_ibs")); }
 public IbsCbs211110RequestItensItemCreditoPresumido setAliquotaIbs(IbsCbs211110RequestItensItemCreditoPresumidoAliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110RequestItensItemCreditoPresumidoAliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new IbsCbs211110RequestItensItemCreditoPresumidoAliquotaCbs(field("aliquota_cbs")); }
 public IbsCbs211110RequestItensItemCreditoPresumido setAliquotaCbs(IbsCbs211110RequestItensItemCreditoPresumidoAliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110RequestItensItemCreditoPresumidoValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211110RequestItensItemCreditoPresumidoValorIbs(field("valor_ibs")); }
 public IbsCbs211110RequestItensItemCreditoPresumido setValorIbs(IbsCbs211110RequestItensItemCreditoPresumidoValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110RequestItensItemCreditoPresumidoValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211110RequestItensItemCreditoPresumidoValorCbs(field("valor_cbs")); }
 public IbsCbs211110RequestItensItemCreditoPresumido setValorCbs(IbsCbs211110RequestItensItemCreditoPresumidoValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
}
