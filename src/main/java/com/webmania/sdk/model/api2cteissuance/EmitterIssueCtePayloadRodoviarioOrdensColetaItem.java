package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadRodoviarioOrdensColetaItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_emissao", "emissor", "numero", "serie");
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItem() { super(FIELDS); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItem(JsonNode node) { super(node, FIELDS); }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor getEmissor() { return (field("emissor")).isNull() || (field("emissor")).isMissingNode() ? null : new EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor(field("emissor")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItem setEmissor(EmitterIssueCtePayloadRodoviarioOrdensColetaItemEmissor value) { put("emissor", value == null ? null : value.toJson()); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public EmitterIssueCtePayloadRodoviarioOrdensColetaItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
}
