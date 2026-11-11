package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseParameterRequirements extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of();
 public NfseParameterRequirements() { super(FIELDS); }
 public NfseParameterRequirements(JsonNode node) { super(node, FIELDS); }
 public String getEntry(String key) { return stringValue(field(key)); }
 public NfseParameterRequirements setEntry(String key, String value) { if(FIELDS.contains(key)) throw new IllegalArgumentException("Use typed field"); put(key, Json.scalar(value)); return this; }
}
