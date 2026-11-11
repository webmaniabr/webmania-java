package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfseImpostosIbsCbsIbsMunicipal extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("valor", "aliquota", "aliquota_efetiva", "aliquota_diferimento");
 public MonitorDocumentNfseImpostosIbsCbsIbsMunicipal() { super(FIELDS); }
 public MonitorDocumentNfseImpostosIbsCbsIbsMunicipal(JsonNode node) { super(node, FIELDS); }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsMunicipal setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquota() { return decimalValue(field("aliquota")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsMunicipal setAliquota(java.math.BigDecimal value) { put("aliquota", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaEfetiva() { return decimalValue(field("aliquota_efetiva")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsMunicipal setAliquotaEfetiva(java.math.BigDecimal value) { put("aliquota_efetiva", Json.scalar(value)); return this; }
 public java.math.BigDecimal getAliquotaDiferimento() { return decimalValue(field("aliquota_diferimento")); }
 public MonitorDocumentNfseImpostosIbsCbsIbsMunicipal setAliquotaDiferimento(java.math.BigDecimal value) { put("aliquota_diferimento", Json.scalar(value)); return this; }
}
