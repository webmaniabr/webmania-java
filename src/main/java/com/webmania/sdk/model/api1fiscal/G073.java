package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G073 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_st", "aliquota_fcp_st", "aliquota_mva", "aliquota_reducao", "aliquota_reducao_st");
 public G073() { super(FIELDS); }
 public G073(JsonNode node) { super(node, FIELDS); }
 public G073AliquotaSt getAliquotaSt() { return (field("aliquota_st")).isNull() || (field("aliquota_st")).isMissingNode() ? null : new G073AliquotaSt(field("aliquota_st")); }
 public G073 setAliquotaSt(G073AliquotaSt value) { put("aliquota_st", value == null ? null : value.toJson()); return this; }
 public G073AliquotaFcpSt getAliquotaFcpSt() { return (field("aliquota_fcp_st")).isNull() || (field("aliquota_fcp_st")).isMissingNode() ? null : new G073AliquotaFcpSt(field("aliquota_fcp_st")); }
 public G073 setAliquotaFcpSt(G073AliquotaFcpSt value) { put("aliquota_fcp_st", value == null ? null : value.toJson()); return this; }
 public G073AliquotaMva getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new G073AliquotaMva(field("aliquota_mva")); }
 public G073 setAliquotaMva(G073AliquotaMva value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
 public G073AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new G073AliquotaReducao(field("aliquota_reducao")); }
 public G073 setAliquotaReducao(G073AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public G073AliquotaReducaoSt getAliquotaReducaoSt() { return (field("aliquota_reducao_st")).isNull() || (field("aliquota_reducao_st")).isMissingNode() ? null : new G073AliquotaReducaoSt(field("aliquota_reducao_st")); }
 public G073 setAliquotaReducaoSt(G073AliquotaReducaoSt value) { put("aliquota_reducao_st", value == null ? null : value.toJson()); return this; }
}
