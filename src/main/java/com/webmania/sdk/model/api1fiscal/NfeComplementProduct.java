package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeComplementProduct extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "item", "nome", "codigo", "ncm", "quantidade", "quantidade_tributavel", "unidade", "unidade_tributavel", "peso", "origem", "desconto", "subtotal", "subtotal_tributavel", "total", "ind_valor_total", "classe_imposto", "impostos", "dfe_referenciado", "cest", "beneficio_fiscal", "informacoes_adicionais", "ind_escala", "cnpj_fabricante", "gtin", "gtin_tributavel", "cod_barras", "cod_barras_tributavel", "nve", "nrecopi", "ativo_permanente", "veiculo_usado", "ex_ipi", "combustiveis", "medicamento", "armamentos", "veiculos_novos", "rastro", "codigo_cfop", "situacao_tributaria");
 public NfeComplementProduct() { super(FIELDS); }
 public NfeComplementProduct(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getID() { return integerValue(field("ID")); }
 public NfeComplementProduct setID(java.math.BigInteger value) { put("ID", Json.scalar(value)); return this; }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public NfeComplementProduct setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public NfeComplementProduct setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getCodigo() { return stringValue(field("codigo")); }
 public NfeComplementProduct setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public NfeComplementProduct setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public NfeComplementProductQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new NfeComplementProductQuantidade(field("quantidade")); }
 public NfeComplementProduct setQuantidade(NfeComplementProductQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public NfeComplementProductQuantidadeTributavel getQuantidadeTributavel() { return (field("quantidade_tributavel")).isNull() || (field("quantidade_tributavel")).isMissingNode() ? null : new NfeComplementProductQuantidadeTributavel(field("quantidade_tributavel")); }
 public NfeComplementProduct setQuantidadeTributavel(NfeComplementProductQuantidadeTributavel value) { put("quantidade_tributavel", value == null ? null : value.toJson()); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public NfeComplementProduct setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
 public String getUnidadeTributavel() { return stringValue(field("unidade_tributavel")); }
 public NfeComplementProduct setUnidadeTributavel(String value) { put("unidade_tributavel", Json.scalar(value)); return this; }
 public NfeComplementProductPeso getPeso() { return (field("peso")).isNull() || (field("peso")).isMissingNode() ? null : new NfeComplementProductPeso(field("peso")); }
 public NfeComplementProduct setPeso(NfeComplementProductPeso value) { put("peso", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getOrigem() { return integerValue(field("origem")); }
 public NfeComplementProduct setOrigem(java.math.BigInteger value) { put("origem", Json.scalar(value)); return this; }
 public NfeComplementProductDesconto getDesconto() { return (field("desconto")).isNull() || (field("desconto")).isMissingNode() ? null : new NfeComplementProductDesconto(field("desconto")); }
 public NfeComplementProduct setDesconto(NfeComplementProductDesconto value) { put("desconto", value == null ? null : value.toJson()); return this; }
 public NfeComplementProductSubtotal getSubtotal() { return (field("subtotal")).isNull() || (field("subtotal")).isMissingNode() ? null : new NfeComplementProductSubtotal(field("subtotal")); }
 public NfeComplementProduct setSubtotal(NfeComplementProductSubtotal value) { put("subtotal", value == null ? null : value.toJson()); return this; }
 public NfeComplementProductSubtotalTributavel getSubtotalTributavel() { return (field("subtotal_tributavel")).isNull() || (field("subtotal_tributavel")).isMissingNode() ? null : new NfeComplementProductSubtotalTributavel(field("subtotal_tributavel")); }
 public NfeComplementProduct setSubtotalTributavel(NfeComplementProductSubtotalTributavel value) { put("subtotal_tributavel", value == null ? null : value.toJson()); return this; }
 public NfeComplementProductTotal getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new NfeComplementProductTotal(field("total")); }
 public NfeComplementProduct setTotal(NfeComplementProductTotal value) { put("total", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIndValorTotal() { return integerValue(field("ind_valor_total")); }
 public NfeComplementProduct setIndValorTotal(java.math.BigInteger value) { put("ind_valor_total", Json.scalar(value)); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public NfeComplementProduct setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public G069 getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new G069(field("impostos")); }
 public NfeComplementProduct setImpostos(G069 value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public G015 getDfeReferenciado() { return (field("dfe_referenciado")).isNull() || (field("dfe_referenciado")).isMissingNode() ? null : new G015(field("dfe_referenciado")); }
 public NfeComplementProduct setDfeReferenciado(G015 value) { put("dfe_referenciado", value == null ? null : value.toJson()); return this; }
 public String getCest() { return stringValue(field("cest")); }
 public NfeComplementProduct setCest(String value) { put("cest", Json.scalar(value)); return this; }
 public String getBeneficioFiscal() { return stringValue(field("beneficio_fiscal")); }
 public NfeComplementProduct setBeneficioFiscal(String value) { put("beneficio_fiscal", Json.scalar(value)); return this; }
 public String getInformacoesAdicionais() { return stringValue(field("informacoes_adicionais")); }
 public NfeComplementProduct setInformacoesAdicionais(String value) { put("informacoes_adicionais", Json.scalar(value)); return this; }
 public String getIndEscala() { return stringValue(field("ind_escala")); }
 public NfeComplementProduct setIndEscala(String value) { put("ind_escala", Json.scalar(value)); return this; }
 public String getCnpjFabricante() { return stringValue(field("cnpj_fabricante")); }
 public NfeComplementProduct setCnpjFabricante(String value) { put("cnpj_fabricante", Json.scalar(value)); return this; }
 public String getGtin() { return stringValue(field("gtin")); }
 public NfeComplementProduct setGtin(String value) { put("gtin", Json.scalar(value)); return this; }
 public String getGtinTributavel() { return stringValue(field("gtin_tributavel")); }
 public NfeComplementProduct setGtinTributavel(String value) { put("gtin_tributavel", Json.scalar(value)); return this; }
 public String getCodBarras() { return stringValue(field("cod_barras")); }
 public NfeComplementProduct setCodBarras(String value) { put("cod_barras", Json.scalar(value)); return this; }
 public String getCodBarrasTributavel() { return stringValue(field("cod_barras_tributavel")); }
 public NfeComplementProduct setCodBarrasTributavel(String value) { put("cod_barras_tributavel", Json.scalar(value)); return this; }
 public String getNve() { return stringValue(field("nve")); }
 public NfeComplementProduct setNve(String value) { put("nve", Json.scalar(value)); return this; }
 public String getNrecopi() { return stringValue(field("nrecopi")); }
 public NfeComplementProduct setNrecopi(String value) { put("nrecopi", Json.scalar(value)); return this; }
 public Boolean getAtivoPermanente() { return booleanValue(field("ativo_permanente")); }
 public NfeComplementProduct setAtivoPermanente(Boolean value) { put("ativo_permanente", Json.scalar(value)); return this; }
 public NfeComplementProductVeiculoUsado getVeiculoUsado() { return (field("veiculo_usado")).isNull() || (field("veiculo_usado")).isMissingNode() ? null : new NfeComplementProductVeiculoUsado(field("veiculo_usado")); }
 public NfeComplementProduct setVeiculoUsado(NfeComplementProductVeiculoUsado value) { put("veiculo_usado", value == null ? null : value.toJson()); return this; }
 public String getExIpi() { return stringValue(field("ex_ipi")); }
 public NfeComplementProduct setExIpi(String value) { put("ex_ipi", Json.scalar(value)); return this; }
 public G016 getCombustiveis() { return (field("combustiveis")).isNull() || (field("combustiveis")).isMissingNode() ? null : new G016(field("combustiveis")); }
 public NfeComplementProduct setCombustiveis(G016 value) { put("combustiveis", value == null ? null : value.toJson()); return this; }
 public G018 getMedicamento() { return (field("medicamento")).isNull() || (field("medicamento")).isMissingNode() ? null : new G018(field("medicamento")); }
 public NfeComplementProduct setMedicamento(G018 value) { put("medicamento", value == null ? null : value.toJson()); return this; }
 public G019 getArmamentos() { return (field("armamentos")).isNull() || (field("armamentos")).isMissingNode() ? null : new G019(field("armamentos")); }
 public NfeComplementProduct setArmamentos(G019 value) { put("armamentos", value == null ? null : value.toJson()); return this; }
 public G020 getVeiculosNovos() { return (field("veiculos_novos")).isNull() || (field("veiculos_novos")).isMissingNode() ? null : new G020(field("veiculos_novos")); }
 public NfeComplementProduct setVeiculosNovos(G020 value) { put("veiculos_novos", value == null ? null : value.toJson()); return this; }
 public java.util.List<G014> getRastro() { return list(field("rastro"), v -> (v).isNull() || (v).isMissingNode() ? null : new G014(v)); }
 public NfeComplementProduct setRastro(java.util.List<G014> value) { put("rastro", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public NfeComplementProduct setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfeComplementProduct setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
}
