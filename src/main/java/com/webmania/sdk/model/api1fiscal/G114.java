package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G114 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade", "subtotal", "total", "codigo_cfop", "situacao_tributaria", "impostos", "beneficio_fiscal", "gtin", "gtin_tributavel", "cod_barras", "cod_barras_tributavel", "unidade_tributavel", "subtotal_tributavel", "quantidade_tributavel");
 public G114() { super(FIELDS); }
 public G114(JsonNode node) { super(node, FIELDS); }
 public G114Quantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new G114Quantidade(field("quantidade")); }
 public G114 setQuantidade(G114Quantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public G114Subtotal getSubtotal() { return (field("subtotal")).isNull() || (field("subtotal")).isMissingNode() ? null : new G114Subtotal(field("subtotal")); }
 public G114 setSubtotal(G114Subtotal value) { put("subtotal", value == null ? null : value.toJson()); return this; }
 public G114Total getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new G114Total(field("total")); }
 public G114 setTotal(G114Total value) { put("total", value == null ? null : value.toJson()); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G114 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G114 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G114Impostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new G114Impostos(field("impostos")); }
 public G114 setImpostos(G114Impostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public String getBeneficioFiscal() { return stringValue(field("beneficio_fiscal")); }
 public G114 setBeneficioFiscal(String value) { put("beneficio_fiscal", Json.scalar(value)); return this; }
 public String getGtin() { return stringValue(field("gtin")); }
 public G114 setGtin(String value) { put("gtin", Json.scalar(value)); return this; }
 public String getGtinTributavel() { return stringValue(field("gtin_tributavel")); }
 public G114 setGtinTributavel(String value) { put("gtin_tributavel", Json.scalar(value)); return this; }
 public String getCodBarras() { return stringValue(field("cod_barras")); }
 public G114 setCodBarras(String value) { put("cod_barras", Json.scalar(value)); return this; }
 public String getCodBarrasTributavel() { return stringValue(field("cod_barras_tributavel")); }
 public G114 setCodBarrasTributavel(String value) { put("cod_barras_tributavel", Json.scalar(value)); return this; }
 public String getUnidadeTributavel() { return stringValue(field("unidade_tributavel")); }
 public G114 setUnidadeTributavel(String value) { put("unidade_tributavel", Json.scalar(value)); return this; }
 public G114SubtotalTributavel getSubtotalTributavel() { return (field("subtotal_tributavel")).isNull() || (field("subtotal_tributavel")).isMissingNode() ? null : new G114SubtotalTributavel(field("subtotal_tributavel")); }
 public G114 setSubtotalTributavel(G114SubtotalTributavel value) { put("subtotal_tributavel", value == null ? null : value.toJson()); return this; }
 public G114QuantidadeTributavel getQuantidadeTributavel() { return (field("quantidade_tributavel")).isNull() || (field("quantidade_tributavel")).isMissingNode() ? null : new G114QuantidadeTributavel(field("quantidade_tributavel")); }
 public G114 setQuantidadeTributavel(G114QuantidadeTributavel value) { put("quantidade_tributavel", value == null ? null : value.toJson()); return this; }
}
