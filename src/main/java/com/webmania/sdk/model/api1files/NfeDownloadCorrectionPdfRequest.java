package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class NfeDownloadCorrectionPdfRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public NfeDownloadCorrectionPdfRequest() { super(FIELDS); }
 public NfeDownloadCorrectionPdfRequest(JsonNode node) { super(node, FIELDS); }
 public NfeDownloadCorrectionPdfRequestIdentifier getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new NfeDownloadCorrectionPdfRequestIdentifier(field("identifier")); }
 public NfeDownloadCorrectionPdfRequest setIdentifier(NfeDownloadCorrectionPdfRequestIdentifier value) { put("identifier", value == null ? null : value.toJson()); return this; }
}
