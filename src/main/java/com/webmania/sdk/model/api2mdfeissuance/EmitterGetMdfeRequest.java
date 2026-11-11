package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterGetMdfeRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("key");
 public EmitterGetMdfeRequest() { super(FIELDS); }
 public EmitterGetMdfeRequest(JsonNode node) { super(node, FIELDS); }
 public String getKey() { return stringValue(field("key")); }
 public EmitterGetMdfeRequest setKey(String value) { put("key", Json.scalar(value)); return this; }
}
