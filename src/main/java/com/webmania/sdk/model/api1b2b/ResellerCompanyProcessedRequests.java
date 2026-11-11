package com.webmania.sdk.model.api1b2b;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/b2b.openapi.json; see contract-provenance.json. */
public final class ResellerCompanyProcessedRequests extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "razao_social", "nome_completo", "cidade", "estado", "ie", "id", "notas_processadas");
 public ResellerCompanyProcessedRequests() { super(FIELDS); }
 public ResellerCompanyProcessedRequests(JsonNode node) { super(node, FIELDS); }
 public ResellerCompanyProcessedRequestsCnpj getCnpj() { return (field("cnpj")).isNull() || (field("cnpj")).isMissingNode() ? null : new ResellerCompanyProcessedRequestsCnpj(field("cnpj")); }
 public ResellerCompanyProcessedRequests setCnpj(ResellerCompanyProcessedRequestsCnpj value) { put("cnpj", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyProcessedRequestsCpf getCpf() { return (field("cpf")).isNull() || (field("cpf")).isMissingNode() ? null : new ResellerCompanyProcessedRequestsCpf(field("cpf")); }
 public ResellerCompanyProcessedRequests setCpf(ResellerCompanyProcessedRequestsCpf value) { put("cpf", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyProcessedRequestsRazaoSocial getRazaoSocial() { return (field("razao_social")).isNull() || (field("razao_social")).isMissingNode() ? null : new ResellerCompanyProcessedRequestsRazaoSocial(field("razao_social")); }
 public ResellerCompanyProcessedRequests setRazaoSocial(ResellerCompanyProcessedRequestsRazaoSocial value) { put("razao_social", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyProcessedRequestsNomeCompleto getNomeCompleto() { return (field("nome_completo")).isNull() || (field("nome_completo")).isMissingNode() ? null : new ResellerCompanyProcessedRequestsNomeCompleto(field("nome_completo")); }
 public ResellerCompanyProcessedRequests setNomeCompleto(ResellerCompanyProcessedRequestsNomeCompleto value) { put("nome_completo", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyProcessedRequestsCidade getCidade() { return (field("cidade")).isNull() || (field("cidade")).isMissingNode() ? null : new ResellerCompanyProcessedRequestsCidade(field("cidade")); }
 public ResellerCompanyProcessedRequests setCidade(ResellerCompanyProcessedRequestsCidade value) { put("cidade", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyProcessedRequestsEstado getEstado() { return (field("estado")).isNull() || (field("estado")).isMissingNode() ? null : new ResellerCompanyProcessedRequestsEstado(field("estado")); }
 public ResellerCompanyProcessedRequests setEstado(ResellerCompanyProcessedRequestsEstado value) { put("estado", value == null ? null : value.toJson()); return this; }
 public ResellerCompanyProcessedRequestsIe getIe() { return (field("ie")).isNull() || (field("ie")).isMissingNode() ? null : new ResellerCompanyProcessedRequestsIe(field("ie")); }
 public ResellerCompanyProcessedRequests setIe(ResellerCompanyProcessedRequestsIe value) { put("ie", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getId() { return integerValue(field("id")); }
 public ResellerCompanyProcessedRequests setId(java.math.BigInteger value) { put("id", Json.scalar(value)); return this; }
 public java.math.BigInteger getNotasProcessadas() { return integerValue(field("notas_processadas")); }
 public ResellerCompanyProcessedRequests setNotasProcessadas(java.math.BigInteger value) { put("notas_processadas", Json.scalar(value)); return this; }
}
