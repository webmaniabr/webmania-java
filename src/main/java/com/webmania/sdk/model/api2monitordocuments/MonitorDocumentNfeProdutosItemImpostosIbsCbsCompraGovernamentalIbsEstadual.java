package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "valor");
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIbsCbsCompraGovernamentalIbsEstadual setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
}
