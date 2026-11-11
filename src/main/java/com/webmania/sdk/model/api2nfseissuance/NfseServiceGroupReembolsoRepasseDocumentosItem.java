package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupReembolsoRepasseDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_competencia", "data_emissao", "descricao", "dfe_nacional", "dfe_outro", "doc_outro", "fornecedor", "tipo_reembolso", "valor", "valor_total", "fornecedor_referenciado");
 public NfseServiceGroupReembolsoRepasseDocumentosItem() { super(FIELDS); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getDataCompetencia() { return stringValue(field("data_competencia")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setDataCompetencia(String value) { put("data_competencia", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemDfeNacional getDfeNacional() { return (field("dfe_nacional")).isNull() || (field("dfe_nacional")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemDfeNacional(field("dfe_nacional")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setDfeNacional(NfseServiceGroupReembolsoRepasseDocumentosItemDfeNacional value) { put("dfe_nacional", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemDfeOutro getDfeOutro() { return (field("dfe_outro")).isNull() || (field("dfe_outro")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemDfeOutro(field("dfe_outro")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setDfeOutro(NfseServiceGroupReembolsoRepasseDocumentosItemDfeOutro value) { put("dfe_outro", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemDocOutro getDocOutro() { return (field("doc_outro")).isNull() || (field("doc_outro")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemDocOutro(field("doc_outro")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setDocOutro(NfseServiceGroupReembolsoRepasseDocumentosItemDocOutro value) { put("doc_outro", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemFornecedor(field("fornecedor")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setFornecedor(NfseServiceGroupReembolsoRepasseDocumentosItemFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemTipoReembolso getTipoReembolso() { return (field("tipo_reembolso")).isNull() || (field("tipo_reembolso")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemTipoReembolso(field("tipo_reembolso")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setTipoReembolso(NfseServiceGroupReembolsoRepasseDocumentosItemTipoReembolso value) { put("tipo_reembolso", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemValor(field("valor")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setValor(NfseServiceGroupReembolsoRepasseDocumentosItemValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemValorTotal(field("valor_total")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setValorTotal(NfseServiceGroupReembolsoRepasseDocumentosItemValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
 public NfseServiceGroupReembolsoRepasseDocumentosItemFornecedorReferenciado getFornecedorReferenciado() { return (field("fornecedor_referenciado")).isNull() || (field("fornecedor_referenciado")).isMissingNode() ? null : new NfseServiceGroupReembolsoRepasseDocumentosItemFornecedorReferenciado(field("fornecedor_referenciado")); }
 public NfseServiceGroupReembolsoRepasseDocumentosItem setFornecedorReferenciado(NfseServiceGroupReembolsoRepasseDocumentosItemFornecedorReferenciado value) { put("fornecedor_referenciado", value == null ? null : value.toJson()); return this; }
}
