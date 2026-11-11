package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioValePedagioVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_fornecedor", "cnpj_responsavel", "numero_comprovante", "valor");
 public MonitorDocumentMdfeRodoviarioValePedagioVariant0() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant0(JsonNode node) { super(node, FIELDS); }
 public String getCnpjFornecedor() { return stringValue(field("cnpj_fornecedor")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant0 setCnpjFornecedor(String value) { put("cnpj_fornecedor", Json.scalar(value)); return this; }
 public String getCnpjResponsavel() { return stringValue(field("cnpj_responsavel")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant0 setCnpjResponsavel(String value) { put("cnpj_responsavel", Json.scalar(value)); return this; }
 public String getNumeroComprovante() { return stringValue(field("numero_comprovante")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant0 setNumeroComprovante(String value) { put("numero_comprovante", Json.scalar(value)); return this; }
 public java.math.BigDecimal getValor() { return decimalValue(field("valor")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant0 setValor(java.math.BigDecimal value) { put("valor", Json.scalar(value)); return this; }
}
