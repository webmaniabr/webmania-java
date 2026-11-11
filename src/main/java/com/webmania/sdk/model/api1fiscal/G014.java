package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G014 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("lote", "quantidade", "data_fabricacao", "data_validade", "codigo_agregacao");
 public G014() { super(FIELDS); }
 public G014(JsonNode node) { super(node, FIELDS); }
 public String getLote() { return stringValue(field("lote")); }
 public G014 setLote(String value) { put("lote", Json.scalar(value)); return this; }
 public G014Quantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new G014Quantidade(field("quantidade")); }
 public G014 setQuantidade(G014Quantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public String getDataFabricacao() { return stringValue(field("data_fabricacao")); }
 public G014 setDataFabricacao(String value) { put("data_fabricacao", Json.scalar(value)); return this; }
 public String getDataValidade() { return stringValue(field("data_validade")); }
 public G014 setDataValidade(String value) { put("data_validade", Json.scalar(value)); return this; }
 public String getCodigoAgregacao() { return stringValue(field("codigo_agregacao")); }
 public G014 setCodigoAgregacao(String value) { put("codigo_agregacao", Json.scalar(value)); return this; }
}
