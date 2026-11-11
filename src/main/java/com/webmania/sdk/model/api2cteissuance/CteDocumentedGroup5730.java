package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class CteDocumentedGroup5730 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "comprovante", "nome_recebedor", "documento_recebedor", "notas_fiscais", "data_hora", "informacoes", "longitude", "latitude");
 public CteDocumentedGroup5730() { super(FIELDS); }
 public CteDocumentedGroup5730(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public CteDocumentedGroup5730 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getComprovante() { return stringValue(field("comprovante")); }
 public CteDocumentedGroup5730 setComprovante(String value) { put("comprovante", Json.scalar(value)); return this; }
 public String getNomeRecebedor() { return stringValue(field("nome_recebedor")); }
 public CteDocumentedGroup5730 setNomeRecebedor(String value) { put("nome_recebedor", Json.scalar(value)); return this; }
 public String getDocumentoRecebedor() { return stringValue(field("documento_recebedor")); }
 public CteDocumentedGroup5730 setDocumentoRecebedor(String value) { put("documento_recebedor", Json.scalar(value)); return this; }
 public String getNotasFiscais() { return stringValue(field("notas_fiscais")); }
 public CteDocumentedGroup5730 setNotasFiscais(String value) { put("notas_fiscais", Json.scalar(value)); return this; }
 public String getDataHora() { return stringValue(field("data_hora")); }
 public CteDocumentedGroup5730 setDataHora(String value) { put("data_hora", Json.scalar(value)); return this; }
 public String getInformacoes() { return stringValue(field("informacoes")); }
 public CteDocumentedGroup5730 setInformacoes(String value) { put("informacoes", Json.scalar(value)); return this; }
 public String getLongitude() { return stringValue(field("longitude")); }
 public CteDocumentedGroup5730 setLongitude(String value) { put("longitude", Json.scalar(value)); return this; }
 public String getLatitude() { return stringValue(field("latitude")); }
 public CteDocumentedGroup5730 setLatitude(String value) { put("latitude", Json.scalar(value)); return this; }
}
