package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfseTaxClassProvider64 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "tipo", "ibs_cbs", "iss", "pis", "cofins", "inss", "ir", "csll", "tipo_emissao", "codigo_servico", "codigo_tributacao_municipio", "tributacao_iss", "tipo_imunidade", "retencao_iss", "cst_pis_cofins", "retencao_pis_cofins");
 public NfseTaxClassProvider64() { super(FIELDS); }
 public NfseTaxClassProvider64(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public NfseTaxClassProvider64 setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfseTaxClassProvider64 setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public NfseTaxClassProvider64 setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
 public G065 getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G065(field("ibs_cbs")); }
 public NfseTaxClassProvider64 setIbsCbs(G065 value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIss() { return integerValue(field("iss")); }
 public NfseTaxClassProvider64 setIss(java.math.BigInteger value) { put("iss", Json.scalar(value)); return this; }
 public java.math.BigInteger getPis() { return integerValue(field("pis")); }
 public NfseTaxClassProvider64 setPis(java.math.BigInteger value) { put("pis", Json.scalar(value)); return this; }
 public java.math.BigInteger getCofins() { return integerValue(field("cofins")); }
 public NfseTaxClassProvider64 setCofins(java.math.BigInteger value) { put("cofins", Json.scalar(value)); return this; }
 public java.math.BigInteger getInss() { return integerValue(field("inss")); }
 public NfseTaxClassProvider64 setInss(java.math.BigInteger value) { put("inss", Json.scalar(value)); return this; }
 public java.math.BigInteger getIr() { return integerValue(field("ir")); }
 public NfseTaxClassProvider64 setIr(java.math.BigInteger value) { put("ir", Json.scalar(value)); return this; }
 public java.math.BigInteger getCsll() { return integerValue(field("csll")); }
 public NfseTaxClassProvider64 setCsll(java.math.BigInteger value) { put("csll", Json.scalar(value)); return this; }
 public String getTipoEmissao() { return stringValue(field("tipo_emissao")); }
 public NfseTaxClassProvider64 setTipoEmissao(String value) { put("tipo_emissao", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public NfseTaxClassProvider64 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public NfseTaxClassProvider64 setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public java.math.BigInteger getTributacaoIss() { return integerValue(field("tributacao_iss")); }
 public NfseTaxClassProvider64 setTributacaoIss(java.math.BigInteger value) { put("tributacao_iss", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoImunidade() { return integerValue(field("tipo_imunidade")); }
 public NfseTaxClassProvider64 setTipoImunidade(java.math.BigInteger value) { put("tipo_imunidade", Json.scalar(value)); return this; }
 public String getRetencaoIss() { return stringValue(field("retencao_iss")); }
 public NfseTaxClassProvider64 setRetencaoIss(String value) { put("retencao_iss", Json.scalar(value)); return this; }
 public String getCstPisCofins() { return stringValue(field("cst_pis_cofins")); }
 public NfseTaxClassProvider64 setCstPisCofins(String value) { put("cst_pis_cofins", Json.scalar(value)); return this; }
 public java.math.BigInteger getRetencaoPisCofins() { return integerValue(field("retencao_pis_cofins")); }
 public NfseTaxClassProvider64 setRetencaoPisCofins(java.math.BigInteger value) { put("retencao_pis_cofins", Json.scalar(value)); return this; }
}
