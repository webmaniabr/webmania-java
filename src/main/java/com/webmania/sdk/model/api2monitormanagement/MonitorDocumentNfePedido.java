package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfePedido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("bandeira", "ID", "informacoes_complementares", "numero_compra", "cnpj_credenciadora", "intermediador", "informacoes_fisco", "desc_pagamento", "numero_pedido", "autorizacao", "valor_pagamento", "desconto", "forma_pagamento", "cnpj_intermediador", "frete", "presenca", "id_intermediador", "pagamento", "modalidade_frete", "tipo_integracao");
 public MonitorDocumentNfePedido() { super(FIELDS); }
 public MonitorDocumentNfePedido(JsonNode node) { super(node, FIELDS); }
 public java.util.List<String> getBandeira() { return list(field("bandeira"), v -> stringValue(v)); }
 public MonitorDocumentNfePedido setBandeira(java.util.List<String> value) { put("bandeira", array(value, v -> Json.scalar(v))); return this; }
 public String getID() { return stringValue(field("ID")); }
 public MonitorDocumentNfePedido setID(String value) { put("ID", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public MonitorDocumentNfePedido setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
 public String getNumeroCompra() { return stringValue(field("numero_compra")); }
 public MonitorDocumentNfePedido setNumeroCompra(String value) { put("numero_compra", Json.scalar(value)); return this; }
 public java.util.List<String> getCnpjCredenciadora() { return list(field("cnpj_credenciadora"), v -> stringValue(v)); }
 public MonitorDocumentNfePedido setCnpjCredenciadora(java.util.List<String> value) { put("cnpj_credenciadora", array(value, v -> Json.scalar(v))); return this; }
 public String getIntermediador() { return stringValue(field("intermediador")); }
 public MonitorDocumentNfePedido setIntermediador(String value) { put("intermediador", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public MonitorDocumentNfePedido setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public java.util.List<String> getDescPagamento() { return list(field("desc_pagamento"), v -> stringValue(v)); }
 public MonitorDocumentNfePedido setDescPagamento(java.util.List<String> value) { put("desc_pagamento", array(value, v -> Json.scalar(v))); return this; }
 public String getNumeroPedido() { return stringValue(field("numero_pedido")); }
 public MonitorDocumentNfePedido setNumeroPedido(String value) { put("numero_pedido", Json.scalar(value)); return this; }
 public java.util.List<String> getAutorizacao() { return list(field("autorizacao"), v -> stringValue(v)); }
 public MonitorDocumentNfePedido setAutorizacao(java.util.List<String> value) { put("autorizacao", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<java.math.BigDecimal> getValorPagamento() { return list(field("valor_pagamento"), v -> decimalValue(v)); }
 public MonitorDocumentNfePedido setValorPagamento(java.util.List<java.math.BigDecimal> value) { put("valor_pagamento", array(value, v -> Json.scalar(v))); return this; }
 public java.math.BigDecimal getDesconto() { return decimalValue(field("desconto")); }
 public MonitorDocumentNfePedido setDesconto(java.math.BigDecimal value) { put("desconto", Json.scalar(value)); return this; }
 public java.util.List<String> getFormaPagamento() { return list(field("forma_pagamento"), v -> stringValue(v)); }
 public MonitorDocumentNfePedido setFormaPagamento(java.util.List<String> value) { put("forma_pagamento", array(value, v -> Json.scalar(v))); return this; }
 public String getCnpjIntermediador() { return stringValue(field("cnpj_intermediador")); }
 public MonitorDocumentNfePedido setCnpjIntermediador(String value) { put("cnpj_intermediador", Json.scalar(value)); return this; }
 public java.math.BigDecimal getFrete() { return decimalValue(field("frete")); }
 public MonitorDocumentNfePedido setFrete(java.math.BigDecimal value) { put("frete", Json.scalar(value)); return this; }
 public String getPresenca() { return stringValue(field("presenca")); }
 public MonitorDocumentNfePedido setPresenca(String value) { put("presenca", Json.scalar(value)); return this; }
 public String getIdIntermediador() { return stringValue(field("id_intermediador")); }
 public MonitorDocumentNfePedido setIdIntermediador(String value) { put("id_intermediador", Json.scalar(value)); return this; }
 public java.util.List<String> getPagamento() { return list(field("pagamento"), v -> stringValue(v)); }
 public MonitorDocumentNfePedido setPagamento(java.util.List<String> value) { put("pagamento", array(value, v -> Json.scalar(v))); return this; }
 public String getModalidadeFrete() { return stringValue(field("modalidade_frete")); }
 public MonitorDocumentNfePedido setModalidadeFrete(String value) { put("modalidade_frete", Json.scalar(value)); return this; }
 public java.util.List<String> getTipoIntegracao() { return list(field("tipo_integracao"), v -> stringValue(v)); }
 public MonitorDocumentNfePedido setTipoIntegracao(java.util.List<String> value) { put("tipo_integracao", array(value, v -> Json.scalar(v))); return this; }
}
