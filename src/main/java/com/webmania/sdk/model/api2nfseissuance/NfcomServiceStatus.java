package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomServiceStatus extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("operacional", "mensagem");
 public NfcomServiceStatus() { super(FIELDS); }
 public NfcomServiceStatus(JsonNode node) { super(node, FIELDS); }
 public Boolean getOperacional() { return booleanValue(field("operacional")); }
 public NfcomServiceStatus setOperacional(Boolean value) { put("operacional", Json.scalar(value)); return this; }
 public String getMensagem() { return stringValue(field("mensagem")); }
 public NfcomServiceStatus setMensagem(String value) { put("mensagem", Json.scalar(value)); return this; }
}
