package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListIcms extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_tributacao", "cenario", "tipo_pessoa", "nao_contribuinte", "codigo_cfop", "situacao_tributaria", "aliquota_importacao", "aliquota_credito", "aliquota_reducao_destino", "aliquota_mva", "aliquota", "aliquota_st", "aliquota_fcp", "aliquota_fcp_st", "aliquota_diferimento", "aliquota_diferimento_fcp", "aliquota_reducao", "aliquota_reducao_st", "aliquota_efetiva_icms", "aliquota_efetiva_icms_st", "codigo_beneficio_reducao_bc", "motivo_desoneracao", "deducao_desoneracao", "motivo_desoneracao_st", "beneficio_fiscal", "credito_presumido");
 public TaxClassListIcms() { super(FIELDS); }
 public TaxClassListIcms(JsonNode node) { super(node, FIELDS); }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public TaxClassListIcms setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public String getCenario() { return stringValue(field("cenario")); }
 public TaxClassListIcms setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public TaxClassListIcms setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public TaxClassListIcmsNaoContribuinte getNaoContribuinte() { return (field("nao_contribuinte")).isNull() || (field("nao_contribuinte")).isMissingNode() ? null : new TaxClassListIcmsNaoContribuinte(field("nao_contribuinte")); }
 public TaxClassListIcms setNaoContribuinte(TaxClassListIcmsNaoContribuinte value) { put("nao_contribuinte", value == null ? null : value.toJson()); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public TaxClassListIcms setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public TaxClassListIcms setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public TaxClassListIcmsAliquotaImportacao getAliquotaImportacao() { return (field("aliquota_importacao")).isNull() || (field("aliquota_importacao")).isMissingNode() ? null : new TaxClassListIcmsAliquotaImportacao(field("aliquota_importacao")); }
 public TaxClassListIcms setAliquotaImportacao(TaxClassListIcmsAliquotaImportacao value) { put("aliquota_importacao", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaCredito getAliquotaCredito() { return (field("aliquota_credito")).isNull() || (field("aliquota_credito")).isMissingNode() ? null : new TaxClassListIcmsAliquotaCredito(field("aliquota_credito")); }
 public TaxClassListIcms setAliquotaCredito(TaxClassListIcmsAliquotaCredito value) { put("aliquota_credito", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaReducaoDestino getAliquotaReducaoDestino() { return (field("aliquota_reducao_destino")).isNull() || (field("aliquota_reducao_destino")).isMissingNode() ? null : new TaxClassListIcmsAliquotaReducaoDestino(field("aliquota_reducao_destino")); }
 public TaxClassListIcms setAliquotaReducaoDestino(TaxClassListIcmsAliquotaReducaoDestino value) { put("aliquota_reducao_destino", value == null ? null : value.toJson()); return this; }
 public TaxClassListStateRates getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new TaxClassListStateRates(field("aliquota_mva")); }
 public TaxClassListIcms setAliquotaMva(TaxClassListStateRates value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
 public TaxClassListStateRates getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new TaxClassListStateRates(field("aliquota")); }
 public TaxClassListIcms setAliquota(TaxClassListStateRates value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public TaxClassListStateRates getAliquotaSt() { return (field("aliquota_st")).isNull() || (field("aliquota_st")).isMissingNode() ? null : new TaxClassListStateRates(field("aliquota_st")); }
 public TaxClassListIcms setAliquotaSt(TaxClassListStateRates value) { put("aliquota_st", value == null ? null : value.toJson()); return this; }
 public TaxClassListStateRates getAliquotaFcp() { return (field("aliquota_fcp")).isNull() || (field("aliquota_fcp")).isMissingNode() ? null : new TaxClassListStateRates(field("aliquota_fcp")); }
 public TaxClassListIcms setAliquotaFcp(TaxClassListStateRates value) { put("aliquota_fcp", value == null ? null : value.toJson()); return this; }
 public TaxClassListStateRates getAliquotaFcpSt() { return (field("aliquota_fcp_st")).isNull() || (field("aliquota_fcp_st")).isMissingNode() ? null : new TaxClassListStateRates(field("aliquota_fcp_st")); }
 public TaxClassListIcms setAliquotaFcpSt(TaxClassListStateRates value) { put("aliquota_fcp_st", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new TaxClassListIcmsAliquotaDiferimento(field("aliquota_diferimento")); }
 public TaxClassListIcms setAliquotaDiferimento(TaxClassListIcmsAliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaDiferimentoFcp getAliquotaDiferimentoFcp() { return (field("aliquota_diferimento_fcp")).isNull() || (field("aliquota_diferimento_fcp")).isMissingNode() ? null : new TaxClassListIcmsAliquotaDiferimentoFcp(field("aliquota_diferimento_fcp")); }
 public TaxClassListIcms setAliquotaDiferimentoFcp(TaxClassListIcmsAliquotaDiferimentoFcp value) { put("aliquota_diferimento_fcp", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new TaxClassListIcmsAliquotaReducao(field("aliquota_reducao")); }
 public TaxClassListIcms setAliquotaReducao(TaxClassListIcmsAliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaReducaoSt getAliquotaReducaoSt() { return (field("aliquota_reducao_st")).isNull() || (field("aliquota_reducao_st")).isMissingNode() ? null : new TaxClassListIcmsAliquotaReducaoSt(field("aliquota_reducao_st")); }
 public TaxClassListIcms setAliquotaReducaoSt(TaxClassListIcmsAliquotaReducaoSt value) { put("aliquota_reducao_st", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaEfetivaIcms getAliquotaEfetivaIcms() { return (field("aliquota_efetiva_icms")).isNull() || (field("aliquota_efetiva_icms")).isMissingNode() ? null : new TaxClassListIcmsAliquotaEfetivaIcms(field("aliquota_efetiva_icms")); }
 public TaxClassListIcms setAliquotaEfetivaIcms(TaxClassListIcmsAliquotaEfetivaIcms value) { put("aliquota_efetiva_icms", value == null ? null : value.toJson()); return this; }
 public TaxClassListIcmsAliquotaEfetivaIcmsSt getAliquotaEfetivaIcmsSt() { return (field("aliquota_efetiva_icms_st")).isNull() || (field("aliquota_efetiva_icms_st")).isMissingNode() ? null : new TaxClassListIcmsAliquotaEfetivaIcmsSt(field("aliquota_efetiva_icms_st")); }
 public TaxClassListIcms setAliquotaEfetivaIcmsSt(TaxClassListIcmsAliquotaEfetivaIcmsSt value) { put("aliquota_efetiva_icms_st", value == null ? null : value.toJson()); return this; }
 public String getCodigoBeneficioReducaoBc() { return stringValue(field("codigo_beneficio_reducao_bc")); }
 public TaxClassListIcms setCodigoBeneficioReducaoBc(String value) { put("codigo_beneficio_reducao_bc", Json.scalar(value)); return this; }
 public String getMotivoDesoneracao() { return stringValue(field("motivo_desoneracao")); }
 public TaxClassListIcms setMotivoDesoneracao(String value) { put("motivo_desoneracao", Json.scalar(value)); return this; }
 public String getDeducaoDesoneracao() { return stringValue(field("deducao_desoneracao")); }
 public TaxClassListIcms setDeducaoDesoneracao(String value) { put("deducao_desoneracao", Json.scalar(value)); return this; }
 public String getMotivoDesoneracaoSt() { return stringValue(field("motivo_desoneracao_st")); }
 public TaxClassListIcms setMotivoDesoneracaoSt(String value) { put("motivo_desoneracao_st", Json.scalar(value)); return this; }
 public java.util.List<G043> getBeneficioFiscal() { return list(field("beneficio_fiscal"), v -> (v).isNull() || (v).isMissingNode() ? null : new G043(v)); }
 public TaxClassListIcms setBeneficioFiscal(java.util.List<G043> value) { put("beneficio_fiscal", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<TaxClassListIcmsPresumedCredit> getCreditoPresumido() { return list(field("credito_presumido"), v -> (v).isNull() || (v).isMissingNode() ? null : new TaxClassListIcmsPresumedCredit(v)); }
 public TaxClassListIcms setCreditoPresumido(java.util.List<TaxClassListIcmsPresumedCredit> value) { put("credito_presumido", array(value, v -> v == null ? null : v.toJson())); return this; }
}
