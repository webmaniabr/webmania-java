package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G136 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("item", "valor_credito_ibs", "valor_credito_cbs");
 public G136() { super(FIELDS); }
 public G136(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G136 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public G136ValorCreditoIbs getValorCreditoIbs() { return (field("valor_credito_ibs")).isNull() || (field("valor_credito_ibs")).isMissingNode() ? null : new G136ValorCreditoIbs(field("valor_credito_ibs")); }
 public G136 setValorCreditoIbs(G136ValorCreditoIbs value) { put("valor_credito_ibs", value == null ? null : value.toJson()); return this; }
 public G136ValorCreditoCbs getValorCreditoCbs() { return (field("valor_credito_cbs")).isNull() || (field("valor_credito_cbs")).isMissingNode() ? null : new G136ValorCreditoCbs(field("valor_credito_cbs")); }
 public G136 setValorCreditoCbs(G136ValorCreditoCbs value) { put("valor_credito_cbs", value == null ? null : value.toJson()); return this; }
}
