package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_municipio", "documentos_fiscais", "nome_municipio");
 public EmitterIssueMdfePayloadDescarregamentoItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadDescarregamentoItem(JsonNode node) { super(node, FIELDS); }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterIssueMdfePayloadDescarregamentoItem setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem> getDocumentosFiscais() { return list(field("documentos_fiscais"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem(v)); }
 public EmitterIssueMdfePayloadDescarregamentoItem setDocumentosFiscais(java.util.List<EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItem> value) { put("documentos_fiscais", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getNomeMunicipio() { return stringValue(field("nome_municipio")); }
 public EmitterIssueMdfePayloadDescarregamentoItem setNomeMunicipio(String value) { put("nome_municipio", Json.scalar(value)); return this; }
}
