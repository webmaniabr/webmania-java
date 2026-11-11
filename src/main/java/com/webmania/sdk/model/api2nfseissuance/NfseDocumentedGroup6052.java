package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseDocumentedGroup6052 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "motivo");
 public NfseDocumentedGroup6052() { super(FIELDS); }
 public NfseDocumentedGroup6052(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfseDocumentedGroup6052 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public NfseDocumentedGroup6052Motivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new NfseDocumentedGroup6052Motivo(field("motivo")); }
 public NfseDocumentedGroup6052 setMotivo(NfseDocumentedGroup6052Motivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
}
