package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoImovel extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cidade", "codigo_cib", "codigo_obra", "codigo_pais", "codigo_postal", "complemento", "endereco", "estado_provincia", "inscricao_imobiliaria", "numero");
 public EmitterIssueNfsePayloadRpsItemServicoImovel() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCodigoCib() { return stringValue(field("codigo_cib")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setCodigoCib(String value) { put("codigo_cib", Json.scalar(value)); return this; }
 public String getCodigoObra() { return stringValue(field("codigo_obra")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setCodigoObra(String value) { put("codigo_obra", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getCodigoPostal() { return stringValue(field("codigo_postal")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setCodigoPostal(String value) { put("codigo_postal", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoImovelEndereco getEndereco() { return (field("endereco")).isNull() || (field("endereco")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoImovelEndereco(field("endereco")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setEndereco(EmitterIssueNfsePayloadRpsItemServicoImovelEndereco value) { put("endereco", value == null ? null : value.toJson()); return this; }
 public String getEstadoProvincia() { return stringValue(field("estado_provincia")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setEstadoProvincia(String value) { put("estado_provincia", Json.scalar(value)); return this; }
 public String getInscricaoImobiliaria() { return stringValue(field("inscricao_imobiliaria")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setInscricaoImobiliaria(String value) { put("inscricao_imobiliaria", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemServicoImovel setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
