package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("estadual", "federal", "municipal");
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Estadual getEstadual() { return (field("estadual")).isNull() || (field("estadual")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Estadual(field("estadual")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9 setEstadual(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Estadual value) { put("estadual", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Federal getFederal() { return (field("federal")).isNull() || (field("federal")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Federal(field("federal")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9 setFederal(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Federal value) { put("federal", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Municipal getMunicipal() { return (field("municipal")).isNull() || (field("municipal")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Municipal(field("municipal")); }
 public EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9 setMunicipal(EmitterIssueNfsePayloadRpsItemServicoImpostosTotTrib6262e9Municipal value) { put("municipal", value == null ? null : value.toJson()); return this; }
}
