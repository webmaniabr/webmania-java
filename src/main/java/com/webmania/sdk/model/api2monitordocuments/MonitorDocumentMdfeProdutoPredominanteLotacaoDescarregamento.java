package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cep", "latitude", "longitude");
 public MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento() { super(FIELDS); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento(JsonNode node) { super(node, FIELDS); }
 public String getCep() { return stringValue(field("cep")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getLatitude() { return stringValue(field("latitude")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento setLatitude(String value) { put("latitude", Json.scalar(value)); return this; }
 public String getLongitude() { return stringValue(field("longitude")); }
 public MonitorDocumentMdfeProdutoPredominanteLotacaoDescarregamento setLongitude(String value) { put("longitude", Json.scalar(value)); return this; }
}
