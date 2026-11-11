package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadFerroviarioFerroviasItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bairro", "cep", "cidade", "cnpj", "complemento", "endereco", "ie", "nome_razao", "numero", "uf");
 public EmitterIssueCtePayloadFerroviarioFerroviasItem() { super(FIELDS); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem(JsonNode node) { super(node, FIELDS); }
 public String getBairro() { return stringValue(field("bairro")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getNomeRazao() { return stringValue(field("nome_razao")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setNomeRazao(String value) { put("nome_razao", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public EmitterIssueCtePayloadFerroviarioFerroviasItem setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
