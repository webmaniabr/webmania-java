package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeGetDocumentRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "ID", "id", "ambiente");
 public NfeGetDocumentRequest() { super(FIELDS); }
 public NfeGetDocumentRequest(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public NfeGetDocumentRequest setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfeGetDocumentRequest setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getID() { return stringValue(field("ID")); }
 public NfeGetDocumentRequest setID(String value) { put("ID", Json.scalar(value)); return this; }
 public String getId() { return stringValue(field("id")); }
 public NfeGetDocumentRequest setId(String value) { put("id", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeGetDocumentRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
}
