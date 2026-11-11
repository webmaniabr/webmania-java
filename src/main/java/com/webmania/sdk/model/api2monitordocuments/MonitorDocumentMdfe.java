package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfe extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "data_emissao", "uf_carregamento", "carregamento", "valor", "seguro", "quantidade_mdfe", "percurso", "quantidade_nfe", "descarregamento", "ferroviario", "produto_predominante", "aquaviario", "modalidade", "rodoviario", "emitente", "chave", "peso_bruto", "empresa_uuid", "docs", "modelo", "uuid", "serie", "categoria", "numero", "uf_descarregamento", "aereo", "quantidade_cte", "data_captura", "fornecedor");
 public MonitorDocumentMdfe() { super(FIELDS); }
 public MonitorDocumentMdfe(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorDocumentMdfe setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentMdfe setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getUfCarregamento() { return stringValue(field("uf_carregamento")); }
 public MonitorDocumentMdfe setUfCarregamento(String value) { put("uf_carregamento", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentMdfeCarregamentoItem> getCarregamento() { return list(field("carregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeCarregamentoItem(v)); }
 public MonitorDocumentMdfe setCarregamento(java.util.List<MonitorDocumentMdfeCarregamentoItem> value) { put("carregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentMdfeValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorDocumentMdfeValor(field("valor")); }
 public MonitorDocumentMdfe setValor(MonitorDocumentMdfeValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public java.util.List<MonitorDocumentMdfeSeguroItem> getSeguro() { return list(field("seguro"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeSeguroItem(v)); }
 public MonitorDocumentMdfe setSeguro(java.util.List<MonitorDocumentMdfeSeguroItem> value) { put("seguro", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigDecimal getQuantidadeMdfe() { return decimalValue(field("quantidade_mdfe")); }
 public MonitorDocumentMdfe setQuantidadeMdfe(java.math.BigDecimal value) { put("quantidade_mdfe", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentMdfePercursoItem> getPercurso() { return list(field("percurso"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfePercursoItem(v)); }
 public MonitorDocumentMdfe setPercurso(java.util.List<MonitorDocumentMdfePercursoItem> value) { put("percurso", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigDecimal getQuantidadeNfe() { return decimalValue(field("quantidade_nfe")); }
 public MonitorDocumentMdfe setQuantidadeNfe(java.math.BigDecimal value) { put("quantidade_nfe", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentMdfeDescarregamentoItem> getDescarregamento() { return list(field("descarregamento"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeDescarregamentoItem(v)); }
 public MonitorDocumentMdfe setDescarregamento(java.util.List<MonitorDocumentMdfeDescarregamentoItem> value) { put("descarregamento", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentMdfeFerroviario getFerroviario() { return (field("ferroviario")).isNull() || (field("ferroviario")).isMissingNode() ? null : new MonitorDocumentMdfeFerroviario(field("ferroviario")); }
 public MonitorDocumentMdfe setFerroviario(MonitorDocumentMdfeFerroviario value) { put("ferroviario", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeProdutoPredominante getProdutoPredominante() { return (field("produto_predominante")).isNull() || (field("produto_predominante")).isMissingNode() ? null : new MonitorDocumentMdfeProdutoPredominante(field("produto_predominante")); }
 public MonitorDocumentMdfe setProdutoPredominante(MonitorDocumentMdfeProdutoPredominante value) { put("produto_predominante", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeAquaviario getAquaviario() { return (field("aquaviario")).isNull() || (field("aquaviario")).isMissingNode() ? null : new MonitorDocumentMdfeAquaviario(field("aquaviario")); }
 public MonitorDocumentMdfe setAquaviario(MonitorDocumentMdfeAquaviario value) { put("aquaviario", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getModalidade() { return decimalValue(field("modalidade")); }
 public MonitorDocumentMdfe setModalidade(java.math.BigDecimal value) { put("modalidade", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeRodoviario getRodoviario() { return (field("rodoviario")).isNull() || (field("rodoviario")).isMissingNode() ? null : new MonitorDocumentMdfeRodoviario(field("rodoviario")); }
 public MonitorDocumentMdfe setRodoviario(MonitorDocumentMdfeRodoviario value) { put("rodoviario", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeEmitente getEmitente() { return (field("emitente")).isNull() || (field("emitente")).isMissingNode() ? null : new MonitorDocumentMdfeEmitente(field("emitente")); }
 public MonitorDocumentMdfe setEmitente(MonitorDocumentMdfeEmitente value) { put("emitente", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentMdfe setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPesoBruto() { return decimalValue(field("peso_bruto")); }
 public MonitorDocumentMdfe setPesoBruto(java.math.BigDecimal value) { put("peso_bruto", Json.scalar(value)); return this; }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorDocumentMdfe setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeDocs getDocs() { return (field("docs")).isNull() || (field("docs")).isMissingNode() ? null : new MonitorDocumentMdfeDocs(field("docs")); }
 public MonitorDocumentMdfe setDocs(MonitorDocumentMdfeDocs value) { put("docs", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorDocumentMdfe setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorDocumentMdfe setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorDocumentMdfeSerie(field("serie")); }
 public MonitorDocumentMdfe setSerie(MonitorDocumentMdfeSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getCategoria() { return stringValue(field("categoria")); }
 public MonitorDocumentMdfe setCategoria(String value) { put("categoria", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentMdfeNumero(field("numero")); }
 public MonitorDocumentMdfe setNumero(MonitorDocumentMdfeNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getUfDescarregamento() { return stringValue(field("uf_descarregamento")); }
 public MonitorDocumentMdfe setUfDescarregamento(String value) { put("uf_descarregamento", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeAereo getAereo() { return (field("aereo")).isNull() || (field("aereo")).isMissingNode() ? null : new MonitorDocumentMdfeAereo(field("aereo")); }
 public MonitorDocumentMdfe setAereo(MonitorDocumentMdfeAereo value) { put("aereo", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getQuantidadeCte() { return decimalValue(field("quantidade_cte")); }
 public MonitorDocumentMdfe setQuantidadeCte(java.math.BigDecimal value) { put("quantidade_cte", Json.scalar(value)); return this; }
 public String getDataCaptura() { return stringValue(field("data_captura")); }
 public MonitorDocumentMdfe setDataCaptura(String value) { put("data_captura", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new MonitorDocumentMdfeFornecedor(field("fornecedor")); }
 public MonitorDocumentMdfe setFornecedor(MonitorDocumentMdfeFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
}
