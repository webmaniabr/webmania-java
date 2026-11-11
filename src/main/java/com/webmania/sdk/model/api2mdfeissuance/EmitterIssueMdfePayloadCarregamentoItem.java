package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadCarregamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_municipio", "nome_municipio");
 public EmitterIssueMdfePayloadCarregamentoItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadCarregamentoItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterIssueMdfePayloadCarregamentoItem setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getNomeMunicipio() { return stringValue(field("nome_municipio")); }
 public EmitterIssueMdfePayloadCarregamentoItem setNomeMunicipio(String value) { put("nome_municipio", Json.scalar(value)); return this; }
}
