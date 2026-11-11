package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadDutoviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_inicio_prestacao", "data_termino_prestacao", "valor_tarifa");
 public EmitterIssueCtePayloadDutoviario() { super(FIELDS); }
 public EmitterIssueCtePayloadDutoviario(JsonNode node) { super(node, FIELDS); }
 public String getDataInicioPrestacao() { return stringValue(field("data_inicio_prestacao")); }
 public EmitterIssueCtePayloadDutoviario setDataInicioPrestacao(String value) { put("data_inicio_prestacao", Json.scalar(value)); return this; }
 public String getDataTerminoPrestacao() { return stringValue(field("data_termino_prestacao")); }
 public EmitterIssueCtePayloadDutoviario setDataTerminoPrestacao(String value) { put("data_termino_prestacao", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadDutoviarioValorTarifa getValorTarifa() { return (field("valor_tarifa")).isNull() || (field("valor_tarifa")).isMissingNode() ? null : new EmitterIssueCtePayloadDutoviarioValorTarifa(field("valor_tarifa")); }
 public EmitterIssueCtePayloadDutoviario setValorTarifa(EmitterIssueCtePayloadDutoviarioValorTarifa value) { put("valor_tarifa", value == null ? null : value.toJson()); return this; }
}
