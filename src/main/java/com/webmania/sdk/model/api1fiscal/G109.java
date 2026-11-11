package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G109 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("competencia_apuracao", "valor_ibs", "valor_cbs");
 public G109() { super(FIELDS); }
 public G109(JsonNode node) { super(node, FIELDS); }
 public String getCompetenciaApuracao() { return stringValue(field("competencia_apuracao")); }
 public G109 setCompetenciaApuracao(String value) { put("competencia_apuracao", Json.scalar(value)); return this; }
 public G109ValorIbs getValorIbs() { return (field("valor_ibs")).isNull() || (field("valor_ibs")).isMissingNode() ? null : new G109ValorIbs(field("valor_ibs")); }
 public G109 setValorIbs(G109ValorIbs value) { put("valor_ibs", value == null ? null : value.toJson()); return this; }
 public G109ValorCbs getValorCbs() { return (field("valor_cbs")).isNull() || (field("valor_cbs")).isMissingNode() ? null : new G109ValorCbs(field("valor_cbs")); }
 public G109 setValorCbs(G109ValorCbs value) { put("valor_cbs", value == null ? null : value.toJson()); return this; }
}
