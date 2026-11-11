package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemAtividadeEvento extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao_evento", "data_inicio", "data_final", "identificacao", "endereco", "numero", "complemento", "bairro", "cep", "codigo_pais", "cep_exterior", "cidade", "estado", "uf", "uf_prestacao", "pais", "exterior");
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento(JsonNode node) { super(node, FIELDS); }
 public String getDescricaoEvento() { return stringValue(field("descricao_evento")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setDescricaoEvento(String value) { put("descricao_evento", Json.scalar(value)); return this; }
 public String getDataInicio() { return stringValue(field("data_inicio")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setDataInicio(String value) { put("data_inicio", Json.scalar(value)); return this; }
 public String getDataFinal() { return stringValue(field("data_final")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setDataFinal(String value) { put("data_final", Json.scalar(value)); return this; }
 public String getIdentificacao() { return stringValue(field("identificacao")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setIdentificacao(String value) { put("identificacao", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getCepExterior() { return stringValue(field("cep_exterior")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setCepExterior(String value) { put("cep_exterior", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getEstado() { return stringValue(field("estado")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getUfPrestacao() { return stringValue(field("uf_prestacao")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setUfPrestacao(String value) { put("uf_prestacao", Json.scalar(value)); return this; }
 public String getPais() { return stringValue(field("pais")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setPais(String value) { put("pais", Json.scalar(value)); return this; }
 public String getExterior() { return stringValue(field("exterior")); }
 public EmitterIssueNfsePayloadRpsItemAtividadeEvento setExterior(String value) { put("exterior", Json.scalar(value)); return this; }
}
