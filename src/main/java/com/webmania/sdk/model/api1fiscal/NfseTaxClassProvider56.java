package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfseTaxClassProvider56 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "tipo", "ibs_cbs", "iss", "pis", "cofins", "inss", "ir", "csll", "codigo_cnae", "codigo_servico", "local_prestacao", "cep_local_prestacao", "iss_retido");
 public NfseTaxClassProvider56() { super(FIELDS); }
 public NfseTaxClassProvider56(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public NfseTaxClassProvider56 setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfseTaxClassProvider56 setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public NfseTaxClassProvider56 setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public G053 getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G053(field("ibs_cbs")); }
 public NfseTaxClassProvider56 setIbsCbs(G053 value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIss() { return integerValue(field("iss")); }
 public NfseTaxClassProvider56 setIss(java.math.BigInteger value) { put("iss", Json.scalar(value)); return this; }
 public java.math.BigInteger getPis() { return integerValue(field("pis")); }
 public NfseTaxClassProvider56 setPis(java.math.BigInteger value) { put("pis", Json.scalar(value)); return this; }
 public java.math.BigInteger getCofins() { return integerValue(field("cofins")); }
 public NfseTaxClassProvider56 setCofins(java.math.BigInteger value) { put("cofins", Json.scalar(value)); return this; }
 public java.math.BigInteger getInss() { return integerValue(field("inss")); }
 public NfseTaxClassProvider56 setInss(java.math.BigInteger value) { put("inss", Json.scalar(value)); return this; }
 public java.math.BigInteger getIr() { return integerValue(field("ir")); }
 public NfseTaxClassProvider56 setIr(java.math.BigInteger value) { put("ir", Json.scalar(value)); return this; }
 public java.math.BigInteger getCsll() { return integerValue(field("csll")); }
 public NfseTaxClassProvider56 setCsll(java.math.BigInteger value) { put("csll", Json.scalar(value)); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public NfseTaxClassProvider56 setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public NfseTaxClassProvider56 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getLocalPrestacao() { return stringValue(field("local_prestacao")); }
 public NfseTaxClassProvider56 setLocalPrestacao(String value) { put("local_prestacao", Json.scalar(value)); return this; }
 public String getCepLocalPrestacao() { return stringValue(field("cep_local_prestacao")); }
 public NfseTaxClassProvider56 setCepLocalPrestacao(String value) { put("cep_local_prestacao", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public NfseTaxClassProvider56 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
}
