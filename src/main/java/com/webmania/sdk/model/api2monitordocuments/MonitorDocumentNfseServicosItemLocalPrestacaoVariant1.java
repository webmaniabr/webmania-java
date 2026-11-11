package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseServicosItemLocalPrestacaoVariant1 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uf", "cidade", "codigo_municipio");
 public MonitorDocumentNfseServicosItemLocalPrestacaoVariant1() { super(FIELDS); }
 public MonitorDocumentNfseServicosItemLocalPrestacaoVariant1(JsonNode node) { super(node, FIELDS); }
 public String getUf() { return stringValue(field("uf")); }
 public MonitorDocumentNfseServicosItemLocalPrestacaoVariant1 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public MonitorDocumentNfseServicosItemLocalPrestacaoVariant1 setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public MonitorDocumentNfseServicosItemLocalPrestacaoVariant1 setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
}
