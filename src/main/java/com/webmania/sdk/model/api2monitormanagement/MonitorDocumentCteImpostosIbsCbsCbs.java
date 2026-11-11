package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteImpostosIbsCbsCbs extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "valor", "aliquota_diferimento", "valor_diferimento", "valor_devolvido", "aliquota_reducao", "aliquota_efetiva");
 public MonitorDocumentCteImpostosIbsCbsCbs() { super(FIELDS); }
 public MonitorDocumentCteImpostosIbsCbsCbs(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentCteImpostosIbsCbsCbs setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentCteImpostosIbsCbsCbs setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaDiferimento() { return decimalValue(field("aliquota_diferimento")); }
 public MonitorDocumentCteImpostosIbsCbsCbs setAliquotaDiferimento(java.math.BigDecimal value) { put("aliquota_diferimento", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorDiferimento() { return decimalValue(field("valor_diferimento")); }
 public MonitorDocumentCteImpostosIbsCbsCbs setValorDiferimento(java.math.BigDecimal value) { put("valor_diferimento", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValorDevolvido() { return decimalValue(field("valor_devolvido")); }
 public MonitorDocumentCteImpostosIbsCbsCbs setValorDevolvido(java.math.BigDecimal value) { put("valor_devolvido", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaReducao() { return decimalValue(field("aliquota_reducao")); }
 public MonitorDocumentCteImpostosIbsCbsCbs setAliquotaReducao(java.math.BigDecimal value) { put("aliquota_reducao", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaEfetiva() { return decimalValue(field("aliquota_efetiva")); }
 public MonitorDocumentCteImpostosIbsCbsCbs setAliquotaEfetiva(java.math.BigDecimal value) { put("aliquota_efetiva", Json.scalar(value)); return this; }
}
