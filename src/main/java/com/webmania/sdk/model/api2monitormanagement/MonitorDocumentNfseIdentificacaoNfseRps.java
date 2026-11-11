package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseIdentificacaoNfseRps extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("serie", "numero", "data_emissao");
 public MonitorDocumentNfseIdentificacaoNfseRps() { super(FIELDS); }
 public MonitorDocumentNfseIdentificacaoNfseRps(JsonNode node) { super(node, FIELDS); }
 public String getSerie() { return stringValue(field("serie")); }
 public MonitorDocumentNfseIdentificacaoNfseRps setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public java.math.BigDecimal getNumero() { return decimalValue(field("numero")); }
 public MonitorDocumentNfseIdentificacaoNfseRps setNumero(java.math.BigDecimal value) { put("numero", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentNfseIdentificacaoNfseRps setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
}
