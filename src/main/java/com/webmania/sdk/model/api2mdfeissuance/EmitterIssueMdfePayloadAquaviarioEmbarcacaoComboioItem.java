package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "identificador_balsa");
 public EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigo() { return stringValue(field("codigo")); }
 public EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getIdentificadorBalsa() { return stringValue(field("identificador_balsa")); }
 public EmitterIssueMdfePayloadAquaviarioEmbarcacaoComboioItem setIdentificadorBalsa(String value) { put("identificador_balsa", Json.scalar(value)); return this; }
}
