package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIcms extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "aliquota_fcp", "aliquota_interestadual", "codigo_cfop", "situacao_tributaria", "aliquota_importacao", "industria", "majoracao", "bc_icms", "bc_icms_st", "valor_icms", "aliquota_diferimento", "credito_presumido", "aliquota_credito", "aliquota_st", "aliquota_fcp_st", "aliquota_mva", "aliquota_reducao", "aliquota_reducao_st", "bc_st_retido", "aliquota_st_retido", "valor_st_retido", "valor_icms_substituto", "valor_fcp_retido", "aliquota_fcp_retido", "aliquota_bc_efetivo", "aliquota_icms_efetivo", "difal_antecipacao", "codigo_beneficio_reducao_bc", "pauta_fiscal", "quantidade_bc", "motivo_desoneracao_st", "quantidade_retencao", "aliquota_retencao", "percentual_reducao", "motivo_reducao", "motivo_desoneracao", "deducao_desoneracao", "aliquota_diferimento_fcp", "bc_st_dest", "valor_st_dest", "valor_operacao", "codigo_beneficio_fiscal", "valor");
 public NfeIcms() { super(FIELDS); }
 public NfeIcms(JsonNode node) { super(node, FIELDS); }
 public NfeIcmsAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfeIcmsAliquota(field("aliquota")); }
 public NfeIcms setAliquota(NfeIcmsAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaFcp getAliquotaFcp() { return (field("aliquota_fcp")).isNull() || (field("aliquota_fcp")).isMissingNode() ? null : new NfeIcmsAliquotaFcp(field("aliquota_fcp")); }
 public NfeIcms setAliquotaFcp(NfeIcmsAliquotaFcp value) { put("aliquota_fcp", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaInterestadual getAliquotaInterestadual() { return (field("aliquota_interestadual")).isNull() || (field("aliquota_interestadual")).isMissingNode() ? null : new NfeIcmsAliquotaInterestadual(field("aliquota_interestadual")); }
 public NfeIcms setAliquotaInterestadual(NfeIcmsAliquotaInterestadual value) { put("aliquota_interestadual", value == null ? null : value.toJson()); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public NfeIcms setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfeIcms setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public NfeIcmsAliquotaImportacao getAliquotaImportacao() { return (field("aliquota_importacao")).isNull() || (field("aliquota_importacao")).isMissingNode() ? null : new NfeIcmsAliquotaImportacao(field("aliquota_importacao")); }
 public NfeIcms setAliquotaImportacao(NfeIcmsAliquotaImportacao value) { put("aliquota_importacao", value == null ? null : value.toJson()); return this; }
 public String getIndustria() { return stringValue(field("industria")); }
 public NfeIcms setIndustria(String value) { put("industria", Json.scalar(value)); return this; }
 public NfeIcmsMajoracao getMajoracao() { return (field("majoracao")).isNull() || (field("majoracao")).isMissingNode() ? null : new NfeIcmsMajoracao(field("majoracao")); }
 public NfeIcms setMajoracao(NfeIcmsMajoracao value) { put("majoracao", value == null ? null : value.toJson()); return this; }
 public NfeIcmsBcIcms getBcIcms() { return (field("bc_icms")).isNull() || (field("bc_icms")).isMissingNode() ? null : new NfeIcmsBcIcms(field("bc_icms")); }
 public NfeIcms setBcIcms(NfeIcmsBcIcms value) { put("bc_icms", value == null ? null : value.toJson()); return this; }
 public NfeIcmsBcIcmsSt getBcIcmsSt() { return (field("bc_icms_st")).isNull() || (field("bc_icms_st")).isMissingNode() ? null : new NfeIcmsBcIcmsSt(field("bc_icms_st")); }
 public NfeIcms setBcIcmsSt(NfeIcmsBcIcmsSt value) { put("bc_icms_st", value == null ? null : value.toJson()); return this; }
 public NfeIcmsValorIcms getValorIcms() { return (field("valor_icms")).isNull() || (field("valor_icms")).isMissingNode() ? null : new NfeIcmsValorIcms(field("valor_icms")); }
 public NfeIcms setValorIcms(NfeIcmsValorIcms value) { put("valor_icms", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new NfeIcmsAliquotaDiferimento(field("aliquota_diferimento")); }
 public NfeIcms setAliquotaDiferimento(NfeIcmsAliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public java.util.List<G091> getCreditoPresumido() { return list(field("credito_presumido"), v -> (v).isNull() || (v).isMissingNode() ? null : new G091(v)); }
 public NfeIcms setCreditoPresumido(java.util.List<G091> value) { put("credito_presumido", array(value, v -> v == null ? null : v.toJson())); return this; }
 public NfeIcmsAliquotaCredito getAliquotaCredito() { return (field("aliquota_credito")).isNull() || (field("aliquota_credito")).isMissingNode() ? null : new NfeIcmsAliquotaCredito(field("aliquota_credito")); }
 public NfeIcms setAliquotaCredito(NfeIcmsAliquotaCredito value) { put("aliquota_credito", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaSt getAliquotaSt() { return (field("aliquota_st")).isNull() || (field("aliquota_st")).isMissingNode() ? null : new NfeIcmsAliquotaSt(field("aliquota_st")); }
 public NfeIcms setAliquotaSt(NfeIcmsAliquotaSt value) { put("aliquota_st", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaFcpSt getAliquotaFcpSt() { return (field("aliquota_fcp_st")).isNull() || (field("aliquota_fcp_st")).isMissingNode() ? null : new NfeIcmsAliquotaFcpSt(field("aliquota_fcp_st")); }
 public NfeIcms setAliquotaFcpSt(NfeIcmsAliquotaFcpSt value) { put("aliquota_fcp_st", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaMva getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new NfeIcmsAliquotaMva(field("aliquota_mva")); }
 public NfeIcms setAliquotaMva(NfeIcmsAliquotaMva value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new NfeIcmsAliquotaReducao(field("aliquota_reducao")); }
 public NfeIcms setAliquotaReducao(NfeIcmsAliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaReducaoSt getAliquotaReducaoSt() { return (field("aliquota_reducao_st")).isNull() || (field("aliquota_reducao_st")).isMissingNode() ? null : new NfeIcmsAliquotaReducaoSt(field("aliquota_reducao_st")); }
 public NfeIcms setAliquotaReducaoSt(NfeIcmsAliquotaReducaoSt value) { put("aliquota_reducao_st", value == null ? null : value.toJson()); return this; }
 public NfeIcmsBcStRetido getBcStRetido() { return (field("bc_st_retido")).isNull() || (field("bc_st_retido")).isMissingNode() ? null : new NfeIcmsBcStRetido(field("bc_st_retido")); }
 public NfeIcms setBcStRetido(NfeIcmsBcStRetido value) { put("bc_st_retido", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaStRetido getAliquotaStRetido() { return (field("aliquota_st_retido")).isNull() || (field("aliquota_st_retido")).isMissingNode() ? null : new NfeIcmsAliquotaStRetido(field("aliquota_st_retido")); }
 public NfeIcms setAliquotaStRetido(NfeIcmsAliquotaStRetido value) { put("aliquota_st_retido", value == null ? null : value.toJson()); return this; }
 public NfeIcmsValorStRetido getValorStRetido() { return (field("valor_st_retido")).isNull() || (field("valor_st_retido")).isMissingNode() ? null : new NfeIcmsValorStRetido(field("valor_st_retido")); }
 public NfeIcms setValorStRetido(NfeIcmsValorStRetido value) { put("valor_st_retido", value == null ? null : value.toJson()); return this; }
 public NfeIcmsValorIcmsSubstituto getValorIcmsSubstituto() { return (field("valor_icms_substituto")).isNull() || (field("valor_icms_substituto")).isMissingNode() ? null : new NfeIcmsValorIcmsSubstituto(field("valor_icms_substituto")); }
 public NfeIcms setValorIcmsSubstituto(NfeIcmsValorIcmsSubstituto value) { put("valor_icms_substituto", value == null ? null : value.toJson()); return this; }
 public NfeIcmsValorFcpRetido getValorFcpRetido() { return (field("valor_fcp_retido")).isNull() || (field("valor_fcp_retido")).isMissingNode() ? null : new NfeIcmsValorFcpRetido(field("valor_fcp_retido")); }
 public NfeIcms setValorFcpRetido(NfeIcmsValorFcpRetido value) { put("valor_fcp_retido", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaFcpRetido getAliquotaFcpRetido() { return (field("aliquota_fcp_retido")).isNull() || (field("aliquota_fcp_retido")).isMissingNode() ? null : new NfeIcmsAliquotaFcpRetido(field("aliquota_fcp_retido")); }
 public NfeIcms setAliquotaFcpRetido(NfeIcmsAliquotaFcpRetido value) { put("aliquota_fcp_retido", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaBcEfetivo getAliquotaBcEfetivo() { return (field("aliquota_bc_efetivo")).isNull() || (field("aliquota_bc_efetivo")).isMissingNode() ? null : new NfeIcmsAliquotaBcEfetivo(field("aliquota_bc_efetivo")); }
 public NfeIcms setAliquotaBcEfetivo(NfeIcmsAliquotaBcEfetivo value) { put("aliquota_bc_efetivo", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaIcmsEfetivo getAliquotaIcmsEfetivo() { return (field("aliquota_icms_efetivo")).isNull() || (field("aliquota_icms_efetivo")).isMissingNode() ? null : new NfeIcmsAliquotaIcmsEfetivo(field("aliquota_icms_efetivo")); }
 public NfeIcms setAliquotaIcmsEfetivo(NfeIcmsAliquotaIcmsEfetivo value) { put("aliquota_icms_efetivo", value == null ? null : value.toJson()); return this; }
 public Boolean getDifalAntecipacao() { return booleanValue(field("difal_antecipacao")); }
 public NfeIcms setDifalAntecipacao(Boolean value) { put("difal_antecipacao", Json.scalar(value)); return this; }
 public String getCodigoBeneficioReducaoBc() { return stringValue(field("codigo_beneficio_reducao_bc")); }
 public NfeIcms setCodigoBeneficioReducaoBc(String value) { put("codigo_beneficio_reducao_bc", Json.scalar(value)); return this; }
 public NfeIcmsPautaFiscal getPautaFiscal() { return (field("pauta_fiscal")).isNull() || (field("pauta_fiscal")).isMissingNode() ? null : new NfeIcmsPautaFiscal(field("pauta_fiscal")); }
 public NfeIcms setPautaFiscal(NfeIcmsPautaFiscal value) { put("pauta_fiscal", value == null ? null : value.toJson()); return this; }
 public NfeIcmsQuantidadeBc getQuantidadeBc() { return (field("quantidade_bc")).isNull() || (field("quantidade_bc")).isMissingNode() ? null : new NfeIcmsQuantidadeBc(field("quantidade_bc")); }
 public NfeIcms setQuantidadeBc(NfeIcmsQuantidadeBc value) { put("quantidade_bc", value == null ? null : value.toJson()); return this; }
 public String getMotivoDesoneracaoSt() { return stringValue(field("motivo_desoneracao_st")); }
 public NfeIcms setMotivoDesoneracaoSt(String value) { put("motivo_desoneracao_st", Json.scalar(value)); return this; }
 public NfeIcmsQuantidadeRetencao getQuantidadeRetencao() { return (field("quantidade_retencao")).isNull() || (field("quantidade_retencao")).isMissingNode() ? null : new NfeIcmsQuantidadeRetencao(field("quantidade_retencao")); }
 public NfeIcms setQuantidadeRetencao(NfeIcmsQuantidadeRetencao value) { put("quantidade_retencao", value == null ? null : value.toJson()); return this; }
 public NfeIcmsAliquotaRetencao getAliquotaRetencao() { return (field("aliquota_retencao")).isNull() || (field("aliquota_retencao")).isMissingNode() ? null : new NfeIcmsAliquotaRetencao(field("aliquota_retencao")); }
 public NfeIcms setAliquotaRetencao(NfeIcmsAliquotaRetencao value) { put("aliquota_retencao", value == null ? null : value.toJson()); return this; }
 public NfeIcmsPercentualReducao getPercentualReducao() { return (field("percentual_reducao")).isNull() || (field("percentual_reducao")).isMissingNode() ? null : new NfeIcmsPercentualReducao(field("percentual_reducao")); }
 public NfeIcms setPercentualReducao(NfeIcmsPercentualReducao value) { put("percentual_reducao", value == null ? null : value.toJson()); return this; }
 public String getMotivoReducao() { return stringValue(field("motivo_reducao")); }
 public NfeIcms setMotivoReducao(String value) { put("motivo_reducao", Json.scalar(value)); return this; }
 public String getMotivoDesoneracao() { return stringValue(field("motivo_desoneracao")); }
 public NfeIcms setMotivoDesoneracao(String value) { put("motivo_desoneracao", Json.scalar(value)); return this; }
 public String getDeducaoDesoneracao() { return stringValue(field("deducao_desoneracao")); }
 public NfeIcms setDeducaoDesoneracao(String value) { put("deducao_desoneracao", Json.scalar(value)); return this; }
 public NfeIcmsAliquotaDiferimentoFcp getAliquotaDiferimentoFcp() { return (field("aliquota_diferimento_fcp")).isNull() || (field("aliquota_diferimento_fcp")).isMissingNode() ? null : new NfeIcmsAliquotaDiferimentoFcp(field("aliquota_diferimento_fcp")); }
 public NfeIcms setAliquotaDiferimentoFcp(NfeIcmsAliquotaDiferimentoFcp value) { put("aliquota_diferimento_fcp", value == null ? null : value.toJson()); return this; }
 public NfeIcmsBcStDest getBcStDest() { return (field("bc_st_dest")).isNull() || (field("bc_st_dest")).isMissingNode() ? null : new NfeIcmsBcStDest(field("bc_st_dest")); }
 public NfeIcms setBcStDest(NfeIcmsBcStDest value) { put("bc_st_dest", value == null ? null : value.toJson()); return this; }
 public NfeIcmsValorStDest getValorStDest() { return (field("valor_st_dest")).isNull() || (field("valor_st_dest")).isMissingNode() ? null : new NfeIcmsValorStDest(field("valor_st_dest")); }
 public NfeIcms setValorStDest(NfeIcmsValorStDest value) { put("valor_st_dest", value == null ? null : value.toJson()); return this; }
 public NfeIcmsValorOperacao getValorOperacao() { return (field("valor_operacao")).isNull() || (field("valor_operacao")).isMissingNode() ? null : new NfeIcmsValorOperacao(field("valor_operacao")); }
 public NfeIcms setValorOperacao(NfeIcmsValorOperacao value) { put("valor_operacao", value == null ? null : value.toJson()); return this; }
 public String getCodigoBeneficioFiscal() { return stringValue(field("codigo_beneficio_fiscal")); }
 public NfeIcms setCodigoBeneficioFiscal(String value) { put("codigo_beneficio_fiscal", Json.scalar(value)); return this; }
 public NfeIcmsValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new NfeIcmsValor(field("valor")); }
 public NfeIcms setValor(NfeIcmsValor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
