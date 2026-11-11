package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G153 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("partilha_icms_contribuinte", "partilha_icms_isento", "orientacao_danfe", "microcervejaria", "icms_ref_sp", "refeicoes_sp", "icms_ref_df", "exclusao_icms_pis_cofins", "exclusao_difal_pis_cofins", "deduzir_desconto_ipi", "base_calculo_ipi_sem_frete", "email_automatico_nfse", "ativar_epec", "ocultar_total_etiqueta");
 public G153() { super(FIELDS); }
 public G153(JsonNode node) { super(node, FIELDS); }
 public Boolean getPartilhaIcmsContribuinte() { return booleanValue(field("partilha_icms_contribuinte")); }
 public G153 setPartilhaIcmsContribuinte(Boolean value) { put("partilha_icms_contribuinte", Json.scalar(value)); return this; }
 public Boolean getPartilhaIcmsIsento() { return booleanValue(field("partilha_icms_isento")); }
 public G153 setPartilhaIcmsIsento(Boolean value) { put("partilha_icms_isento", Json.scalar(value)); return this; }
 public String getOrientacaoDanfe() { return stringValue(field("orientacao_danfe")); }
 public G153 setOrientacaoDanfe(String value) { put("orientacao_danfe", Json.scalar(value)); return this; }
 public Boolean getMicrocervejaria() { return booleanValue(field("microcervejaria")); }
 public G153 setMicrocervejaria(Boolean value) { put("microcervejaria", Json.scalar(value)); return this; }
 public Boolean getIcmsRefSp() { return booleanValue(field("icms_ref_sp")); }
 public G153 setIcmsRefSp(Boolean value) { put("icms_ref_sp", Json.scalar(value)); return this; }
 public Boolean getRefeicoesSp() { return booleanValue(field("refeicoes_sp")); }
 public G153 setRefeicoesSp(Boolean value) { put("refeicoes_sp", Json.scalar(value)); return this; }
 public Boolean getIcmsRefDf() { return booleanValue(field("icms_ref_df")); }
 public G153 setIcmsRefDf(Boolean value) { put("icms_ref_df", Json.scalar(value)); return this; }
 public Boolean getExclusaoIcmsPisCofins() { return booleanValue(field("exclusao_icms_pis_cofins")); }
 public G153 setExclusaoIcmsPisCofins(Boolean value) { put("exclusao_icms_pis_cofins", Json.scalar(value)); return this; }
 public Boolean getExclusaoDifalPisCofins() { return booleanValue(field("exclusao_difal_pis_cofins")); }
 public G153 setExclusaoDifalPisCofins(Boolean value) { put("exclusao_difal_pis_cofins", Json.scalar(value)); return this; }
 public Boolean getDeduzirDescontoIpi() { return booleanValue(field("deduzir_desconto_ipi")); }
 public G153 setDeduzirDescontoIpi(Boolean value) { put("deduzir_desconto_ipi", Json.scalar(value)); return this; }
 public Boolean getBaseCalculoIpiSemFrete() { return booleanValue(field("base_calculo_ipi_sem_frete")); }
 public G153 setBaseCalculoIpiSemFrete(Boolean value) { put("base_calculo_ipi_sem_frete", Json.scalar(value)); return this; }
 public Boolean getEmailAutomaticoNfse() { return booleanValue(field("email_automatico_nfse")); }
 public G153 setEmailAutomaticoNfse(Boolean value) { put("email_automatico_nfse", Json.scalar(value)); return this; }
 public String getAtivarEpec() { return stringValue(field("ativar_epec")); }
 public G153 setAtivarEpec(String value) { put("ativar_epec", Json.scalar(value)); return this; }
 public String getOcultarTotalEtiqueta() { return stringValue(field("ocultar_total_etiqueta")); }
 public G153 setOcultarTotalEtiqueta(String value) { put("ocultar_total_etiqueta", Json.scalar(value)); return this; }
}
