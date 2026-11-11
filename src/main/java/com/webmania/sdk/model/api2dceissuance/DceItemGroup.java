package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class DceItemGroup extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("descricao", "informacoes_adicionais", "ncm", "quantidade", "valor_unitario");
 public DceItemGroup() { super(FIELDS); }
 public DceItemGroup(JsonNode node) { super(node, FIELDS); }
 public String getDescricao() { return stringValue(field("descricao")); }
 public DceItemGroup setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public DceItemGroupInformacoesAdicionais getInformacoesAdicionais() { return (field("informacoes_adicionais")).isNull() || (field("informacoes_adicionais")).isMissingNode() ? null : new DceItemGroupInformacoesAdicionais(field("informacoes_adicionais")); }
 public DceItemGroup setInformacoesAdicionais(DceItemGroupInformacoesAdicionais value) { put("informacoes_adicionais", value == null ? null : value.toJson()); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public DceItemGroup setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public DceItemGroupQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new DceItemGroupQuantidade(field("quantidade")); }
 public DceItemGroup setQuantidade(DceItemGroupQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public DceItemGroupValorUnitario getValorUnitario() { return (field("valor_unitario")).isNull() || (field("valor_unitario")).isMissingNode() ? null : new DceItemGroupValorUnitario(field("valor_unitario")); }
 public DceItemGroup setValorUnitario(DceItemGroupValorUnitario value) { put("valor_unitario", value == null ? null : value.toJson()); return this; }
}
