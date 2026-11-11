package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave_dfe", "descricao_tipo_chave_dfe", "tipo_chave_dfe");
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional(JsonNode node) { super(node, FIELDS); }
 public String getChaveDfe() { return stringValue(field("chave_dfe")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional setChaveDfe(String value) { put("chave_dfe", Json.scalar(value)); return this; }
 public String getDescricaoTipoChaveDfe() { return stringValue(field("descricao_tipo_chave_dfe")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional setDescricaoTipoChaveDfe(String value) { put("descricao_tipo_chave_dfe", Json.scalar(value)); return this; }
 public JsonValue getTipoChaveDfe() { return (field("tipo_chave_dfe")).isNull() || (field("tipo_chave_dfe")).isMissingNode() ? null : new JsonValue(field("tipo_chave_dfe")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional setTipoChaveDfe(JsonValue value) { put("tipo_chave_dfe", value == null ? null : value.toJson()); return this; }
}
