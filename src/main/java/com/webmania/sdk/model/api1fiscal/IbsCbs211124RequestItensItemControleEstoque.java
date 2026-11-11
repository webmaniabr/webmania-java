package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211124RequestItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_perecimento", "unidade_perecimento");
 public IbsCbs211124RequestItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs211124RequestItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211124RequestItensItemControleEstoqueQuantidadePerecimento getQuantidadePerecimento() { return (field("quantidade_perecimento")).isNull() || (field("quantidade_perecimento")).isMissingNode() ? null : new IbsCbs211124RequestItensItemControleEstoqueQuantidadePerecimento(field("quantidade_perecimento")); }
 public IbsCbs211124RequestItensItemControleEstoque setQuantidadePerecimento(IbsCbs211124RequestItensItemControleEstoqueQuantidadePerecimento value) { put("quantidade_perecimento", value == null ? null : value.toJson()); return this; }
 public String getUnidadePerecimento() { return stringValue(field("unidade_perecimento")); }
 public IbsCbs211124RequestItensItemControleEstoque setUnidadePerecimento(String value) { put("unidade_perecimento", Json.scalar(value)); return this; }
}
