package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("beneficio_fiscal", "cfop", "classificacao_tributaria", "cofins", "csll", "icms", "inss", "ir", "pis", "ibs_cbs");
 public EmitterIssueCtePayloadImpostos() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostos(JsonNode node) { super(node, FIELDS); }
 public String getBeneficioFiscal() { return stringValue(field("beneficio_fiscal")); }
 public EmitterIssueCtePayloadImpostos setBeneficioFiscal(String value) { put("beneficio_fiscal", Json.scalar(value)); return this; }
 public String getCfop() { return stringValue(field("cfop")); }
 public EmitterIssueCtePayloadImpostos setCfop(String value) { put("cfop", Json.scalar(value)); return this; }
 public String getClassificacaoTributaria() { return stringValue(field("classificacao_tributaria")); }
 public EmitterIssueCtePayloadImpostos setClassificacaoTributaria(String value) { put("classificacao_tributaria", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadImpostosCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosCofins(field("cofins")); }
 public EmitterIssueCtePayloadImpostos setCofins(EmitterIssueCtePayloadImpostosCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosCsll getCsll() { return (field("csll")).isNull() || (field("csll")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosCsll(field("csll")); }
 public EmitterIssueCtePayloadImpostos setCsll(EmitterIssueCtePayloadImpostosCsll value) { put("csll", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcms(field("icms")); }
 public EmitterIssueCtePayloadImpostos setIcms(EmitterIssueCtePayloadImpostosIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosInss getInss() { return (field("inss")).isNull() || (field("inss")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosInss(field("inss")); }
 public EmitterIssueCtePayloadImpostos setInss(EmitterIssueCtePayloadImpostosInss value) { put("inss", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIr getIr() { return (field("ir")).isNull() || (field("ir")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIr(field("ir")); }
 public EmitterIssueCtePayloadImpostos setIr(EmitterIssueCtePayloadImpostosIr value) { put("ir", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosPis(field("pis")); }
 public EmitterIssueCtePayloadImpostos setPis(EmitterIssueCtePayloadImpostosPis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbs(field("ibs_cbs")); }
 public EmitterIssueCtePayloadImpostos setIbsCbs(EmitterIssueCtePayloadImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
