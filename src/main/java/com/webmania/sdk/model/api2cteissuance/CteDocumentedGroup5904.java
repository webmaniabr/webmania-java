package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup5904 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "alteracoes", "ambiente", "sequencia");
 public CteDocumentedGroup5904() { super(FIELDS); }
 public CteDocumentedGroup5904(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteDocumentedGroup5904 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public java.util.List<JsonValue> getAlteracoes() { return list(field("alteracoes"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public CteDocumentedGroup5904 setAlteracoes(java.util.List<JsonValue> value) { put("alteracoes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public CteDocumentedGroup5904Ambiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new CteDocumentedGroup5904Ambiente(field("ambiente")); }
 public CteDocumentedGroup5904 setAmbiente(CteDocumentedGroup5904Ambiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public CteDocumentedGroup5904Sequencia getSequencia() { return (field("sequencia")).isNull() || (field("sequencia")).isMissingNode() ? null : new CteDocumentedGroup5904Sequencia(field("sequencia")); }
 public CteDocumentedGroup5904 setSequencia(CteDocumentedGroup5904Sequencia value) { put("sequencia", value == null ? null : value.toJson()); return this; }
}
