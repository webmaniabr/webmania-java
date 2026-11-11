package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfseTaxClassProvider66 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "tipo", "ibs_cbs", "iss", "pis", "cofins", "inss", "ir", "csll", "codigo_servico", "tributacao", "iss_retido", "responsavel_retencao");
 public NfseTaxClassProvider66() { super(FIELDS); }
 public NfseTaxClassProvider66(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public NfseTaxClassProvider66 setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfseTaxClassProvider66 setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public NfseTaxClassProvider66 setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public G053 getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G053(field("ibs_cbs")); }
 public NfseTaxClassProvider66 setIbsCbs(G053 value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIss() { return integerValue(field("iss")); }
 public NfseTaxClassProvider66 setIss(java.math.BigInteger value) { put("iss", Json.scalar(value)); return this; }
 public java.math.BigInteger getPis() { return integerValue(field("pis")); }
 public NfseTaxClassProvider66 setPis(java.math.BigInteger value) { put("pis", Json.scalar(value)); return this; }
 public java.math.BigInteger getCofins() { return integerValue(field("cofins")); }
 public NfseTaxClassProvider66 setCofins(java.math.BigInteger value) { put("cofins", Json.scalar(value)); return this; }
 public java.math.BigInteger getInss() { return integerValue(field("inss")); }
 public NfseTaxClassProvider66 setInss(java.math.BigInteger value) { put("inss", Json.scalar(value)); return this; }
 public java.math.BigInteger getIr() { return integerValue(field("ir")); }
 public NfseTaxClassProvider66 setIr(java.math.BigInteger value) { put("ir", Json.scalar(value)); return this; }
 public java.math.BigInteger getCsll() { return integerValue(field("csll")); }
 public NfseTaxClassProvider66 setCsll(java.math.BigInteger value) { put("csll", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public NfseTaxClassProvider66 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public java.math.BigInteger getTributacao() { return integerValue(field("tributacao")); }
 public NfseTaxClassProvider66 setTributacao(java.math.BigInteger value) { put("tributacao", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public NfseTaxClassProvider66 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
 public String getResponsavelRetencao() { return stringValue(field("responsavel_retencao")); }
 public NfseTaxClassProvider66 setResponsavelRetencao(String value) { put("responsavel_retencao", Json.scalar(value)); return this; }
}
