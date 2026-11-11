package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup5949 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("grupo", "campo", "valor", "item");
 public CteDocumentedGroup5949() { super(FIELDS); }
 public CteDocumentedGroup5949(JsonNode node) { super(node, FIELDS); }
 public String getGrupo() { return stringValue(field("grupo")); }
 public CteDocumentedGroup5949 setGrupo(String value) { put("grupo", Json.scalar(value)); return this; }
 public String getCampo() { return stringValue(field("campo")); }
 public CteDocumentedGroup5949 setCampo(String value) { put("campo", Json.scalar(value)); return this; }
 public String getValor() { return stringValue(field("valor")); }
 public CteDocumentedGroup5949 setValor(String value) { put("valor", Json.scalar(value)); return this; }
 public CteDocumentedGroup5949Item getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new CteDocumentedGroup5949Item(field("item")); }
 public CteDocumentedGroup5949 setItem(CteDocumentedGroup5949Item value) { put("item", value == null ? null : value.toJson()); return this; }
}
