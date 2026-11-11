package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeFatura extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor_desconto", "valor_liquido", "valor", "valor_original", "desconto", "numero");
 public MonitorDocumentNfeFatura() { super(FIELDS); }
 public MonitorDocumentNfeFatura(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValorDesconto() { return decimalValue(field("valor_desconto")); }
 public MonitorDocumentNfeFatura setValorDesconto(java.math.BigDecimal value) { put("valor_desconto", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorLiquido() { return decimalValue(field("valor_liquido")); }
 public MonitorDocumentNfeFatura setValorLiquido(java.math.BigDecimal value) { put("valor_liquido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfeFatura setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorOriginal() { return decimalValue(field("valor_original")); }
 public MonitorDocumentNfeFatura setValorOriginal(java.math.BigDecimal value) { put("valor_original", Json.scalar(value)); return this; }
 public java.math.BigDecimal getDesconto() { return decimalValue(field("desconto")); }
 public MonitorDocumentNfeFatura setDesconto(java.math.BigDecimal value) { put("desconto", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentNfeFatura setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
