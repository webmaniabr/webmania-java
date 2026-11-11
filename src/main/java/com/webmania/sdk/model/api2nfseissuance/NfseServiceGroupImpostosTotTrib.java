package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImpostosTotTrib extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pTotTribEst", "pTotTribFed", "pTotTribMun");
 public NfseServiceGroupImpostosTotTrib() { super(FIELDS); }
 public NfseServiceGroupImpostosTotTrib(JsonNode node) { super(node, FIELDS); }
 public NfseServiceGroupImpostosTotTribPTotTribEst getPTotTribEst() { return (field("pTotTribEst")).isNull() || (field("pTotTribEst")).isMissingNode() ? null : new NfseServiceGroupImpostosTotTribPTotTribEst(field("pTotTribEst")); }
 public NfseServiceGroupImpostosTotTrib setPTotTribEst(NfseServiceGroupImpostosTotTribPTotTribEst value) { put("pTotTribEst", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosTotTribPTotTribFed getPTotTribFed() { return (field("pTotTribFed")).isNull() || (field("pTotTribFed")).isMissingNode() ? null : new NfseServiceGroupImpostosTotTribPTotTribFed(field("pTotTribFed")); }
 public NfseServiceGroupImpostosTotTrib setPTotTribFed(NfseServiceGroupImpostosTotTribPTotTribFed value) { put("pTotTribFed", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupImpostosTotTribPTotTribMun getPTotTribMun() { return (field("pTotTribMun")).isNull() || (field("pTotTribMun")).isMissingNode() ? null : new NfseServiceGroupImpostosTotTribPTotTribMun(field("pTotTribMun")); }
 public NfseServiceGroupImpostosTotTrib setPTotTribMun(NfseServiceGroupImpostosTotTribPTotTribMun value) { put("pTotTribMun", value == null ? null : value.toJson()); return this; }
}
