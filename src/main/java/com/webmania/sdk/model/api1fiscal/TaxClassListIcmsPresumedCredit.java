package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListIcmsPresumedCredit extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("estado", "codigo_beneficio_fiscal", "aliquota");
 public TaxClassListIcmsPresumedCredit() { super(FIELDS); }
 public TaxClassListIcmsPresumedCredit(JsonNode node) { super(node, FIELDS); }
 public String getEstado() { return stringValue(field("estado")); }
 public TaxClassListIcmsPresumedCredit setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public String getCodigoBeneficioFiscal() { return stringValue(field("codigo_beneficio_fiscal")); }
 public TaxClassListIcmsPresumedCredit setCodigoBeneficioFiscal(String value) { put("codigo_beneficio_fiscal", Json.scalar(value)); return this; }
 public TaxClassListIcmsPresumedCreditAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new TaxClassListIcmsPresumedCreditAliquota(field("aliquota")); }
 public TaxClassListIcmsPresumedCredit setAliquota(TaxClassListIcmsPresumedCreditAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
