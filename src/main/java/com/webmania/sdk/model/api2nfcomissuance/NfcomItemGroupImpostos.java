package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_classificacao", "cofins", "funttel", "fust", "ibs_cbs", "icms", "pis");
 public NfcomItemGroupImpostos() { super(FIELDS); }
 public NfcomItemGroupImpostos(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosCodigoClassificacao getCodigoClassificacao() { return (field("codigo_classificacao")).isNull() || (field("codigo_classificacao")).isMissingNode() ? null : new NfcomItemGroupImpostosCodigoClassificacao(field("codigo_classificacao")); }
 public NfcomItemGroupImpostos setCodigoClassificacao(NfcomItemGroupImpostosCodigoClassificacao value) { put("codigo_classificacao", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new NfcomItemGroupImpostosCofins(field("cofins")); }
 public NfcomItemGroupImpostos setCofins(NfcomItemGroupImpostosCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosFunttel getFunttel() { return (field("funttel")).isNull() || (field("funttel")).isMissingNode() ? null : new NfcomItemGroupImpostosFunttel(field("funttel")); }
 public NfcomItemGroupImpostos setFunttel(NfcomItemGroupImpostosFunttel value) { put("funttel", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosFust getFust() { return (field("fust")).isNull() || (field("fust")).isMissingNode() ? null : new NfcomItemGroupImpostosFust(field("fust")); }
 public NfcomItemGroupImpostos setFust(NfcomItemGroupImpostosFust value) { put("fust", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbs(field("ibs_cbs")); }
 public NfcomItemGroupImpostos setIbsCbs(NfcomItemGroupImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new NfcomItemGroupImpostosIcms(field("icms")); }
 public NfcomItemGroupImpostos setIcms(NfcomItemGroupImpostosIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosPis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new NfcomItemGroupImpostosPis(field("pis")); }
 public NfcomItemGroupImpostos setPis(NfcomItemGroupImpostosPis value) { put("pis", value == null ? null : value.toJson()); return this; }
}
