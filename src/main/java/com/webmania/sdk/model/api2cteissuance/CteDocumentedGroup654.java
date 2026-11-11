package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup654 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "chave", "serie", "numero", "status", "motivo", "epec", "xml", "xml_cancelamento", "dacte", "log");
 public CteDocumentedGroup654() { super(FIELDS); }
 public CteDocumentedGroup654(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteDocumentedGroup654 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public CteDocumentedGroup654 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public CteDocumentedGroup654Serie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new CteDocumentedGroup654Serie(field("serie")); }
 public CteDocumentedGroup654 setSerie(CteDocumentedGroup654Serie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public CteDocumentedGroup654Numero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new CteDocumentedGroup654Numero(field("numero")); }
 public CteDocumentedGroup654 setNumero(CteDocumentedGroup654Numero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public CteDocumentedGroup654 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public CteDocumentedGroup654 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public Boolean getEpec() { return booleanValue(field("epec")); }
 public CteDocumentedGroup654 setEpec(Boolean value) { put("epec", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public CteDocumentedGroup654 setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getXmlCancelamento() { return stringValue(field("xml_cancelamento")); }
 public CteDocumentedGroup654 setXmlCancelamento(String value) { put("xml_cancelamento", Json.scalar(value)); return this; }
 public String getDacte() { return stringValue(field("dacte")); }
 public CteDocumentedGroup654 setDacte(String value) { put("dacte", Json.scalar(value)); return this; }
 public java.util.List<JsonValue> getLog() { return list(field("log"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public CteDocumentedGroup654 setLog(java.util.List<JsonValue> value) { put("log", array(value, v -> v == null ? null : v.toJson())); return this; }
}
