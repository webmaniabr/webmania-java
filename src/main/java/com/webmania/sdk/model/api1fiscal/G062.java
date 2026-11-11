package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G062 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "exigibilidade_iss", "deducoes", "iss", "pis", "cofins", "inss", "ir", "csll");
 public G062() { super(FIELDS); }
 public G062(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getCenario() { return integerValue(field("cenario")); }
 public G062 setCenario(java.math.BigInteger value) { put("cenario", Json.scalar(value)); return this; }
 public String getExigibilidadeIss() { return stringValue(field("exigibilidade_iss")); }
 public G062 setExigibilidadeIss(String value) { put("exigibilidade_iss", Json.scalar(value)); return this; }
 public G062Deducoes getDeducoes() { return (field("deducoes")).isNull() || (field("deducoes")).isMissingNode() ? null : new G062Deducoes(field("deducoes")); }
 public G062 setDeducoes(G062Deducoes value) { put("deducoes", value == null ? null : value.toJson()); return this; }
 public G062Iss getIss() { return (field("iss")).isNull() || (field("iss")).isMissingNode() ? null : new G062Iss(field("iss")); }
 public G062 setIss(G062Iss value) { put("iss", value == null ? null : value.toJson()); return this; }
 public G062Pis getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new G062Pis(field("pis")); }
 public G062 setPis(G062Pis value) { put("pis", value == null ? null : value.toJson()); return this; }
 public G062Cofins getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new G062Cofins(field("cofins")); }
 public G062 setCofins(G062Cofins value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public G062Inss getInss() { return (field("inss")).isNull() || (field("inss")).isMissingNode() ? null : new G062Inss(field("inss")); }
 public G062 setInss(G062Inss value) { put("inss", value == null ? null : value.toJson()); return this; }
 public G062Ir getIr() { return (field("ir")).isNull() || (field("ir")).isMissingNode() ? null : new G062Ir(field("ir")); }
 public G062 setIr(G062Ir value) { put("ir", value == null ? null : value.toJson()); return this; }
 public G062Csll getCsll() { return (field("csll")).isNull() || (field("csll")).isMissingNode() ? null : new G062Csll(field("csll")); }
 public G062 setCsll(G062Csll value) { put("csll", value == null ? null : value.toJson()); return this; }
}
