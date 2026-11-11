package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class NfeDownloadCorrectionPdfSequenceRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier", "event");
 public NfeDownloadCorrectionPdfSequenceRequest() { super(FIELDS); }
 public NfeDownloadCorrectionPdfSequenceRequest(JsonNode node) { super(node, FIELDS); }
 public NfeDownloadCorrectionPdfSequenceRequestIdentifier getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new NfeDownloadCorrectionPdfSequenceRequestIdentifier(field("identifier")); }
 public NfeDownloadCorrectionPdfSequenceRequest setIdentifier(NfeDownloadCorrectionPdfSequenceRequestIdentifier value) { put("identifier", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getEvent() { return integerValue(field("event")); }
 public NfeDownloadCorrectionPdfSequenceRequest setEvent(java.math.BigInteger value) { put("event", Json.scalar(value)); return this; }
}
