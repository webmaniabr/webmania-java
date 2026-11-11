package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeDocumentedGroup465 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "chave", "serie", "mdfe", "status", "motivo", "xml", "damdfe", "log");
 public MdfeDocumentedGroup465() { super(FIELDS); }
 public MdfeDocumentedGroup465(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MdfeDocumentedGroup465 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MdfeDocumentedGroup465 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public MdfeDocumentedGroup465Serie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MdfeDocumentedGroup465Serie(field("serie")); }
 public MdfeDocumentedGroup465 setSerie(MdfeDocumentedGroup465Serie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public MdfeDocumentedGroup465Mdfe getMdfe() { return (field("mdfe")).isNull() || (field("mdfe")).isMissingNode() ? null : new MdfeDocumentedGroup465Mdfe(field("mdfe")); }
 public MdfeDocumentedGroup465 setMdfe(MdfeDocumentedGroup465Mdfe value) { put("mdfe", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public MdfeDocumentedGroup465 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public MdfeDocumentedGroup465 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public MdfeDocumentedGroup465 setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getDamdfe() { return stringValue(field("damdfe")); }
 public MdfeDocumentedGroup465 setDamdfe(String value) { put("damdfe", Json.scalar(value)); return this; }
 public java.util.List<JsonValue> getLog() { return list(field("log"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public MdfeDocumentedGroup465 setLog(java.util.List<JsonValue> value) { put("log", array(value, v -> v == null ? null : v.toJson())); return this; }
}
