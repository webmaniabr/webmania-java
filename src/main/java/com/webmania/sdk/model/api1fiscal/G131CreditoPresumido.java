package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G131CreditoPresumido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "aliquota_cbs", "valor_ibs", "valor_cbs");
 public G131CreditoPresumido() { super(FIELDS); }
 public G131CreditoPresumido(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public G131CreditoPresumido setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public G131CreditoPresumidoAliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new G131CreditoPresumidoAliquotaIbs(field("aliquota_ibs")); }
 public G131CreditoPresumido setAliquotaIbs(G131CreditoPresumidoAliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public G131CreditoPresumidoAliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new G131CreditoPresumidoAliquotaCbs(field("aliquota_cbs")); }
 public G131CreditoPresumido setAliquotaCbs(G131CreditoPresumidoAliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
 public G131CreditoPresumidoValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G131CreditoPresumidoValorIbs(field("valor_ibs")); }
 public G131CreditoPresumido setValorIbs(G131CreditoPresumidoValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G131CreditoPresumidoValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G131CreditoPresumidoValorCbs(field("valor_cbs")); }
 public G131CreditoPresumido setValorCbs(G131CreditoPresumidoValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
}
