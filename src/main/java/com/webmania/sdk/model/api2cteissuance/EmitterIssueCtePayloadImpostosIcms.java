package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIcms extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "aliquota_st_retido", "bc_st_retido", "credito_outorgado", "devido_origem", "partilha", "percentual_reducao");
 public EmitterIssueCtePayloadImpostosIcms() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostosIcms(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadImpostosIcmsAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsAliquota(field("aliquota")); }
 public EmitterIssueCtePayloadImpostosIcms setAliquota(EmitterIssueCtePayloadImpostosIcmsAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido getAliquotaStRetido() { return (field("aliquota_st_retido")).isNull() || (field("aliquota_st_retido")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido(field("aliquota_st_retido")); }
 public EmitterIssueCtePayloadImpostosIcms setAliquotaStRetido(EmitterIssueCtePayloadImpostosIcmsAliquotaStRetido value) { put("aliquota_st_retido", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsBcStRetido getBcStRetido() { return (field("bc_st_retido")).isNull() || (field("bc_st_retido")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsBcStRetido(field("bc_st_retido")); }
 public EmitterIssueCtePayloadImpostosIcms setBcStRetido(EmitterIssueCtePayloadImpostosIcmsBcStRetido value) { put("bc_st_retido", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsCreditoOutorgado getCreditoOutorgado() { return (field("credito_outorgado")).isNull() || (field("credito_outorgado")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsCreditoOutorgado(field("credito_outorgado")); }
 public EmitterIssueCtePayloadImpostosIcms setCreditoOutorgado(EmitterIssueCtePayloadImpostosIcmsCreditoOutorgado value) { put("credito_outorgado", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsDevidoOrigem getDevidoOrigem() { return (field("devido_origem")).isNull() || (field("devido_origem")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsDevidoOrigem(field("devido_origem")); }
 public EmitterIssueCtePayloadImpostosIcms setDevidoOrigem(EmitterIssueCtePayloadImpostosIcmsDevidoOrigem value) { put("devido_origem", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsPartilha getPartilha() { return (field("partilha")).isNull() || (field("partilha")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPartilha(field("partilha")); }
 public EmitterIssueCtePayloadImpostosIcms setPartilha(EmitterIssueCtePayloadImpostosIcmsPartilha value) { put("partilha", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsPercentualReducao getPercentualReducao() { return (field("percentual_reducao")).isNull() || (field("percentual_reducao")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPercentualReducao(field("percentual_reducao")); }
 public EmitterIssueCtePayloadImpostosIcms setPercentualReducao(EmitterIssueCtePayloadImpostosIcmsPercentualReducao value) { put("percentual_reducao", value == null ? null : value.toJson()); return this; }
}
