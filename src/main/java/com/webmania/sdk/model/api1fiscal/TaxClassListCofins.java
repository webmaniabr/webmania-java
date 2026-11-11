package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListCofins extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "tipo_pessoa", "situacao_tributaria", "aliquota");
 public TaxClassListCofins() { super(FIELDS); }
 public TaxClassListCofins(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public TaxClassListCofins setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public TaxClassListCofins setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public TaxClassListCofins setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public TaxClassListCofinsAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new TaxClassListCofinsAliquota(field("aliquota")); }
 public TaxClassListCofins setAliquota(TaxClassListCofinsAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
