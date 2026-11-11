package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G070 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "aliquota_fcp", "aliquota_interestadual", "codigo_cfop", "situacao_tributaria", "aliquota_importacao", "industria", "majoracao", "bc_icms", "bc_icms_st", "valor_icms", "aliquota_diferimento", "credito_presumido");
 public G070() { super(FIELDS); }
 public G070(JsonNode node) { super(node, FIELDS); }
 public G070Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G070Aliquota(field("aliquota")); }
 public G070 setAliquota(G070Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G070AliquotaFcp getAliquotaFcp() { return (field("aliquota_fcp")).isNull() || (field("aliquota_fcp")).isMissingNode() ? null : new G070AliquotaFcp(field("aliquota_fcp")); }
 public G070 setAliquotaFcp(G070AliquotaFcp value) { put("aliquota_fcp", value == null ? null : value.toJson()); return this; }
 public G070AliquotaInterestadual getAliquotaInterestadual() { return (field("aliquota_interestadual")).isNull() || (field("aliquota_interestadual")).isMissingNode() ? null : new G070AliquotaInterestadual(field("aliquota_interestadual")); }
 public G070 setAliquotaInterestadual(G070AliquotaInterestadual value) { put("aliquota_interestadual", value == null ? null : value.toJson()); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G070 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G070 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G070AliquotaImportacao getAliquotaImportacao() { return (field("aliquota_importacao")).isNull() || (field("aliquota_importacao")).isMissingNode() ? null : new G070AliquotaImportacao(field("aliquota_importacao")); }
 public G070 setAliquotaImportacao(G070AliquotaImportacao value) { put("aliquota_importacao", value == null ? null : value.toJson()); return this; }
 public String getIndustria() { return stringValue(field("industria")); }
 public G070 setIndustria(String value) { put("industria", Json.scalar(value)); return this; }
 public G070Majoracao getMajoracao() { return (field("majoracao")).isNull() || (field("majoracao")).isMissingNode() ? null : new G070Majoracao(field("majoracao")); }
 public G070 setMajoracao(G070Majoracao value) { put("majoracao", value == null ? null : value.toJson()); return this; }
 public G070BcIcms getBcIcms() { return (field("bc_icms")).isNull() || (field("bc_icms")).isMissingNode() ? null : new G070BcIcms(field("bc_icms")); }
 public G070 setBcIcms(G070BcIcms value) { put("bc_icms", value == null ? null : value.toJson()); return this; }
 public G070BcIcmsSt getBcIcmsSt() { return (field("bc_icms_st")).isNull() || (field("bc_icms_st")).isMissingNode() ? null : new G070BcIcmsSt(field("bc_icms_st")); }
 public G070 setBcIcmsSt(G070BcIcmsSt value) { put("bc_icms_st", value == null ? null : value.toJson()); return this; }
 public G070ValorIcms getValorIcms() { return (field("valor_icms")).isNull() || (field("valor_icms")).isMissingNode() ? null : new G070ValorIcms(field("valor_icms")); }
 public G070 setValorIcms(G070ValorIcms value) { put("valor_icms", value == null ? null : value.toJson()); return this; }
 public G070AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G070AliquotaDiferimento(field("aliquota_diferimento")); }
 public G070 setAliquotaDiferimento(G070AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public java.util.List<G091> getCreditoPresumido() { return list(field("credito_presumido"), v -> (v).isNull() || (v).isMissingNode() ? null : new G091(v)); }
 public G070 setCreditoPresumido(java.util.List<G091> value) { put("credito_presumido", array(value, v -> v == null ? null : v.toJson())); return this; }
}
