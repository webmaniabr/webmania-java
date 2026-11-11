package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeProtocoloVariant1 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("motivo", "status", "data_recebimento", "numero_protocolo");
 public MonitorDocumentNfeProtocoloVariant1() { super(FIELDS); }
 public MonitorDocumentNfeProtocoloVariant1(JsonNode node) { super(node, FIELDS); }
 public String getMotivo() { return stringValue(field("motivo")); }
 public MonitorDocumentNfeProtocoloVariant1 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public MonitorDocumentNfeProtocoloVariant1 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getDataRecebimento() { return stringValue(field("data_recebimento")); }
 public MonitorDocumentNfeProtocoloVariant1 setDataRecebimento(String value) { put("data_recebimento", Json.scalar(value)); return this; }
 public String getNumeroProtocolo() { return stringValue(field("numero_protocolo")); }
 public MonitorDocumentNfeProtocoloVariant1 setNumeroProtocolo(String value) { put("numero_protocolo", Json.scalar(value)); return this; }
}
