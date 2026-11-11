package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_competencia", "data_emissao", "descricao", "dfe_nacional", "dfe_outro", "doc_outro", "fornecedor", "tipo_reembolso", "valor", "valor_total");
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem() { super(FIELDS); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem(JsonNode node) { super(node, FIELDS); }
 public String getDataCompetencia() { return stringValue(field("data_competencia")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDataCompetencia(String value) { put("data_competencia", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional getDfeNacional() { return (field("dfe_nacional")).isNull() || (field("dfe_nacional")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional(field("dfe_nacional")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDfeNacional(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeNacional value) { put("dfe_nacional", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro getDfeOutro() { return (field("dfe_outro")).isNull() || (field("dfe_outro")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro(field("dfe_outro")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDfeOutro(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDfeOutro value) { put("dfe_outro", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro getDocOutro() { return (field("doc_outro")).isNull() || (field("doc_outro")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro(field("doc_outro")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setDocOutro(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemDocOutro value) { put("doc_outro", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor(field("fornecedor")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setFornecedor(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemTipoReembolso getTipoReembolso() { return (field("tipo_reembolso")).isNull() || (field("tipo_reembolso")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemTipoReembolso(field("tipo_reembolso")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setTipoReembolso(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemTipoReembolso value) { put("tipo_reembolso", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValor(field("valor")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setValor(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValorTotal(field("valor_total")); }
 public EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItem setValorTotal(EmitterReplaceNfsePayloadRpsItemServicoReembolsoRepasseDocumentosItemValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
}
