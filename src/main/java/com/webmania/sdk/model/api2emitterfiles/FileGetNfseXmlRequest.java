package com.webmania.sdk.model.api2emitterfiles;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-files.openapi.json; see contract-provenance.json. */
public final class FileGetNfseXmlRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identifier");
 public FileGetNfseXmlRequest() { super(FIELDS); }
 public FileGetNfseXmlRequest(JsonNode node) { super(node, FIELDS); }
 public FiscalFileUuid getIdentifier() { return (field("identifier")).isNull() || (field("identifier")).isMissingNode() ? null : new FiscalFileUuid(field("identifier")); }
 public FileGetNfseXmlRequest setIdentifier(FiscalFileUuid value) { put("identifier", value == null ? null : value.toJson()); return this; }
}
