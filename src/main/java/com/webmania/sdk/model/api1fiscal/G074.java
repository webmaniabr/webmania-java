package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G074 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bc_st_retido", "aliquota_st_retido", "valor_st_retido", "valor_icms_substituto", "valor_fcp_retido", "aliquota_fcp_retido", "aliquota_bc_efetivo", "aliquota_icms_efetivo");
 public G074() { super(FIELDS); }
 public G074(JsonNode node) { super(node, FIELDS); }
 public G074BcStRetido getBcStRetido() { return (field("bc_st_retido")).isNull() || (field("bc_st_retido")).isMissingNode() ? null : new G074BcStRetido(field("bc_st_retido")); }
 public G074 setBcStRetido(G074BcStRetido value) { put("bc_st_retido", value == null ? null : value.toJson()); return this; }
 public G074AliquotaStRetido getAliquotaStRetido() { return (field("aliquota_st_retido")).isNull() || (field("aliquota_st_retido")).isMissingNode() ? null : new G074AliquotaStRetido(field("aliquota_st_retido")); }
 public G074 setAliquotaStRetido(G074AliquotaStRetido value) { put("aliquota_st_retido", value == null ? null : value.toJson()); return this; }
 public G074ValorStRetido getValorStRetido() { return (field("valor_st_retido")).isNull() || (field("valor_st_retido")).isMissingNode() ? null : new G074ValorStRetido(field("valor_st_retido")); }
 public G074 setValorStRetido(G074ValorStRetido value) { put("valor_st_retido", value == null ? null : value.toJson()); return this; }
 public G074ValorIcmsSubstituto getValorIcmsSubstituto() { return (field("valor_icms_substituto")).isNull() || (field("valor_icms_substituto")).isMissingNode() ? null : new G074ValorIcmsSubstituto(field("valor_icms_substituto")); }
 public G074 setValorIcmsSubstituto(G074ValorIcmsSubstituto value) { put("valor_icms_substituto", value == null ? null : value.toJson()); return this; }
 public G074ValorFcpRetido getValorFcpRetido() { return (field("valor_fcp_retido")).isNull() || (field("valor_fcp_retido")).isMissingNode() ? null : new G074ValorFcpRetido(field("valor_fcp_retido")); }
 public G074 setValorFcpRetido(G074ValorFcpRetido value) { put("valor_fcp_retido", value == null ? null : value.toJson()); return this; }
 public G074AliquotaFcpRetido getAliquotaFcpRetido() { return (field("aliquota_fcp_retido")).isNull() || (field("aliquota_fcp_retido")).isMissingNode() ? null : new G074AliquotaFcpRetido(field("aliquota_fcp_retido")); }
 public G074 setAliquotaFcpRetido(G074AliquotaFcpRetido value) { put("aliquota_fcp_retido", value == null ? null : value.toJson()); return this; }
 public G074AliquotaBcEfetivo getAliquotaBcEfetivo() { return (field("aliquota_bc_efetivo")).isNull() || (field("aliquota_bc_efetivo")).isMissingNode() ? null : new G074AliquotaBcEfetivo(field("aliquota_bc_efetivo")); }
 public G074 setAliquotaBcEfetivo(G074AliquotaBcEfetivo value) { put("aliquota_bc_efetivo", value == null ? null : value.toJson()); return this; }
 public G074AliquotaIcmsEfetivo getAliquotaIcmsEfetivo() { return (field("aliquota_icms_efetivo")).isNull() || (field("aliquota_icms_efetivo")).isMissingNode() ? null : new G074AliquotaIcmsEfetivo(field("aliquota_icms_efetivo")); }
 public G074 setAliquotaIcmsEfetivo(G074AliquotaIcmsEfetivo value) { put("aliquota_icms_efetivo", value == null ? null : value.toJson()); return this; }
}
