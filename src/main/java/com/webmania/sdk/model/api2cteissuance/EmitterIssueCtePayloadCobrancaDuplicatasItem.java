package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadCobrancaDuplicatasItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_vencimento", "numero", "valor");
 public EmitterIssueCtePayloadCobrancaDuplicatasItem() { super(FIELDS); }
 public EmitterIssueCtePayloadCobrancaDuplicatasItem(JsonNode node) { super(node, FIELDS); }
 public String getDataVencimento() { return stringValue(field("data_vencimento")); }
 public EmitterIssueCtePayloadCobrancaDuplicatasItem setDataVencimento(String value) { put("data_vencimento", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadCobrancaDuplicatasItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadCobrancaDuplicatasItemValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterIssueCtePayloadCobrancaDuplicatasItemValor(field("valor")); }
 public EmitterIssueCtePayloadCobrancaDuplicatasItem setValor(EmitterIssueCtePayloadCobrancaDuplicatasItemValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
