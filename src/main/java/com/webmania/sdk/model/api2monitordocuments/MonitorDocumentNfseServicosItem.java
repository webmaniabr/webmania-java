package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseServicosItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("desconto_condicionado", "discriminacao", "valor_liquido", "codigo_tributacao_municipio", "valor", "codigo_cnae", "codigo_servico", "local_prestacao", "impostos", "desconto_incondicionado", "valor_recebido");
 public MonitorDocumentNfseServicosItem() { super(FIELDS); }
 public MonitorDocumentNfseServicosItem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getDescontoCondicionado() { return decimalValue(field("desconto_condicionado")); }
 public MonitorDocumentNfseServicosItem setDescontoCondicionado(java.math.BigDecimal value) { put("desconto_condicionado", Json.scalar(value)); return this; }
 public String getDiscriminacao() { return stringValue(field("discriminacao")); }
 public MonitorDocumentNfseServicosItem setDiscriminacao(String value) { put("discriminacao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorLiquido() { return decimalValue(field("valor_liquido")); }
 public MonitorDocumentNfseServicosItem setValorLiquido(java.math.BigDecimal value) { put("valor_liquido", Json.scalar(value)); return this; }
 public String getCodigoTributacaoMunicipio() { return stringValue(field("codigo_tributacao_municipio")); }
 public MonitorDocumentNfseServicosItem setCodigoTributacaoMunicipio(String value) { put("codigo_tributacao_municipio", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfseServicosItem setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public MonitorDocumentNfseServicosItem setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public MonitorDocumentNfseServicosItem setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public MonitorDocumentNfseServicosItemLocalPrestacao getLocalPrestacao() { return (field("local_prestacao")).isNull() || (field("local_prestacao")).isMissingNode() ? null : new MonitorDocumentNfseServicosItemLocalPrestacao(field("local_prestacao")); }
 public MonitorDocumentNfseServicosItem setLocalPrestacao(MonitorDocumentNfseServicosItemLocalPrestacao value) { put("local_prestacao", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfseServicosItemImpostos getImpostos() { return (field("impostos")).isNull() || (field("impostos")).isMissingNode() ? null : new MonitorDocumentNfseServicosItemImpostos(field("impostos")); }
 public MonitorDocumentNfseServicosItem setImpostos(MonitorDocumentNfseServicosItemImpostos value) { put("impostos", value == null ? null : value.toJson()); return this; }
 public java.math.BigDecimal getDescontoIncondicionado() { return decimalValue(field("desconto_incondicionado")); }
 public MonitorDocumentNfseServicosItem setDescontoIncondicionado(java.math.BigDecimal value) { put("desconto_incondicionado", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorRecebido() { return decimalValue(field("valor_recebido")); }
 public MonitorDocumentNfseServicosItem setValorRecebido(java.math.BigDecimal value) { put("valor_recebido", Json.scalar(value)); return this; }
}
