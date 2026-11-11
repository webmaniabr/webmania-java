package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G093 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "aliquota", "majoracao", "bc_pis");
 public G093() { super(FIELDS); }
 public G093(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G093 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G093Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G093Aliquota(field("aliquota")); }
 public G093 setAliquota(G093Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G093Majoracao getMajoracao() { return (field("majoracao")).isNull() || (field("majoracao")).isMissingNode() ? null : new G093Majoracao(field("majoracao")); }
 public G093 setMajoracao(G093Majoracao value) { put("majoracao", value == null ? null : value.toJson()); return this; }
 public G093BcPis getBcPis() { return (field("bc_pis")).isNull() || (field("bc_pis")).isMissingNode() ? null : new G093BcPis(field("bc_pis")); }
 public G093 setBcPis(G093BcPis value) { put("bc_pis", value == null ? null : value.toJson()); return this; }
}
