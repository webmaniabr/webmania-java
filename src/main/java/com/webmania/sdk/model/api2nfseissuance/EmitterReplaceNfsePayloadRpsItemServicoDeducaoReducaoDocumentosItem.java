package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave_nfe", "chave_nfse", "data_emissao", "descricao_outras_deducoes", "doc_fiscal", "doc_nao_fiscal", "fornecedor", "nf_nfs", "nfse_municipal", "tipo_deducao_reducao", "valor_deducao", "valor_dedutivel");
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getChaveNfe() { return stringValue(field("chave_nfe")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setChaveNfe(String value) { put("chave_nfe", Json.scalar(value)); return this; }
 public String getChaveNfse() { return stringValue(field("chave_nfse")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setChaveNfse(String value) { put("chave_nfse", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDescricaoOutrasDeducoes() { return stringValue(field("descricao_outras_deducoes")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDescricaoOutrasDeducoes(String value) { put("descricao_outras_deducoes", Json.scalar(value)); return this; }
 public String getDocFiscal() { return stringValue(field("doc_fiscal")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDocFiscal(String value) { put("doc_fiscal", Json.scalar(value)); return this; }
 public String getDocNaoFiscal() { return stringValue(field("doc_nao_fiscal")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setDocNaoFiscal(String value) { put("doc_nao_fiscal", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor(field("fornecedor")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setFornecedor(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs getNfNfs() { return (field("nf_nfs")).isNull() || (field("nf_nfs")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs(field("nf_nfs")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setNfNfs(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfNfs value) { put("nf_nfs", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal getNfseMunicipal() { return (field("nfse_municipal")).isNull() || (field("nfse_municipal")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal(field("nfse_municipal")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setNfseMunicipal(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemNfseMunicipal value) { put("nfse_municipal", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemTipoDeducaoReducao getTipoDeducaoReducao() { return (field("tipo_deducao_reducao")).isNull() || (field("tipo_deducao_reducao")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemTipoDeducaoReducao(field("tipo_deducao_reducao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setTipoDeducaoReducao(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemTipoDeducaoReducao value) { put("tipo_deducao_reducao", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao getValorDeducao() { return (field("valor_deducao")).isNull() || (field("valor_deducao")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao(field("valor_deducao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setValorDeducao(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDeducao value) { put("valor_deducao", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDedutivel getValorDedutivel() { return (field("valor_dedutivel")).isNull() || (field("valor_dedutivel")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDedutivel(field("valor_dedutivel")); }
 public EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItem setValorDedutivel(EmitterReplaceNfsePayloadRpsItemServicoDeducaoReducaoDocumentosItemValorDedutivel value) { put("valor_dedutivel", value == null ? null : value.toJson()); return this; }
}
