package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeProduct extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "item", "nome", "codigo", "ncm", "quantidade", "quantidade_tributavel", "unidade", "unidade_tributavel", "peso", "origem", "desconto", "subtotal", "subtotal_tributavel", "total", "ind_valor_total", "classe_imposto", "impostos", "dfe_referenciado", "cest", "beneficio_fiscal", "informacoes_adicionais", "ind_escala", "cnpj_fabricante", "gtin", "gtin_tributavel", "cod_barras", "cod_barras_tributavel", "nve", "nrecopi", "ativo_permanente", "veiculo_usado", "ex_ipi", "combustiveis", "medicamento", "armamentos", "veiculos_novos", "rastro", "drawback", "reg_exportacao", "nfe_exportacao", "qtd_exportacao", "ndoc_importacao", "ddoc_importacao", "local_desembaraco", "uf_desembaraco", "data_desembaraco", "via_transporte", "intermediacao", "adicao", "seq_adicao", "fabricante", "desc_di", "afrmm", "cnpj_terceiro", "cpf_terceiro", "uf_terceiro", "cod_exportador", "nfci");
 public NfeProduct() { super(FIELDS); }
 public NfeProduct(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getID() { return integerValue(field("ID")); }
 public NfeProduct setID(java.math.BigInteger value) { put("ID", Json.scalar(value)); return this; }
 public java.math.BigInteger getItem() { return integerValue(field("item")); }
 public NfeProduct setItem(java.math.BigInteger value) { put("item", Json.scalar(value)); return this; }
 public String getNome() { return stringValue(field("nome")); }
 public NfeProduct setNome(String value) { put("nome", Json.scalar(value)); return this; }
 public String getCodigo() { return stringValue(field("codigo")); }
 public NfeProduct setCodigo(String value) { put("codigo", Json.scalar(value)); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public NfeProduct setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public NfeProductQuantidade getQuantidade() { return (field("quantidade")).isNull() || (field("quantidade")).isMissingNode() ? null : new NfeProductQuantidade(field("quantidade")); }
 public NfeProduct setQuantidade(NfeProductQuantidade value) { put("quantidade", value == null ? null : value.toJson()); return this; }
 public NfeProductQuantidadeTributavel getQuantidadeTributavel() { return (field("quantidade_tributavel")).isNull() || (field("quantidade_tributavel")).isMissingNode() ? null : new NfeProductQuantidadeTributavel(field("quantidade_tributavel")); }
 public NfeProduct setQuantidadeTributavel(NfeProductQuantidadeTributavel value) { put("quantidade_tributavel", value == null ? null : value.toJson()); return this; }
 public String getUnidade() { return stringValue(field("unidade")); }
 public NfeProduct setUnidade(String value) { put("unidade", Json.scalar(value)); return this; }
 public String getUnidadeTributavel() { return stringValue(field("unidade_tributavel")); }
 public NfeProduct setUnidadeTributavel(String value) { put("unidade_tributavel", Json.scalar(value)); return this; }
 public NfeProductPeso getPeso() { return (field("peso")).isNull() || (field("peso")).isMissingNode() ? null : new NfeProductPeso(field("peso")); }
 public NfeProduct setPeso(NfeProductPeso value) { put("peso", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getOrigem() { return integerValue(field("origem")); }
 public NfeProduct setOrigem(java.math.BigInteger value) { put("origem", Json.scalar(value)); return this; }
 public NfeProductDesconto getDesconto() { return (field("desconto")).isNull() || (field("desconto")).isMissingNode() ? null : new NfeProductDesconto(field("desconto")); }
 public NfeProduct setDesconto(NfeProductDesconto value) { put("desconto", value == null ? null : value.toJson()); return this; }
 public NfeProductSubtotal getSubtotal() { return (field("subtotal")).isNull() || (field("subtotal")).isMissingNode() ? null : new NfeProductSubtotal(field("subtotal")); }
 public NfeProduct setSubtotal(NfeProductSubtotal value) { put("subtotal", value == null ? null : value.toJson()); return this; }
 public NfeProductSubtotalTributavel getSubtotalTributavel() { return (field("subtotal_tributavel")).isNull() || (field("subtotal_tributavel")).isMissingNode() ? null : new NfeProductSubtotalTributavel(field("subtotal_tributavel")); }
 public NfeProduct setSubtotalTributavel(NfeProductSubtotalTributavel value) { put("subtotal_tributavel", value == null ? null : value.toJson()); return this; }
 public NfeProductTotal getTotal() { return (field("total")).isNull() || (field("total")).isMissingNode() ? null : new NfeProductTotal(field("total")); }
 public NfeProduct setTotal(NfeProductTotal value) { put("total", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getIndValorTotal() { return integerValue(field("ind_valor_total")); }
 public NfeProduct setIndValorTotal(java.math.BigInteger value) { put("ind_valor_total", Json.scalar(value)); return this; }
 public String getClasseImposto() { return stringValue(field("classe_imposto")); }
 public NfeProduct setClasseImposto(String value) { put("classe_imposto", Json.scalar(value)); return this; }
 public G069 getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new G069(field("impostos")); }
 public NfeProduct setImpostos(G069 value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public G015 getDfeReferenciado() { return (field("dfe_referenciado")).isNull() || (field("dfe_referenciado")).isMissingNode() ? null : new G015(field("dfe_referenciado")); }
 public NfeProduct setDfeReferenciado(G015 value) { put("dfe_referenciado", value == null ? null : value.toJson()); return this; }
 public String getCest() { return stringValue(field("cest")); }
 public NfeProduct setCest(String value) { put("cest", Json.scalar(value)); return this; }
 public String getBeneficioFiscal() { return stringValue(field("beneficio_fiscal")); }
 public NfeProduct setBeneficioFiscal(String value) { put("beneficio_fiscal", Json.scalar(value)); return this; }
 public String getInformacoesAdicionais() { return stringValue(field("informacoes_adicionais")); }
 public NfeProduct setInformacoesAdicionais(String value) { put("informacoes_adicionais", Json.scalar(value)); return this; }
 public String getIndEscala() { return stringValue(field("ind_escala")); }
 public NfeProduct setIndEscala(String value) { put("ind_escala", Json.scalar(value)); return this; }
 public String getCnpjFabricante() { return stringValue(field("cnpj_fabricante")); }
 public NfeProduct setCnpjFabricante(String value) { put("cnpj_fabricante", Json.scalar(value)); return this; }
 public String getGtin() { return stringValue(field("gtin")); }
 public NfeProduct setGtin(String value) { put("gtin", Json.scalar(value)); return this; }
 public String getGtinTributavel() { return stringValue(field("gtin_tributavel")); }
 public NfeProduct setGtinTributavel(String value) { put("gtin_tributavel", Json.scalar(value)); return this; }
 public String getCodBarras() { return stringValue(field("cod_barras")); }
 public NfeProduct setCodBarras(String value) { put("cod_barras", Json.scalar(value)); return this; }
 public String getCodBarrasTributavel() { return stringValue(field("cod_barras_tributavel")); }
 public NfeProduct setCodBarrasTributavel(String value) { put("cod_barras_tributavel", Json.scalar(value)); return this; }
 public String getNve() { return stringValue(field("nve")); }
 public NfeProduct setNve(String value) { put("nve", Json.scalar(value)); return this; }
 public String getNrecopi() { return stringValue(field("nrecopi")); }
 public NfeProduct setNrecopi(String value) { put("nrecopi", Json.scalar(value)); return this; }
 public Boolean getAtivoPermanente() { return booleanValue(field("ativo_permanente")); }
 public NfeProduct setAtivoPermanente(Boolean value) { put("ativo_permanente", Json.scalar(value)); return this; }
 public NfeProductVeiculoUsado getVeiculoUsado() { return (field("veiculo_usado")).isNull() || (field("veiculo_usado")).isMissingNode() ? null : new NfeProductVeiculoUsado(field("veiculo_usado")); }
 public NfeProduct setVeiculoUsado(NfeProductVeiculoUsado value) { put("veiculo_usado", value == null ? null : value.toJson()); return this; }
 public String getExIpi() { return stringValue(field("ex_ipi")); }
 public NfeProduct setExIpi(String value) { put("ex_ipi", Json.scalar(value)); return this; }
 public G016 getCombustiveis() { return (field("combustiveis")).isNull() || (field("combustiveis")).isMissingNode() ? null : new G016(field("combustiveis")); }
 public NfeProduct setCombustiveis(G016 value) { put("combustiveis", value == null ? null : value.toJson()); return this; }
 public G018 getMedicamento() { return (field("medicamento")).isNull() || (field("medicamento")).isMissingNode() ? null : new G018(field("medicamento")); }
 public NfeProduct setMedicamento(G018 value) { put("medicamento", value == null ? null : value.toJson()); return this; }
 public G019 getArmamentos() { return (field("armamentos")).isNull() || (field("armamentos")).isMissingNode() ? null : new G019(field("armamentos")); }
 public NfeProduct setArmamentos(G019 value) { put("armamentos", value == null ? null : value.toJson()); return this; }
 public G020 getVeiculosNovos() { return (field("veiculos_novos")).isNull() || (field("veiculos_novos")).isMissingNode() ? null : new G020(field("veiculos_novos")); }
 public NfeProduct setVeiculosNovos(G020 value) { put("veiculos_novos", value == null ? null : value.toJson()); return this; }
 public java.util.List<G014> getRastro() { return list(field("rastro"), v -> (v).isNull() || (v).isMissingNode() ? null : new G014(v)); }
 public NfeProduct setRastro(java.util.List<G014> value) { put("rastro", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getDrawback() { return stringValue(field("drawback")); }
 public NfeProduct setDrawback(String value) { put("drawback", Json.scalar(value)); return this; }
 public String getRegExportacao() { return stringValue(field("reg_exportacao")); }
 public NfeProduct setRegExportacao(String value) { put("reg_exportacao", Json.scalar(value)); return this; }
 public String getNfeExportacao() { return stringValue(field("nfe_exportacao")); }
 public NfeProduct setNfeExportacao(String value) { put("nfe_exportacao", Json.scalar(value)); return this; }
 public NfeProductQtdExportacao getQtdExportacao() { return (field("qtd_exportacao")).isNull() || (field("qtd_exportacao")).isMissingNode() ? null : new NfeProductQtdExportacao(field("qtd_exportacao")); }
 public NfeProduct setQtdExportacao(NfeProductQtdExportacao value) { put("qtd_exportacao", value == null ? null : value.toJson()); return this; }
 public String getNdocImportacao() { return stringValue(field("ndoc_importacao")); }
 public NfeProduct setNdocImportacao(String value) { put("ndoc_importacao", Json.scalar(value)); return this; }
 public String getDdocImportacao() { return stringValue(field("ddoc_importacao")); }
 public NfeProduct setDdocImportacao(String value) { put("ddoc_importacao", Json.scalar(value)); return this; }
 public String getLocalDesembaraco() { return stringValue(field("local_desembaraco")); }
 public NfeProduct setLocalDesembaraco(String value) { put("local_desembaraco", Json.scalar(value)); return this; }
 public String getUfDesembaraco() { return stringValue(field("uf_desembaraco")); }
 public NfeProduct setUfDesembaraco(String value) { put("uf_desembaraco", Json.scalar(value)); return this; }
 public String getDataDesembaraco() { return stringValue(field("data_desembaraco")); }
 public NfeProduct setDataDesembaraco(String value) { put("data_desembaraco", Json.scalar(value)); return this; }
 public String getViaTransporte() { return stringValue(field("via_transporte")); }
 public NfeProduct setViaTransporte(String value) { put("via_transporte", Json.scalar(value)); return this; }
 public String getIntermediacao() { return stringValue(field("intermediacao")); }
 public NfeProduct setIntermediacao(String value) { put("intermediacao", Json.scalar(value)); return this; }
 public String getAdicao() { return stringValue(field("adicao")); }
 public NfeProduct setAdicao(String value) { put("adicao", Json.scalar(value)); return this; }
 public String getSeqAdicao() { return stringValue(field("seq_adicao")); }
 public NfeProduct setSeqAdicao(String value) { put("seq_adicao", Json.scalar(value)); return this; }
 public String getFabricante() { return stringValue(field("fabricante")); }
 public NfeProduct setFabricante(String value) { put("fabricante", Json.scalar(value)); return this; }
 public NfeProductDescDi getDescDi() { return (field("desc_di")).isNull() || (field("desc_di")).isMissingNode() ? null : new NfeProductDescDi(field("desc_di")); }
 public NfeProduct setDescDi(NfeProductDescDi value) { put("desc_di", value == null ? null : value.toJson()); return this; }
 public NfeProductAfrmm getAfrmm() { return (field("afrmm")).isNull() || (field("afrmm")).isMissingNode() ? null : new NfeProductAfrmm(field("afrmm")); }
 public NfeProduct setAfrmm(NfeProductAfrmm value) { put("afrmm", value == null ? null : value.toJson()); return this; }
 public String getCnpjTerceiro() { return stringValue(field("cnpj_terceiro")); }
 public NfeProduct setCnpjTerceiro(String value) { put("cnpj_terceiro", Json.scalar(value)); return this; }
 public String getCpfTerceiro() { return stringValue(field("cpf_terceiro")); }
 public NfeProduct setCpfTerceiro(String value) { put("cpf_terceiro", Json.scalar(value)); return this; }
 public String getUfTerceiro() { return stringValue(field("uf_terceiro")); }
 public NfeProduct setUfTerceiro(String value) { put("uf_terceiro", Json.scalar(value)); return this; }
 public String getCodExportador() { return stringValue(field("cod_exportador")); }
 public NfeProduct setCodExportador(String value) { put("cod_exportador", Json.scalar(value)); return this; }
 public String getNfci() { return stringValue(field("nfci")); }
 public NfeProduct setNfci(String value) { put("nfci", Json.scalar(value)); return this; }
}
