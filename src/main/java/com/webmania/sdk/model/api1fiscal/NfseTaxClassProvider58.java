package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfseTaxClassProvider58 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "tipo", "ibs_cbs", "iss", "pis", "cofins", "inss", "ir", "csll", "cfps", "id_cnae", "situacao_tributaria", "iss_retido");
 public NfseTaxClassProvider58() { super(FIELDS); }
 public NfseTaxClassProvider58(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public NfseTaxClassProvider58 setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfseTaxClassProvider58 setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public NfseTaxClassProvider58 setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public G053 getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G053(field("ibs_cbs")); }
 public NfseTaxClassProvider58 setIbsCbs(G053 value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIss() { return integerValue(field("iss")); }
 public NfseTaxClassProvider58 setIss(java.math.BigInteger value) { put("iss", Json.scalar(value)); return this; }
 public java.math.BigInteger getPis() { return integerValue(field("pis")); }
 public NfseTaxClassProvider58 setPis(java.math.BigInteger value) { put("pis", Json.scalar(value)); return this; }
 public java.math.BigInteger getCofins() { return integerValue(field("cofins")); }
 public NfseTaxClassProvider58 setCofins(java.math.BigInteger value) { put("cofins", Json.scalar(value)); return this; }
 public java.math.BigInteger getInss() { return integerValue(field("inss")); }
 public NfseTaxClassProvider58 setInss(java.math.BigInteger value) { put("inss", Json.scalar(value)); return this; }
 public java.math.BigInteger getIr() { return integerValue(field("ir")); }
 public NfseTaxClassProvider58 setIr(java.math.BigInteger value) { put("ir", Json.scalar(value)); return this; }
 public java.math.BigInteger getCsll() { return integerValue(field("csll")); }
 public NfseTaxClassProvider58 setCsll(java.math.BigInteger value) { put("csll", Json.scalar(value)); return this; }
 public java.util.List<G059> getCfps() { return list(field("cfps"), v -> (v).isNull() || (v).isMissingNode() ? null : new G059(v)); }
 public NfseTaxClassProvider58 setCfps(java.util.List<G059> value) { put("cfps", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getIdCnae() { return stringValue(field("id_cnae")); }
 public NfseTaxClassProvider58 setIdCnae(String value) { put("id_cnae", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfseTaxClassProvider58 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public NfseTaxClassProvider58 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
}
