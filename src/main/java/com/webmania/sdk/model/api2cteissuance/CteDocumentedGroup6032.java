package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup6032 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "protocolo", "sequencia", "pagamento");
 public CteDocumentedGroup6032() { super(FIELDS); }
 public CteDocumentedGroup6032(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteDocumentedGroup6032 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getProtocolo() { return stringValue(field("protocolo")); }
 public CteDocumentedGroup6032 setProtocolo(String value) { put("protocolo", Json.scalar(value)); return this; }
 public CteDocumentedGroup6032Sequencia getSequencia() { return (field("sequencia")).isNull() || (field("sequencia")).isMissingNode() ? null : new CteDocumentedGroup6032Sequencia(field("sequencia")); }
 public CteDocumentedGroup6032 setSequencia(CteDocumentedGroup6032Sequencia value) { put("sequencia", value == null ? null : value.toJson()); return this; }
 public CteDocumentedGroup6032Pagamento getPagamento() { return (field("pagamento")).isNull() || (field("pagamento")).isMissingNode() ? null : new CteDocumentedGroup6032Pagamento(field("pagamento")); }
 public CteDocumentedGroup6032 setPagamento(CteDocumentedGroup6032Pagamento value) { put("pagamento", value == null ? null : value.toJson()); return this; }
}
