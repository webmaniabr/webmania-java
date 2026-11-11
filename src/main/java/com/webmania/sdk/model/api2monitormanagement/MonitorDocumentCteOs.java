package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "cfop", "data_emissao", "documentos_fiscais", "servico", "valor", "finalidade", "impostos", "natureza_operacao", "uf_termino_prestacao", "uf_inicio_prestacao", "tomador", "modalidade", "emitente", "indicador_tomador", "chave", "empresa_uuid", "docs", "modelo", "uuid", "serie", "categoria", "numero", "data_captura", "fornecedor", "relacao_empresa");
 public MonitorDocumentCteOs() { super(FIELDS); }
 public MonitorDocumentCteOs(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorDocumentCteOs setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.util.List<String> getCfop() { return list(field("cfop"), v -> stringValue(v)); }
 public MonitorDocumentCteOs setCfop(java.util.List<String> value) { put("cfop", array(value, v -> Json.scalar(v))); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentCteOs setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentCteOsDocumentosFiscaisItem> getDocumentosFiscais() { return list(field("documentos_fiscais"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentCteOsDocumentosFiscaisItem(v)); }
 public MonitorDocumentCteOs setDocumentosFiscais(java.util.List<MonitorDocumentCteOsDocumentosFiscaisItem> value) { put("documentos_fiscais", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentCteOsServico getServico() { return (field("servico")).isNull() || (field("servico")).isMissingNode() ? null : new MonitorDocumentCteOsServico(field("servico")); }
 public MonitorDocumentCteOs setServico(MonitorDocumentCteOsServico value) { put("servico", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorDocumentCteOsValor(field("valor")); }
 public MonitorDocumentCteOs setValor(MonitorDocumentCteOsValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getFinalidade() { return decimalValue(field("finalidade")); }
 public MonitorDocumentCteOs setFinalidade(java.math.BigDecimal value) { put("finalidade", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new MonitorDocumentCteOsImpostos(field("impostos")); }
 public MonitorDocumentCteOs setImpostos(MonitorDocumentCteOsImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public MonitorDocumentCteOs setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public String getUfTerminoPrestacao() { return stringValue(field("uf_termino_prestacao")); }
 public MonitorDocumentCteOs setUfTerminoPrestacao(String value) { put("uf_termino_prestacao", Json.scalar(value)); return this; }
 public String getUfInicioPrestacao() { return stringValue(field("uf_inicio_prestacao")); }
 public MonitorDocumentCteOs setUfInicioPrestacao(String value) { put("uf_inicio_prestacao", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsTomador getTomador() { return (field("tomador")).isNull() || (field("tomador")).isMissingNode() ? null : new MonitorDocumentCteOsTomador(field("tomador")); }
 public MonitorDocumentCteOs setTomador(MonitorDocumentCteOsTomador value) { put("tomador", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getModalidade() { return decimalValue(field("modalidade")); }
 public MonitorDocumentCteOs setModalidade(java.math.BigDecimal value) { put("modalidade", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsEmitente getEmitente() { return (field("emitente")).isNull() || (field("emitente")).isMissingNode() ? null : new MonitorDocumentCteOsEmitente(field("emitente")); }
 public MonitorDocumentCteOs setEmitente(MonitorDocumentCteOsEmitente value) { put("emitente", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsIndicadorTomador getIndicadorTomador() { return (field("indicador_tomador")).isNull() || (field("indicador_tomador")).isMissingNode() ? null : new MonitorDocumentCteOsIndicadorTomador(field("indicador_tomador")); }
 public MonitorDocumentCteOs setIndicadorTomador(MonitorDocumentCteOsIndicadorTomador value) { put("indicador_tomador", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentCteOs setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorDocumentCteOs setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsDocs getDocs() { return (field("docs")).isNull() || (field("docs")).isMissingNode() ? null : new MonitorDocumentCteOsDocs(field("docs")); }
 public MonitorDocumentCteOs setDocs(MonitorDocumentCteOsDocs value) { put("docs", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorDocumentCteOs setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorDocumentCteOs setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorDocumentCteOsSerie(field("serie")); }
 public MonitorDocumentCteOs setSerie(MonitorDocumentCteOsSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getCategoria() { return stringValue(field("categoria")); }
 public MonitorDocumentCteOs setCategoria(String value) { put("categoria", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentCteOsNumero(field("numero")); }
 public MonitorDocumentCteOs setNumero(MonitorDocumentCteOsNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getDataCaptura() { return stringValue(field("data_captura")); }
 public MonitorDocumentCteOs setDataCaptura(String value) { put("data_captura", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new MonitorDocumentCteOsFornecedor(field("fornecedor")); }
 public MonitorDocumentCteOs setFornecedor(MonitorDocumentCteOsFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public String getRelacaoEmpresa() { return stringValue(field("relacao_empresa")); }
 public MonitorDocumentCteOs setRelacaoEmpresa(String value) { put("relacao_empresa", Json.scalar(value)); return this; }
}
