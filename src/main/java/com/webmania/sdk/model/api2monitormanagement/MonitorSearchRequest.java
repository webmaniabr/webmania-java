package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorSearchRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("modelo", "ambiente", "empresa_uuid", "categoria", "data_inicial", "data_final", "status", "manifestacao", "chave", "numero", "serie", "valor", "codigo_verificacao", "fornecedor", "pesquisa", "finalidade", "operacao", "ncm", "cfop", "serie_rps", "numero_rps", "codigo_cnae", "codigo_servico", "modalidade", "uf_carregamento", "uf_descarregamento", "placa_veiculo", "uf_inicio_prestacao", "uf_termino_prestacao", "relatorio", "documentos", "url_notificacao", "per_page", "page", "cursor", "paginacao", "ordenar_por", "ordem", "novos_documentos", "filtros", "filtros_modelo");
 public MonitorSearchRequest() { super(FIELDS); }
 public MonitorSearchRequest(JsonNode node) { super(node, FIELDS); }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorSearchRequest setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public MonitorSearchRequestAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new MonitorSearchRequestAmbiente(field("ambiente")); }
 public MonitorSearchRequest setAmbiente(MonitorSearchRequestAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestEmpresaUuid getEmpresaUuid() { return (field("empresa_uuid")).isNull() || (field("empresa_uuid")).isMissingNode() ? null : new MonitorSearchRequestEmpresaUuid(field("empresa_uuid")); }
 public MonitorSearchRequest setEmpresaUuid(MonitorSearchRequestEmpresaUuid value) { put("empresa_uuid", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestCategoria getCategoria() { return (field("categoria")).isNull() || (field("categoria")).isMissingNode() ? null : new MonitorSearchRequestCategoria(field("categoria")); }
 public MonitorSearchRequest setCategoria(MonitorSearchRequestCategoria value) { put("categoria", value == null ? null : value.toJson()); return this; }
 public String getDataInicial() { return stringValue(field("data_inicial")); }
 public MonitorSearchRequest setDataInicial(String value) { put("data_inicial", Json.scalar(value)); return this; }
 public String getDataFinal() { return stringValue(field("data_final")); }
 public MonitorSearchRequest setDataFinal(String value) { put("data_final", Json.scalar(value)); return this; }
 public MonitorSearchRequestStatus getStatus() { return (field("status")).isNull() || (field("status")).isMissingNode() ? null : new MonitorSearchRequestStatus(field("status")); }
 public MonitorSearchRequest setStatus(MonitorSearchRequestStatus value) { put("status", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestManifestacao getManifestacao() { return (field("manifestacao")).isNull() || (field("manifestacao")).isMissingNode() ? null : new MonitorSearchRequestManifestacao(field("manifestacao")); }
 public MonitorSearchRequest setManifestacao(MonitorSearchRequestManifestacao value) { put("manifestacao", value == null ? null : value.toJson()); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorSearchRequest setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public MonitorSearchRequestNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorSearchRequestNumero(field("numero")); }
 public MonitorSearchRequest setNumero(MonitorSearchRequestNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorSearchRequestSerie(field("serie")); }
 public MonitorSearchRequest setSerie(MonitorSearchRequestSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorSearchRequestValor(field("valor")); }
 public MonitorSearchRequest setValor(MonitorSearchRequestValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public MonitorSearchRequest setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getFornecedor() { return stringValue(field("fornecedor")); }
 public MonitorSearchRequest setFornecedor(String value) { put("fornecedor", Json.scalar(value)); return this; }
 public String getPesquisa() { return stringValue(field("pesquisa")); }
 public MonitorSearchRequest setPesquisa(String value) { put("pesquisa", Json.scalar(value)); return this; }
 public MonitorSearchRequestFinalidade getFinalidade() { return (field("finalidade")).isNull() || (field("finalidade")).isMissingNode() ? null : new MonitorSearchRequestFinalidade(field("finalidade")); }
 public MonitorSearchRequest setFinalidade(MonitorSearchRequestFinalidade value) { put("finalidade", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestOperacao getOperacao() { return (field("operacao")).isNull() || (field("operacao")).isMissingNode() ? null : new MonitorSearchRequestOperacao(field("operacao")); }
 public MonitorSearchRequest setOperacao(MonitorSearchRequestOperacao value) { put("operacao", value == null ? null : value.toJson()); return this; }
 public String getNcm() { return stringValue(field("ncm")); }
 public MonitorSearchRequest setNcm(String value) { put("ncm", Json.scalar(value)); return this; }
 public String getCfop() { return stringValue(field("cfop")); }
 public MonitorSearchRequest setCfop(String value) { put("cfop", Json.scalar(value)); return this; }
 public String getSerieRps() { return stringValue(field("serie_rps")); }
 public MonitorSearchRequest setSerieRps(String value) { put("serie_rps", Json.scalar(value)); return this; }
 public MonitorSearchRequestNumeroRps getNumeroRps() { return (field("numero_rps")).isNull() || (field("numero_rps")).isMissingNode() ? null : new MonitorSearchRequestNumeroRps(field("numero_rps")); }
 public MonitorSearchRequest setNumeroRps(MonitorSearchRequestNumeroRps value) { put("numero_rps", value == null ? null : value.toJson()); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public MonitorSearchRequest setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public MonitorSearchRequest setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public MonitorSearchRequestModalidade getModalidade() { return (field("modalidade")).isNull() || (field("modalidade")).isMissingNode() ? null : new MonitorSearchRequestModalidade(field("modalidade")); }
 public MonitorSearchRequest setModalidade(MonitorSearchRequestModalidade value) { put("modalidade", value == null ? null : value.toJson()); return this; }
 public String getUfCarregamento() { return stringValue(field("uf_carregamento")); }
 public MonitorSearchRequest setUfCarregamento(String value) { put("uf_carregamento", Json.scalar(value)); return this; }
 public String getUfDescarregamento() { return stringValue(field("uf_descarregamento")); }
 public MonitorSearchRequest setUfDescarregamento(String value) { put("uf_descarregamento", Json.scalar(value)); return this; }
 public String getPlacaVeiculo() { return stringValue(field("placa_veiculo")); }
 public MonitorSearchRequest setPlacaVeiculo(String value) { put("placa_veiculo", Json.scalar(value)); return this; }
 public String getUfInicioPrestacao() { return stringValue(field("uf_inicio_prestacao")); }
 public MonitorSearchRequest setUfInicioPrestacao(String value) { put("uf_inicio_prestacao", Json.scalar(value)); return this; }
 public String getUfTerminoPrestacao() { return stringValue(field("uf_termino_prestacao")); }
 public MonitorSearchRequest setUfTerminoPrestacao(String value) { put("uf_termino_prestacao", Json.scalar(value)); return this; }
 public String getRelatorio() { return stringValue(field("relatorio")); }
 public MonitorSearchRequest setRelatorio(String value) { put("relatorio", Json.scalar(value)); return this; }
 public java.util.List<String> getDocumentos() { return list(field("documentos"), v -> stringValue(v)); }
 public MonitorSearchRequest setDocumentos(java.util.List<String> value) { put("documentos", array(value, v -> Json.scalar(v))); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public MonitorSearchRequest setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
 public java.math.BigInteger getPerPage() { return integerValue(field("per_page")); }
 public MonitorSearchRequest setPerPage(java.math.BigInteger value) { put("per_page", Json.scalar(value)); return this; }
 public java.math.BigInteger getPage() { return integerValue(field("page")); }
 public MonitorSearchRequest setPage(java.math.BigInteger value) { put("page", Json.scalar(value)); return this; }
 public String getCursor() { return stringValue(field("cursor")); }
 public MonitorSearchRequest setCursor(String value) { put("cursor", Json.scalar(value)); return this; }
 public String getPaginacao() { return stringValue(field("paginacao")); }
 public MonitorSearchRequest setPaginacao(String value) { put("paginacao", Json.scalar(value)); return this; }
 public String getOrdenarPor() { return stringValue(field("ordenar_por")); }
 public MonitorSearchRequest setOrdenarPor(String value) { put("ordenar_por", Json.scalar(value)); return this; }
 public String getOrdem() { return stringValue(field("ordem")); }
 public MonitorSearchRequest setOrdem(String value) { put("ordem", Json.scalar(value)); return this; }
 public Boolean getNovosDocumentos() { return booleanValue(field("novos_documentos")); }
 public MonitorSearchRequest setNovosDocumentos(Boolean value) { put("novos_documentos", Json.scalar(value)); return this; }
 public MonitorSearchRequestFiltros getFiltros() { return (field("filtros")).isNull() || (field("filtros")).isMissingNode() ? null : new MonitorSearchRequestFiltros(field("filtros")); }
 public MonitorSearchRequest setFiltros(MonitorSearchRequestFiltros value) { put("filtros", value == null ? null : value.toJson()); return this; }
 public MonitorSearchRequestFiltrosModelo getFiltrosModelo() { return (field("filtros_modelo")).isNull() || (field("filtros_modelo")).isMissingNode() ? null : new MonitorSearchRequestFiltrosModelo(field("filtros_modelo")); }
 public MonitorSearchRequest setFiltrosModelo(MonitorSearchRequestFiltrosModelo value) { put("filtros_modelo", value == null ? null : value.toJson()); return this; }
}
