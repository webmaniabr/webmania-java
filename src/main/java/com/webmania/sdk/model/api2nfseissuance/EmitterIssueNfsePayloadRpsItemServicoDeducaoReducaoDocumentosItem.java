package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave_nfe", "chave_nfse", "data_emissao", "descricao_outras_deducoes", "doc_fiscal", "doc_nao_fiscal", "fornecedor", "nf_nfs", "nfse_municipal", "tipo_deducao_reducao", "valor_deducao", "valor_dedutivel");
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getChaveNfe() { return stringValue(field("chave_nfe")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setChaveNfe(String value) { put("chave_nfe", Json.scalar(value)); return this; }
 public String getChaveNfse() { return stringValue(field("chave_nfse")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setChaveNfse(String value) { put("chave_nfse", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDescricaoOutrasDeducoes() { return stringValue(field("descricao_outras_deducoes")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDescricaoOutrasDeducoes(String value) { put("descricao_outras_deducoes", Json.scalar(value)); return this; }
 public String getDocFiscal() { return stringValue(field("doc_fiscal")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDocFiscal(String value) { put("doc_fiscal", Json.scalar(value)); return this; }
 public String getDocNaoFiscal() { return stringValue(field("doc_nao_fiscal")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDocNaoFiscal(String value) { put("doc_nao_fiscal", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor(field("fornecedor")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setFornecedor(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs getNfNfs() { return (field("nf_nfs")).isNull() || (field("nf_nfs")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs(field("nf_nfs")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setNfNfs(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs value) { put("nf_nfs", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal getNfseMunicipal() { return (field("nfse_municipal")).isNull() || (field("nfse_municipal")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal(field("nfse_municipal")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setNfseMunicipal(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal value) { put("nfse_municipal", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemTipoDeducaoReducao getTipoDeducaoReducao() { return (field("tipo_deducao_reducao")).isNull() || (field("tipo_deducao_reducao")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemTipoDeducaoReducao(field("tipo_deducao_reducao")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setTipoDeducaoReducao(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemTipoDeducaoReducao value) { put("tipo_deducao_reducao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao getValorDeducao() { return (field("valor_deducao")).isNull() || (field("valor_deducao")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao(field("valor_deducao")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setValorDeducao(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao value) { put("valor_deducao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDedutivel getValorDedutivel() { return (field("valor_dedutivel")).isNull() || (field("valor_dedutivel")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDedutivel(field("valor_dedutivel")); }
 public EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setValorDedutivel(EmitterIssueNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDedutivel value) { put("valor_dedutivel", value == null ? null : value.toJson()); return this; }
}
