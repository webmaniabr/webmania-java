package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIbsCbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_devolvido");
 public EmitterIssueCtePayloadImpostosIbsCbsCbs() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbsCbs(JsonNode node) { super(node, FIELDS); }
 public String getValorDevolvido() { return stringValue(field("valor_devolvido")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCbs setValorDevolvido(String value) { put("valor_devolvido", Json.scalar(value)); return this; }
}
