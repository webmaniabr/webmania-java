package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112130RequestItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_perecimento", "unidade_perecimento", "valor_ibs_estorno", "valor_cbs_estorno");
 public IbsCbs112130RequestItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs112130RequestItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112130RequestItensItemControleEstoqueQuantidadePerecimento getQuantidadePerecimento() { return (field("quantidade_perecimento")).isNull() || (field("quantidade_perecimento")).isMissingNode() ? null : new IbsCbs112130RequestItensItemControleEstoqueQuantidadePerecimento(field("quantidade_perecimento")); }
 public IbsCbs112130RequestItensItemControleEstoque setQuantidadePerecimento(IbsCbs112130RequestItensItemControleEstoqueQuantidadePerecimento value) { put("quantidade_perecimento", value == null ? null : value.toJson()); return this; }
 public String getUnidadePerecimento() { return stringValue(field("unidade_perecimento")); }
 public IbsCbs112130RequestItensItemControleEstoque setUnidadePerecimento(String value) { put("unidade_perecimento", Json.scalar(value)); return this; }
 public IbsCbs112130RequestItensItemControleEstoqueValorIbsEstorno getValorIbsEstorno() { return (field("valor_ibs_estorno")).isNull() || (field("valor_ibs_estorno")).isMissingNode() ? null : new IbsCbs112130RequestItensItemControleEstoqueValorIbsEstorno(field("valor_ibs_estorno")); }
 public IbsCbs112130RequestItensItemControleEstoque setValorIbsEstorno(IbsCbs112130RequestItensItemControleEstoqueValorIbsEstorno value) { put("valor_ibs_estorno", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130RequestItensItemControleEstoqueValorCbsEstorno getValorCbsEstorno() { return (field("valor_cbs_estorno")).isNull() || (field("valor_cbs_estorno")).isMissingNode() ? null : new IbsCbs112130RequestItensItemControleEstoqueValorCbsEstorno(field("valor_cbs_estorno")); }
 public IbsCbs112130RequestItensItemControleEstoque setValorCbsEstorno(IbsCbs112130RequestItensItemControleEstoqueValorCbsEstorno value) { put("valor_cbs_estorno", value == null ? null : value.toJson()); return this; }
}
