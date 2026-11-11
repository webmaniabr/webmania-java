package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211124DetailsItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_perecimento", "unidade_perecimento");
 public IbsCbs211124DetailsItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs211124DetailsItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211124DetailsItensItemControleEstoqueQuantidadePerecimento getQuantidadePerecimento() { return (field("quantidade_perecimento")).isNull() || (field("quantidade_perecimento")).isMissingNode() ? null : new IbsCbs211124DetailsItensItemControleEstoqueQuantidadePerecimento(field("quantidade_perecimento")); }
 public IbsCbs211124DetailsItensItemControleEstoque setQuantidadePerecimento(IbsCbs211124DetailsItensItemControleEstoqueQuantidadePerecimento value) { put("quantidade_perecimento", value == null ? null : value.toJson()); return this; }
 public String getUnidadePerecimento() { return stringValue(field("unidade_perecimento")); }
 public IbsCbs211124DetailsItensItemControleEstoque setUnidadePerecimento(String value) { put("unidade_perecimento", Json.scalar(value)); return this; }
}
