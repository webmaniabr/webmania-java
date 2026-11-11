package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeSefazStatus extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status");
 public NfeSefazStatus() { super(FIELDS); }
 public NfeSefazStatus(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public NfeSefazStatus setStatus(String value) { put("status", Json.scalar(value)); return this; }
}
