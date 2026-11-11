package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeManifestationRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "ambiente", "evento", "justificativa");
 public NfeManifestationRequest() { super(FIELDS); }
 public NfeManifestationRequest(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public NfeManifestationRequest setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeManifestationRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public NfeManifestationRequestEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new NfeManifestationRequestEvento(field("evento")); }
 public NfeManifestationRequest setEvento(NfeManifestationRequestEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public String getJustificativa() { return stringValue(field("justificativa")); }
 public NfeManifestationRequest setJustificativa(String value) { put("justificativa", Json.scalar(value)); return this; }
}
