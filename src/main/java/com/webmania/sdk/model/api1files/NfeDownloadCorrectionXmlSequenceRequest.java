package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class NfeDownloadCorrectionXmlSequenceRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier", "event", "download");
 public NfeDownloadCorrectionXmlSequenceRequest() { super(FIELDS); }
 public NfeDownloadCorrectionXmlSequenceRequest(JsonNode node) { super(node, FIELDS); }
 public NfeDownloadCorrectionXmlSequenceRequestIdentifier getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new NfeDownloadCorrectionXmlSequenceRequestIdentifier(field("identifier")); }
 public NfeDownloadCorrectionXmlSequenceRequest setIdentifier(NfeDownloadCorrectionXmlSequenceRequestIdentifier value) { put("identifier", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getEvent() { return integerValue(field("event")); }
 public NfeDownloadCorrectionXmlSequenceRequest setEvent(java.math.BigInteger value) { put("event", Json.scalar(value)); return this; }
 public java.math.BigInteger getDownload() { return integerValue(field("download")); }
 public NfeDownloadCorrectionXmlSequenceRequest setDownload(java.math.BigInteger value) { put("download", Json.scalar(value)); return this; }
}
