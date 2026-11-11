package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorImportRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("empresa_uuid", "chave", "xml", "url_arquivo_zip");
 public MonitorImportRequest() { super(FIELDS); }
 public MonitorImportRequest(JsonNode node) { super(node, FIELDS); }
 public String getEmpresaUuid() { return stringValue(field("empresa_uuid")); }
 public MonitorImportRequest setEmpresaUuid(String value) { put("empresa_uuid", Json.scalar(value)); return this; }
 public String getChave() { return stringValue(field("chave")); }
 public MonitorImportRequest setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getXml() { return stringValue(field("xml")); }
 public MonitorImportRequest setXml(String value) { put("xml", Json.scalar(value)); return this; }
 public String getUrlArquivoZip() { return stringValue(field("url_arquivo_zip")); }
 public MonitorImportRequest setUrlArquivoZip(String value) { put("url_arquivo_zip", Json.scalar(value)); return this; }
}
