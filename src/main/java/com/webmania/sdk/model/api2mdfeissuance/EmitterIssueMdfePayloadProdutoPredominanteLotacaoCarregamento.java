package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cep", "latitude", "longitude");
 public EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento() { super(FIELDS); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento(JsonNode node) { super(node, FIELDS); }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getLatitude() { return stringValue(field("latitude")); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento setLatitude(String value) { put("latitude", Json.scalar(value)); return this; }
 public String getLongitude() { return stringValue(field("longitude")); }
 public EmitterIssueMdfePayloadProdutoPredominanteLotacaoCarregamento setLongitude(String value) { put("longitude", Json.scalar(value)); return this; }
}
