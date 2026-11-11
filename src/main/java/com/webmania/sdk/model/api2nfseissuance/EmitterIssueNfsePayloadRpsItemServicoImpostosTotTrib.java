package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pTotTribEst", "pTotTribFed", "pTotTribMun");
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribEst getPTotTribEst() { return (field("pTotTribEst")).isNull() || (field("pTotTribEst")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribEst(field("pTotTribEst")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib setPTotTribEst(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribEst value) { put("pTotTribEst", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribFed getPTotTribFed() { return (field("pTotTribFed")).isNull() || (field("pTotTribFed")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribFed(field("pTotTribFed")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib setPTotTribFed(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribFed value) { put("pTotTribFed", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribMun getPTotTribMun() { return (field("pTotTribMun")).isNull() || (field("pTotTribMun")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribMun(field("pTotTribMun")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib setPTotTribMun(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTribPTotTribMun value) { put("pTotTribMun", value == null ? null : value.toJson()); return this; }
}
