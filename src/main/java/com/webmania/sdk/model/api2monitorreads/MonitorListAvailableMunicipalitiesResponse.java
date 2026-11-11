package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorListAvailableMunicipalitiesResponse extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"$ref\":\"#/components/schemas/MonitorAvailableMunicipalities\"},{\"$ref\":\"#/components/schemas/MonitorAvailableMunicipality\"}]}");
 public MonitorListAvailableMunicipalitiesResponse(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorListAvailableMunicipalitiesResponse ofVariant0(MonitorAvailableMunicipalities value) { return new MonitorListAvailableMunicipalitiesResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorAvailableMunicipalities asVariant0() { JsonNode value = checkedVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorAvailableMunicipalities(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorListAvailableMunicipalitiesResponse ofVariant1(MonitorAvailableMunicipality value) { return new MonitorListAvailableMunicipalitiesResponse(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_1); }
 public MonitorAvailableMunicipality asVariant1() { JsonNode value = checkedVariant("api2/monitor-reads.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new MonitorAvailableMunicipality(value); }
}
