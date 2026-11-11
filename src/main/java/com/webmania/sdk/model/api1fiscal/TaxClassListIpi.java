package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListIpi extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "tipo_pessoa", "situacao_tributaria", "codigo_enquadramento", "aliquota");
 public TaxClassListIpi() { super(FIELDS); }
 public TaxClassListIpi(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public TaxClassListIpi setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public TaxClassListIpi setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public TaxClassListIpi setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getCodigoEnquadramento() { return stringValue(field("codigo_enquadramento")); }
 public TaxClassListIpi setCodigoEnquadramento(String value) { put("codigo_enquadramento", Json.scalar(value)); return this; }
 public TaxClassListIpiAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new TaxClassListIpiAliquota(field("aliquota")); }
 public TaxClassListIpi setAliquota(TaxClassListIpiAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
