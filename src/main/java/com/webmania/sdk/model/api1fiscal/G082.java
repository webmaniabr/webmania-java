package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G082 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("motivo_desoneracao", "deducao_desoneracao");
 public G082() { super(FIELDS); }
 public G082(JsonNode node) { super(node, FIELDS); }
 public String getMotivoDesoneracao() { return stringValue(field("motivo_desoneracao")); }
 public G082 setMotivoDesoneracao(String value) { put("motivo_desoneracao", Json.scalar(value)); return this; }
 public String getDeducaoDesoneracao() { return stringValue(field("deducao_desoneracao")); }
 public G082 setDeducaoDesoneracao(String value) { put("deducao_desoneracao", Json.scalar(value)); return this; }
}
