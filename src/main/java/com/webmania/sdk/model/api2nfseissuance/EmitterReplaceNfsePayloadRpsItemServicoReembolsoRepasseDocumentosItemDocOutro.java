package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao_documento", "numero_documento");
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro(JsonNode node) { super(node, FIELDS); }
 public String getDescricaoDocumento() { return stringValue(field("descricao_documento")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro setDescricaoDocumento(String value) { put("descricao_documento", Json.scalar(value)); return this; }
 public String getNumeroDocumento() { return stringValue(field("numero_documento")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro setNumeroDocumento(String value) { put("numero_documento", Json.scalar(value)); return this; }
}
