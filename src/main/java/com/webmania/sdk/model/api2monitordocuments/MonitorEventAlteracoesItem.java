package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorEventAlteracoesItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("grupo", "campo", "alteracao");
 public MonitorEventAlteracoesItem() { super(FIELDS); }
 public MonitorEventAlteracoesItem(JsonNode node) { super(node, FIELDS); }
 public String getGrupo() { return stringValue(field("grupo")); }
 public MonitorEventAlteracoesItem setGrupo(String value) { put("grupo", Json.scalar(value)); return this; }
 public String getCampo() { return stringValue(field("campo")); }
 public MonitorEventAlteracoesItem setCampo(String value) { put("campo", Json.scalar(value)); return this; }
 public String getAlteracao() { return stringValue(field("alteracao")); }
 public MonitorEventAlteracoesItem setAlteracao(String value) { put("alteracao", Json.scalar(value)); return this; }
}
