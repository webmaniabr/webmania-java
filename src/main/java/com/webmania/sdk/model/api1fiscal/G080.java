package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G080 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_reducao", "motivo_desoneracao", "deducao_desoneracao");
 public G080() { super(FIELDS); }
 public G080(JsonNode node) { super(node, FIELDS); }
 public G080AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new G080AliquotaReducao(field("aliquota_reducao")); }
 public G080 setAliquotaReducao(G080AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public String getMotivoDesoneracao() { return stringValue(field("motivo_desoneracao")); }
 public G080 setMotivoDesoneracao(String value) { put("motivo_desoneracao", Json.scalar(value)); return this; }
 public String getDeducaoDesoneracao() { return stringValue(field("deducao_desoneracao")); }
 public G080 setDeducaoDesoneracao(String value) { put("deducao_desoneracao", Json.scalar(value)); return this; }
}
