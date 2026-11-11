package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G087 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_st", "aliquota_fcp_st", "aliquota_mva", "aliquota_reducao", "aliquota_reducao_st", "motivo_desoneracao", "motivo_desoneracao_st", "deducao_desoneracao");
 public G087() { super(FIELDS); }
 public G087(JsonNode node) { super(node, FIELDS); }
 public G087AliquotaSt getAliquotaSt() { return (field("aliquota_st")).isNull() || (field("aliquota_st")).isMissingNode() ? null : new G087AliquotaSt(field("aliquota_st")); }
 public G087 setAliquotaSt(G087AliquotaSt value) { put("aliquota_st", value == null ? null : value.toJson()); return this; }
 public G087AliquotaFcpSt getAliquotaFcpSt() { return (field("aliquota_fcp_st")).isNull() || (field("aliquota_fcp_st")).isMissingNode() ? null : new G087AliquotaFcpSt(field("aliquota_fcp_st")); }
 public G087 setAliquotaFcpSt(G087AliquotaFcpSt value) { put("aliquota_fcp_st", value == null ? null : value.toJson()); return this; }
 public G087AliquotaMva getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new G087AliquotaMva(field("aliquota_mva")); }
 public G087 setAliquotaMva(G087AliquotaMva value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
 public G087AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new G087AliquotaReducao(field("aliquota_reducao")); }
 public G087 setAliquotaReducao(G087AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public G087AliquotaReducaoSt getAliquotaReducaoSt() { return (field("aliquota_reducao_st")).isNull() || (field("aliquota_reducao_st")).isMissingNode() ? null : new G087AliquotaReducaoSt(field("aliquota_reducao_st")); }
 public G087 setAliquotaReducaoSt(G087AliquotaReducaoSt value) { put("aliquota_reducao_st", value == null ? null : value.toJson()); return this; }
 public String getMotivoDesoneracao() { return stringValue(field("motivo_desoneracao")); }
 public G087 setMotivoDesoneracao(String value) { put("motivo_desoneracao", Json.scalar(value)); return this; }
 public String getMotivoDesoneracaoSt() { return stringValue(field("motivo_desoneracao_st")); }
 public G087 setMotivoDesoneracaoSt(String value) { put("motivo_desoneracao_st", Json.scalar(value)); return this; }
 public String getDeducaoDesoneracao() { return stringValue(field("deducao_desoneracao")); }
 public G087 setDeducaoDesoneracao(String value) { put("deducao_desoneracao", Json.scalar(value)); return this; }
}
