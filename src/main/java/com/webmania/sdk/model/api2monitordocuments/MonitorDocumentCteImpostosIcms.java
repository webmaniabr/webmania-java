package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteImpostosIcms extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "valor", "valor_credito", "percentual_credito", "aliquota", "percentual_reducao", "codigo_cfop", "bc");
 public MonitorDocumentCteImpostosIcms() { super(FIELDS); }
 public MonitorDocumentCteImpostosIcms(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentCteImpostosIcms setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteImpostosIcms setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCredito() { return decimalValue(field("valor_credito")); }
 public MonitorDocumentCteImpostosIcms setValorCredito(java.math.BigDecimal value) { put("valor_credito", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPercentualCredito() { return decimalValue(field("percentual_credito")); }
 public MonitorDocumentCteImpostosIcms setPercentualCredito(java.math.BigDecimal value) { put("percentual_credito", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentCteImpostosIcms setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPercentualReducao() { return decimalValue(field("percentual_reducao")); }
 public MonitorDocumentCteImpostosIcms setPercentualReducao(java.math.BigDecimal value) { put("percentual_reducao", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public MonitorDocumentCteImpostosIcms setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentCteImpostosIcms setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
}
