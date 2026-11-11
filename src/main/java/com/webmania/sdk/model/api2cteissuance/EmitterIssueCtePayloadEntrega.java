package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadEntrega extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data", "data_final", "data_inicial");
 public EmitterIssueCtePayloadEntrega() { super(FIELDS); }
 public EmitterIssueCtePayloadEntrega(JsonNode node) { super(node, FIELDS); }
 public String getData() { return stringValue(field("data")); }
 public EmitterIssueCtePayloadEntrega setData(String value) { put("data", Json.scalar(value)); return this; }
 public String getDataFinal() { return stringValue(field("data_final")); }
 public EmitterIssueCtePayloadEntrega setDataFinal(String value) { put("data_final", Json.scalar(value)); return this; }
 public String getDataInicial() { return stringValue(field("data_inicial")); }
 public EmitterIssueCtePayloadEntrega setDataInicial(String value) { put("data_inicial", Json.scalar(value)); return this; }
}
