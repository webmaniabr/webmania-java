package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeLookupRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "ID", "id", "ambiente");
 public NfeLookupRequest() { super(FIELDS); }
 public NfeLookupRequest(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public NfeLookupRequest setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeLookupRequest setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getID() { return stringValue(field("ID")); }
 public NfeLookupRequest setID(String value) { put("ID", Json.scalar(value)); return this; }
 public String getId() { return stringValue(field("id")); }
 public NfeLookupRequest setId(String value) { put("id", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeLookupRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
}
