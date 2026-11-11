package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentCteOsDocumentosFiscaisItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo", "chave", "pin", "previsao_entrega", "modelo", "numero", "serie", "data_emissao", "valor_total", "cfop", "descricao");
 public MonitorDocumentCteOsDocumentosFiscaisItem() { super(FIELDS); }
 public MonitorDocumentCteOsDocumentosFiscaisItem(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getTipo() { return integerValue(field("tipo")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setTipo(java.math.BigInteger value) { put("tipo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getPin() { return stringValue(field("pin")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setPin(String value) { put("pin", Json.scalar(value)); return this; }
 public String getPrevisaoEntrega() { return stringValue(field("previsao_entrega")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setPrevisaoEntrega(String value) { put("previsao_entrega", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsDocumentosFiscaisItemNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new MonitorDocumentCteOsDocumentosFiscaisItemNumero(field("numero")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setNumero(MonitorDocumentCteOsDocumentosFiscaisItemNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentCteOsDocumentosFiscaisItemSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MonitorDocumentCteOsDocumentosFiscaisItemSerie(field("serie")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setSerie(MonitorDocumentCteOsDocumentosFiscaisItemSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getDataEmissao() { return stringValue(field("data_emissao")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setDataEmissao(String value) { put("data_emissao", Json.scalar(value)); return this; }
 public MonitorDocumentCteOsDocumentosFiscaisItemValorTotal getValorTotal() { return (field("valor_total")).isNull() || (field("valor_total")).isMissingNode() ? null : new MonitorDocumentCteOsDocumentosFiscaisItemValorTotal(field("valor_total")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setValorTotal(MonitorDocumentCteOsDocumentosFiscaisItemValorTotal value) { put("valor_total", value == null ? null : value.toJson()); return this; }
 public String getCfop() { return stringValue(field("cfop")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setCfop(String value) { put("cfop", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public MonitorDocumentCteOsDocumentosFiscaisItem setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
}
