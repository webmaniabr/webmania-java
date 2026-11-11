package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G145 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_tributacao", "regime_tributario", "cnpj", "razao_social", "cpf", "nome_completo", "nome_fantasia", "ie", "im", "unidade_empresa", "email", "telefone", "conta_bancaria_banco", "conta_bancaria_agencia", "conta_bancaria_numero", "conta_bancaria_digito", "contabilidade", "url_notificacao", "logomarca");
 public G145() { super(FIELDS); }
 public G145(JsonNode node) { super(node, FIELDS); }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public G145 setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public String getRegimeTributario() { return stringValue(field("regime_tributario")); }
 public G145 setRegimeTributario(String value) { put("regime_tributario", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public G145 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public G145 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public G145 setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public G145 setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getNomeFantasia() { return stringValue(field("nome_fantasia")); }
 public G145 setNomeFantasia(String value) { put("nome_fantasia", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public G145 setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getIm() { return stringValue(field("im")); }
 public G145 setIm(String value) { put("im", Json.scalar(value)); return this; }
 public String getUnidadeEmpresa() { return stringValue(field("unidade_empresa")); }
 public G145 setUnidadeEmpresa(String value) { put("unidade_empresa", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public G145 setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public G145 setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getContaBancariaBanco() { return stringValue(field("conta_bancaria_banco")); }
 public G145 setContaBancariaBanco(String value) { put("conta_bancaria_banco", Json.scalar(value)); return this; }
 public String getContaBancariaAgencia() { return stringValue(field("conta_bancaria_agencia")); }
 public G145 setContaBancariaAgencia(String value) { put("conta_bancaria_agencia", Json.scalar(value)); return this; }
 public String getContaBancariaNumero() { return stringValue(field("conta_bancaria_numero")); }
 public G145 setContaBancariaNumero(String value) { put("conta_bancaria_numero", Json.scalar(value)); return this; }
 public String getContaBancariaDigito() { return stringValue(field("conta_bancaria_digito")); }
 public G145 setContaBancariaDigito(String value) { put("conta_bancaria_digito", Json.scalar(value)); return this; }
 public String getContabilidade() { return stringValue(field("contabilidade")); }
 public G145 setContabilidade(String value) { put("contabilidade", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G145 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public String getLogomarca() { return stringValue(field("logomarca")); }
 public G145 setLogomarca(String value) { put("logomarca", Json.scalar(value)); return this; }
}
