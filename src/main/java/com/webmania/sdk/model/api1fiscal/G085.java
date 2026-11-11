package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G085 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bc_st_retido", "aliquota_st_retido", "valor_st_retido", "bc_st_dest", "valor_st_dest", "valor_fcp_retido", "aliquota_fcp_retido", "aliquota_bc_efetivo", "aliquota_icms_efetivo");
 public G085() { super(FIELDS); }
 public G085(JsonNode node) { super(node, FIELDS); }
 public G085BcStRetido getBcStRetido() { return (field("bc_st_retido")).isNull() || (field("bc_st_retido")).isMissingNode() ? null : new G085BcStRetido(field("bc_st_retido")); }
 public G085 setBcStRetido(G085BcStRetido value) { put("bc_st_retido", value == null ? null : value.toJson()); return this; }
 public G085AliquotaStRetido getAliquotaStRetido() { return (field("aliquota_st_retido")).isNull() || (field("aliquota_st_retido")).isMissingNode() ? null : new G085AliquotaStRetido(field("aliquota_st_retido")); }
 public G085 setAliquotaStRetido(G085AliquotaStRetido value) { put("aliquota_st_retido", value == null ? null : value.toJson()); return this; }
 public G085ValorStRetido getValorStRetido() { return (field("valor_st_retido")).isNull() || (field("valor_st_retido")).isMissingNode() ? null : new G085ValorStRetido(field("valor_st_retido")); }
 public G085 setValorStRetido(G085ValorStRetido value) { put("valor_st_retido", value == null ? null : value.toJson()); return this; }
 public G085BcStDest getBcStDest() { return (field("bc_st_dest")).isNull() || (field("bc_st_dest")).isMissingNode() ? null : new G085BcStDest(field("bc_st_dest")); }
 public G085 setBcStDest(G085BcStDest value) { put("bc_st_dest", value == null ? null : value.toJson()); return this; }
 public G085ValorStDest getValorStDest() { return (field("valor_st_dest")).isNull() || (field("valor_st_dest")).isMissingNode() ? null : new G085ValorStDest(field("valor_st_dest")); }
 public G085 setValorStDest(G085ValorStDest value) { put("valor_st_dest", value == null ? null : value.toJson()); return this; }
 public G085ValorFcpRetido getValorFcpRetido() { return (field("valor_fcp_retido")).isNull() || (field("valor_fcp_retido")).isMissingNode() ? null : new G085ValorFcpRetido(field("valor_fcp_retido")); }
 public G085 setValorFcpRetido(G085ValorFcpRetido value) { put("valor_fcp_retido", value == null ? null : value.toJson()); return this; }
 public G085AliquotaFcpRetido getAliquotaFcpRetido() { return (field("aliquota_fcp_retido")).isNull() || (field("aliquota_fcp_retido")).isMissingNode() ? null : new G085AliquotaFcpRetido(field("aliquota_fcp_retido")); }
 public G085 setAliquotaFcpRetido(G085AliquotaFcpRetido value) { put("aliquota_fcp_retido", value == null ? null : value.toJson()); return this; }
 public G085AliquotaBcEfetivo getAliquotaBcEfetivo() { return (field("aliquota_bc_efetivo")).isNull() || (field("aliquota_bc_efetivo")).isMissingNode() ? null : new G085AliquotaBcEfetivo(field("aliquota_bc_efetivo")); }
 public G085 setAliquotaBcEfetivo(G085AliquotaBcEfetivo value) { put("aliquota_bc_efetivo", value == null ? null : value.toJson()); return this; }
 public G085AliquotaIcmsEfetivo getAliquotaIcmsEfetivo() { return (field("aliquota_icms_efetivo")).isNull() || (field("aliquota_icms_efetivo")).isMissingNode() ? null : new G085AliquotaIcmsEfetivo(field("aliquota_icms_efetivo")); }
 public G085 setAliquotaIcmsEfetivo(G085AliquotaIcmsEfetivo value) { put("aliquota_icms_efetivo", value == null ? null : value.toJson()); return this; }
}
