package com.webmania.sdk.model.api2emitterfiles;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-files.openapi.json; see contract-provenance.json. */
public final class FileGetCteCorrectionXmlRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public FileGetCteCorrectionXmlRequest() { super(FIELDS); }
 public FileGetCteCorrectionXmlRequest(JsonNode node) { super(node, FIELDS); }
 public FiscalFileIdentifier getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new FiscalFileIdentifier(field("identifier")); }
 public FileGetCteCorrectionXmlRequest setIdentifier(FiscalFileIdentifier value) { put("identifier", value == null ? null : value.toJson()); return this; }
}
