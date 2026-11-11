package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G116 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_cfop", "situacao_tributaria", "bc_icms_st", "valor_icms_st", "valor_fcp_st", "aliquota_mva", "beneficio_fiscal");
 public G116() { super(FIELDS); }
 public G116(JsonNode node) { super(node, FIELDS); }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G116 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G116 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G116BcIcmsSt getBcIcmsSt() { return (field("bc_icms_st")).isNull() || (field("bc_icms_st")).isMissingNode() ? null : new G116BcIcmsSt(field("bc_icms_st")); }
 public G116 setBcIcmsSt(G116BcIcmsSt value) { put("bc_icms_st", value == null ? null : value.toJson()); return this; }
 public G116ValorIcmsSt getValorIcmsSt() { return (field("valor_icms_st")).isNull() || (field("valor_icms_st")).isMissingNode() ? null : new G116ValorIcmsSt(field("valor_icms_st")); }
 public G116 setValorIcmsSt(G116ValorIcmsSt value) { put("valor_icms_st", value == null ? null : value.toJson()); return this; }
 public G116ValorFcpSt getValorFcpSt() { return (field("valor_fcp_st")).isNull() || (field("valor_fcp_st")).isMissingNode() ? null : new G116ValorFcpSt(field("valor_fcp_st")); }
 public G116 setValorFcpSt(G116ValorFcpSt value) { put("valor_fcp_st", value == null ? null : value.toJson()); return this; }
 public G116AliquotaMva getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new G116AliquotaMva(field("aliquota_mva")); }
 public G116 setAliquotaMva(G116AliquotaMva value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
 public String getBeneficioFiscal() { return stringValue(field("beneficio_fiscal")); }
 public G116 setBeneficioFiscal(String value) { put("beneficio_fiscal", Json.scalar(value)); return this; }
}
