package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cep", "latitude", "longitude");
 public MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento() { super(FIELDS); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento(JsonNode node) { super(node, FIELDS); }
 public String getCep() { return stringValue(field("cep")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getLatitude() { return stringValue(field("latitude")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento setLatitude(String value) { put("latitude", Json.scalar(value)); return this; }
 public String getLongitude() { return stringValue(field("longitude")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoCarregamento setLongitude(String value) { put("longitude", Json.scalar(value)); return this; }
}
