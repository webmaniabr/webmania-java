package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classe_risco", "grupo_embalagem", "nome_embarque", "numero_onu", "quantidade_total", "quantidade_volumes", "entrega_parcial");
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem(JsonNode node) { super(node, FIELDS); }
 public String getClasseRisco() { return stringValue(field("classe_risco")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem setClasseRisco(String value) { put("classe_risco", Json.scalar(value)); return this; }
 public String getGrupoEmbalagem() { return stringValue(field("grupo_embalagem")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem setGrupoEmbalagem(String value) { put("grupo_embalagem", Json.scalar(value)); return this; }
 public String getNomeEmbarque() { return stringValue(field("nome_embarque")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem setNomeEmbarque(String value) { put("nome_embarque", Json.scalar(value)); return this; }
 public String getNumeroOnu() { return stringValue(field("numero_onu")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem setNumeroOnu(String value) { put("numero_onu", Json.scalar(value)); return this; }
 public String getQuantidadeTotal() { return stringValue(field("quantidade_total")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem setQuantidadeTotal(String value) { put("quantidade_total", Json.scalar(value)); return this; }
 public String getQuantidadeVolumes() { return stringValue(field("quantidade_volumes")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem setQuantidadeVolumes(String value) { put("quantidade_volumes", Json.scalar(value)); return this; }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItemEntregaParcial getEntregaParcial() { return (field("entrega_parcial")).isNull() || (field("entrega_parcial")).isMissingNode() ? null : new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItemEntregaParcial(field("entrega_parcial")); }
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItem setEntregaParcial(EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemPericulosidadeItemEntregaParcial value) { put("entrega_parcial", value == null ? null : value.toJson()); return this; }
}
