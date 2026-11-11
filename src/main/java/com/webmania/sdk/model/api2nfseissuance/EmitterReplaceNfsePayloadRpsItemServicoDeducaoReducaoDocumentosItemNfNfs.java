package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("modelo", "numero", "serie");
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs(JsonNode node) { super(node, FIELDS); }
 public String getModelo() { return stringValue(field("modelo")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs setSerie(String value) { put("serie", Json.scalar(value)); return this; }
}
