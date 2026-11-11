package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112130DetailsItensItemControleEstoque extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_perecimento", "unidade_perecimento", "valor_ibs_estorno", "valor_cbs_estorno");
 public IbsCbs112130DetailsItensItemControleEstoque() { super(FIELDS); }
 public IbsCbs112130DetailsItensItemControleEstoque(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112130DetailsItensItemControleEstoqueQuantidadePerecimento getQuantidadePerecimento() { return (field("quantidade_perecimento")).isNull() || (field("quantidade_perecimento")).isMissingNode() ? null : new IbsCbs112130DetailsItensItemControleEstoqueQuantidadePerecimento(field("quantidade_perecimento")); }
 public IbsCbs112130DetailsItensItemControleEstoque setQuantidadePerecimento(IbsCbs112130DetailsItensItemControleEstoqueQuantidadePerecimento value) { put("quantidade_perecimento", value == null ? null : value.toJson()); return this; }
 public String getUnidadePerecimento() { return stringValue(field("unidade_perecimento")); }
 public IbsCbs112130DetailsItensItemControleEstoque setUnidadePerecimento(String value) { put("unidade_perecimento", Json.scalar(value)); return this; }
 public IbsCbs112130DetailsItensItemControleEstoqueValorIbsEstorno getValorIbsEstorno() { return (field("valor_ibs_estorno")).isNull() || (field("valor_ibs_estorno")).isMissingNode() ? null : new IbsCbs112130DetailsItensItemControleEstoqueValorIbsEstorno(field("valor_ibs_estorno")); }
 public IbsCbs112130DetailsItensItemControleEstoque setValorIbsEstorno(IbsCbs112130DetailsItensItemControleEstoqueValorIbsEstorno value) { put("valor_ibs_estorno", value == null ? null : value.toJson()); return this; }
 public IbsCbs112130DetailsItensItemControleEstoqueValorCbsEstorno getValorCbsEstorno() { return (field("valor_cbs_estorno")).isNull() || (field("valor_cbs_estorno")).isMissingNode() ? null : new IbsCbs112130DetailsItensItemControleEstoqueValorCbsEstorno(field("valor_cbs_estorno")); }
 public IbsCbs112130DetailsItensItemControleEstoque setValorCbsEstorno(IbsCbs112130DetailsItensItemControleEstoqueValorCbsEstorno value) { put("valor_cbs_estorno", value == null ? null : value.toJson()); return this; }
}
