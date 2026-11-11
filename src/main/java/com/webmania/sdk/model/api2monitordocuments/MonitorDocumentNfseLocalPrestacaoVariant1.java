package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseLocalPrestacaoVariant1 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cidade", "uf", "codigo_municipio");
 public MonitorDocumentNfseLocalPrestacaoVariant1() { super(FIELDS); }
 public MonitorDocumentNfseLocalPrestacaoVariant1(JsonNode node) { super(node, FIELDS); }
 public String getCidade() { return stringValue(field("cidade")); }
 public MonitorDocumentNfseLocalPrestacaoVariant1 setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentNfseLocalPrestacaoVariant1 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public MonitorDocumentNfseLocalPrestacaoVariant1 setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
}
