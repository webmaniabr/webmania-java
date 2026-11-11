package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemConstrucaoCivil extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("art", "codigo_obra");
 public EmitterReplaceNfsePayloadRpsItemConstrucaoCivil() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemConstrucaoCivil(JsonNode node) { super(node, FIELDS); }
 public String getArt() { return stringValue(field("art")); }
 public EmitterReplaceNfsePayloadRpsItemConstrucaoCivil setArt(String value) { put("art", Json.scalar(value)); return this; }
 public String getCodigoObra() { return stringValue(field("codigo_obra")); }
 public EmitterReplaceNfsePayloadRpsItemConstrucaoCivil setCodigoObra(String value) { put("codigo_obra", Json.scalar(value)); return this; }
}
