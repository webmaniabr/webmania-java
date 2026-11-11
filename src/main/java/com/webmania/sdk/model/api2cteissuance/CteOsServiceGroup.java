package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteOsServiceGroup extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("componentes", "descricao", "tipo", "valor_recebido", "valor_total");
 public CteOsServiceGroup() { super(FIELDS); }
 public CteOsServiceGroup(JsonNode node) { super(node, FIELDS); }
 public java.util.List<JsonValue> getComponentes() { return list(field("componentes"), v -> (v).isNull() || (v).isMissingNode() ? null : new JsonValue(v)); }
 public CteOsServiceGroup setComponentes(java.util.List<JsonValue> value) { put("componentes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public CteOsServiceGroup setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public CteOsServiceGroupTipo getTipo() { return (field("tipo")).isNull() || (field("tipo")).isMissingNode() ? null : new CteOsServiceGroupTipo(field("tipo")); }
 public CteOsServiceGroup setTipo(CteOsServiceGroupTipo value) { put("tipo", value == null ? null : value.toJson()); return this; }
 public CteOsServiceGroupValorRecebido getValorRecebido() { return (field("valor_recebido")).isNull() || (field("valor_recebido")).isMissingNode() ? null : new CteOsServiceGroupValorRecebido(field("valor_recebido")); }
 public CteOsServiceGroup setValorRecebido(CteOsServiceGroupValorRecebido value) { put("valor_recebido", value == null ? null : value.toJson()); return this; }
 public CteOsServiceGroupValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new CteOsServiceGroupValorTotal(field("valor_total")); }
 public CteOsServiceGroup setValorTotal(CteOsServiceGroupValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
}
