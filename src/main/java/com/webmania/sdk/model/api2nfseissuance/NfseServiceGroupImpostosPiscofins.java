package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosPiscofins extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_cofins", "aliquota_pis", "base_calculo", "cst", "tipo_retencao", "valor_cofins", "valor_pis");
 public NfseServiceGroupImpostosPiscofins() { super(FIELDS); }
 public NfseServiceGroupImpostosPiscofins(JsonNode node) { super(node, FIELDS); }
 public NfseServiceGroupImpostosPiscofinsAliquotaCofins getAliquotaCofins() { return (field("aliquota_cofins")).isNull() || (field("aliquota_cofins")).isMissingNode() ? null : new NfseServiceGroupImpostosPiscofinsAliquotaCofins(field("aliquota_cofins")); }
 public NfseServiceGroupImpostosPiscofins setAliquotaCofins(NfseServiceGroupImpostosPiscofinsAliquotaCofins value) { put("aliquota_cofins", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosPiscofinsAliquotaPis getAliquotaPis() { return (field("aliquota_pis")).isNull() || (field("aliquota_pis")).isMissingNode() ? null : new NfseServiceGroupImpostosPiscofinsAliquotaPis(field("aliquota_pis")); }
 public NfseServiceGroupImpostosPiscofins setAliquotaPis(NfseServiceGroupImpostosPiscofinsAliquotaPis value) { put("aliquota_pis", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosPiscofinsBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new NfseServiceGroupImpostosPiscofinsBaseCalculo(field("base_calculo")); }
 public NfseServiceGroupImpostosPiscofins setBaseCalculo(NfseServiceGroupImpostosPiscofinsBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public String getCst() { return stringValue(field("cst")); }
 public NfseServiceGroupImpostosPiscofins setCst(String value) { put("cst", Json.scalar(value)); return this; }
 public JsonValue getTipoRetencao() { return (field("tipo_retencao")).isNull() || (field("tipo_retencao")).isMissingNode() ? null : new JsonValue(field("tipo_retencao")); }
 public NfseServiceGroupImpostosPiscofins setTipoRetencao(JsonValue value) { put("tipo_retencao", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosPiscofinsValorCofins getValorCofins() { return (field("valor_cofins")).isNull() || (field("valor_cofins")).isMissingNode() ? null : new NfseServiceGroupImpostosPiscofinsValorCofins(field("valor_cofins")); }
 public NfseServiceGroupImpostosPiscofins setValorCofins(NfseServiceGroupImpostosPiscofinsValorCofins value) { put("valor_cofins", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosPiscofinsValorPis getValorPis() { return (field("valor_pis")).isNull() || (field("valor_pis")).isMissingNode() ? null : new NfseServiceGroupImpostosPiscofinsValorPis(field("valor_pis")); }
 public NfseServiceGroupImpostosPiscofins setValorPis(NfseServiceGroupImpostosPiscofinsValorPis value) { put("valor_pis", value == null ? null : value.toJson()); return this; }
}
