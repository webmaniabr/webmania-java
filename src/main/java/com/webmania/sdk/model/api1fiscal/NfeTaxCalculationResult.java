package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeTaxCalculationResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("impostos", "aliquotas", "pedido");
 public NfeTaxCalculationResult() { super(FIELDS); }
 public NfeTaxCalculationResult(JsonNode node) { super(node, FIELDS); }
 public NfeTaxCalculationResultImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new NfeTaxCalculationResultImpostos(field("impostos")); }
 public NfeTaxCalculationResult setImpostos(NfeTaxCalculationResultImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultAliquotas getAliquotas() { return (field("aliquotas")).isNull() || (field("aliquotas")).isMissingNode() ? null : new NfeTaxCalculationResultAliquotas(field("aliquotas")); }
 public NfeTaxCalculationResult setAliquotas(NfeTaxCalculationResultAliquotas value) { put("aliquotas", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultPedido getPedido() { return (field("pedido")).isNull() || (field("pedido")).isMissingNode() ? null : new NfeTaxCalculationResultPedido(field("pedido")); }
 public NfeTaxCalculationResult setPedido(NfeTaxCalculationResultPedido value) { put("pedido", value == null ? null : value.toJson()); return this; }
}
