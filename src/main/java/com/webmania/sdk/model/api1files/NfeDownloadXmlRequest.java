package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class NfeDownloadXmlRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier", "download");
 public NfeDownloadXmlRequest() { super(FIELDS); }
 public NfeDownloadXmlRequest(JsonNode node) { super(node, FIELDS); }
 public NfeDownloadXmlRequestIdentifier getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new NfeDownloadXmlRequestIdentifier(field("identifier")); }
 public NfeDownloadXmlRequest setIdentifier(NfeDownloadXmlRequestIdentifier value) { put("identifier", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getDownload() { return integerValue(field("download")); }
 public NfeDownloadXmlRequest setDownload(java.math.BigInteger value) { put("download", Json.scalar(value)); return this; }
}
