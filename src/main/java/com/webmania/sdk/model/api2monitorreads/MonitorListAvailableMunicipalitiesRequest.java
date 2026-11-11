package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorListAvailableMunicipalitiesRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_ibge");
 public MonitorListAvailableMunicipalitiesRequest() { super(FIELDS); }
 public MonitorListAvailableMunicipalitiesRequest(JsonNode node) { super(node, FIELDS); }
 public String getCodigoIbge() { return stringValue(field("codigo_ibge")); }
 public MonitorListAvailableMunicipalitiesRequest setCodigoIbge(String value) { put("codigo_ibge", Json.scalar(value)); return this; }
}
