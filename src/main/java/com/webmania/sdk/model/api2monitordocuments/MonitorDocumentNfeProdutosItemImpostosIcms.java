package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIcms extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("fcp_aliquota_uf_destino", "icms_aliquota_reducao", "icms_st_aliquota", "icms_bc_uf_destino", "icms_st_aliquota_reducao", "icms_valor_uf_destino", "icms_motivo_desoneracao", "icms_aliquota_efetiva", "icms_st_retido_bc", "icms_valor_operacao", "icms_modalidade_bc", "fcp_st_bc", "fcp_st_retido_aliquota", "fcp_bc_uf_destino", "fcp_st_retido_bc", "icms_substituto_valor", "icms_st_uf", "aliquota", "icms_aliquota_reducao_efetiva", "icms_valor", "fcp_st_aliquota", "icms_bc_efetiva", "fcp_bc", "origem", "icms_st_valor_dest", "icms_bc_operacao_propria", "icms_st_retido_valor", "icms_aliquota_diferimento", "icms_st_bc_dest", "icms_aliquota_interestadual", "codigo_cfop", "icms_aliquota_uf_destino", "icms_valor_credito", "icms_aliquota_credito", "icms_st_aliquota_mva", "icms_st_bc", "valor", "fcp_st_retido_valor", "icms_bc", "icms_valor_efetivo", "fcp_st_valor", "base_calculo", "fcp_aliquota", "icms_aliquota_partilha_interestadual", "icms_valor_desonerado", "icms_st_valor", "icms_valor_uf_remetente", "situacao_tributaria", "icms_aliquota", "fcp_valor_uf_destino", "icms_valor_diferimento", "fcp_valor", "icms_st_modalidade_bc");
 public MonitorDocumentNfeProdutosItemImpostosIcms() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIcms(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getFcpAliquotaUfDestino() { return decimalValue(field("fcp_aliquota_uf_destino")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpAliquotaUfDestino(java.math.BigDecimal value) { put("fcp_aliquota_uf_destino", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaReducao() { return decimalValue(field("icms_aliquota_reducao")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaReducao(java.math.BigDecimal value) { put("icms_aliquota_reducao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStAliquota() { return decimalValue(field("icms_st_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStAliquota(java.math.BigDecimal value) { put("icms_st_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsBcUfDestino() { return decimalValue(field("icms_bc_uf_destino")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsBcUfDestino(java.math.BigDecimal value) { put("icms_bc_uf_destino", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStAliquotaReducao() { return decimalValue(field("icms_st_aliquota_reducao")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStAliquotaReducao(java.math.BigDecimal value) { put("icms_st_aliquota_reducao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorUfDestino() { return decimalValue(field("icms_valor_uf_destino")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValorUfDestino(java.math.BigDecimal value) { put("icms_valor_uf_destino", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsMotivoDesoneracao() { return decimalValue(field("icms_motivo_desoneracao")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsMotivoDesoneracao(java.math.BigDecimal value) { put("icms_motivo_desoneracao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaEfetiva() { return decimalValue(field("icms_aliquota_efetiva")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaEfetiva(java.math.BigDecimal value) { put("icms_aliquota_efetiva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStRetidoBc() { return decimalValue(field("icms_st_retido_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStRetidoBc(java.math.BigDecimal value) { put("icms_st_retido_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorOperacao() { return decimalValue(field("icms_valor_operacao")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValorOperacao(java.math.BigDecimal value) { put("icms_valor_operacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsModalidadeBc() { return decimalValue(field("icms_modalidade_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsModalidadeBc(java.math.BigDecimal value) { put("icms_modalidade_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStBc() { return decimalValue(field("fcp_st_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpStBc(java.math.BigDecimal value) { put("fcp_st_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStRetidoAliquota() { return decimalValue(field("fcp_st_retido_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpStRetidoAliquota(java.math.BigDecimal value) { put("fcp_st_retido_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpBcUfDestino() { return decimalValue(field("fcp_bc_uf_destino")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpBcUfDestino(java.math.BigDecimal value) { put("fcp_bc_uf_destino", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStRetidoBc() { return decimalValue(field("fcp_st_retido_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpStRetidoBc(java.math.BigDecimal value) { put("fcp_st_retido_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsSubstitutoValor() { return decimalValue(field("icms_substituto_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsSubstitutoValor(java.math.BigDecimal value) { put("icms_substituto_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStUf() { return decimalValue(field("icms_st_uf")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStUf(java.math.BigDecimal value) { put("icms_st_uf", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaReducaoEfetiva() { return decimalValue(field("icms_aliquota_reducao_efetiva")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaReducaoEfetiva(java.math.BigDecimal value) { put("icms_aliquota_reducao_efetiva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValor() { return decimalValue(field("icms_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValor(java.math.BigDecimal value) { put("icms_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStAliquota() { return decimalValue(field("fcp_st_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpStAliquota(java.math.BigDecimal value) { put("fcp_st_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsBcEfetiva() { return decimalValue(field("icms_bc_efetiva")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsBcEfetiva(java.math.BigDecimal value) { put("icms_bc_efetiva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpBc() { return decimalValue(field("fcp_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpBc(java.math.BigDecimal value) { put("fcp_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getOrigem() { return decimalValue(field("origem")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setOrigem(java.math.BigDecimal value) { put("origem", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStValorDest() { return decimalValue(field("icms_st_valor_dest")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStValorDest(java.math.BigDecimal value) { put("icms_st_valor_dest", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsBcOperacaoPropria() { return decimalValue(field("icms_bc_operacao_propria")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsBcOperacaoPropria(java.math.BigDecimal value) { put("icms_bc_operacao_propria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStRetidoValor() { return decimalValue(field("icms_st_retido_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStRetidoValor(java.math.BigDecimal value) { put("icms_st_retido_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaDiferimento() { return decimalValue(field("icms_aliquota_diferimento")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaDiferimento(java.math.BigDecimal value) { put("icms_aliquota_diferimento", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStBcDest() { return decimalValue(field("icms_st_bc_dest")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStBcDest(java.math.BigDecimal value) { put("icms_st_bc_dest", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaInterestadual() { return decimalValue(field("icms_aliquota_interestadual")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaInterestadual(java.math.BigDecimal value) { put("icms_aliquota_interestadual", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaUfDestino() { return decimalValue(field("icms_aliquota_uf_destino")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaUfDestino(java.math.BigDecimal value) { put("icms_aliquota_uf_destino", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorCredito() { return decimalValue(field("icms_valor_credito")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValorCredito(java.math.BigDecimal value) { put("icms_valor_credito", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaCredito() { return decimalValue(field("icms_aliquota_credito")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaCredito(java.math.BigDecimal value) { put("icms_aliquota_credito", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStAliquotaMva() { return decimalValue(field("icms_st_aliquota_mva")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStAliquotaMva(java.math.BigDecimal value) { put("icms_st_aliquota_mva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStBc() { return decimalValue(field("icms_st_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStBc(java.math.BigDecimal value) { put("icms_st_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStRetidoValor() { return decimalValue(field("fcp_st_retido_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpStRetidoValor(java.math.BigDecimal value) { put("fcp_st_retido_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsBc() { return decimalValue(field("icms_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsBc(java.math.BigDecimal value) { put("icms_bc", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorEfetivo() { return decimalValue(field("icms_valor_efetivo")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValorEfetivo(java.math.BigDecimal value) { put("icms_valor_efetivo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpStValor() { return decimalValue(field("fcp_st_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpStValor(java.math.BigDecimal value) { put("fcp_st_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBaseCalculo() { return decimalValue(field("base_calculo")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setBaseCalculo(java.math.BigDecimal value) { put("base_calculo", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpAliquota() { return decimalValue(field("fcp_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpAliquota(java.math.BigDecimal value) { put("fcp_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquotaPartilhaInterestadual() { return decimalValue(field("icms_aliquota_partilha_interestadual")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquotaPartilhaInterestadual(java.math.BigDecimal value) { put("icms_aliquota_partilha_interestadual", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorDesonerado() { return decimalValue(field("icms_valor_desonerado")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValorDesonerado(java.math.BigDecimal value) { put("icms_valor_desonerado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStValor() { return decimalValue(field("icms_st_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStValor(java.math.BigDecimal value) { put("icms_st_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorUfRemetente() { return decimalValue(field("icms_valor_uf_remetente")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValorUfRemetente(java.math.BigDecimal value) { put("icms_valor_uf_remetente", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsAliquota() { return decimalValue(field("icms_aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsAliquota(java.math.BigDecimal value) { put("icms_aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpValorUfDestino() { return decimalValue(field("fcp_valor_uf_destino")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpValorUfDestino(java.math.BigDecimal value) { put("fcp_valor_uf_destino", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsValorDiferimento() { return decimalValue(field("icms_valor_diferimento")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsValorDiferimento(java.math.BigDecimal value) { put("icms_valor_diferimento", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFcpValor() { return decimalValue(field("fcp_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setFcpValor(java.math.BigDecimal value) { put("fcp_valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIcmsStModalidadeBc() { return decimalValue(field("icms_st_modalidade_bc")); }
 public MonitorDocumentNfeProdutosItemImpostosIcms setIcmsStModalidadeBc(java.math.BigDecimal value) { put("icms_st_modalidade_bc", Json.scalar(value)); return this; }
}
