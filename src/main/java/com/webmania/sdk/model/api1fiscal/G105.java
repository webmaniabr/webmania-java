package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G105 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_bc", "aliquota_ibs", "aliquota_cbs", "quantidade_bc_retencao", "aliquota_ibs_retencao", "aliquota_cbs_retencao", "quantidade_bc_retido", "aliquota_ibs_retido", "aliquota_cbs_retido", "aliquota_diferimento_ibs", "aliquota_diferimento_cbs");
 public G105() { super(FIELDS); }
 public G105(JsonNode node) { super(node, FIELDS); }
 public G105QuantidadeBc getQuantidadeBc() { return (field("quantidade_bc")).isNull() || (field("quantidade_bc")).isMissingNode() ? null : new G105QuantidadeBc(field("quantidade_bc")); }
 public G105 setQuantidadeBc(G105QuantidadeBc value) { put("quantidade_bc", value == null ? null : value.toJson()); return this; }
 public G105AliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new G105AliquotaIbs(field("aliquota_ibs")); }
 public G105 setAliquotaIbs(G105AliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public G105AliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new G105AliquotaCbs(field("aliquota_cbs")); }
 public G105 setAliquotaCbs(G105AliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
 public G105QuantidadeBcRetencao getQuantidadeBcRetencao() { return (field("quantidade_bc_retencao")).isNull() || (field("quantidade_bc_retencao")).isMissingNode() ? null : new G105QuantidadeBcRetencao(field("quantidade_bc_retencao")); }
 public G105 setQuantidadeBcRetencao(G105QuantidadeBcRetencao value) { put("quantidade_bc_retencao", value == null ? null : value.toJson()); return this; }
 public G105AliquotaIbsRetencao getAliquotaIbsRetencao() { return (field("aliquota_ibs_retencao")).isNull() || (field("aliquota_ibs_retencao")).isMissingNode() ? null : new G105AliquotaIbsRetencao(field("aliquota_ibs_retencao")); }
 public G105 setAliquotaIbsRetencao(G105AliquotaIbsRetencao value) { put("aliquota_ibs_retencao", value == null ? null : value.toJson()); return this; }
 public G105AliquotaCbsRetencao getAliquotaCbsRetencao() { return (field("aliquota_cbs_retencao")).isNull() || (field("aliquota_cbs_retencao")).isMissingNode() ? null : new G105AliquotaCbsRetencao(field("aliquota_cbs_retencao")); }
 public G105 setAliquotaCbsRetencao(G105AliquotaCbsRetencao value) { put("aliquota_cbs_retencao", value == null ? null : value.toJson()); return this; }
 public G105QuantidadeBcRetido getQuantidadeBcRetido() { return (field("quantidade_bc_retido")).isNull() || (field("quantidade_bc_retido")).isMissingNode() ? null : new G105QuantidadeBcRetido(field("quantidade_bc_retido")); }
 public G105 setQuantidadeBcRetido(G105QuantidadeBcRetido value) { put("quantidade_bc_retido", value == null ? null : value.toJson()); return this; }
 public G105AliquotaIbsRetido getAliquotaIbsRetido() { return (field("aliquota_ibs_retido")).isNull() || (field("aliquota_ibs_retido")).isMissingNode() ? null : new G105AliquotaIbsRetido(field("aliquota_ibs_retido")); }
 public G105 setAliquotaIbsRetido(G105AliquotaIbsRetido value) { put("aliquota_ibs_retido", value == null ? null : value.toJson()); return this; }
 public G105AliquotaCbsRetido getAliquotaCbsRetido() { return (field("aliquota_cbs_retido")).isNull() || (field("aliquota_cbs_retido")).isMissingNode() ? null : new G105AliquotaCbsRetido(field("aliquota_cbs_retido")); }
 public G105 setAliquotaCbsRetido(G105AliquotaCbsRetido value) { put("aliquota_cbs_retido", value == null ? null : value.toJson()); return this; }
 public G105AliquotaDiferimentoIbs getAliquotaDiferimentoIbs() { return (field("aliquota_diferimento_ibs")).isNull() || (field("aliquota_diferimento_ibs")).isMissingNode() ? null : new G105AliquotaDiferimentoIbs(field("aliquota_diferimento_ibs")); }
 public G105 setAliquotaDiferimentoIbs(G105AliquotaDiferimentoIbs value) { put("aliquota_diferimento_ibs", value == null ? null : value.toJson()); return this; }
 public G105AliquotaDiferimentoCbs getAliquotaDiferimentoCbs() { return (field("aliquota_diferimento_cbs")).isNull() || (field("aliquota_diferimento_cbs")).isMissingNode() ? null : new G105AliquotaDiferimentoCbs(field("aliquota_diferimento_cbs")); }
 public G105 setAliquotaDiferimentoCbs(G105AliquotaDiferimentoCbs value) { put("aliquota_diferimento_cbs", value == null ? null : value.toJson()); return this; }
}
