package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoImovel extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cidade", "codigo_cib", "codigo_obra", "codigo_pais", "codigo_postal", "complemento", "endereco", "estado_provincia", "inscricao_imobiliaria", "numero");
 public EmitterReplaceNfsePayloadRpsItemServicoImovel() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCodigoCib() { return stringValue(field("codigo_cib")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setCodigoCib(String value) { put("codigo_cib", Json.scalar(value)); return this; }
 public String getCodigoObra() { return stringValue(field("codigo_obra")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setCodigoObra(String value) { put("codigo_obra", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getCodigoPostal() { return stringValue(field("codigo_postal")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setCodigoPostal(String value) { put("codigo_postal", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoImovelEndereco getEndereco() { return (field("endereco")).isNull() || (field("endereco")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoImovelEndereco(field("endereco")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setEndereco(EmitterReplaceNfsePayloadRpsItemServicoImovelEndereco value) { put("endereco", value == null ? null : value.toJson()); return this; }
 public String getEstadoProvincia() { return stringValue(field("estado_provincia")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setEstadoProvincia(String value) { put("estado_provincia", Json.scalar(value)); return this; }
 public String getInscricaoImobiliaria() { return stringValue(field("inscricao_imobiliaria")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setInscricaoImobiliaria(String value) { put("inscricao_imobiliaria", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterReplaceNfsePayloadRpsItemServicoImovel setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
