package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentNfeFornecedorVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("razao_social", "documento", "uf");
 public MonitorDocumentNfeFornecedorVariant0() { super(FIELDS); }
 public MonitorDocumentNfeFornecedorVariant0(JsonNode node) { super(node, FIELDS); }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public MonitorDocumentNfeFornecedorVariant0 setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public MonitorDocumentNfeFornecedorVariant0Documento getDocumento() { return (field("documento")).isNull() || (field("documento")).isMissingNode() ? null : new MonitorDocumentNfeFornecedorVariant0Documento(field("documento")); }
 public MonitorDocumentNfeFornecedorVariant0 setDocumento(MonitorDocumentNfeFornecedorVariant0Documento value) { put("documento", value == null ? null : value.toJson()); return this; }
 public MonitorDocumentNfeFornecedorVariant0Uf getUf() { return (field("uf")).isNull() || (field("uf")).isMissingNode() ? null : new MonitorDocumentNfeFornecedorVariant0Uf(field("uf")); }
 public MonitorDocumentNfeFornecedorVariant0 setUf(MonitorDocumentNfeFornecedorVariant0Uf value) { put("uf", value == null ? null : value.toJson()); return this; }
}
