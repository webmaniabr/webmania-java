package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfe extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "cfop", "data_emissao", "totais_issqn", "produtos", "valor", "protocolo", "finalidade", "totais", "fatura", "operacao", "pedido", "natureza_operacao", "responsavel_tecnico", "emitente", "transporte", "chave", "empresa_uuid", "docs", "modelo", "cliente", "uuid", "serie", "categoria", "numero", "parcelas", "data_captura", "fornecedor", "qtd_produtos", "manifestacao", "totais_ibs_cbs");
 public MonitorDocumentNfe() { super(FIELDS); }
 public MonitorDocumentNfe(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorDocumentNfe setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.util.List<String> getCfop() { return list(field("cfop"), v -> stringValue(v)); }
 public MonitorDocumentNfe setCfop(java.util.List<String> value) { put("cfop", array(value, v -> Json.scalar(v))); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentNfe setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public MonitorDocumentNfeTotaisIssqn getTotaisIssqn() { return (field("totais_issqn")).isNull() || (field("totais_issqn")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIssqn(field("totais_issqn")); }
 public MonitorDocumentNfe setTotaisIssqn(MonitorDocumentNfeTotaisIssqn value) { put("totais_issqn", value == null ? null : value.toJson()); return this; }
 public java.util.List<MonitorDocumentNfeProdutosItem> getProdutos() { return list(field("produtos"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentNfeProdutosItem(v)); }
 public MonitorDocumentNfe setProdutos(java.util.List<MonitorDocumentNfeProdutosItem> value) { put("produtos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentNfeValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorDocumentNfeValor(field("valor")); }
 public MonitorDocumentNfe setValor(MonitorDocumentNfeValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeProtocolo getProtocolo() { return (field("protocolo")).isNull() || (field("protocolo")).isMissingNode() ? null : new MonitorDocumentNfeProtocolo(field("protocolo")); }
 public MonitorDocumentNfe setProtocolo(MonitorDocumentNfeProtocolo value) { put("protocolo", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getFinalidade() { return decimalValue(field("finalidade")); }
 public MonitorDocumentNfe setFinalidade(java.math.BigDecimal value) { put("finalidade", Json.scalar(value)); return this; }
 public MonitorDocumentNfeTotais getTotais() { return (field("totais")).isNull() || (field("totais")).isMissingNode() ? null : new MonitorDocumentNfeTotais(field("totais")); }
 public MonitorDocumentNfe setTotais(MonitorDocumentNfeTotais value) { put("totais", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeFatura getFatura() { return (field("fatura")).isNull() || (field("fatura")).isMissingNode() ? null : new MonitorDocumentNfeFatura(field("fatura")); }
 public MonitorDocumentNfe setFatura(MonitorDocumentNfeFatura value) { put("fatura", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getOperacao() { return decimalValue(field("operacao")); }
 public MonitorDocumentNfe setOperacao(java.math.BigDecimal value) { put("operacao", Json.scalar(value)); return this; }
 public MonitorDocumentNfePedido getPedido() { return (field("pedido")).isNull() || (field("pedido")).isMissingNode() ? null : new MonitorDocumentNfePedido(field("pedido")); }
 public MonitorDocumentNfe setPedido(MonitorDocumentNfePedido value) { put("pedido", value == null ? null : value.toJson()); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public MonitorDocumentNfe setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public MonitorDocumentNfeResponsavelTecnico getResponsavelTecnico() { return (field("responsavel_tecnico")).isNull() || (field("responsavel_tecnico")).isMissingNode() ? null : new MonitorDocumentNfeResponsavelTecnico(field("responsavel_tecnico")); }
 public MonitorDocumentNfe setResponsavelTecnico(MonitorDocumentNfeResponsavelTecnico value) { put("responsavel_tecnico", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeEmitente getEmitente() { return (field("emitente")).isNull() || (field("emitente")).isMissingNode() ? null : new MonitorDocumentNfeEmitente(field("emitente")); }
 public MonitorDocumentNfe setEmitente(MonitorDocumentNfeEmitente value) { put("emitente", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeTransporte getTransporte() { return (field("transporte")).isNull() || (field("transporte")).isMissingNode() ? null : new MonitorDocumentNfeTransporte(field("transporte")); }
 public MonitorDocumentNfe setTransporte(MonitorDocumentNfeTransporte value) { put("transporte", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentNfe setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorDocumentNfe setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public MonitorDocumentNfeDocs getDocs() { return (field("docs")).isNull() || (field("docs")).isMissingNode() ? null : new MonitorDocumentNfeDocs(field("docs")); }
 public MonitorDocumentNfe setDocs(MonitorDocumentNfeDocs value) { put("docs", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorDocumentNfe setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public MonitorDocumentNfeCliente getCliente() { return (field("cliente")).isNull() || (field("cliente")).isMissingNode() ? null : new MonitorDocumentNfeCliente(field("cliente")); }
 public MonitorDocumentNfe setCliente(MonitorDocumentNfeCliente value) { put("cliente", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorDocumentNfe setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public MonitorDocumentNfeSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorDocumentNfeSerie(field("serie")); }
 public MonitorDocumentNfe setSerie(MonitorDocumentNfeSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getCategoria() { return stringValue(field("categoria")); }
 public MonitorDocumentNfe setCategoria(String value) { put("categoria", Json.scalar(value)); return this; }
 public MonitorDocumentNfeNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentNfeNumero(field("numero")); }
 public MonitorDocumentNfe setNumero(MonitorDocumentNfeNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public java.util.List<MonitorDocumentNfeParcelasItem> getParcelas() { return list(field("parcelas"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentNfeParcelasItem(v)); }
 public MonitorDocumentNfe setParcelas(java.util.List<MonitorDocumentNfeParcelasItem> value) { put("parcelas", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getDataCaptura() { return stringValue(field("data_captura")); }
 public MonitorDocumentNfe setDataCaptura(String value) { put("data_captura", Json.scalar(value)); return this; }
 public MonitorDocumentNfeFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new MonitorDocumentNfeFornecedor(field("fornecedor")); }
 public MonitorDocumentNfe setFornecedor(MonitorDocumentNfeFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getQtdProdutos() { return integerValue(field("qtd_produtos")); }
 public MonitorDocumentNfe setQtdProdutos(java.math.BigInteger value) { put("qtd_produtos", Json.scalar(value)); return this; }
 public MonitorManifestationState getManifestacao() { return (field("manifestacao")).isNull() || (field("manifestacao")).isMissingNode() ? null : new MonitorManifestationState(field("manifestacao")); }
 public MonitorDocumentNfe setManifestacao(MonitorManifestationState value) { put("manifestacao", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeTotaisIbsCbs getTotaisIbsCbs() { return (field("totais_ibs_cbs")).isNull() || (field("totais_ibs_cbs")).isMissingNode() ? null : new MonitorDocumentNfeTotaisIbsCbs(field("totais_ibs_cbs")); }
 public MonitorDocumentNfe setTotaisIbsCbs(MonitorDocumentNfeTotaisIbsCbs value) { put("totais_ibs_cbs", value == null ? null : value.toJson()); return this; }
}
