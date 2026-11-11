package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G078 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_st", "aliquota_fcp_st", "aliquota_mva", "aliquota_reducao_st", "motivo_desoneracao_st");
 public G078() { super(FIELDS); }
 public G078(JsonNode node) { super(node, FIELDS); }
 public G078AliquotaSt getAliquotaSt() { return (field("aliquota_st")).isNull() || (field("aliquota_st")).isMissingNode() ? null : new G078AliquotaSt(field("aliquota_st")); }
 public G078 setAliquotaSt(G078AliquotaSt value) { put("aliquota_st", value == null ? null : value.toJson()); return this; }
 public G078AliquotaFcpSt getAliquotaFcpSt() { return (field("aliquota_fcp_st")).isNull() || (field("aliquota_fcp_st")).isMissingNode() ? null : new G078AliquotaFcpSt(field("aliquota_fcp_st")); }
 public G078 setAliquotaFcpSt(G078AliquotaFcpSt value) { put("aliquota_fcp_st", value == null ? null : value.toJson()); return this; }
 public G078AliquotaMva getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new G078AliquotaMva(field("aliquota_mva")); }
 public G078 setAliquotaMva(G078AliquotaMva value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
 public G078AliquotaReducaoSt getAliquotaReducaoSt() { return (field("aliquota_reducao_st")).isNull() || (field("aliquota_reducao_st")).isMissingNode() ? null : new G078AliquotaReducaoSt(field("aliquota_reducao_st")); }
 public G078 setAliquotaReducaoSt(G078AliquotaReducaoSt value) { put("aliquota_reducao_st", value == null ? null : value.toJson()); return this; }
 public String getMotivoDesoneracaoSt() { return stringValue(field("motivo_desoneracao_st")); }
 public G078 setMotivoDesoneracaoSt(String value) { put("motivo_desoneracao_st", Json.scalar(value)); return this; }
}
