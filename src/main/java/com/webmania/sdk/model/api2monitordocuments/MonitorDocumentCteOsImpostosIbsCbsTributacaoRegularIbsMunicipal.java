package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsMunicipal extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_efetiva", "valor");
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsMunicipal() { super(FIELDS); }
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsMunicipal(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getAliquotaEfetiva() { return decimalValue(field("aliquota_efetiva")); }
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsMunicipal setAliquotaEfetiva(java.math.BigDecimal value) { put("aliquota_efetiva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteOsImpostosIbsCbsTributacaoRegularIbsMunicipal setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
}
