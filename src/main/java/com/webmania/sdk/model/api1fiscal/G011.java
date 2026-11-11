package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G011 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "item", "nome", "codigo", "ncm", "quantidade", "quantidade_tributavel", "unidade", "unidade_tributavel", "peso", "origem", "desconto", "subtotal", "subtotal_tributavel", "total", "ind_valor_total", "classe_imposto", "impostos", "dfe_referenciado", "cest", "beneficio_fiscal", "informacoes_adicionais", "ind_escala", "cnpj_fabricante", "gtin", "gtin_tributavel", "cod_barras", "cod_barras_tributavel", "nve", "nrecopi", "ativo_permanente", "veiculo_usado", "ex_ipi", "combustiveis", "medicamento", "armamentos", "veiculos_novos", "rastro");
 public G011() { super(FIELDS); }
 public G011(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getID() { return integerValue(field("ID")); }
 public G011 setID(java.math.BigInteger value) { put("ID", Json.scalar(value)); return this; }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public G011 setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public G011 setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getCodigo() { return stringValue(field("codigo")); }
 public G011 setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public G011 setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public G011Quantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new G011Quantidade(field("quantidade")); }
 public G011 setQuantidade(G011Quantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public G011QuantidadeTributavel getQuantidadeTributavel() { return (field("quantidade_tributavel")).isNull() || (field("quantidade_tributavel")).isMissingNode() ? null : new G011QuantidadeTributavel(field("quantidade_tributavel")); }
 public G011 setQuantidadeTributavel(G011QuantidadeTributavel value) { put("quantidade_tributavel", value == null ? null : value.toJson()); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public G011 setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
 public String getUnidadeTributavel() { return stringValue(field("unidade_tributavel")); }
 public G011 setUnidadeTributavel(String value) { put("unidade_tributavel", Json.scalar(value)); return this; }
 public G011Peso getPeso() { return (field("peso")).isNull() || (field("peso")).isMissingNode() ? null : new G011Peso(field("peso")); }
 public G011 setPeso(G011Peso value) { put("peso", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getOrigem() { return integerValue(field("origem")); }
 public G011 setOrigem(java.math.BigInteger value) { put("origem", Json.scalar(value)); return this; }
 public G011Desconto getDesconto() { return (field("desconto")).isNull() || (field("desconto")).isMissingNode() ? null : new G011Desconto(field("desconto")); }
 public G011 setDesconto(G011Desconto value) { put("desconto", value == null ? null : value.toJson()); return this; }
 public G011Subtotal getSubtotal() { return (field("subtotal")).isNull() || (field("subtotal")).isMissingNode() ? null : new G011Subtotal(field("subtotal")); }
 public G011 setSubtotal(G011Subtotal value) { put("subtotal", value == null ? null : value.toJson()); return this; }
 public G011SubtotalTributavel getSubtotalTributavel() { return (field("subtotal_tributavel")).isNull() || (field("subtotal_tributavel")).isMissingNode() ? null : new G011SubtotalTributavel(field("subtotal_tributavel")); }
 public G011 setSubtotalTributavel(G011SubtotalTributavel value) { put("subtotal_tributavel", value == null ? null : value.toJson()); return this; }
 public G011Total getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new G011Total(field("total")); }
 public G011 setTotal(G011Total value) { put("total", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIndValorTotal() { return integerValue(field("ind_valor_total")); }
 public G011 setIndValorTotal(java.math.BigInteger value) { put("ind_valor_total", Json.scalar(value)); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public G011 setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public G069 getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new G069(field("impostos")); }
 public G011 setImpostos(G069 value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public G015 getDfeReferenciado() { return (field("dfe_referenciado")).isNull() || (field("dfe_referenciado")).isMissingNode() ? null : new G015(field("dfe_referenciado")); }
 public G011 setDfeReferenciado(G015 value) { put("dfe_referenciado", value == null ? null : value.toJson()); return this; }
 public String getCest() { return stringValue(field("cest")); }
 public G011 setCest(String value) { put("cest", Json.scalar(value)); return this; }
 public String getBeneficioFiscal() { return stringValue(field("beneficio_fiscal")); }
 public G011 setBeneficioFiscal(String value) { put("beneficio_fiscal", Json.scalar(value)); return this; }
 public String getInformacoesAdicionais() { return stringValue(field("informacoes_adicionais")); }
 public G011 setInformacoesAdicionais(String value) { put("informacoes_adicionais", Json.scalar(value)); return this; }
 public String getIndEscala() { return stringValue(field("ind_escala")); }
 public G011 setIndEscala(String value) { put("ind_escala", Json.scalar(value)); return this; }
 public String getCnpjFabricante() { return stringValue(field("cnpj_fabricante")); }
 public G011 setCnpjFabricante(String value) { put("cnpj_fabricante", Json.scalar(value)); return this; }
 public String getGtin() { return stringValue(field("gtin")); }
 public G011 setGtin(String value) { put("gtin", Json.scalar(value)); return this; }
 public String getGtinTributavel() { return stringValue(field("gtin_tributavel")); }
 public G011 setGtinTributavel(String value) { put("gtin_tributavel", Json.scalar(value)); return this; }
 public String getCodBarras() { return stringValue(field("cod_barras")); }
 public G011 setCodBarras(String value) { put("cod_barras", Json.scalar(value)); return this; }
 public String getCodBarrasTributavel() { return stringValue(field("cod_barras_tributavel")); }
 public G011 setCodBarrasTributavel(String value) { put("cod_barras_tributavel", Json.scalar(value)); return this; }
 public String getNve() { return stringValue(field("nve")); }
 public G011 setNve(String value) { put("nve", Json.scalar(value)); return this; }
 public String getNrecopi() { return stringValue(field("nrecopi")); }
 public G011 setNrecopi(String value) { put("nrecopi", Json.scalar(value)); return this; }
 public Boolean getAtivoPermanente() { return booleanValue(field("ativo_permanente")); }
 public G011 setAtivoPermanente(Boolean value) { put("ativo_permanente", Json.scalar(value)); return this; }
 public G011VeiculoUsado getVeiculoUsado() { return (field("veiculo_usado")).isNull() || (field("veiculo_usado")).isMissingNode() ? null : new G011VeiculoUsado(field("veiculo_usado")); }
 public G011 setVeiculoUsado(G011VeiculoUsado value) { put("veiculo_usado", value == null ? null : value.toJson()); return this; }
 public String getExIpi() { return stringValue(field("ex_ipi")); }
 public G011 setExIpi(String value) { put("ex_ipi", Json.scalar(value)); return this; }
 public G016 getCombustiveis() { return (field("combustiveis")).isNull() || (field("combustiveis")).isMissingNode() ? null : new G016(field("combustiveis")); }
 public G011 setCombustiveis(G016 value) { put("combustiveis", value == null ? null : value.toJson()); return this; }
 public G018 getMedicamento() { return (field("medicamento")).isNull() || (field("medicamento")).isMissingNode() ? null : new G018(field("medicamento")); }
 public G011 setMedicamento(G018 value) { put("medicamento", value == null ? null : value.toJson()); return this; }
 public G019 getArmamentos() { return (field("armamentos")).isNull() || (field("armamentos")).isMissingNode() ? null : new G019(field("armamentos")); }
 public G011 setArmamentos(G019 value) { put("armamentos", value == null ? null : value.toJson()); return this; }
 public G020 getVeiculosNovos() { return (field("veiculos_novos")).isNull() || (field("veiculos_novos")).isMissingNode() ? null : new G020(field("veiculos_novos")); }
 public G011 setVeiculosNovos(G020 value) { put("veiculos_novos", value == null ? null : value.toJson()); return this; }
 public java.util.List<G014> getRastro() { return list(field("rastro"), v -> (v).isNull() || (v).isMissingNode() ? null : new G014(v)); }
 public G011 setRastro(java.util.List<G014> value) { put("rastro", array(value, v -> v == null ? null : v.toJson())); return this; }
}
