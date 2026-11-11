package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G132ControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_perecimento", "unidade_perecimento");
 public G132ControleEstoque() { super(FIELDS); }
 public G132ControleEstoque(JsonNode node) { super(node, FIELDS); }
 public G132ControleEstoqueQuantidadePerecimento getQuantidadePerecimento() { return (field("quantidade_perecimento")).isNull() || (field("quantidade_perecimento")).isMissingNode() ? null : new G132ControleEstoqueQuantidadePerecimento(field("quantidade_perecimento")); }
 public G132ControleEstoque setQuantidadePerecimento(G132ControleEstoqueQuantidadePerecimento value) { put("quantidade_perecimento", value == null ? null : value.toJson()); return this; }
 public String getUnidadePerecimento() { return stringValue(field("unidade_perecimento")); }
 public G132ControleEstoque setUnidadePerecimento(String value) { put("unidade_perecimento", Json.scalar(value)); return this; }
}
