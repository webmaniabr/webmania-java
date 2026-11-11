package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211110DetailsItensItemCreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "aliquota_cbs", "valor_ibs", "valor_cbs");
 public IbsCbs211110DetailsItensItemCreditoPresumido() { super(FIELDS); }
 public IbsCbs211110DetailsItensItemCreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public IbsCbs211110DetailsItensItemCreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaIbs(field("aliquota_ibs")); }
 public IbsCbs211110DetailsItensItemCreditoPresumido setAliquotaIbs(IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaCbs(field("aliquota_cbs")); }
 public IbsCbs211110DetailsItensItemCreditoPresumido setAliquotaCbs(IbsCbs211110DetailsItensItemCreditoPresumidoAliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110DetailsItensItemCreditoPresumidoValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new IbsCbs211110DetailsItensItemCreditoPresumidoValorIbs(field("valor_ibs")); }
 public IbsCbs211110DetailsItensItemCreditoPresumido setValorIbs(IbsCbs211110DetailsItensItemCreditoPresumidoValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public IbsCbs211110DetailsItensItemCreditoPresumidoValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new IbsCbs211110DetailsItensItemCreditoPresumidoValorCbs(field("valor_cbs")); }
 public IbsCbs211110DetailsItensItemCreditoPresumido setValorCbs(IbsCbs211110DetailsItensItemCreditoPresumidoValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
}
