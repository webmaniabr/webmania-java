package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G090 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_operacao");
 public G090() { super(FIELDS); }
 public G090(JsonNode node) { super(node, FIELDS); }
 public G090ValorOperacao getValorOperacao() { return (field("valor_operacao")).isNull() || (field("valor_operacao")).isMissingNode() ? null : new G090ValorOperacao(field("valor_operacao")); }
 public G090 setValorOperacao(G090ValorOperacao value) { put("valor_operacao", value == null ? null : value.toJson()); return this; }
}
