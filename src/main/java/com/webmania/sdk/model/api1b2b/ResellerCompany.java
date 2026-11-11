package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCompany extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "nome_completo", "cidade", "estado", "ie", "id", "unidade_empresa", "tipo_tributacao", "credenciais");
 public ResellerCompany() { super(FIELDS); }
 public ResellerCompany(JsonNode node) { super(node, FIELDS); }
 public ResellerCompanyCnpj getCnpj() { return (field("cnpj")).isNull() || (field("cnpj")).isMissingNode() ? null : new ResellerCompanyCnpj(field("cnpj")); }
 public ResellerCompany setCnpj(ResellerCompanyCnpj value) { put("cnpj", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyCpf getCpf() { return (field("cpf")).isNull() || (field("cpf")).isMissingNode() ? null : new ResellerCompanyCpf(field("cpf")); }
 public ResellerCompany setCpf(ResellerCompanyCpf value) { put("cpf", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyRazaoSocial getRazaoSocial() { return (field("razao_social")).isNull() || (field("razao_social")).isMissingNode() ? null : new ResellerCompanyRazaoSocial(field("razao_social")); }
 public ResellerCompany setRazaoSocial(ResellerCompanyRazaoSocial value) { put("razao_social", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyNomeCompleto getNomeCompleto() { return (field("nome_completo")).isNull() || (field("nome_completo")).isMissingNode() ? null : new ResellerCompanyNomeCompleto(field("nome_completo")); }
 public ResellerCompany setNomeCompleto(ResellerCompanyNomeCompleto value) { put("nome_completo", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyCidade getCidade() { return (field("cidade")).isNull() || (field("cidade")).isMissingNode() ? null : new ResellerCompanyCidade(field("cidade")); }
 public ResellerCompany setCidade(ResellerCompanyCidade value) { put("cidade", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyEstado getEstado() { return (field("estado")).isNull() || (field("estado")).isMissingNode() ? null : new ResellerCompanyEstado(field("estado")); }
 public ResellerCompany setEstado(ResellerCompanyEstado value) { put("estado", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyIe getIe() { return (field("ie")).isNull() || (field("ie")).isMissingNode() ? null : new ResellerCompanyIe(field("ie")); }
 public ResellerCompany setIe(ResellerCompanyIe value) { put("ie", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getId() { return integerValue(field("id")); }
 public ResellerCompany setId(java.math.BigInteger value) { put("id", Json.scalar(value)); return this; }
 public ResellerCompanyUnidadeEmpresa getUnidadeEmpresa() { return (field("unidade_empresa")).isNull() || (field("unidade_empresa")).isMissingNode() ? null : new ResellerCompanyUnidadeEmpresa(field("unidade_empresa")); }
 public ResellerCompany setUnidadeEmpresa(ResellerCompanyUnidadeEmpresa value) { put("unidade_empresa", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyTipoTributacao getTipoTributacao() { return (field("tipo_tributacao")).isNull() || (field("tipo_tributacao")).isMissingNode() ? null : new ResellerCompanyTipoTributacao(field("tipo_tributacao")); }
 public ResellerCompany setTipoTributacao(ResellerCompanyTipoTributacao value) { put("tipo_tributacao", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyCredentials getCredenciais() { return (field("credenciais")).isNull() || (field("credenciais")).isMissingNode() ? null : new ResellerCompanyCredentials(field("credenciais")); }
 public ResellerCompany setCredenciais(ResellerCompanyCredentials value) { put("credenciais", value == null ? null : value.toJson()); return this; }
}
