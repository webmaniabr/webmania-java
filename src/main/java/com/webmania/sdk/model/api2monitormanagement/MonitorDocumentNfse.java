package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("status", "discriminacao", "data_emissao", "codigo_tributacao_municipio", "valor", "codigo_cnae", "totais", "impostos", "desconto_incondicionado", "identificacao_nfse", "valor_recebido", "tomador", "desconto_condicionado", "valor_liquido", "servicos", "data_cancelamento", "codigo_servico", "local_prestacao", "empresa_uuid", "prestador", "docs", "modelo", "uuid", "serie", "categoria", "numero", "data_captura", "fornecedor");
 public MonitorDocumentNfse() { super(FIELDS); }
 public MonitorDocumentNfse(JsonNode node) { super(node, FIELDS); }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorDocumentNfse setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getDiscriminacao() { return stringValue(field("discriminacao")); }
 public MonitorDocumentNfse setDiscriminacao(String value) { put("discriminacao", Json.scalar(value)); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentNfse setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public MonitorDocumentNfse setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public MonitorDocumentNfseValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new MonitorDocumentNfseValor(field("valor")); }
 public MonitorDocumentNfse setValor(MonitorDocumentNfseValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public MonitorDocumentNfse setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public MonitorDocumentNfseTotais getTotais() { return (field("totais")).isNull() || (field("totais")).isMissingNode() ? null : new MonitorDocumentNfseTotais(field("totais")); }
 public MonitorDocumentNfse setTotais(MonitorDocumentNfseTotais value) { put("totais", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new MonitorDocumentNfseImpostos(field("impostos")); }
 public MonitorDocumentNfse setImpostos(MonitorDocumentNfseImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseDescontoIncondicionado getDescontoIncondicionado() { return (field("desconto_incondicionado")).isNull() || (field("desconto_incondicionado")).isMissingNode() ? null : new MonitorDocumentNfseDescontoIncondicionado(field("desconto_incondicionado")); }
 public MonitorDocumentNfse setDescontoIncondicionado(MonitorDocumentNfseDescontoIncondicionado value) { put("desconto_incondicionado", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseIdentificacaoNfse getIdentificacaoNfse() { return (field("identificacao_nfse")).isNull() || (field("identificacao_nfse")).isMissingNode() ? null : new MonitorDocumentNfseIdentificacaoNfse(field("identificacao_nfse")); }
 public MonitorDocumentNfse setIdentificacaoNfse(MonitorDocumentNfseIdentificacaoNfse value) { put("identificacao_nfse", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseValorRecebido getValorRecebido() { return (field("valor_recebido")).isNull() || (field("valor_recebido")).isMissingNode() ? null : new MonitorDocumentNfseValorRecebido(field("valor_recebido")); }
 public MonitorDocumentNfse setValorRecebido(MonitorDocumentNfseValorRecebido value) { put("valor_recebido", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseTomador getTomador() { return (field("tomador")).isNull() || (field("tomador")).isMissingNode() ? null : new MonitorDocumentNfseTomador(field("tomador")); }
 public MonitorDocumentNfse setTomador(MonitorDocumentNfseTomador value) { put("tomador", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseDescontoCondicionado getDescontoCondicionado() { return (field("desconto_condicionado")).isNull() || (field("desconto_condicionado")).isMissingNode() ? null : new MonitorDocumentNfseDescontoCondicionado(field("desconto_condicionado")); }
 public MonitorDocumentNfse setDescontoCondicionado(MonitorDocumentNfseDescontoCondicionado value) { put("desconto_condicionado", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseValorLiquido getValorLiquido() { return (field("valor_liquido")).isNull() || (field("valor_liquido")).isMissingNode() ? null : new MonitorDocumentNfseValorLiquido(field("valor_liquido")); }
 public MonitorDocumentNfse setValorLiquido(MonitorDocumentNfseValorLiquido value) { put("valor_liquido", value == null ? null : value.toJson()); return this; }
 public java.util.List<MonitorDocumentNfseServicosItem> getServicos() { return list(field("servicos"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentNfseServicosItem(v)); }
 public MonitorDocumentNfse setServicos(java.util.List<MonitorDocumentNfseServicosItem> value) { put("servicos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public MonitorDocumentNfseDataCancelamento getDataCancelamento() { return (field("data_cancelamento")).isNull() || (field("data_cancelamento")).isMissingNode() ? null : new MonitorDocumentNfseDataCancelamento(field("data_cancelamento")); }
 public MonitorDocumentNfse setDataCancelamento(MonitorDocumentNfseDataCancelamento value) { put("data_cancelamento", value == null ? null : value.toJson()); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public MonitorDocumentNfse setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public MonitorDocumentNfseLocalPrestacao getLocalPrestacao() { return (field("local_prestacao")).isNull() || (field("local_prestacao")).isMissingNode() ? null : new MonitorDocumentNfseLocalPrestacao(field("local_prestacao")); }
 public MonitorDocumentNfse setLocalPrestacao(MonitorDocumentNfseLocalPrestacao value) { put("local_prestacao", value == null ? null : value.toJson()); return this; }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorDocumentNfse setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public MonitorDocumentNfsePrestador getPrestador() { return (field("prestador")).isNull() || (field("prestador")).isMissingNode() ? null : new MonitorDocumentNfsePrestador(field("prestador")); }
 public MonitorDocumentNfse setPrestador(MonitorDocumentNfsePrestador value) { put("prestador", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseDocs getDocs() { return (field("docs")).isNull() || (field("docs")).isMissingNode() ? null : new MonitorDocumentNfseDocs(field("docs")); }
 public MonitorDocumentNfse setDocs(MonitorDocumentNfseDocs value) { put("docs", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorDocumentNfse setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MonitorDocumentNfse setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public MonitorDocumentNfseSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorDocumentNfseSerie(field("serie")); }
 public MonitorDocumentNfse setSerie(MonitorDocumentNfseSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getCategoria() { return stringValue(field("categoria")); }
 public MonitorDocumentNfse setCategoria(String value) { put("categoria", Json.scalar(value)); return this; }
 public MonitorDocumentNfseNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentNfseNumero(field("numero")); }
 public MonitorDocumentNfse setNumero(MonitorDocumentNfseNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getDataCaptura() { return stringValue(field("data_captura")); }
 public MonitorDocumentNfse setDataCaptura(String value) { put("data_captura", Json.scalar(value)); return this; }
 public MonitorDocumentNfseFornecedor getFornecedor() { return (field("fornecedor")).isNull() || (field("fornecedor")).isMissingNode() ? null : new MonitorDocumentNfseFornecedor(field("fornecedor")); }
 public MonitorDocumentNfse setFornecedor(MonitorDocumentNfseFornecedor value) { put("fornecedor", value == null ? null : value.toJson()); return this; }
}
