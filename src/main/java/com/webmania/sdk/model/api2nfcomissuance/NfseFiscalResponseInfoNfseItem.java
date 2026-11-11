package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfseFiscalResponseInfoNfseItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "modelo", "status", "motivo", "numero", "codigo_verificacao", "xml", "pdf_nfse", "pdf_nfse_status", "pdf_rps");
 public NfseFiscalResponseInfoNfseItem() { super(FIELDS); }
 public NfseFiscalResponseInfoNfseItem(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public NfseFiscalResponseInfoNfseItem setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public NfseFiscalResponseInfoNfseItem setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public NfseFiscalResponseInfoNfseItem setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public NfseFiscalResponseInfoNfseItemMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new NfseFiscalResponseInfoNfseItemMotivo(field("motivo")); }
 public NfseFiscalResponseInfoNfseItem setMotivo(NfseFiscalResponseInfoNfseItemMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public NfseFiscalResponseInfoNfseItem setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getCodigoVerificacao() { return stringValue(field("codigo_verificacao")); }
 public NfseFiscalResponseInfoNfseItem setCodigoVerificacao(String value) { put("codigo_verificacao", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public NfseFiscalResponseInfoNfseItem setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getPdfNfse() { return stringValue(field("pdf_nfse")); }
 public NfseFiscalResponseInfoNfseItem setPdfNfse(String value) { put("pdf_nfse", Json.scalar(value)); return this; }
 public String getPdfNfseStatus() { return stringValue(field("pdf_nfse_status")); }
 public NfseFiscalResponseInfoNfseItem setPdfNfseStatus(String value) { put("pdf_nfse_status", Json.scalar(value)); return this; }
 public String getPdfRps() { return stringValue(field("pdf_rps")); }
 public NfseFiscalResponseInfoNfseItem setPdfRps(String value) { put("pdf_rps", Json.scalar(value)); return this; }
}
