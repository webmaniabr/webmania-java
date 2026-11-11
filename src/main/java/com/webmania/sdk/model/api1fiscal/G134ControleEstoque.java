package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G134ControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_imobilizada", "unidade_imobilizada");
 public G134ControleEstoque() { super(FIELDS); }
 public G134ControleEstoque(JsonNode node) { super(node, FIELDS); }
 public G134ControleEstoqueQuantidadeImobilizada getQuantidadeImobilizada() { return (field("quantidade_imobilizada")).isNull() || (field("quantidade_imobilizada")).isMissingNode() ? null : new G134ControleEstoqueQuantidadeImobilizada(field("quantidade_imobilizada")); }
 public G134ControleEstoque setQuantidadeImobilizada(G134ControleEstoqueQuantidadeImobilizada value) { put("quantidade_imobilizada", value == null ? null : value.toJson()); return this; }
 public String getUnidadeImobilizada() { return stringValue(field("unidade_imobilizada")); }
 public G134ControleEstoque setUnidadeImobilizada(String value) { put("unidade_imobilizada", Json.scalar(value)); return this; }
}
