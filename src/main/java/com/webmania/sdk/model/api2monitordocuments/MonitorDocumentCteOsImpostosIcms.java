package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostosIcms extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "valor", "valor_credito", "percentual_credito", "aliquota", "percentual_reducao", "codigo_cfop", "bc");
 public MonitorDocumentCteOsImpostosIcms() { super(FIELDS); }
 public MonitorDocumentCteOsImpostosIcms(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public MonitorDocumentCteOsImpostosIcms setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteOsImpostosIcms setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorCredito() { return decimalValue(field("valor_credito")); }
 public MonitorDocumentCteOsImpostosIcms setValorCredito(java.math.BigDecimal value) { put("valor_credito", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPercentualCredito() { return decimalValue(field("percentual_credito")); }
 public MonitorDocumentCteOsImpostosIcms setPercentualCredito(java.math.BigDecimal value) { put("percentual_credito", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentCteOsImpostosIcms setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getPercentualReducao() { return decimalValue(field("percentual_reducao")); }
 public MonitorDocumentCteOsImpostosIcms setPercentualReducao(java.math.BigDecimal value) { put("percentual_reducao", Json.scalar(value)); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public MonitorDocumentCteOsImpostosIcms setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public java.math.BigDecimal getBc() { return decimalValue(field("bc")); }
 public MonitorDocumentCteOsImpostosIcms setBc(java.math.BigDecimal value) { put("bc", Json.scalar(value)); return this; }
}
