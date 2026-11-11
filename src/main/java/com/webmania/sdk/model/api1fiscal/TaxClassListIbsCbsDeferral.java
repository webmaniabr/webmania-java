package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class TaxClassListIbsCbsDeferral extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento");
 public TaxClassListIbsCbsDeferral() { super(FIELDS); }
 public TaxClassListIbsCbsDeferral(JsonNode node) { super(node, FIELDS); }
 public TaxClassListIbsCbsDeferralAliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new TaxClassListIbsCbsDeferralAliquotaDiferimento(field("aliquota_diferimento")); }
 public TaxClassListIbsCbsDeferral setAliquotaDiferimento(TaxClassListIbsCbsDeferralAliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
}
