package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCertificateValidity extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("expiration");
 public NfeCertificateValidity() { super(FIELDS); }
 public NfeCertificateValidity(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getExpiration() { return integerValue(field("expiration")); }
 public NfeCertificateValidity setExpiration(java.math.BigInteger value) { put("expiration", Json.scalar(value)); return this; }
}
