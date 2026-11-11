package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G128ControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_perecimento", "unidade_perecimento", "valor_ibs_estorno", "valor_cbs_estorno");
 public G128ControleEstoque() { super(FIELDS); }
 public G128ControleEstoque(JsonNode node) { super(node, FIELDS); }
 public G128ControleEstoqueQuantidadePerecimento getQuantidadePerecimento() { return (field("quantidade_perecimento")).isNull() || (field("quantidade_perecimento")).isMissingNode() ? null : new G128ControleEstoqueQuantidadePerecimento(field("quantidade_perecimento")); }
 public G128ControleEstoque setQuantidadePerecimento(G128ControleEstoqueQuantidadePerecimento value) { put("quantidade_perecimento", value == null ? null : value.toJson()); return this; }
 public String getUnidadePerecimento() { return stringValue(field("unidade_perecimento")); }
 public G128ControleEstoque setUnidadePerecimento(String value) { put("unidade_perecimento", Json.scalar(value)); return this; }
 public G128ControleEstoqueValorIbsEstorno getValorIbsEstorno() { return (field("valor_ibs_estorno")).isNull() || (field("valor_ibs_estorno")).isMissingNode() ? null : new G128ControleEstoqueValorIbsEstorno(field("valor_ibs_estorno")); }
 public G128ControleEstoque setValorIbsEstorno(G128ControleEstoqueValorIbsEstorno value) { put("valor_ibs_estorno", value == null ? null : value.toJson()); return this; }
 public G128ControleEstoqueValorCbsEstorno getValorCbsEstorno() { return (field("valor_cbs_estorno")).isNull() || (field("valor_cbs_estorno")).isMissingNode() ? null : new G128ControleEstoqueValorCbsEstorno(field("valor_cbs_estorno")); }
 public G128ControleEstoque setValorCbsEstorno(G128ControleEstoqueValorCbsEstorno value) { put("valor_cbs_estorno", value == null ? null : value.toJson()); return this; }
}
