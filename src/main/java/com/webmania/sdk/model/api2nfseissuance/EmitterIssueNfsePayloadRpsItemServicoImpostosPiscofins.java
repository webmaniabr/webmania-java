package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_cofins", "aliquota_pis", "base_calculo", "cst", "tipo_retencao", "valor_cofins", "valor_pis");
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaCofins getAliquotaCofins() { return (field("aliquota_cofins")).isNull() || (field("aliquota_cofins")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaCofins(field("aliquota_cofins")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins setAliquotaCofins(EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaCofins value) { put("aliquota_cofins", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaPis getAliquotaPis() { return (field("aliquota_pis")).isNull() || (field("aliquota_pis")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaPis(field("aliquota_pis")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins setAliquotaPis(EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsAliquotaPis value) { put("aliquota_pis", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsBaseCalculo(field("base_calculo")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins setBaseCalculo(EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public String getCst() { return stringValue(field("cst")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins setCst(String value) { put("cst", Json.scalar(value)); return this; }
 public JsonValue getTipoRetencao() { return (field("tipo_retencao")).isNull() || (field("tipo_retencao")).isMissingNode() ? null : new JsonValue(field("tipo_retencao")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins setTipoRetencao(JsonValue value) { put("tipo_retencao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsValorCofins getValorCofins() { return (field("valor_cofins")).isNull() || (field("valor_cofins")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsValorCofins(field("valor_cofins")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins setValorCofins(EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsValorCofins value) { put("valor_cofins", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsValorPis getValorPis() { return (field("valor_pis")).isNull() || (field("valor_pis")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsValorPis(field("valor_pis")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins setValorPis(EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofinsValorPis value) { put("valor_pis", value == null ? null : value.toJson()); return this; }
}
