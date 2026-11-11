package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadAereoTarifa extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classe", "codigo", "valor");
 public EmitterIssueCtePayloadAereoTarifa() { super(FIELDS); }
 public EmitterIssueCtePayloadAereoTarifa(JsonNode node) { super(node, FIELDS); }
 public String getClasse() { return stringValue(field("classe")); }
 public EmitterIssueCtePayloadAereoTarifa setClasse(String value) { put("classe", Json.scalar(value)); return this; }
 public String getCodigo() { return stringValue(field("codigo")); }
 public EmitterIssueCtePayloadAereoTarifa setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadAereoTarifaValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterIssueCtePayloadAereoTarifaValor(field("valor")); }
 public EmitterIssueCtePayloadAereoTarifa setValor(EmitterIssueCtePayloadAereoTarifaValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
