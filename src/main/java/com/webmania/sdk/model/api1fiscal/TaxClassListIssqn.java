package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListIssqn extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "tipo_pessoa", "codigo_cfop", "exigibilidade", "item_servico", "incentivo_fiscal", "aliquota", "municipio", "codigo_servico");
 public TaxClassListIssqn() { super(FIELDS); }
 public TaxClassListIssqn(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public TaxClassListIssqn setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public TaxClassListIssqn setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public TaxClassListIssqn setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getExigibilidade() { return stringValue(field("exigibilidade")); }
 public TaxClassListIssqn setExigibilidade(String value) { put("exigibilidade", Json.scalar(value)); return this; }
 public String getItemServico() { return stringValue(field("item_servico")); }
 public TaxClassListIssqn setItemServico(String value) { put("item_servico", Json.scalar(value)); return this; }
 public String getIncentivoFiscal() { return stringValue(field("incentivo_fiscal")); }
 public TaxClassListIssqn setIncentivoFiscal(String value) { put("incentivo_fiscal", Json.scalar(value)); return this; }
 public TaxClassListIssqnAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new TaxClassListIssqnAliquota(field("aliquota")); }
 public TaxClassListIssqn setAliquota(TaxClassListIssqnAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public TaxClassListIssqn setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public TaxClassListIssqn setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
}
