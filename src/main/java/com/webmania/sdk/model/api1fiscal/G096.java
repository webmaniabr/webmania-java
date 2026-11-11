package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G096 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_pis", "valor_cofins", "valor_csll", "bc_irrf", "valor_irrf", "bc_previdencia", "valor_previdencia");
 public G096() { super(FIELDS); }
 public G096(JsonNode node) { super(node, FIELDS); }
 public G096ValorPis getValorPis() { return (field("valor_pis")).isNull() || (field("valor_pis")).isMissingNode() ? null : new G096ValorPis(field("valor_pis")); }
 public G096 setValorPis(G096ValorPis value) { put("valor_pis", value == null ? null : value.toJson()); return this; }
 public G096ValorCofins getValorCofins() { return (field("valor_cofins")).isNull() || (field("valor_cofins")).isMissingNode() ? null : new G096ValorCofins(field("valor_cofins")); }
 public G096 setValorCofins(G096ValorCofins value) { put("valor_cofins", value == null ? null : value.toJson()); return this; }
 public G096ValorCsll getValorCsll() { return (field("valor_csll")).isNull() || (field("valor_csll")).isMissingNode() ? null : new G096ValorCsll(field("valor_csll")); }
 public G096 setValorCsll(G096ValorCsll value) { put("valor_csll", value == null ? null : value.toJson()); return this; }
 public G096BcIrrf getBcIrrf() { return (field("bc_irrf")).isNull() || (field("bc_irrf")).isMissingNode() ? null : new G096BcIrrf(field("bc_irrf")); }
 public G096 setBcIrrf(G096BcIrrf value) { put("bc_irrf", value == null ? null : value.toJson()); return this; }
 public G096ValorIrrf getValorIrrf() { return (field("valor_irrf")).isNull() || (field("valor_irrf")).isMissingNode() ? null : new G096ValorIrrf(field("valor_irrf")); }
 public G096 setValorIrrf(G096ValorIrrf value) { put("valor_irrf", value == null ? null : value.toJson()); return this; }
 public G096BcPrevidencia getBcPrevidencia() { return (field("bc_previdencia")).isNull() || (field("bc_previdencia")).isMissingNode() ? null : new G096BcPrevidencia(field("bc_previdencia")); }
 public G096 setBcPrevidencia(G096BcPrevidencia value) { put("bc_previdencia", value == null ? null : value.toJson()); return this; }
 public G096ValorPrevidencia getValorPrevidencia() { return (field("valor_previdencia")).isNull() || (field("valor_previdencia")).isMissingNode() ? null : new G096ValorPrevidencia(field("valor_previdencia")); }
 public G096 setValorPrevidencia(G096ValorPrevidencia value) { put("valor_previdencia", value == null ? null : value.toJson()); return this; }
}
