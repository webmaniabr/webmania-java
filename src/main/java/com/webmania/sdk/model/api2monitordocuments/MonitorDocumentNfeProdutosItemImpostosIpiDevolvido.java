package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProdutosItemImpostosIpiDevolvido extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("percentual_devolvido", "ipi_devolvido_valor");
 public MonitorDocumentNfeProdutosItemImpostosIpiDevolvido() { super(FIELDS); }
 public MonitorDocumentNfeProdutosItemImpostosIpiDevolvido(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getPercentualDevolvido() { return decimalValue(field("percentual_devolvido")); }
 public MonitorDocumentNfeProdutosItemImpostosIpiDevolvido setPercentualDevolvido(java.math.BigDecimal value) { put("percentual_devolvido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getIpiDevolvidoValor() { return decimalValue(field("ipi_devolvido_valor")); }
 public MonitorDocumentNfeProdutosItemImpostosIpiDevolvido setIpiDevolvidoValor(java.math.BigDecimal value) { put("ipi_devolvido_valor", Json.scalar(value)); return this; }
}
