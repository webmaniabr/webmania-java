package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class DceDocumentedGroup282 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "uuid", "chave", "serie", "numero", "status", "motivo", "modelo", "xml", "xml_cancelamento", "dace", "log");
 public DceDocumentedGroup282() { super(FIELDS); }
 public DceDocumentedGroup282(JsonNode node) { super(node, FIELDS); }
 public String getID() { return stringValue(field("ID")); }
 public DceDocumentedGroup282 setID(String value) { put("ID", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public DceDocumentedGroup282 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public DceDocumentedGroup282 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public DceDocumentedGroup282Serie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new DceDocumentedGroup282Serie(field("serie")); }
 public DceDocumentedGroup282 setSerie(DceDocumentedGroup282Serie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public DceDocumentedGroup282Numero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new DceDocumentedGroup282Numero(field("numero")); }
 public DceDocumentedGroup282 setNumero(DceDocumentedGroup282Numero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public DceDocumentedGroup282 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public DceDocumentedGroup282 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public DceDocumentedGroup282 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public DceDocumentedGroup282 setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getXmlCancelamento() { return stringValue(field("xml_cancelamento")); }
 public DceDocumentedGroup282 setXmlCancelamento(String value) { put("xml_cancelamento", Json.scalar(value)); return this; }
 public String getDace() { return stringValue(field("dace")); }
 public DceDocumentedGroup282 setDace(String value) { put("dace", Json.scalar(value)); return this; }
 public java.util.List<JsonValue> getLog() { return list(field("log"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public DceDocumentedGroup282 setLog(java.util.List<JsonValue> value) { put("log", array(value, v -> v == null ? null : v.toJson())); return this; }
}
