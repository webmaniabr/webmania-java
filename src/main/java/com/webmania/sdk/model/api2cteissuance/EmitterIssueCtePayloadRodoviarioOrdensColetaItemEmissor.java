package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "ie", "telefone", "uf");
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor() { super(FIELDS); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
