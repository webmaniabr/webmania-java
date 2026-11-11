package com.webmania.sdk.model.api2monitorreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-reads.openapi.json; see contract-provenance.json. */
public final class MonitorListCompanyMunicipalitiesRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("company", "page", "per_page", "municipio", "uf", "codigo_ibge");
 public MonitorListCompanyMunicipalitiesRequest() { super(FIELDS); }
 public MonitorListCompanyMunicipalitiesRequest(JsonNode node) { super(node, FIELDS); }
 public String getCompany() { return stringValue(field("company")); }
 public MonitorListCompanyMunicipalitiesRequest setCompany(String value) { put("company", Json.scalar(value)); return this; }
 public java.math.BigInteger getPage() { return integerValue(field("page")); }
 public MonitorListCompanyMunicipalitiesRequest setPage(java.math.BigInteger value) { put("page", Json.scalar(value)); return this; }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorListCompanyMunicipalitiesRequest setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public MonitorListCompanyMunicipalitiesRequest setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorListCompanyMunicipalitiesRequest setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCodigoIbge() { return stringValue(field("codigo_ibge")); }
 public MonitorListCompanyMunicipalitiesRequest setCodigoIbge(String value) { put("codigo_ibge", Json.scalar(value)); return this; }
}
