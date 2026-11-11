package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCorrectCtePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("alteracoes", "ambiente", "chave", "origem", "sequencia", "uuid");
 public EmitterCorrectCtePayload() { super(FIELDS); }
 public EmitterCorrectCtePayload(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterCorrectCtePayloadAlteracoesItem> getAlteracoes() { return list(field("alteracoes"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterCorrectCtePayloadAlteracoesItem(v)); }
 public EmitterCorrectCtePayload setAlteracoes(java.util.List<EmitterCorrectCtePayloadAlteracoesItem> value) { put("alteracoes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterCorrectCtePayloadAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new EmitterCorrectCtePayloadAmbiente(field("ambiente")); }
 public EmitterCorrectCtePayload setAmbiente(EmitterCorrectCtePayloadAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public JsonValue getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new JsonValue(field("chave")); }
 public EmitterCorrectCtePayload setChave(JsonValue value) { put("chave", value == null ? null : value.toJson()); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterCorrectCtePayload setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public EmitterCorrectCtePayloadSequencia getSequencia() { return (field("sequencia")).isNull() || (field("sequencia")).isMissingNode() ? null : new EmitterCorrectCtePayloadSequencia(field("sequencia")); }
 public EmitterCorrectCtePayload setSequencia(EmitterCorrectCtePayloadSequencia value) { put("sequencia", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCorrectCtePayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
