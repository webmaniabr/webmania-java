package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeProductTaxClass extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "icms", "ipi", "pis", "cofins", "issqn", "ibs_cbs", "informacoes_fisco", "informacoes_complementares", "tipo", "tributos_federais", "tributos_estaduais");
 public NfeProductTaxClass() { super(FIELDS); }
 public NfeProductTaxClass(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public NfeProductTaxClass setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfeProductTaxClass setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public java.util.List<G037> getIcms() { return list(field("icms"), v -> (v).isNull() || (v).isMissingNode() ? null : new G037(v)); }
 public NfeProductTaxClass setIcms(java.util.List<G037> value) { put("icms", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G045> getIpi() { return list(field("ipi"), v -> (v).isNull() || (v).isMissingNode() ? null : new G045(v)); }
 public NfeProductTaxClass setIpi(java.util.List<G045> value) { put("ipi", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G046> getPis() { return list(field("pis"), v -> (v).isNull() || (v).isMissingNode() ? null : new G046(v)); }
 public NfeProductTaxClass setPis(java.util.List<G046> value) { put("pis", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G047> getCofins() { return list(field("cofins"), v -> (v).isNull() || (v).isMissingNode() ? null : new G047(v)); }
 public NfeProductTaxClass setCofins(java.util.List<G047> value) { put("cofins", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G048> getIssqn() { return list(field("issqn"), v -> (v).isNull() || (v).isMissingNode() ? null : new G048(v)); }
 public NfeProductTaxClass setIssqn(java.util.List<G048> value) { put("issqn", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G049> getIbsCbs() { return list(field("ibs_cbs"), v -> (v).isNull() || (v).isMissingNode() ? null : new G049(v)); }
 public NfeProductTaxClass setIbsCbs(java.util.List<G049> value) { put("ibs_cbs", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public NfeProductTaxClass setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public NfeProductTaxClass setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public NfeProductTaxClass setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public NfeProductTaxClassTributosFederais getTributosFederais() { return (field("tributos_federais")).isNull() || (field("tributos_federais")).isMissingNode() ? null : new NfeProductTaxClassTributosFederais(field("tributos_federais")); }
 public NfeProductTaxClass setTributosFederais(NfeProductTaxClassTributosFederais value) { put("tributos_federais", value == null ? null : value.toJson()); return this; }
 public NfeProductTaxClassTributosEstaduais getTributosEstaduais() { return (field("tributos_estaduais")).isNull() || (field("tributos_estaduais")).isMissingNode() ? null : new NfeProductTaxClassTributosEstaduais(field("tributos_estaduais")); }
 public NfeProductTaxClass setTributosEstaduais(NfeProductTaxClassTributosEstaduais value) { put("tributos_estaduais", value == null ? null : value.toJson()); return this; }
}
