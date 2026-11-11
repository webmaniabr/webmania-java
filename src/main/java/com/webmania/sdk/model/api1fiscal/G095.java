package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G095 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_cfop", "exigibilidade", "item_servico", "incentivo_fiscal", "aliquota", "deducao", "retencoes", "desconto_incondicionado", "desconto_condicionado", "iss_retido", "municipio", "codigo_servico", "processo", "cnae");
 public G095() { super(FIELDS); }
 public G095(JsonNode node) { super(node, FIELDS); }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G095 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public java.math.BigInteger getExigibilidade() { return integerValue(field("exigibilidade")); }
 public G095 setExigibilidade(java.math.BigInteger value) { put("exigibilidade", Json.scalar(value)); return this; }
 public String getItemServico() { return stringValue(field("item_servico")); }
 public G095 setItemServico(String value) { put("item_servico", Json.scalar(value)); return this; }
 public String getIncentivoFiscal() { return stringValue(field("incentivo_fiscal")); }
 public G095 setIncentivoFiscal(String value) { put("incentivo_fiscal", Json.scalar(value)); return this; }
 public G095Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G095Aliquota(field("aliquota")); }
 public G095 setAliquota(G095Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G095Deducao getDeducao() { return (field("deducao")).isNull() || (field("deducao")).isMissingNode() ? null : new G095Deducao(field("deducao")); }
 public G095 setDeducao(G095Deducao value) { put("deducao", value == null ? null : value.toJson()); return this; }
 public G095Retencoes getRetencoes() { return (field("retencoes")).isNull() || (field("retencoes")).isMissingNode() ? null : new G095Retencoes(field("retencoes")); }
 public G095 setRetencoes(G095Retencoes value) { put("retencoes", value == null ? null : value.toJson()); return this; }
 public G095DescontoIncondicionado getDescontoIncondicionado() { return (field("desconto_incondicionado")).isNull() || (field("desconto_incondicionado")).isMissingNode() ? null : new G095DescontoIncondicionado(field("desconto_incondicionado")); }
 public G095 setDescontoIncondicionado(G095DescontoIncondicionado value) { put("desconto_incondicionado", value == null ? null : value.toJson()); return this; }
 public G095DescontoCondicionado getDescontoCondicionado() { return (field("desconto_condicionado")).isNull() || (field("desconto_condicionado")).isMissingNode() ? null : new G095DescontoCondicionado(field("desconto_condicionado")); }
 public G095 setDescontoCondicionado(G095DescontoCondicionado value) { put("desconto_condicionado", value == null ? null : value.toJson()); return this; }
 public G095IssRetido getIssRetido() { return (field("iss_retido")).isNull() || (field("iss_retido")).isMissingNode() ? null : new G095IssRetido(field("iss_retido")); }
 public G095 setIssRetido(G095IssRetido value) { put("iss_retido", value == null ? null : value.toJson()); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public G095 setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G095 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getProcesso() { return stringValue(field("processo")); }
 public G095 setProcesso(String value) { put("processo", Json.scalar(value)); return this; }
 public String getCnae() { return stringValue(field("cnae")); }
 public G095 setCnae(String value) { put("cnae", Json.scalar(value)); return this; }
}
