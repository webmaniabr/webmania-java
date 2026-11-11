package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemConstrucaoCivil extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("art", "cno", "codigo_obra", "inscricao_imobiliaria_fiscal", "endereco", "numero", "complemento", "bairro", "cep", "matricula_obra", "numero_encapsulamento", "uf_local_obra", "cidade_local_obra", "nome", "cidade", "uf", "inscricao_imobiliaria", "exterior");
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil(JsonNode node) { super(node, FIELDS); }
 public String getArt() { return stringValue(field("art")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setArt(String value) { put("art", Json.scalar(value)); return this; }
 public String getCno() { return stringValue(field("cno")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setCno(String value) { put("cno", Json.scalar(value)); return this; }
 public String getCodigoObra() { return stringValue(field("codigo_obra")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setCodigoObra(String value) { put("codigo_obra", Json.scalar(value)); return this; }
 public String getInscricaoImobiliariaFiscal() { return stringValue(field("inscricao_imobiliaria_fiscal")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setInscricaoImobiliariaFiscal(String value) { put("inscricao_imobiliaria_fiscal", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getMatriculaObra() { return stringValue(field("matricula_obra")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setMatriculaObra(String value) { put("matricula_obra", Json.scalar(value)); return this; }
 public String getNumeroEncapsulamento() { return stringValue(field("numero_encapsulamento")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setNumeroEncapsulamento(String value) { put("numero_encapsulamento", Json.scalar(value)); return this; }
 public String getUfLocalObra() { return stringValue(field("uf_local_obra")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setUfLocalObra(String value) { put("uf_local_obra", Json.scalar(value)); return this; }
 public String getCidadeLocalObra() { return stringValue(field("cidade_local_obra")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setCidadeLocalObra(String value) { put("cidade_local_obra", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getInscricaoImobiliaria() { return stringValue(field("inscricao_imobiliaria")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setInscricaoImobiliaria(String value) { put("inscricao_imobiliaria", Json.scalar(value)); return this; }
 public String getExterior() { return stringValue(field("exterior")); }
 public EmitterIssueNfsePayloadRpsItemConstrucaoCivil setExterior(String value) { put("exterior", Json.scalar(value)); return this; }
}
