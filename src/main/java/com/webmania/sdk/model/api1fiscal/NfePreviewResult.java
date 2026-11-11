package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfePreviewResult extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("danfe");
 public NfePreviewResult() { super(FIELDS); }
 public NfePreviewResult(JsonNode node) { super(node, FIELDS); }
 public String getDanfe() { return stringValue(field("danfe")); }
 public NfePreviewResult setDanfe(String value) { put("danfe", Json.scalar(value)); return this; }
}
