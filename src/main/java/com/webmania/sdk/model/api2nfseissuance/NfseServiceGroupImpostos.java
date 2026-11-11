package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cofins", "csll", "ibs_cbs", "inss", "ir", "iss", "pis", "piscofins", "totTrib", "tot_trib", "classe_imposto", "iss_simples_nacional", "reducao", "cst_pis_cofins", "cp");
 public NfseServiceGroupImpostos() { super(FIELDS); }
 public NfseServiceGroupImpostos(JsonNode node) { super(node, FIELDS); }
 public NfseServiceGroupImpostosCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new NfseServiceGroupImpostosCofins(field("cofins")); }
 public NfseServiceGroupImpostos setCofins(NfseServiceGroupImpostosCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosCsll getCsll() { return (field("csll")).isNull() || (field("csll")).isMissingNode() ? null : new NfseServiceGroupImpostosCsll(field("csll")); }
 public NfseServiceGroupImpostos setCsll(NfseServiceGroupImpostosCsll value) { put("csll", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new NfseServiceGroupImpostosIbsCbs(field("ibs_cbs")); }
 public NfseServiceGroupImpostos setIbsCbs(NfseServiceGroupImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosInss getInss() { return (field("inss")).isNull() || (field("inss")).isMissingNode() ? null : new NfseServiceGroupImpostosInss(field("inss")); }
 public NfseServiceGroupImpostos setInss(NfseServiceGroupImpostosInss value) { put("inss", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosIr getIr() { return (field("ir")).isNull() || (field("ir")).isMissingNode() ? null : new NfseServiceGroupImpostosIr(field("ir")); }
 public NfseServiceGroupImpostos setIr(NfseServiceGroupImpostosIr value) { put("ir", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosIss getIss() { return (field("iss")).isNull() || (field("iss")).isMissingNode() ? null : new NfseServiceGroupImpostosIss(field("iss")); }
 public NfseServiceGroupImpostos setIss(NfseServiceGroupImpostosIss value) { put("iss", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new NfseServiceGroupImpostosPis(field("pis")); }
 public NfseServiceGroupImpostos setPis(NfseServiceGroupImpostosPis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosPiscofins getPiscofins() { return (field("piscofins")).isNull() || (field("piscofins")).isMissingNode() ? null : new NfseServiceGroupImpostosPiscofins(field("piscofins")); }
 public NfseServiceGroupImpostos setPiscofins(NfseServiceGroupImpostosPiscofins value) { put("piscofins", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosTotTrib getTotTrib() { return (field("totTrib")).isNull() || (field("totTrib")).isMissingNode() ? null : new NfseServiceGroupImpostosTotTrib(field("totTrib")); }
 public NfseServiceGroupImpostos setTotTrib(NfseServiceGroupImpostosTotTrib value) { put("totTrib", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosTotTrib6262e9 getTotTrib6262e9() { return (field("tot_trib")).isNull() || (field("tot_trib")).isMissingNode() ? null : new NfseServiceGroupImpostosTotTrib6262e9(field("tot_trib")); }
 public NfseServiceGroupImpostos setTotTrib6262e9(NfseServiceGroupImpostosTotTrib6262e9 value) { put("tot_trib", value == null ? null : value.toJson()); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public NfseServiceGroupImpostos setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public String getIssSimplesNacional() { return stringValue(field("iss_simples_nacional")); }
 public NfseServiceGroupImpostos setIssSimplesNacional(String value) { put("iss_simples_nacional", Json.scalar(value)); return this; }
 public NfseServiceGroupImpostosReducao getReducao() { return (field("reducao")).isNull() || (field("reducao")).isMissingNode() ? null : new NfseServiceGroupImpostosReducao(field("reducao")); }
 public NfseServiceGroupImpostos setReducao(NfseServiceGroupImpostosReducao value) { put("reducao", value == null ? null : value.toJson()); return this; }
 public String getCstPisCofins() { return stringValue(field("cst_pis_cofins")); }
 public NfseServiceGroupImpostos setCstPisCofins(String value) { put("cst_pis_cofins", Json.scalar(value)); return this; }
 public NfseServiceGroupImpostosCp getCp() { return (field("cp")).isNull() || (field("cp")).isMissingNode() ? null : new NfseServiceGroupImpostosCp(field("cp")); }
 public NfseServiceGroupImpostos setCp(NfseServiceGroupImpostosCp value) { put("cp", value == null ? null : value.toJson()); return this; }
}
