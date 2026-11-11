package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeFiscalResponse extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ID", "uuid", "chave", "serie", "status", "motivo", "modelo", "xml", "xml_cancelamento", "log", "mdfe", "damdfe");
 public MdfeFiscalResponse() { super(FIELDS); }
 public MdfeFiscalResponse(JsonNode node) { super(node, FIELDS); }
 public MdfeFiscalResponseID getID() { return (field("ID")).isNull() || (field("ID")).isMissingNode() ? null : new MdfeFiscalResponseID(field("ID")); }
 public MdfeFiscalResponse setID(MdfeFiscalResponseID value) { put("ID", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public MdfeFiscalResponse setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public MdfeFiscalResponseChave getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new MdfeFiscalResponseChave(field("chave")); }
 public MdfeFiscalResponse setChave(MdfeFiscalResponseChave value) { put("chave", value == null ? null : value.toJson()); return this; }
 public MdfeFiscalResponseSerie getSerie() { return (field("serie")).isNull() || (field("serie")).isMissingNode() ? null : new MdfeFiscalResponseSerie(field("serie")); }
 public MdfeFiscalResponse setSerie(MdfeFiscalResponseSerie value) { put("serie", value == null ? null : value.toJson()); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public MdfeFiscalResponse setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public MdfeFiscalResponseMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new MdfeFiscalResponseMotivo(field("motivo")); }
 public MdfeFiscalResponse setMotivo(MdfeFiscalResponseMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public MdfeFiscalResponse setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public MdfeFiscalResponseXml getXml() { return (field("xml")).isNull() || (field("xml")).isMissingNode() ? null : new MdfeFiscalResponseXml(field("xml")); }
 public MdfeFiscalResponse setXml(MdfeFiscalResponseXml value) { put("xml", value == null ? null : value.toJson()); return this; }
 public MdfeFiscalResponseXmlCancelamento getXmlCancelamento() { return (field("xml_cancelamento")).isNull() || (field("xml_cancelamento")).isMissingNode() ? null : new MdfeFiscalResponseXmlCancelamento(field("xml_cancelamento")); }
 public MdfeFiscalResponse setXmlCancelamento(MdfeFiscalResponseXmlCancelamento value) { put("xml_cancelamento", value == null ? null : value.toJson()); return this; }
 public MdfeFiscalResponseLog getLog() { return (field("log")).isNull() || (field("log")).isMissingNode() ? null : new MdfeFiscalResponseLog(field("log")); }
 public MdfeFiscalResponse setLog(MdfeFiscalResponseLog value) { put("log", value == null ? null : value.toJson()); return this; }
 public MdfeFiscalResponseMdfe getMdfe() { return (field("mdfe")).isNull() || (field("mdfe")).isMissingNode() ? null : new MdfeFiscalResponseMdfe(field("mdfe")); }
 public MdfeFiscalResponse setMdfe(MdfeFiscalResponseMdfe value) { put("mdfe", value == null ? null : value.toJson()); return this; }
 public MdfeFiscalResponseDamdfe getDamdfe() { return (field("damdfe")).isNull() || (field("damdfe")).isMissingNode() ? null : new MdfeFiscalResponseDamdfe(field("damdfe")); }
 public MdfeFiscalResponse setDamdfe(MdfeFiscalResponseDamdfe value) { put("damdfe", value == null ? null : value.toJson()); return this; }
}
