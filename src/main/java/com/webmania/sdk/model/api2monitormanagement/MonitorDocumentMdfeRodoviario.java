package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("contratantes", "veiculo_reboque", "lacres", "veiculos", "ciot", "contratante", "condutor", "rntrc", "veiculo_tracao", "vale_pedagio");
 public MonitorDocumentMdfeRodoviario() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviario(JsonNode node) { super(node, FIELDS); }
 public java.util.List<MonitorDocumentMdfeRodoviarioContratantesItem> getContratantes() { return list(field("contratantes"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioContratantesItem(v)); }
 public MonitorDocumentMdfeRodoviario setContratantes(java.util.List<MonitorDocumentMdfeRodoviarioContratantesItem> value) { put("contratantes", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeRodoviarioVeiculoReboqueItem> getVeiculoReboque() { return list(field("veiculo_reboque"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioVeiculoReboqueItem(v)); }
 public MonitorDocumentMdfeRodoviario setVeiculoReboque(java.util.List<MonitorDocumentMdfeRodoviarioVeiculoReboqueItem> value) { put("veiculo_reboque", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeRodoviarioLacresItem> getLacres() { return list(field("lacres"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioLacresItem(v)); }
 public MonitorDocumentMdfeRodoviario setLacres(java.util.List<MonitorDocumentMdfeRodoviarioLacresItem> value) { put("lacres", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeRodoviarioVeiculosItem> getVeiculos() { return list(field("veiculos"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioVeiculosItem(v)); }
 public MonitorDocumentMdfeRodoviario setVeiculos(java.util.List<MonitorDocumentMdfeRodoviarioVeiculosItem> value) { put("veiculos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeRodoviarioCiotItem> getCiot() { return list(field("ciot"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioCiotItem(v)); }
 public MonitorDocumentMdfeRodoviario setCiot(java.util.List<MonitorDocumentMdfeRodoviarioCiotItem> value) { put("ciot", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeRodoviarioContratanteItem> getContratante() { return list(field("contratante"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioContratanteItem(v)); }
 public MonitorDocumentMdfeRodoviario setContratante(java.util.List<MonitorDocumentMdfeRodoviarioContratanteItem> value) { put("contratante", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<MonitorDocumentMdfeRodoviarioCondutorItem> getCondutor() { return list(field("condutor"), v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioCondutorItem(v)); }
 public MonitorDocumentMdfeRodoviario setCondutor(java.util.List<MonitorDocumentMdfeRodoviarioCondutorItem> value) { put("condutor", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getRntrc() { return stringValue(field("rntrc")); }
 public MonitorDocumentMdfeRodoviario setRntrc(String value) { put("rntrc", Json.scalar(value)); return this; }
 public MonitorDocumentMdfeRodoviarioVeiculoTracao getVeiculoTracao() { return (field("veiculo_tracao")).isNull() || (field("veiculo_tracao")).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioVeiculoTracao(field("veiculo_tracao")); }
 public MonitorDocumentMdfeRodoviario setVeiculoTracao(MonitorDocumentMdfeRodoviarioVeiculoTracao value) { put("veiculo_tracao", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentMdfeRodoviarioValePedagio getValePedagio() { return (field("vale_pedagio")).isNull() || (field("vale_pedagio")).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioValePedagio(field("vale_pedagio")); }
 public MonitorDocumentMdfeRodoviario setValePedagio(MonitorDocumentMdfeRodoviarioValePedagio value) { put("vale_pedagio", value == null ? null : value.toJson()); return this; }
}
