package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfseTaxClassProvider57 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "tipo", "ibs_cbs", "iss", "pis", "cofins", "inss", "ir", "csll", "codigo_servico", "tipo_tributacao", "iss_retido", "responsavel_retencao", "codigo_cnae");
 public NfseTaxClassProvider57() { super(FIELDS); }
 public NfseTaxClassProvider57(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public NfseTaxClassProvider57 setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfseTaxClassProvider57 setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public NfseTaxClassProvider57 setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public G053 getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G053(field("ibs_cbs")); }
 public NfseTaxClassProvider57 setIbsCbs(G053 value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIss() { return integerValue(field("iss")); }
 public NfseTaxClassProvider57 setIss(java.math.BigInteger value) { put("iss", Json.scalar(value)); return this; }
 public java.math.BigInteger getPis() { return integerValue(field("pis")); }
 public NfseTaxClassProvider57 setPis(java.math.BigInteger value) { put("pis", Json.scalar(value)); return this; }
 public java.math.BigInteger getCofins() { return integerValue(field("cofins")); }
 public NfseTaxClassProvider57 setCofins(java.math.BigInteger value) { put("cofins", Json.scalar(value)); return this; }
 public java.math.BigInteger getInss() { return integerValue(field("inss")); }
 public NfseTaxClassProvider57 setInss(java.math.BigInteger value) { put("inss", Json.scalar(value)); return this; }
 public java.math.BigInteger getIr() { return integerValue(field("ir")); }
 public NfseTaxClassProvider57 setIr(java.math.BigInteger value) { put("ir", Json.scalar(value)); return this; }
 public java.math.BigInteger getCsll() { return integerValue(field("csll")); }
 public NfseTaxClassProvider57 setCsll(java.math.BigInteger value) { put("csll", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public NfseTaxClassProvider57 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getTipoTributacao() { return stringValue(field("tipo_tributacao")); }
 public NfseTaxClassProvider57 setTipoTributacao(String value) { put("tipo_tributacao", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public NfseTaxClassProvider57 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
 public String getResponsavelRetencao() { return stringValue(field("responsavel_retencao")); }
 public NfseTaxClassProvider57 setResponsavelRetencao(String value) { put("responsavel_retencao", Json.scalar(value)); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public NfseTaxClassProvider57 setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
}
