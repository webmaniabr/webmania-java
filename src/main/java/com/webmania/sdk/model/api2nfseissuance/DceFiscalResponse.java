package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class DceFiscalResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "uuid", "chave", "serie", "status", "motivo", "modelo", "xml", "xml_cancelamento", "log", "numero", "dace");
 public DceFiscalResponse() { super(FIELDS); }
 public DceFiscalResponse(JsonNode node) { super(node, FIELDS); }
 public DceFiscalResponseID getID() { return (field("ID")).isNull() || (field("ID")).isMissingNode() ? null : new DceFiscalResponseID(field("ID")); }
 public DceFiscalResponse setID(DceFiscalResponseID value) { put("ID", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public DceFiscalResponse setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public DceFiscalResponseChave getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new DceFiscalResponseChave(field("chave")); }
 public DceFiscalResponse setChave(DceFiscalResponseChave value) { put("chave", value == null ? null : value.toJson()); return this; }
 public DceFiscalResponseSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new DceFiscalResponseSerie(field("serie")); }
 public DceFiscalResponse setSerie(DceFiscalResponseSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public DceFiscalResponse setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public DceFiscalResponseMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new DceFiscalResponseMotivo(field("motivo")); }
 public DceFiscalResponse setMotivo(DceFiscalResponseMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public DceFiscalResponse setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public DceFiscalResponseXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new DceFiscalResponseXml(field("xml")); }
 public DceFiscalResponse setXml(DceFiscalResponseXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public DceFiscalResponseXmlCancelamento getXmlCancelamento() { return (field("xml_cancelamento")).isNull() || (field("xml_cancelamento")).isMissingNode() ? null : new DceFiscalResponseXmlCancelamento(field("xml_cancelamento")); }
 public DceFiscalResponse setXmlCancelamento(DceFiscalResponseXmlCancelamento value) { put("xml_cancelamento", value == null ? null : value.toJson()); return this; }
 public DceFiscalResponseLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new DceFiscalResponseLog(field("log")); }
 public DceFiscalResponse setLog(DceFiscalResponseLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public DceFiscalResponseNumero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new DceFiscalResponseNumero(field("numero")); }
 public DceFiscalResponse setNumero(DceFiscalResponseNumero value) { put("numero", value == null ? null : value.toJson()); return this; }
 public String getDace() { return stringValue(field("dace")); }
 public DceFiscalResponse setDace(String value) { put("dace", Json.scalar(value)); return this; }
}
