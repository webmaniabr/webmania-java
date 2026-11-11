package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G064 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_emissao", "codigo_servico", "codigo_tributacao_municipio", "tributacao_iss", "tipo_imunidade", "retencao_iss", "cst_pis_cofins", "retencao_pis_cofins", "ibs_cbs");
 public G064() { super(FIELDS); }
 public G064(JsonNode node) { super(node, FIELDS); }
 public String getTipoEmissao() { return stringValue(field("tipo_emissao")); }
 public G064 setTipoEmissao(String value) { put("tipo_emissao", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G064 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public G064 setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public java.math.BigInteger getTributacaoIss() { return integerValue(field("tributacao_iss")); }
 public G064 setTributacaoIss(java.math.BigInteger value) { put("tributacao_iss", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoImunidade() { return integerValue(field("tipo_imunidade")); }
 public G064 setTipoImunidade(java.math.BigInteger value) { put("tipo_imunidade", Json.scalar(value)); return this; }
 public String getRetencaoIss() { return stringValue(field("retencao_iss")); }
 public G064 setRetencaoIss(String value) { put("retencao_iss", Json.scalar(value)); return this; }
 public String getCstPisCofins() { return stringValue(field("cst_pis_cofins")); }
 public G064 setCstPisCofins(String value) { put("cst_pis_cofins", Json.scalar(value)); return this; }
 public java.math.BigInteger getRetencaoPisCofins() { return integerValue(field("retencao_pis_cofins")); }
 public G064 setRetencaoPisCofins(java.math.BigInteger value) { put("retencao_pis_cofins", Json.scalar(value)); return this; }
 public G065 getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G065(field("ibs_cbs")); }
 public G064 setIbsCbs(G065 value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
