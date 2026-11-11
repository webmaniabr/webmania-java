package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroup extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_classificacao", "classe_imposto", "impostos", "codigo", "descricao", "indicador_total", "quantidade", "unidade", "valor_total", "valor_unitario", "valor_desconto", "outras_despesas");
 public NfcomItemGroup() { super(FIELDS); }
 public NfcomItemGroup(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupCodigoClassificacao getCodigoClassificacao() { return (field("codigo_classificacao")).isNull() || (field("codigo_classificacao")).isMissingNode() ? null : new NfcomItemGroupCodigoClassificacao(field("codigo_classificacao")); }
 public NfcomItemGroup setCodigoClassificacao(NfcomItemGroupCodigoClassificacao value) { put("codigo_classificacao", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupClasseImposto getClasseImposto() { return (field("classe_imposto")).isNull() || (field("classe_imposto")).isMissingNode() ? null : new NfcomItemGroupClasseImposto(field("classe_imposto")); }
 public NfcomItemGroup setClasseImposto(NfcomItemGroupClasseImposto value) { put("classe_imposto", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new NfcomItemGroupImpostos(field("impostos")); }
 public NfcomItemGroup setImpostos(NfcomItemGroupImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupCodigo getCodigo() { return (field("codigo")).isNull() || (field("codigo")).isMissingNode() ? null : new NfcomItemGroupCodigo(field("codigo")); }
 public NfcomItemGroup setCodigo(NfcomItemGroupCodigo value) { put("codigo", value == null ? null : value.toJson()); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfcomItemGroup setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public NfcomItemGroupIndicadorTotal getIndicadorTotal() { return (field("indicador_total")).isNull() || (field("indicador_total")).isMissingNode() ? null : new NfcomItemGroupIndicadorTotal(field("indicador_total")); }
 public NfcomItemGroup setIndicadorTotal(NfcomItemGroupIndicadorTotal value) { put("indicador_total", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new NfcomItemGroupQuantidade(field("quantidade")); }
 public NfcomItemGroup setQuantidade(NfcomItemGroupQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public NfcomItemGroup setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
 public NfcomItemGroupValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new NfcomItemGroupValorTotal(field("valor_total")); }
 public NfcomItemGroup setValorTotal(NfcomItemGroupValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupValorUnitario getValorUnitario() { return (field("valor_unitario")).isNull() || (field("valor_unitario")).isMissingNode() ? null : new NfcomItemGroupValorUnitario(field("valor_unitario")); }
 public NfcomItemGroup setValorUnitario(NfcomItemGroupValorUnitario value) { put("valor_unitario", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupValorDesconto getValorDesconto() { return (field("valor_desconto")).isNull() || (field("valor_desconto")).isMissingNode() ? null : new NfcomItemGroupValorDesconto(field("valor_desconto")); }
 public NfcomItemGroup setValorDesconto(NfcomItemGroupValorDesconto value) { put("valor_desconto", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupOutrasDespesas getOutrasDespesas() { return (field("outras_despesas")).isNull() || (field("outras_despesas")).isMissingNode() ? null : new NfcomItemGroupOutrasDespesas(field("outras_despesas")); }
 public NfcomItemGroup setOutrasDespesas(NfcomItemGroupOutrasDespesas value) { put("outras_despesas", value == null ? null : value.toJson()); return this; }
}
