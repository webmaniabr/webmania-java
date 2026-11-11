package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pTotTribEst", "pTotTribFed", "pTotTribMun");
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib(JsonNode node) { super(node, FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribEst getPTotTribEst() { return (field("pTotTribEst")).isNull() || (field("pTotTribEst")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribEst(field("pTotTribEst")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib setPTotTribEst(EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribEst value) { put("pTotTribEst", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribFed getPTotTribFed() { return (field("pTotTribFed")).isNull() || (field("pTotTribFed")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribFed(field("pTotTribFed")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib setPTotTribFed(EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribFed value) { put("pTotTribFed", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribMun getPTotTribMun() { return (field("pTotTribMun")).isNull() || (field("pTotTribMun")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribMun(field("pTotTribMun")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTrib setPTotTribMun(EmitterReplaceNfsePayloadRpsItemServicoImpostosTotTribPTotTribMun value) { put("pTotTribMun", value == null ? null : value.toJson()); return this; }
}
