package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "icms", "ipi", "pis", "cofins", "issqn", "ibs_cbs", "informacoes_fisco", "informacoes_complementares", "tipo", "tributos_federais", "tributos_estaduais", "type", "data", "updated_date", "status");
 public TaxClassListItem() { super(FIELDS); }
 public TaxClassListItem(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public TaxClassListItem setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public TaxClassListItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public TaxClassListItemIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new TaxClassListItemIcms(field("icms")); }
 public TaxClassListItem setIcms(TaxClassListItemIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public java.util.List<TaxClassListIpi> getIpi() { return list(field("ipi"), v -> (v).isNull() || (v).isMissingNode() ? null : new TaxClassListIpi(v)); }
 public TaxClassListItem setIpi(java.util.List<TaxClassListIpi> value) { put("ipi", array(value, v -> v == null ? null : v.toJson())); return this; }
 public TaxClassListItemPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new TaxClassListItemPis(field("pis")); }
 public TaxClassListItem setPis(TaxClassListItemPis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public TaxClassListItemCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new TaxClassListItemCofins(field("cofins")); }
 public TaxClassListItem setCofins(TaxClassListItemCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public java.util.List<TaxClassListIssqn> getIssqn() { return list(field("issqn"), v -> (v).isNull() || (v).isMissingNode() ? null : new TaxClassListIssqn(v)); }
 public TaxClassListItem setIssqn(java.util.List<TaxClassListIssqn> value) { put("issqn", array(value, v -> v == null ? null : v.toJson())); return this; }
 public TaxClassListItemIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new TaxClassListItemIbsCbs(field("ibs_cbs")); }
 public TaxClassListItem setIbsCbs(TaxClassListItemIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public TaxClassListItem setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public TaxClassListItem setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public TaxClassListItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public TaxClassListItemTributosFederais getTributosFederais() { return (field("tributos_federais")).isNull() || (field("tributos_federais")).isMissingNode() ? null : new TaxClassListItemTributosFederais(field("tributos_federais")); }
 public TaxClassListItem setTributosFederais(TaxClassListItemTributosFederais value) { put("tributos_federais", value == null ? null : value.toJson()); return this; }
 public TaxClassListItemTributosEstaduais getTributosEstaduais() { return (field("tributos_estaduais")).isNull() || (field("tributos_estaduais")).isMissingNode() ? null : new TaxClassListItemTributosEstaduais(field("tributos_estaduais")); }
 public TaxClassListItem setTributosEstaduais(TaxClassListItemTributosEstaduais value) { put("tributos_estaduais", value == null ? null : value.toJson()); return this; }
 public String getType() { return stringValue(field("type")); }
 public TaxClassListItem setType(String value) { put("type", Json.scalar(value)); return this; }
 public String getData() { return stringValue(field("data")); }
 public TaxClassListItem setData(String value) { put("data", Json.scalar(value)); return this; }
 public String getUpdatedDate() { return stringValue(field("updated_date")); }
 public TaxClassListItem setUpdatedDate(String value) { put("updated_date", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public TaxClassListItem setStatus(String value) { put("status", Json.scalar(value)); return this; }
}
