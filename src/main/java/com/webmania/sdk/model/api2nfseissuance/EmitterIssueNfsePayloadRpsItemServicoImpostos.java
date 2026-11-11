package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cofins", "csll", "ibs_cbs", "inss", "ir", "iss", "pis", "piscofins", "totTrib", "tot_trib", "classe_imposto", "iss_simples_nacional", "reducao", "cst_pis_cofins", "cp");
 public EmitterIssueNfsePayloadRpsItemServicoImpostos() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosCofins(field("cofins")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setCofins(EmitterIssueNfsePayloadRpsItemServicoImpostosCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosCsll getCsll() { return (field("csll")).isNull() || (field("csll")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosCsll(field("csll")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setCsll(EmitterIssueNfsePayloadRpsItemServicoImpostosCsll value) { put("csll", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs(field("ibs_cbs")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setIbsCbs(EmitterIssueNfsePayloadRpsItemServicoImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosInss getInss() { return (field("inss")).isNull() || (field("inss")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosInss(field("inss")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setInss(EmitterIssueNfsePayloadRpsItemServicoImpostosInss value) { put("inss", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIr getIr() { return (field("ir")).isNull() || (field("ir")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIr(field("ir")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setIr(EmitterIssueNfsePayloadRpsItemServicoImpostosIr value) { put("ir", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosIss getIss() { return (field("iss")).isNull() || (field("iss")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosIss(field("iss")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setIss(EmitterIssueNfsePayloadRpsItemServicoImpostosIss value) { put("iss", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosPis(field("pis")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setPis(EmitterIssueNfsePayloadRpsItemServicoImpostosPis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins getPiscofins() { return (field("piscofins")).isNull() || (field("piscofins")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins(field("piscofins")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setPiscofins(EmitterIssueNfsePayloadRpsItemServicoImpostosPiscofins value) { put("piscofins", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib getTotTrib() { return (field("totTrib")).isNull() || (field("totTrib")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib(field("totTrib")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setTotTrib(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib value) { put("totTrib", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9 getTotTrib6262e9() { return (field("tot_trib")).isNull() || (field("tot_trib")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9(field("tot_trib")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setTotTrib6262e9(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9 value) { put("tot_trib", value == null ? null : value.toJson()); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public String getIssSimplesNacional() { return stringValue(field("iss_simples_nacional")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setIssSimplesNacional(String value) { put("iss_simples_nacional", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosReducao getReducao() { return (field("reducao")).isNull() || (field("reducao")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosReducao(field("reducao")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setReducao(EmitterIssueNfsePayloadRpsItemServicoImpostosReducao value) { put("reducao", value == null ? null : value.toJson()); return this; }
 public String getCstPisCofins() { return stringValue(field("cst_pis_cofins")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setCstPisCofins(String value) { put("cst_pis_cofins", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosCp getCp() { return (field("cp")).isNull() || (field("cp")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosCp(field("cp")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostos setCp(EmitterIssueNfsePayloadRpsItemServicoImpostosCp value) { put("cp", value == null ? null : value.toJson()); return this; }
}
