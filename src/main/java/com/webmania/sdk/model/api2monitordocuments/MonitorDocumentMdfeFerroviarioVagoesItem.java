package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeFerroviarioVagoesItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("peso_bc", "peso_real", "tipo_vagao", "serie", "numero", "sequencia_vagao", "tonelada_util");
 public MonitorDocumentMdfeFerroviarioVagoesItem() { super(FIELDS); }
 public MonitorDocumentMdfeFerroviarioVagoesItem(JsonNode node) { super(node, FIELDS); }
 public String getPesoBc() { return stringValue(field("peso_bc")); }
 public MonitorDocumentMdfeFerroviarioVagoesItem setPesoBc(String value) { put("peso_bc", Json.scalar(value)); return this; }
 public String getPesoReal() { return stringValue(field("peso_real")); }
 public MonitorDocumentMdfeFerroviarioVagoesItem setPesoReal(String value) { put("peso_real", Json.scalar(value)); return this; }
 public String getTipoVagao() { return stringValue(field("tipo_vagao")); }
 public MonitorDocumentMdfeFerroviarioVagoesItem setTipoVagao(String value) { put("tipo_vagao", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public MonitorDocumentMdfeFerroviarioVagoesItem setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public MonitorDocumentMdfeFerroviarioVagoesItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getSequenciaVagao() { return stringValue(field("sequencia_vagao")); }
 public MonitorDocumentMdfeFerroviarioVagoesItem setSequenciaVagao(String value) { put("sequencia_vagao", Json.scalar(value)); return this; }
 public String getToneladaUtil() { return stringValue(field("tonelada_util")); }
 public MonitorDocumentMdfeFerroviarioVagoesItem setToneladaUtil(String value) { put("tonelada_util", Json.scalar(value)); return this; }
}
