package com.webmania.sdk.model.api2monitormanagement;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-management.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioValePedagioVariant1Item extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_fornecedor", "cnpj_responsavel", "cpf_responsavel", "valor", "comprovante");
 public MonitorDocumentMdfeRodoviarioValePedagioVariant1Item() { super(FIELDS); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant1Item(JsonNode node) { super(node, FIELDS); }
 public String getCnpjFornecedor() { return stringValue(field("cnpj_fornecedor")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant1Item setCnpjFornecedor(String value) { put("cnpj_fornecedor", Json.scalar(value)); return this; }
 public String getCnpjResponsavel() { return stringValue(field("cnpj_responsavel")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant1Item setCnpjResponsavel(String value) { put("cnpj_responsavel", Json.scalar(value)); return this; }
 public String getCpfResponsavel() { return stringValue(field("cpf_responsavel")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant1Item setCpfResponsavel(String value) { put("cpf_responsavel", Json.scalar(value)); return this; }
 public String getValor() { return stringValue(field("valor")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant1Item setValor(String value) { put("valor", Json.scalar(value)); return this; }
 public String getComprovante() { return stringValue(field("comprovante")); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant1Item setComprovante(String value) { put("comprovante", Json.scalar(value)); return this; }
}
