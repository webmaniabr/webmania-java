package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorReportFiltros extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("selecao_manual", "periodo", "empresas", "categoria", "finalidade", "operacao", "modalidade", "status", "manifestacao");
 public MonitorReportFiltros() { super(FIELDS); }
 public MonitorReportFiltros(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getSelecaoManual() { return integerValue(field("selecao_manual")); }
 public MonitorReportFiltros setSelecaoManual(java.math.BigInteger value) { put("selecao_manual", Json.scalar(value)); return this; }
 public MonitorReportFiltrosPeriodo getPeriodo() { return (field("periodo")).isNull() || (field("periodo")).isMissingNode() ? null : new MonitorReportFiltrosPeriodo(field("periodo")); }
 public MonitorReportFiltros setPeriodo(MonitorReportFiltrosPeriodo value) { put("periodo", value == null ? null : value.toJson()); return this; }
 public java.math.BigInteger getEmpresas() { return integerValue(field("empresas")); }
 public MonitorReportFiltros setEmpresas(java.math.BigInteger value) { put("empresas", Json.scalar(value)); return this; }
 public java.util.List<String> getCategoria() { return list(field("categoria"), v -> stringValue(v)); }
 public MonitorReportFiltros setCategoria(java.util.List<String> value) { put("categoria", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getFinalidade() { return list(field("finalidade"), v -> stringValue(v)); }
 public MonitorReportFiltros setFinalidade(java.util.List<String> value) { put("finalidade", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getOperacao() { return list(field("operacao"), v -> stringValue(v)); }
 public MonitorReportFiltros setOperacao(java.util.List<String> value) { put("operacao", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getModalidade() { return list(field("modalidade"), v -> stringValue(v)); }
 public MonitorReportFiltros setModalidade(java.util.List<String> value) { put("modalidade", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getStatus() { return list(field("status"), v -> stringValue(v)); }
 public MonitorReportFiltros setStatus(java.util.List<String> value) { put("status", array(value, v -> Json.scalar(v))); return this; }
 public java.util.List<String> getManifestacao() { return list(field("manifestacao"), v -> stringValue(v)); }
 public MonitorReportFiltros setManifestacao(java.util.List<String> value) { put("manifestacao", array(value, v -> Json.scalar(v))); return this; }
}
