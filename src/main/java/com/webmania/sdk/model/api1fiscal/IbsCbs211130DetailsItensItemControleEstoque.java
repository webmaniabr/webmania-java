package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211130DetailsItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_imobilizada", "unidade_imobilizada");
 public IbsCbs211130DetailsItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs211130DetailsItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211130DetailsItensItemControleEstoqueQuantidadeImobilizada getQuantidadeImobilizada() { return (field("quantidade_imobilizada")).isNull() || (field("quantidade_imobilizada")).isMissingNode() ? null : new IbsCbs211130DetailsItensItemControleEstoqueQuantidadeImobilizada(field("quantidade_imobilizada")); }
 public IbsCbs211130DetailsItensItemControleEstoque setQuantidadeImobilizada(IbsCbs211130DetailsItensItemControleEstoqueQuantidadeImobilizada value) { put("quantidade_imobilizada", value == null ? null : value.toJson()); return this; }
 public String getUnidadeImobilizada() { return stringValue(field("unidade_imobilizada")); }
 public IbsCbs211130DetailsItensItemControleEstoque setUnidadeImobilizada(String value) { put("unidade_imobilizada", Json.scalar(value)); return this; }
}
