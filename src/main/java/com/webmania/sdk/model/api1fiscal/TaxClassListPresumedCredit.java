package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListPresumedCredit extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "aliquota_cbs");
 public TaxClassListPresumedCredit() { super(FIELDS); }
 public TaxClassListPresumedCredit(JsonNode node) { super(node, FIELDS); }
 public TaxClassListPresumedCreditClassificacao getClassificacao() { return (field("classificacao")).isNull() || (field("classificacao")).isMissingNode() ? null : new TaxClassListPresumedCreditClassificacao(field("classificacao")); }
 public TaxClassListPresumedCredit setClassificacao(TaxClassListPresumedCreditClassificacao value) { put("classificacao", value == null ? null : value.toJson()); return this; }
 public TaxClassListPresumedCreditAliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new TaxClassListPresumedCreditAliquotaIbs(field("aliquota_ibs")); }
 public TaxClassListPresumedCredit setAliquotaIbs(TaxClassListPresumedCreditAliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public TaxClassListPresumedCreditAliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new TaxClassListPresumedCreditAliquotaCbs(field("aliquota_cbs")); }
 public TaxClassListPresumedCredit setAliquotaCbs(TaxClassListPresumedCreditAliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
}
