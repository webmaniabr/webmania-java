package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeTaxCalculationResultImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ipi", "icms", "icms_st", "pis", "cofins", "fcp_st", "fcp_dest", "fcp_dest_base", "issqn", "total_tributacao", "icms_desoneracao", "importacao");
 public NfeTaxCalculationResultImpostos() { super(FIELDS); }
 public NfeTaxCalculationResultImpostos(JsonNode node) { super(node, FIELDS); }
 public NfeTaxCalculationResultImpostosIpi getIpi() { return (field("ipi")).isNull() || (field("ipi")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosIpi(field("ipi")); }
 public NfeTaxCalculationResultImpostos setIpi(NfeTaxCalculationResultImpostosIpi value) { put("ipi", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosIcms(field("icms")); }
 public NfeTaxCalculationResultImpostos setIcms(NfeTaxCalculationResultImpostosIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosIcmsSt getIcmsSt() { return (field("icms_st")).isNull() || (field("icms_st")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosIcmsSt(field("icms_st")); }
 public NfeTaxCalculationResultImpostos setIcmsSt(NfeTaxCalculationResultImpostosIcmsSt value) { put("icms_st", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosPis(field("pis")); }
 public NfeTaxCalculationResultImpostos setPis(NfeTaxCalculationResultImpostosPis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosCofins(field("cofins")); }
 public NfeTaxCalculationResultImpostos setCofins(NfeTaxCalculationResultImpostosCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosFcpSt getFcpSt() { return (field("fcp_st")).isNull() || (field("fcp_st")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosFcpSt(field("fcp_st")); }
 public NfeTaxCalculationResultImpostos setFcpSt(NfeTaxCalculationResultImpostosFcpSt value) { put("fcp_st", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosFcpDest getFcpDest() { return (field("fcp_dest")).isNull() || (field("fcp_dest")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosFcpDest(field("fcp_dest")); }
 public NfeTaxCalculationResultImpostos setFcpDest(NfeTaxCalculationResultImpostosFcpDest value) { put("fcp_dest", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosFcpDestBase getFcpDestBase() { return (field("fcp_dest_base")).isNull() || (field("fcp_dest_base")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosFcpDestBase(field("fcp_dest_base")); }
 public NfeTaxCalculationResultImpostos setFcpDestBase(NfeTaxCalculationResultImpostosFcpDestBase value) { put("fcp_dest_base", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosIssqn getIssqn() { return (field("issqn")).isNull() || (field("issqn")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosIssqn(field("issqn")); }
 public NfeTaxCalculationResultImpostos setIssqn(NfeTaxCalculationResultImpostosIssqn value) { put("issqn", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosTotalTributacao getTotalTributacao() { return (field("total_tributacao")).isNull() || (field("total_tributacao")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosTotalTributacao(field("total_tributacao")); }
 public NfeTaxCalculationResultImpostos setTotalTributacao(NfeTaxCalculationResultImpostosTotalTributacao value) { put("total_tributacao", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosIcmsDesoneracao getIcmsDesoneracao() { return (field("icms_desoneracao")).isNull() || (field("icms_desoneracao")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosIcmsDesoneracao(field("icms_desoneracao")); }
 public NfeTaxCalculationResultImpostos setIcmsDesoneracao(NfeTaxCalculationResultImpostosIcmsDesoneracao value) { put("icms_desoneracao", value == null ? null : value.toJson()); return this; }
 public NfeTaxCalculationResultImpostosImportacao getImportacao() { return (field("importacao")).isNull() || (field("importacao")).isMissingNode() ? null : new NfeTaxCalculationResultImpostosImportacao(field("importacao")); }
 public NfeTaxCalculationResultImpostos setImportacao(NfeTaxCalculationResultImpostosImportacao value) { put("importacao", value == null ? null : value.toJson()); return this; }
}
