package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeVoidRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("sequencia", "motivo", "ambiente", "serie", "modelo", "ver_aplic");
 public NfeVoidRequest() { super(FIELDS); }
 public NfeVoidRequest(JsonNode node) { super(node, FIELDS); }
 public String getSequencia() { return stringValue(field("sequencia")); }
 public NfeVoidRequest setSequencia(String value) { put("sequencia", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfeVoidRequest setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public Environment getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new Environment(field("ambiente")); }
 public NfeVoidRequest setAmbiente(Environment value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public NfeVoidRequest setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfeVoidRequest setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getVerAplic() { return stringValue(field("ver_aplic")); }
 public NfeVoidRequest setVerAplic(String value) { put("ver_aplic", Json.scalar(value)); return this; }
}
