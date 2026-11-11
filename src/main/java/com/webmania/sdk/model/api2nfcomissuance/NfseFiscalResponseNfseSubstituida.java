package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfseFiscalResponseNfseSubstituida extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "numero", "codigo_verificacao");
 public NfseFiscalResponseNfseSubstituida() { super(FIELDS); }
 public NfseFiscalResponseNfseSubstituida(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfseFiscalResponseNfseSubstituida setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public NfseFiscalResponseNfseSubstituida setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public NfseFiscalResponseNfseSubstituida setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
}
