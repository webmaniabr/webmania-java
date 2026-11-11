package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class NfeDownloadSimpleDanfeRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public NfeDownloadSimpleDanfeRequest() { super(FIELDS); }
 public NfeDownloadSimpleDanfeRequest(JsonNode node) { super(node, FIELDS); }
 public NfeDownloadSimpleDanfeRequestIdentifier getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new NfeDownloadSimpleDanfeRequestIdentifier(field("identifier")); }
 public NfeDownloadSimpleDanfeRequest setIdentifier(NfeDownloadSimpleDanfeRequestIdentifier value) { put("identifier", value == null ? null : value.toJson()); return this; }
}
