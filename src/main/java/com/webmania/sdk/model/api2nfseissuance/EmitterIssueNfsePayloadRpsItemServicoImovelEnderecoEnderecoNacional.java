package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cep", "codigo_municipio_ibge");
 public EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional(JsonNode node) { super(node, FIELDS); }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCodigoMunicipioIbge() { return stringValue(field("codigo_municipio_ibge")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEnderecoEnderecoNacional setCodigoMunicipioIbge(String value) { put("codigo_municipio_ibge", Json.scalar(value)); return this; }
}
