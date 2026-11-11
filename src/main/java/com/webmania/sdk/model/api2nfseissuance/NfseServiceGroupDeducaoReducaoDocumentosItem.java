package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupDeducaoReducaoDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave_nfe", "chave_nfse", "data_emissao", "descricao_outras_deducoes", "doc_fiscal", "doc_nao_fiscal", "fornecedor", "nf_nfs", "nfse_municipal", "tipo_deducao_reducao", "valor_deducao", "valor_dedutivel");
 public NfseServiceGroupDeducaoReducaoDocumentosItem() { super(FIELDS); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getChaveNfe() { return stringValue(field("chave_nfe")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setChaveNfe(String value) { put("chave_nfe", Json.scalar(value)); return this; }
 public String getChaveNfse() { return stringValue(field("chave_nfse")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setChaveNfse(String value) { put("chave_nfse", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDescricaoOutrasDeducoes() { return stringValue(field("descricao_outras_deducoes")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setDescricaoOutrasDeducoes(String value) { put("descricao_outras_deducoes", Json.scalar(value)); return this; }
 public String getDocFiscal() { return stringValue(field("doc_fiscal")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setDocFiscal(String value) { put("doc_fiscal", Json.scalar(value)); return this; }
 public String getDocNaoFiscal() { return stringValue(field("doc_nao_fiscal")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setDocNaoFiscal(String value) { put("doc_nao_fiscal", Json.scalar(value)); return this; }
 public NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor(field("fornecedor")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setFornecedor(NfseServiceGroupDeducaoReducaoDocumentosItemFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDeducaoReducaoDocumentosItemNfNfs getNfNfs() { return (field("nf_nfs")).isNull() || (field("nf_nfs")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoDocumentosItemNfNfs(field("nf_nfs")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setNfNfs(NfseServiceGroupDeducaoReducaoDocumentosItemNfNfs value) { put("nf_nfs", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDeducaoReducaoDocumentosItemNfseMunicipal getNfseMunicipal() { return (field("nfse_municipal")).isNull() || (field("nfse_municipal")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoDocumentosItemNfseMunicipal(field("nfse_municipal")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setNfseMunicipal(NfseServiceGroupDeducaoReducaoDocumentosItemNfseMunicipal value) { put("nfse_municipal", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDeducaoReducaoDocumentosItemTipoDeducaoReducao getTipoDeducaoReducao() { return (field("tipo_deducao_reducao")).isNull() || (field("tipo_deducao_reducao")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoDocumentosItemTipoDeducaoReducao(field("tipo_deducao_reducao")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setTipoDeducaoReducao(NfseServiceGroupDeducaoReducaoDocumentosItemTipoDeducaoReducao value) { put("tipo_deducao_reducao", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDeducaoReducaoDocumentosItemValorDeducao getValorDeducao() { return (field("valor_deducao")).isNull() || (field("valor_deducao")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoDocumentosItemValorDeducao(field("valor_deducao")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setValorDeducao(NfseServiceGroupDeducaoReducaoDocumentosItemValorDeducao value) { put("valor_deducao", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupDeducaoReducaoDocumentosItemValorDedutivel getValorDedutivel() { return (field("valor_dedutivel")).isNull() || (field("valor_dedutivel")).isMissingNode() ? null : new NfseServiceGroupDeducaoReducaoDocumentosItemValorDedutivel(field("valor_dedutivel")); }
 public NfseServiceGroupDeducaoReducaoDocumentosItem setValorDedutivel(NfseServiceGroupDeducaoReducaoDocumentosItemValorDedutivel value) { put("valor_dedutivel", value == null ? null : value.toJson()); return this; }
}
