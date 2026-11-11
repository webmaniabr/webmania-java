package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfcomCommunicationTaxClass extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "tipo", "codigo_classificacao", "icms", "pis", "cofins", "fust", "funttel");
 public NfcomCommunicationTaxClass() { super(FIELDS); }
 public NfcomCommunicationTaxClass(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public NfcomCommunicationTaxClass setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfcomCommunicationTaxClass setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public NfcomCommunicationTaxClass setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public String getCodigoClassificacao() { return stringValue(field("codigo_classificacao")); }
 public NfcomCommunicationTaxClass setCodigoClassificacao(String value) { put("codigo_classificacao", Json.scalar(value)); return this; }
 public NfcomClassIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new NfcomClassIcms(field("icms")); }
 public NfcomCommunicationTaxClass setIcms(NfcomClassIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public NfcomClassPisCofins getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new NfcomClassPisCofins(field("pis")); }
 public NfcomCommunicationTaxClass setPis(NfcomClassPisCofins value) { put("pis", value == null ? null : value.toJson()); return this; }
 public NfcomClassPisCofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new NfcomClassPisCofins(field("cofins")); }
 public NfcomCommunicationTaxClass setCofins(NfcomClassPisCofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public NfcomClassContribution getFust() { return (field("fust")).isNull() || (field("fust")).isMissingNode() ? null : new NfcomClassContribution(field("fust")); }
 public NfcomCommunicationTaxClass setFust(NfcomClassContribution value) { put("fust", value == null ? null : value.toJson()); return this; }
 public NfcomClassContribution getFunttel() { return (field("funttel")).isNull() || (field("funttel")).isMissingNode() ? null : new NfcomClassContribution(field("funttel")); }
 public NfcomCommunicationTaxClass setFunttel(NfcomClassContribution value) { put("funttel", value == null ? null : value.toJson()); return this; }
}
