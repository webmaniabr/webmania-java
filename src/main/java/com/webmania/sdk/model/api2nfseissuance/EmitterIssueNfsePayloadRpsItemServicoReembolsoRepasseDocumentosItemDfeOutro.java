package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_municipio_emissor", "descricao_documento", "numero_documento");
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro(JsonNode node) { super(node, FIELDS); }
 public String getCodigoMunicipioEmissor() { return stringValue(field("codigo_municipio_emissor")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro setCodigoMunicipioEmissor(String value) { put("codigo_municipio_emissor", Json.scalar(value)); return this; }
 public String getDescricaoDocumento() { return stringValue(field("descricao_documento")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro setDescricaoDocumento(String value) { put("descricao_documento", Json.scalar(value)); return this; }
 public String getNumeroDocumento() { return stringValue(field("numero_documento")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro setNumeroDocumento(String value) { put("numero_documento", Json.scalar(value)); return this; }
}
