package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadCobrancaFatura extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("numero", "valor_desconto", "valor_liquido", "valor_original");
 public EmitterIssueCtePayloadCobrancaFatura() { super(FIELDS); }
 public EmitterIssueCtePayloadCobrancaFatura(JsonNode node) { super(node, FIELDS); }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadCobrancaFatura setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadCobrancaFaturaValorDesconto getValorDesconto() { return (field("valor_desconto")).isNull() || (field("valor_desconto")).isMissingNode() ? null : new EmitterIssueCtePayloadCobrancaFaturaValorDesconto(field("valor_desconto")); }
 public EmitterIssueCtePayloadCobrancaFatura setValorDesconto(EmitterIssueCtePayloadCobrancaFaturaValorDesconto value) { put("valor_desconto", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadCobrancaFaturaValorLiquido getValorLiquido() { return (field("valor_liquido")).isNull() || (field("valor_liquido")).isMissingNode() ? null : new EmitterIssueCtePayloadCobrancaFaturaValorLiquido(field("valor_liquido")); }
 public EmitterIssueCtePayloadCobrancaFatura setValorLiquido(EmitterIssueCtePayloadCobrancaFaturaValorLiquido value) { put("valor_liquido", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadCobrancaFaturaValorOriginal getValorOriginal() { return (field("valor_original")).isNull() || (field("valor_original")).isMissingNode() ? null : new EmitterIssueCtePayloadCobrancaFaturaValorOriginal(field("valor_original")); }
 public EmitterIssueCtePayloadCobrancaFatura setValorOriginal(EmitterIssueCtePayloadCobrancaFaturaValorOriginal value) { put("valor_original", value == null ? null : value.toJson()); return this; }
}
