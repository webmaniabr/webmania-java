package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCte extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "cfop", "data_emissao", "documentos_fiscais", "servico", "remetente", "valor", "finalidade", "impostos", "expedidor", "natureza_operacao", "uf_termino_prestacao", "uf_inicio_prestacao", "tomador", "recebedor", "modalidade", "emitente", "indicador_tomador", "destinatario", "chave", "empresa_uuid", "docs", "modelo", "uuid", "serie", "categoria", "numero", "data_captura", "fornecedor", "relacao_empresa");
 public MonitorDocumentCte() { super(FIELDS); }
 public MonitorDocumentCte(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorDocumentCte setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public java.util.List<String> getCfop() { return list(field("cfop"), v -> stringValue(v)); }
 public MonitorDocumentCte setCfop(java.util.List<String> value) { put("cfop", array(value, v -> Json.scalar(v))); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentCte setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public java.util.List<MonitorDocumentCteDocumentosFiscaisItem> getDocumentosFiscais() { return list(field("documentos_fiscais"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentCteDocumentosFiscaisItem(v)); }
 public MonitorDocumentCte setDocumentosFiscais(java.util.List<MonitorDocumentCteDocumentosFiscaisItem> value) { put("documentos_fiscais", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentCteServico getServico() { return (field("servico")).isNull() || (field("servico")).isMissingNode() ? null : new MonitorDocumentCteServico(field("servico")); }
 public MonitorDocumentCte setServico(MonitorDocumentCteServico value) { put("servico", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteRemetente getRemetente() { return (field("remetente")).isNull() || (field("remetente")).isMissingNode() ? null : new MonitorDocumentCteRemetente(field("remetente")); }
 public MonitorDocumentCte setRemetente(MonitorDocumentCteRemetente value) { put("remetente", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorDocumentCteValor(field("valor")); }
 public MonitorDocumentCte setValor(MonitorDocumentCteValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getFinalidade() { return decimalValue(field("finalidade")); }
 public MonitorDocumentCte setFinalidade(java.math.BigDecimal value) { put("finalidade", Json.scalar(value)); return this; }
 public MonitorDocumentCteImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new MonitorDocumentCteImpostos(field("impostos")); }
 public MonitorDocumentCte setImpostos(MonitorDocumentCteImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteExpedidor getExpedidor() { return (field("expedidor")).isNull() || (field("expedidor")).isMissingNode() ? null : new MonitorDocumentCteExpedidor(field("expedidor")); }
 public MonitorDocumentCte setExpedidor(MonitorDocumentCteExpedidor value) { put("expedidor", value == null ? null : value.toJson()); return this; }
 public String getNaturezaOperacao() { return stringValue(field("natureza_operacao")); }
 public MonitorDocumentCte setNaturezaOperacao(String value) { put("natureza_operacao", Json.scalar(value)); return this; }
 public String getUfTerminoPrestacao() { return stringValue(field("uf_termino_prestacao")); }
 public MonitorDocumentCte setUfTerminoPrestacao(String value) { put("uf_termino_prestacao", Json.scalar(value)); return this; }
 public String getUfInicioPrestacao() { return stringValue(field("uf_inicio_prestacao")); }
 public MonitorDocumentCte setUfInicioPrestacao(String value) { put("uf_inicio_prestacao", Json.scalar(value)); return this; }
 public MonitorDocumentCteTomador getTomador() { return (field("tomador")).isNull() || (field("tomador")).isMissingNode() ? null : new MonitorDocumentCteTomador(field("tomador")); }
 public MonitorDocumentCte setTomador(MonitorDocumentCteTomador value) { put("tomador", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteRecebedor getRecebedor() { return (field("recebedor")).isNull() || (field("recebedor")).isMissingNode() ? null : new MonitorDocumentCteRecebedor(field("recebedor")); }
 public MonitorDocumentCte setRecebedor(MonitorDocumentCteRecebedor value) { put("recebedor", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getModalidade() { return decimalValue(field("modalidade")); }
 public MonitorDocumentCte setModalidade(java.math.BigDecimal value) { put("modalidade", Json.scalar(value)); return this; }
 public MonitorDocumentCteEmitente getEmitente() { return (field("emitente")).isNull() || (field("emitente")).isMissingNode() ? null : new MonitorDocumentCteEmitente(field("emitente")); }
 public MonitorDocumentCte setEmitente(MonitorDocumentCteEmitente value) { put("emitente", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteIndicadorTomador getIndicadorTomador() { return (field("indicador_tomador")).isNull() || (field("indicador_tomador")).isMissingNode() ? null : new MonitorDocumentCteIndicadorTomador(field("indicador_tomador")); }
 public MonitorDocumentCte setIndicadorTomador(MonitorDocumentCteIndicadorTomador value) { put("indicador_tomador", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteDestinatario getDestinatario() { return (field("destinatario")).isNull() || (field("destinatario")).isMissingNode() ? null : new MonitorDocumentCteDestinatario(field("destinatario")); }
 public MonitorDocumentCte setDestinatario(MonitorDocumentCteDestinatario value) { put("destinatario", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentCte setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorDocumentCte setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public MonitorDocumentCteDocs getDocs() { return (field("docs")).isNull() || (field("docs")).isMissingNode() ? null : new MonitorDocumentCteDocs(field("docs")); }
 public MonitorDocumentCte setDocs(MonitorDocumentCteDocs value) { put("docs", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorDocumentCte setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorDocumentCte setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public MonitorDocumentCteSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorDocumentCteSerie(field("serie")); }
 public MonitorDocumentCte setSerie(MonitorDocumentCteSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getCategoria() { return stringValue(field("categoria")); }
 public MonitorDocumentCte setCategoria(String value) { put("categoria", Json.scalar(value)); return this; }
 public MonitorDocumentCteNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentCteNumero(field("numero")); }
 public MonitorDocumentCte setNumero(MonitorDocumentCteNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getDataCaptura() { return stringValue(field("data_captura")); }
 public MonitorDocumentCte setDataCaptura(String value) { put("data_captura", Json.scalar(value)); return this; }
 public MonitorDocumentCteFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new MonitorDocumentCteFornecedor(field("fornecedor")); }
 public MonitorDocumentCte setFornecedor(MonitorDocumentCteFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
 public String getRelacaoEmpresa() { return stringValue(field("relacao_empresa")); }
 public MonitorDocumentCte setRelacaoEmpresa(String value) { put("relacao_empresa", Json.scalar(value)); return this; }
}
