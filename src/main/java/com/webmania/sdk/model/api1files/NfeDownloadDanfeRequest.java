package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class NfeDownloadDanfeRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public NfeDownloadDanfeRequest() { super(FIELDS); }
 public NfeDownloadDanfeRequest(JsonNode node) { super(node, FIELDS); }
 public NfeDownloadDanfeRequestIdentifier getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new NfeDownloadDanfeRequestIdentifier(field("identifier")); }
 public NfeDownloadDanfeRequest setIdentifier(NfeDownloadDanfeRequestIdentifier value) { put("identifier", value == null ? null : value.toJson()); return this; }
}
