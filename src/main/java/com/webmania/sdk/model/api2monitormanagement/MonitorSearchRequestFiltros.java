package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequestFiltros extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ambiente", "empresa_uuid", "categoria", "data_inicial", "data_final", "status", "manifestacao", "chave", "numero", "serie", "valor", "codigo_verificacao", "fornecedor", "pesquisa", "relatorio", "url_notificacao", "per_page", "novos_documentos");
 public MonitorSearchRequestFiltros() { super(FIELDS); }
 public MonitorSearchRequestFiltros(JsonNode node) { super(node, FIELDS); }
 public MonitorSearchRequestFiltrosAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new MonitorSearchRequestFiltrosAmbiente(field("ambiente")); }
 public MonitorSearchRequestFiltros setAmbiente(MonitorSearchRequestFiltrosAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestFiltrosEmpresaUuid getEmpresaUuid() { return (field("empresa_uuid")).isNull() || (field("empresa_uuid")).isMissingNode() ? null : new MonitorSearchRequestFiltrosEmpresaUuid(field("empresa_uuid")); }
 public MonitorSearchRequestFiltros setEmpresaUuid(MonitorSearchRequestFiltrosEmpresaUuid value) { put("empresa_uuid", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestFiltrosCategoria getCategoria() { return (field("categoria")).isNull() || (field("categoria")).isMissingNode() ? null : new MonitorSearchRequestFiltrosCategoria(field("categoria")); }
 public MonitorSearchRequestFiltros setCategoria(MonitorSearchRequestFiltrosCategoria value) { put("categoria", value == null ? null : value.toJson()); return this; }
 public String getDataInicial() { return stringValue(field("data_inicial")); }
 public MonitorSearchRequestFiltros setDataInicial(String value) { put("data_inicial", Json.scalar(value)); return this; }
 public String getDataFinal() { return stringValue(field("data_final")); }
 public MonitorSearchRequestFiltros setDataFinal(String value) { put("data_final", Json.scalar(value)); return this; }
 public MonitorSearchRequestFiltrosStatus getStatus() { return (field("status")).isNull() || (field("status")).isMissingNode() ? null : new MonitorSearchRequestFiltrosStatus(field("status")); }
 public MonitorSearchRequestFiltros setStatus(MonitorSearchRequestFiltrosStatus value) { put("status", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestFiltrosManifestacao getManifestacao() { return (field("manifestacao")).isNull() || (field("manifestacao")).isMissingNode() ? null : new MonitorSearchRequestFiltrosManifestacao(field("manifestacao")); }
 public MonitorSearchRequestFiltros setManifestacao(MonitorSearchRequestFiltrosManifestacao value) { put("manifestacao", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorSearchRequestFiltros setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public MonitorSearchRequestFiltrosNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorSearchRequestFiltrosNumero(field("numero")); }
 public MonitorSearchRequestFiltros setNumero(MonitorSearchRequestFiltrosNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestFiltrosSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorSearchRequestFiltrosSerie(field("serie")); }
 public MonitorSearchRequestFiltros setSerie(MonitorSearchRequestFiltrosSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestFiltrosValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorSearchRequestFiltrosValor(field("valor")); }
 public MonitorSearchRequestFiltros setValor(MonitorSearchRequestFiltrosValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public MonitorSearchRequestFiltros setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getFornecedor() { return stringValue(field("fornecedor")); }
 public MonitorSearchRequestFiltros setFornecedor(String value) { put("fornecedor", Json.scalar(value)); return this; }
 public String getPesquisa() { return stringValue(field("pesquisa")); }
 public MonitorSearchRequestFiltros setPesquisa(String value) { put("pesquisa", Json.scalar(value)); return this; }
 public String getRelatorio() { return stringValue(field("relatorio")); }
 public MonitorSearchRequestFiltros setRelatorio(String value) { put("relatorio", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public MonitorSearchRequestFiltros setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorSearchRequestFiltros setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
 public Boolean getNovosDocumentos() { return booleanValue(field("novos_documentos")); }
 public MonitorSearchRequestFiltros setNovosDocumentos(Boolean value) { put("novos_documentos", Json.scalar(value)); return this; }
}
