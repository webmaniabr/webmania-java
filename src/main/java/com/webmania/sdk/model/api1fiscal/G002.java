package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G002 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "status", "motivo", "nfe", "serie", "recibo", "chave", "modelo", "epec", "xml", "danfe", "log", "data", "log_cancelamento");
 public G002() { super(FIELDS); }
 public G002(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public G002 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public G002 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public G002 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfe() { return integerValue(field("nfe")); }
 public G002 setNfe(java.math.BigInteger value) { put("nfe", Json.scalar(value)); return this; }
 public java.math.BigInteger getSerie() { return integerValue(field("serie")); }
 public G002 setSerie(java.math.BigInteger value) { put("serie", Json.scalar(value)); return this; }
 public String getRecibo() { return stringValue(field("recibo")); }
 public G002 setRecibo(String value) { put("recibo", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public G002 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public G002 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public Boolean getEpec() { return booleanValue(field("epec")); }
 public G002 setEpec(Boolean value) { put("epec", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public G002 setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getDanfe() { return stringValue(field("danfe")); }
 public G002 setDanfe(String value) { put("danfe", Json.scalar(value)); return this; }
 public G002Log getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new G002Log(field("log")); }
 public G002 setLog(G002Log value) { put("log", value == null ? null : value.toJson()); return this; }
 public NfeIssueRequest getData() { return (field("data")).isNull() || (field("data")).isMissingNode() ? null : new NfeIssueRequest(field("data")); }
 public G002 setData(NfeIssueRequest value) { put("data", value == null ? null : value.toJson()); return this; }
 public G002LogCancelamento getLogCancelamento() { return (field("log_cancelamento")).isNull() || (field("log_cancelamento")).isMissingNode() ? null : new G002LogCancelamento(field("log_cancelamento")); }
 public G002 setLogCancelamento(G002LogCancelamento value) { put("log_cancelamento", value == null ? null : value.toJson()); return this; }
}
