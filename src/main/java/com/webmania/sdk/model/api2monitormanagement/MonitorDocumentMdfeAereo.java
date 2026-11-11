package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeAereo extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nacionalidade_aeronave", "matricula_aeronave", "numero_voo", "aerodromo_embarque", "aerodromo_destino", "data_voo");
 public MonitorDocumentMdfeAereo() { super(FIELDS); }
 public MonitorDocumentMdfeAereo(JsonNode node) { super(node, FIELDS); }
 public String getNacionalidadeAeronave() { return stringValue(field("nacionalidade_aeronave")); }
 public MonitorDocumentMdfeAereo setNacionalidadeAeronave(String value) { put("nacionalidade_aeronave", Json.scalar(value)); return this; }
 public String getMatriculaAeronave() { return stringValue(field("matricula_aeronave")); }
 public MonitorDocumentMdfeAereo setMatriculaAeronave(String value) { put("matricula_aeronave", Json.scalar(value)); return this; }
 public String getNumeroVoo() { return stringValue(field("numero_voo")); }
 public MonitorDocumentMdfeAereo setNumeroVoo(String value) { put("numero_voo", Json.scalar(value)); return this; }
 public String getAerodromoEmbarque() { return stringValue(field("aerodromo_embarque")); }
 public MonitorDocumentMdfeAereo setAerodromoEmbarque(String value) { put("aerodromo_embarque", Json.scalar(value)); return this; }
 public String getAerodromoDestino() { return stringValue(field("aerodromo_destino")); }
 public MonitorDocumentMdfeAereo setAerodromoDestino(String value) { put("aerodromo_destino", Json.scalar(value)); return this; }
 public String getDataVoo() { return stringValue(field("data_voo")); }
 public MonitorDocumentMdfeAereo setDataVoo(String value) { put("data_voo", Json.scalar(value)); return this; }
}
