package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_cofins", "aliquota_pis", "base_calculo", "cst", "tipo_retencao", "valor_cofins", "valor_pis");
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins(JsonNode node) { super(node, FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaCofins getAliquotaCofins() { return (field("aliquota_cofins")).isNull() || (field("aliquota_cofins")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaCofins(field("aliquota_cofins")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins setAliquotaCofins(EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaCofins value) { put("aliquota_cofins", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaPis getAliquotaPis() { return (field("aliquota_pis")).isNull() || (field("aliquota_pis")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaPis(field("aliquota_pis")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins setAliquotaPis(EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaPis value) { put("aliquota_pis", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsBaseCalculo(field("base_calculo")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins setBaseCalculo(EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public String getCst() { return stringValue(field("cst")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins setCst(String value) { put("cst", Json.scalar(value)); return this; }
 public JsonValue getTipoRetencao() { return (field("tipo_retencao")).isNull() || (field("tipo_retencao")).isMissingNode() ? null : new JsonValue(field("tipo_retencao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins setTipoRetencao(JsonValue value) { put("tipo_retencao", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsValorCofins getValorCofins() { return (field("valor_cofins")).isNull() || (field("valor_cofins")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsValorCofins(field("valor_cofins")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins setValorCofins(EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsValorCofins value) { put("valor_cofins", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsValorPis getValorPis() { return (field("valor_pis")).isNull() || (field("valor_pis")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsValorPis(field("valor_pis")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins setValorPis(EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofinsValorPis value) { put("valor_pis", value == null ? null : value.toJson()); return this; }
}
