package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G037 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_tributacao", "cenario", "tipo_pessoa", "nao_contribuinte", "codigo_cfop", "situacao_tributaria", "aliquota_importacao", "aliquota_credito", "aliquota_reducao_destino", "aliquota_mva", "aliquota_icms", "aliquota_icms_st", "aliquota_fcp", "aliquota_fcp_st", "aliquota_diferimento", "aliquota_diferimento_fcp", "aliquota_reducao", "aliquota_reducao_st", "aliquota_efetiva_icms", "aliquota_efetiva_icms_st", "codigo_beneficio_reducao_bc", "motivo_desoneracao", "deducao_desoneracao", "motivo_desoneracao_st", "beneficio_fiscal", "credito_presumido");
 public G037() { super(FIELDS); }
 public G037(JsonNode node) { super(node, FIELDS); }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public G037 setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public String getCenario() { return stringValue(field("cenario")); }
 public G037 setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public G037 setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public Boolean getNaoContribuinte() { return booleanValue(field("nao_contribuinte")); }
 public G037 setNaoContribuinte(Boolean value) { put("nao_contribuinte", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G037 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G037 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G037AliquotaImportacao getAliquotaImportacao() { return (field("aliquota_importacao")).isNull() || (field("aliquota_importacao")).isMissingNode() ? null : new G037AliquotaImportacao(field("aliquota_importacao")); }
 public G037 setAliquotaImportacao(G037AliquotaImportacao value) { put("aliquota_importacao", value == null ? null : value.toJson()); return this; }
 public G037AliquotaCredito getAliquotaCredito() { return (field("aliquota_credito")).isNull() || (field("aliquota_credito")).isMissingNode() ? null : new G037AliquotaCredito(field("aliquota_credito")); }
 public G037 setAliquotaCredito(G037AliquotaCredito value) { put("aliquota_credito", value == null ? null : value.toJson()); return this; }
 public G037AliquotaReducaoDestino getAliquotaReducaoDestino() { return (field("aliquota_reducao_destino")).isNull() || (field("aliquota_reducao_destino")).isMissingNode() ? null : new G037AliquotaReducaoDestino(field("aliquota_reducao_destino")); }
 public G037 setAliquotaReducaoDestino(G037AliquotaReducaoDestino value) { put("aliquota_reducao_destino", value == null ? null : value.toJson()); return this; }
 public java.util.List<G038> getAliquotaMva() { return list(field("aliquota_mva"), v -> (v).isNull() || (v).isMissingNode() ? null : new G038(v)); }
 public G037 setAliquotaMva(java.util.List<G038> value) { put("aliquota_mva", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G039> getAliquotaIcms() { return list(field("aliquota_icms"), v -> (v).isNull() || (v).isMissingNode() ? null : new G039(v)); }
 public G037 setAliquotaIcms(java.util.List<G039> value) { put("aliquota_icms", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G040> getAliquotaIcmsSt() { return list(field("aliquota_icms_st"), v -> (v).isNull() || (v).isMissingNode() ? null : new G040(v)); }
 public G037 setAliquotaIcmsSt(java.util.List<G040> value) { put("aliquota_icms_st", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G041> getAliquotaFcp() { return list(field("aliquota_fcp"), v -> (v).isNull() || (v).isMissingNode() ? null : new G041(v)); }
 public G037 setAliquotaFcp(java.util.List<G041> value) { put("aliquota_fcp", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G042> getAliquotaFcpSt() { return list(field("aliquota_fcp_st"), v -> (v).isNull() || (v).isMissingNode() ? null : new G042(v)); }
 public G037 setAliquotaFcpSt(java.util.List<G042> value) { put("aliquota_fcp_st", array(value, v -> v == null ? null : v.toJson())); return this; }
 public G037AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G037AliquotaDiferimento(field("aliquota_diferimento")); }
 public G037 setAliquotaDiferimento(G037AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public G037AliquotaDiferimentoFcp getAliquotaDiferimentoFcp() { return (field("aliquota_diferimento_fcp")).isNull() || (field("aliquota_diferimento_fcp")).isMissingNode() ? null : new G037AliquotaDiferimentoFcp(field("aliquota_diferimento_fcp")); }
 public G037 setAliquotaDiferimentoFcp(G037AliquotaDiferimentoFcp value) { put("aliquota_diferimento_fcp", value == null ? null : value.toJson()); return this; }
 public G037AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new G037AliquotaReducao(field("aliquota_reducao")); }
 public G037 setAliquotaReducao(G037AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public G037AliquotaReducaoSt getAliquotaReducaoSt() { return (field("aliquota_reducao_st")).isNull() || (field("aliquota_reducao_st")).isMissingNode() ? null : new G037AliquotaReducaoSt(field("aliquota_reducao_st")); }
 public G037 setAliquotaReducaoSt(G037AliquotaReducaoSt value) { put("aliquota_reducao_st", value == null ? null : value.toJson()); return this; }
 public G037AliquotaEfetivaIcms getAliquotaEfetivaIcms() { return (field("aliquota_efetiva_icms")).isNull() || (field("aliquota_efetiva_icms")).isMissingNode() ? null : new G037AliquotaEfetivaIcms(field("aliquota_efetiva_icms")); }
 public G037 setAliquotaEfetivaIcms(G037AliquotaEfetivaIcms value) { put("aliquota_efetiva_icms", value == null ? null : value.toJson()); return this; }
 public G037AliquotaEfetivaIcmsSt getAliquotaEfetivaIcmsSt() { return (field("aliquota_efetiva_icms_st")).isNull() || (field("aliquota_efetiva_icms_st")).isMissingNode() ? null : new G037AliquotaEfetivaIcmsSt(field("aliquota_efetiva_icms_st")); }
 public G037 setAliquotaEfetivaIcmsSt(G037AliquotaEfetivaIcmsSt value) { put("aliquota_efetiva_icms_st", value == null ? null : value.toJson()); return this; }
 public String getCodigoBeneficioReducaoBc() { return stringValue(field("codigo_beneficio_reducao_bc")); }
 public G037 setCodigoBeneficioReducaoBc(String value) { put("codigo_beneficio_reducao_bc", Json.scalar(value)); return this; }
 public String getMotivoDesoneracao() { return stringValue(field("motivo_desoneracao")); }
 public G037 setMotivoDesoneracao(String value) { put("motivo_desoneracao", Json.scalar(value)); return this; }
 public String getDeducaoDesoneracao() { return stringValue(field("deducao_desoneracao")); }
 public G037 setDeducaoDesoneracao(String value) { put("deducao_desoneracao", Json.scalar(value)); return this; }
 public String getMotivoDesoneracaoSt() { return stringValue(field("motivo_desoneracao_st")); }
 public G037 setMotivoDesoneracaoSt(String value) { put("motivo_desoneracao_st", Json.scalar(value)); return this; }
 public java.util.List<G043> getBeneficioFiscal() { return list(field("beneficio_fiscal"), v -> (v).isNull() || (v).isMissingNode() ? null : new G043(v)); }
 public G037 setBeneficioFiscal(java.util.List<G043> value) { put("beneficio_fiscal", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G044> getCreditoPresumido() { return list(field("credito_presumido"), v -> (v).isNull() || (v).isMissingNode() ? null : new G044(v)); }
 public G037 setCreditoPresumido(java.util.List<G044> value) { put("credito_presumido", array(value, v -> v == null ? null : v.toJson())); return this; }
}
