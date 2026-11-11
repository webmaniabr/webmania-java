package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G094 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "aliquota", "majoracao", "bc_cofins");
 public G094() { super(FIELDS); }
 public G094(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G094 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G094Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G094Aliquota(field("aliquota")); }
 public G094 setAliquota(G094Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G094Majoracao getMajoracao() { return (field("majoracao")).isNull() || (field("majoracao")).isMissingNode() ? null : new G094Majoracao(field("majoracao")); }
 public G094 setMajoracao(G094Majoracao value) { put("majoracao", value == null ? null : value.toJson()); return this; }
 public G094BcCofins getBcCofins() { return (field("bc_cofins")).isNull() || (field("bc_cofins")).isMissingNode() ? null : new G094BcCofins(field("bc_cofins")); }
 public G094 setBcCofins(G094BcCofins value) { put("bc_cofins", value == null ? null : value.toJson()); return this; }
}
