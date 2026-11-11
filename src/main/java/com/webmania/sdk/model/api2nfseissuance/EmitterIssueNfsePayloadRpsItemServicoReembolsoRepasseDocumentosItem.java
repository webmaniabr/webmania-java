package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_competencia", "data_emissao", "descricao", "dfe_nacional", "dfe_outro", "doc_outro", "fornecedor", "tipo_reembolso", "valor", "valor_total", "fornecedor_referenciado");
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getDataCompetencia() { return stringValue(field("data_competencia")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDataCompetencia(String value) { put("data_competencia", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional getDfeNacional() { return (field("dfe_nacional")).isNull() || (field("dfe_nacional")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional(field("dfe_nacional")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDfeNacional(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional value) { put("dfe_nacional", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro getDfeOutro() { return (field("dfe_outro")).isNull() || (field("dfe_outro")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro(field("dfe_outro")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDfeOutro(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro value) { put("dfe_outro", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro getDocOutro() { return (field("doc_outro")).isNull() || (field("doc_outro")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro(field("doc_outro")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDocOutro(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro value) { put("doc_outro", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor(field("fornecedor")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setFornecedor(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemTipoReembolso getTipoReembolso() { return (field("tipo_reembolso")).isNull() || (field("tipo_reembolso")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemTipoReembolso(field("tipo_reembolso")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setTipoReembolso(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemTipoReembolso value) { put("tipo_reembolso", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValor(field("valor")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setValor(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValorTotal(field("valor_total")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setValorTotal(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedorReferenciado getFornecedorReferenciado() { return (field("fornecedor_referenciado")).isNull() || (field("fornecedor_referenciado")).isMissingNode() ? null : new EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedorReferenciado(field("fornecedor_referenciado")); }
 public EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setFornecedorReferenciado(EmitterIssueNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedorReferenciado value) { put("fornecedor_referenciado", value == null ? null : value.toJson()); return this; }
}
