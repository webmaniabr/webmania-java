package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfcomClassPisCofins extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "aliquota");
 public NfcomClassPisCofins() { super(FIELDS); }
 public NfcomClassPisCofins(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfcomClassPisCofins setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public NfcomClassPisCofinsAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfcomClassPisCofinsAliquota(field("aliquota")); }
 public NfcomClassPisCofins setAliquota(NfcomClassPisCofinsAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
