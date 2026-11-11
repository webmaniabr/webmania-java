package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeTaxCalculationResultAliquotas extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("icms", "icms_diferimento", "icms_st", "pis", "cofins", "ipi");
 public NfeTaxCalculationResultAliquotas() { super(FIELDS); }
 public NfeTaxCalculationResultAliquotas(JsonNode node) { super(node, FIELDS); }
 public java.util.List<NfeTaxCalculationResultAliquotasIcmsItem> getIcms() { return list(field("icms"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeTaxCalculationResultAliquotasIcmsItem(v)); }
 public NfeTaxCalculationResultAliquotas setIcms(java.util.List<NfeTaxCalculationResultAliquotasIcmsItem> value) { put("icms", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<NfeTaxCalculationResultAliquotasIcmsDiferimentoItem> getIcmsDiferimento() { return list(field("icms_diferimento"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeTaxCalculationResultAliquotasIcmsDiferimentoItem(v)); }
 public NfeTaxCalculationResultAliquotas setIcmsDiferimento(java.util.List<NfeTaxCalculationResultAliquotasIcmsDiferimentoItem> value) { put("icms_diferimento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<NfeTaxCalculationResultAliquotasIcmsStItem> getIcmsSt() { return list(field("icms_st"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeTaxCalculationResultAliquotasIcmsStItem(v)); }
 public NfeTaxCalculationResultAliquotas setIcmsSt(java.util.List<NfeTaxCalculationResultAliquotasIcmsStItem> value) { put("icms_st", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<NfeTaxCalculationResultAliquotasPisItem> getPis() { return list(field("pis"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeTaxCalculationResultAliquotasPisItem(v)); }
 public NfeTaxCalculationResultAliquotas setPis(java.util.List<NfeTaxCalculationResultAliquotasPisItem> value) { put("pis", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<NfeTaxCalculationResultAliquotasCofinsItem> getCofins() { return list(field("cofins"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeTaxCalculationResultAliquotasCofinsItem(v)); }
 public NfeTaxCalculationResultAliquotas setCofins(java.util.List<NfeTaxCalculationResultAliquotasCofinsItem> value) { put("cofins", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<NfeTaxCalculationResultAliquotasIpiItem> getIpi() { return list(field("ipi"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfeTaxCalculationResultAliquotasIpiItem(v)); }
 public NfeTaxCalculationResultAliquotas setIpi(java.util.List<NfeTaxCalculationResultAliquotasIpiItem> value) { put("ipi", array(value, v -> v == null ? null : v.toJson())); return this; }
}
