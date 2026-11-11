package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteDocumentosFiscaisItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "chave", "pin", "previsao_entrega", "modelo", "numero", "serie", "data_emissao", "valor_total", "cfop", "descricao");
 public MonitorDocumentCteDocumentosFiscaisItem() { super(FIELDS); }
 public MonitorDocumentCteDocumentosFiscaisItem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getTipo() { return integerValue(field("tipo")); }
 public MonitorDocumentCteDocumentosFiscaisItem setTipo(java.math.BigInteger value) { put("tipo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentCteDocumentosFiscaisItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getPin() { return stringValue(field("pin")); }
 public MonitorDocumentCteDocumentosFiscaisItem setPin(String value) { put("pin", Json.scalar(value)); return this; }
 public String getPrevisaoEntrega() { return stringValue(field("previsao_entrega")); }
 public MonitorDocumentCteDocumentosFiscaisItem setPrevisaoEntrega(String value) { put("previsao_entrega", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorDocumentCteDocumentosFiscaisItem setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public MonitorDocumentCteDocumentosFiscaisItemNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentCteDocumentosFiscaisItemNumero(field("numero")); }
 public MonitorDocumentCteDocumentosFiscaisItem setNumero(MonitorDocumentCteDocumentosFiscaisItemNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteDocumentosFiscaisItemSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorDocumentCteDocumentosFiscaisItemSerie(field("serie")); }
 public MonitorDocumentCteDocumentosFiscaisItem setSerie(MonitorDocumentCteDocumentosFiscaisItemSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentCteDocumentosFiscaisItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public MonitorDocumentCteDocumentosFiscaisItemValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new MonitorDocumentCteDocumentosFiscaisItemValorTotal(field("valor_total")); }
 public MonitorDocumentCteDocumentosFiscaisItem setValorTotal(MonitorDocumentCteDocumentosFiscaisItemValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
 public String getCfop() { return stringValue(field("cfop")); }
 public MonitorDocumentCteDocumentosFiscaisItem setCfop(String value) { put("cfop", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public MonitorDocumentCteDocumentosFiscaisItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
}
