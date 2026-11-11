package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cofins", "csll", "inss", "ir", "iss", "pis", "piscofins", "totTrib", "tot_trib", "ibs_cbs");
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos(JsonNode node) { super(node, FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosCofins(field("cofins")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setCofins(EmitterReplaceNfsePayloadRpsItemServicoImpostosCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosCsll getCsll() { return (field("csll")).isNull() || (field("csll")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosCsll(field("csll")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setCsll(EmitterReplaceNfsePayloadRpsItemServicoImpostosCsll value) { put("csll", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosInss getInss() { return (field("inss")).isNull() || (field("inss")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosInss(field("inss")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setInss(EmitterReplaceNfsePayloadRpsItemServicoImpostosInss value) { put("inss", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIr getIr() { return (field("ir")).isNull() || (field("ir")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosIr(field("ir")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setIr(EmitterReplaceNfsePayloadRpsItemServicoImpostosIr value) { put("ir", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIss getIss() { return (field("iss")).isNull() || (field("iss")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosIss(field("iss")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setIss(EmitterReplaceNfsePayloadRpsItemServicoImpostosIss value) { put("iss", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosPis(field("pis")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setPis(EmitterReplaceNfsePayloadRpsItemServicoImpostosPis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins getPiscofins() { return (field("piscofins")).isNull() || (field("piscofins")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins(field("piscofins")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setPiscofins(EmitterReplaceNfsePayloadRpsItemServicoImpostosPiscofins value) { put("piscofins", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib getTotTrib() { return (field("totTrib")).isNull() || (field("totTrib")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib(field("totTrib")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setTotTrib(EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib value) { put("totTrib", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib6262e9 getTotTrib6262e9() { return (field("tot_trib")).isNull() || (field("tot_trib")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib6262e9(field("tot_trib")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setTotTrib6262e9(EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib6262e9 value) { put("tot_trib", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs(field("ibs_cbs")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostos setIbsCbs(EmitterReplaceNfsePayloadRpsItemServicoImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
