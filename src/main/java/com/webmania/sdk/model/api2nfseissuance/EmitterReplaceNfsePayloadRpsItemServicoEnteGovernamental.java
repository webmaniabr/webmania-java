package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "tipo");
 public EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public JsonValue getTipo() { return (field("tipo")).isNull() || (field("tipo")).isMissingNode() ? null : new JsonValue(field("tipo")); }
 public EmitterReplaceNfsePayloadRpsItemServicoEnteGovernamental setTipo(JsonValue value) { put("tipo", value == null ? null : value.toJson()); return this; }
}
