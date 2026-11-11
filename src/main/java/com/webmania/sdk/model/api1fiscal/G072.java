package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G072 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_st", "aliquota_fcp_st", "aliquota_mva", "aliquota_credito", "aliquota_reducao", "aliquota_reducao_st");
 public G072() { super(FIELDS); }
 public G072(JsonNode node) { super(node, FIELDS); }
 public G072AliquotaSt getAliquotaSt() { return (field("aliquota_st")).isNull() || (field("aliquota_st")).isMissingNode() ? null : new G072AliquotaSt(field("aliquota_st")); }
 public G072 setAliquotaSt(G072AliquotaSt value) { put("aliquota_st", value == null ? null : value.toJson()); return this; }
 public G072AliquotaFcpSt getAliquotaFcpSt() { return (field("aliquota_fcp_st")).isNull() || (field("aliquota_fcp_st")).isMissingNode() ? null : new G072AliquotaFcpSt(field("aliquota_fcp_st")); }
 public G072 setAliquotaFcpSt(G072AliquotaFcpSt value) { put("aliquota_fcp_st", value == null ? null : value.toJson()); return this; }
 public G072AliquotaMva getAliquotaMva() { return (field("aliquota_mva")).isNull() || (field("aliquota_mva")).isMissingNode() ? null : new G072AliquotaMva(field("aliquota_mva")); }
 public G072 setAliquotaMva(G072AliquotaMva value) { put("aliquota_mva", value == null ? null : value.toJson()); return this; }
 public G072AliquotaCredito getAliquotaCredito() { return (field("aliquota_credito")).isNull() || (field("aliquota_credito")).isMissingNode() ? null : new G072AliquotaCredito(field("aliquota_credito")); }
 public G072 setAliquotaCredito(G072AliquotaCredito value) { put("aliquota_credito", value == null ? null : value.toJson()); return this; }
 public G072AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new G072AliquotaReducao(field("aliquota_reducao")); }
 public G072 setAliquotaReducao(G072AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public G072AliquotaReducaoSt getAliquotaReducaoSt() { return (field("aliquota_reducao_st")).isNull() || (field("aliquota_reducao_st")).isMissingNode() ? null : new G072AliquotaReducaoSt(field("aliquota_reducao_st")); }
 public G072 setAliquotaReducaoSt(G072AliquotaReducaoSt value) { put("aliquota_reducao_st", value == null ? null : value.toJson()); return this; }
}
