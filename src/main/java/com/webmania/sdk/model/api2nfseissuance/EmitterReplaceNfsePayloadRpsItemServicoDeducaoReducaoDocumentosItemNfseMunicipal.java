package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_municipio", "codigo_verificacao", "numero");
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal(JsonNode node) { super(node, FIELDS); }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
