package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceCodeAliquotaSugerida extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("iss");
 public NfseServiceCodeAliquotaSugerida() { super(FIELDS); }
 public NfseServiceCodeAliquotaSugerida(JsonNode node) { super(node, FIELDS); }
 public NfseServiceCodeAliquotaSugeridaIss getIss() { return (field("iss")).isNull() || (field("iss")).isMissingNode() ? null : new NfseServiceCodeAliquotaSugeridaIss(field("iss")); }
 public NfseServiceCodeAliquotaSugerida setIss(NfseServiceCodeAliquotaSugeridaIss value) { put("iss", value == null ? null : value.toJson()); return this; }
}
