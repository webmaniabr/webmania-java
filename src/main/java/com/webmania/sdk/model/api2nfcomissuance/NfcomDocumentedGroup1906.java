package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomDocumentedGroup1906 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("autorizar_download");
 public NfcomDocumentedGroup1906() { super(FIELDS); }
 public NfcomDocumentedGroup1906(JsonNode node) { super(node, FIELDS); }
 public java.util.List<JsonValue> getAutorizarDownload() { return list(field("autorizar_download"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public NfcomDocumentedGroup1906 setAutorizarDownload(java.util.List<JsonValue> value) { put("autorizar_download", array(value, v -> v == null ? null : v.toJson())); return this; }
}
