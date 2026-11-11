package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "nome");
 public EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigo() { return stringValue(field("codigo")); }
 public EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterIssueMdfePayloadAquaviarioTerminalCarregamentoItem setNome(String value) { put("nome", Json.scalar(value)); return this; }
}
