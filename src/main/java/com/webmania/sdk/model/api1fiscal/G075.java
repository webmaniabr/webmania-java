package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G075 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "aliquota_fcp", "aliquota_interestadual", "codigo_cfop", "situacao_tributaria", "aliquota_importacao", "industria", "majoracao", "difal_antecipacao", "codigo_beneficio_reducao_bc", "bc_icms", "valor_icms", "bc_icms_st", "credito_presumido");
 public G075() { super(FIELDS); }
 public G075(JsonNode node) { super(node, FIELDS); }
 public G075Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G075Aliquota(field("aliquota")); }
 public G075 setAliquota(G075Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G075AliquotaFcp getAliquotaFcp() { return (field("aliquota_fcp")).isNull() || (field("aliquota_fcp")).isMissingNode() ? null : new G075AliquotaFcp(field("aliquota_fcp")); }
 public G075 setAliquotaFcp(G075AliquotaFcp value) { put("aliquota_fcp", value == null ? null : value.toJson()); return this; }
 public G075AliquotaInterestadual getAliquotaInterestadual() { return (field("aliquota_interestadual")).isNull() || (field("aliquota_interestadual")).isMissingNode() ? null : new G075AliquotaInterestadual(field("aliquota_interestadual")); }
 public G075 setAliquotaInterestadual(G075AliquotaInterestadual value) { put("aliquota_interestadual", value == null ? null : value.toJson()); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G075 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G075 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G075AliquotaImportacao getAliquotaImportacao() { return (field("aliquota_importacao")).isNull() || (field("aliquota_importacao")).isMissingNode() ? null : new G075AliquotaImportacao(field("aliquota_importacao")); }
 public G075 setAliquotaImportacao(G075AliquotaImportacao value) { put("aliquota_importacao", value == null ? null : value.toJson()); return this; }
 public String getIndustria() { return stringValue(field("industria")); }
 public G075 setIndustria(String value) { put("industria", Json.scalar(value)); return this; }
 public G075Majoracao getMajoracao() { return (field("majoracao")).isNull() || (field("majoracao")).isMissingNode() ? null : new G075Majoracao(field("majoracao")); }
 public G075 setMajoracao(G075Majoracao value) { put("majoracao", value == null ? null : value.toJson()); return this; }
 public Boolean getDifalAntecipacao() { return booleanValue(field("difal_antecipacao")); }
 public G075 setDifalAntecipacao(Boolean value) { put("difal_antecipacao", Json.scalar(value)); return this; }
 public String getCodigoBeneficioReducaoBc() { return stringValue(field("codigo_beneficio_reducao_bc")); }
 public G075 setCodigoBeneficioReducaoBc(String value) { put("codigo_beneficio_reducao_bc", Json.scalar(value)); return this; }
 public G075BcIcms getBcIcms() { return (field("bc_icms")).isNull() || (field("bc_icms")).isMissingNode() ? null : new G075BcIcms(field("bc_icms")); }
 public G075 setBcIcms(G075BcIcms value) { put("bc_icms", value == null ? null : value.toJson()); return this; }
 public G075ValorIcms getValorIcms() { return (field("valor_icms")).isNull() || (field("valor_icms")).isMissingNode() ? null : new G075ValorIcms(field("valor_icms")); }
 public G075 setValorIcms(G075ValorIcms value) { put("valor_icms", value == null ? null : value.toJson()); return this; }
 public G075BcIcmsSt getBcIcmsSt() { return (field("bc_icms_st")).isNull() || (field("bc_icms_st")).isMissingNode() ? null : new G075BcIcmsSt(field("bc_icms_st")); }
 public G075 setBcIcmsSt(G075BcIcmsSt value) { put("bc_icms_st", value == null ? null : value.toJson()); return this; }
 public java.util.List<G091> getCreditoPresumido() { return list(field("credito_presumido"), v -> (v).isNull() || (v).isMissingNode() ? null : new G091(v)); }
 public G075 setCreditoPresumido(java.util.List<G091> value) { put("credito_presumido", array(value, v -> v == null ? null : v.toJson())); return this; }
}
