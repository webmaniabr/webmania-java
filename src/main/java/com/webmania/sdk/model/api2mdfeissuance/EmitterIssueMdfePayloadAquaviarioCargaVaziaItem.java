package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadAquaviarioCargaVaziaItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("identificador", "tipo_unidade");
 public EmitterIssueMdfePayloadAquaviarioCargaVaziaItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadAquaviarioCargaVaziaItem(JsonNode node) { super(node, FIELDS); }
 public String getIdentificador() { return stringValue(field("identificador")); }
 public EmitterIssueMdfePayloadAquaviarioCargaVaziaItem setIdentificador(String value) { put("identificador", Json.scalar(value)); return this; }
 public JsonValue getTipoUnidade() { return (field("tipo_unidade")).isNull() || (field("tipo_unidade")).isMissingNode() ? null : new JsonValue(field("tipo_unidade")); }
 public EmitterIssueMdfePayloadAquaviarioCargaVaziaItem setTipoUnidade(JsonValue value) { put("tipo_unidade", value == null ? null : value.toJson()); return this; }
}
