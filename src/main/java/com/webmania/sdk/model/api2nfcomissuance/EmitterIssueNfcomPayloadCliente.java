package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadCliente extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "cpf", "email", "endereco", "exterior", "indicador_ie", "inscricao_estadual", "nome_completo", "razao_social", "inscricao_municipal");
 public EmitterIssueNfcomPayloadCliente() { super(FIELDS); }
 public EmitterIssueNfcomPayloadCliente(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadClienteCnpj getCnpj() { return (field("cnpj")).isNull() || (field("cnpj")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteCnpj(field("cnpj")); }
 public EmitterIssueNfcomPayloadCliente setCnpj(EmitterIssueNfcomPayloadClienteCnpj value) { put("cnpj", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteCpf getCpf() { return (field("cpf")).isNull() || (field("cpf")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteCpf(field("cpf")); }
 public EmitterIssueNfcomPayloadCliente setCpf(EmitterIssueNfcomPayloadClienteCpf value) { put("cpf", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteEmail getEmail() { return (field("email")).isNull() || (field("email")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteEmail(field("email")); }
 public EmitterIssueNfcomPayloadCliente setEmail(EmitterIssueNfcomPayloadClienteEmail value) { put("email", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteEndereco getEndereco() { return (field("endereco")).isNull() || (field("endereco")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteEndereco(field("endereco")); }
 public EmitterIssueNfcomPayloadCliente setEndereco(EmitterIssueNfcomPayloadClienteEndereco value) { put("endereco", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteExterior getExterior() { return (field("exterior")).isNull() || (field("exterior")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteExterior(field("exterior")); }
 public EmitterIssueNfcomPayloadCliente setExterior(EmitterIssueNfcomPayloadClienteExterior value) { put("exterior", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteIndicadorIe getIndicadorIe() { return (field("indicador_ie")).isNull() || (field("indicador_ie")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteIndicadorIe(field("indicador_ie")); }
 public EmitterIssueNfcomPayloadCliente setIndicadorIe(EmitterIssueNfcomPayloadClienteIndicadorIe value) { put("indicador_ie", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteInscricaoEstadual getInscricaoEstadual() { return (field("inscricao_estadual")).isNull() || (field("inscricao_estadual")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteInscricaoEstadual(field("inscricao_estadual")); }
 public EmitterIssueNfcomPayloadCliente setInscricaoEstadual(EmitterIssueNfcomPayloadClienteInscricaoEstadual value) { put("inscricao_estadual", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteNomeCompleto getNomeCompleto() { return (field("nome_completo")).isNull() || (field("nome_completo")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteNomeCompleto(field("nome_completo")); }
 public EmitterIssueNfcomPayloadCliente setNomeCompleto(EmitterIssueNfcomPayloadClienteNomeCompleto value) { put("nome_completo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadClienteRazaoSocial getRazaoSocial() { return (field("razao_social")).isNull() || (field("razao_social")).isMissingNode() ? null : new EmitterIssueNfcomPayloadClienteRazaoSocial(field("razao_social")); }
 public EmitterIssueNfcomPayloadCliente setRazaoSocial(EmitterIssueNfcomPayloadClienteRazaoSocial value) { put("razao_social", value == null ? null : value.toJson()); return this; }
 public String getInscricaoMunicipal() { return stringValue(field("inscricao_municipal")); }
 public EmitterIssueNfcomPayloadCliente setInscricaoMunicipal(String value) { put("inscricao_municipal", Json.scalar(value)); return this; }
}
