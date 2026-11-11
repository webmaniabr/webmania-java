package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeDocumentedGroup3210 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uuid", "uf", "municipio", "codigo_municipio");
 public MdfeDocumentedGroup3210() { super(FIELDS); }
 public MdfeDocumentedGroup3210(JsonNode node) { super(node, FIELDS); }
 public String getUuid() { return stringValue(field("uuid")); }
 public MdfeDocumentedGroup3210 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public MdfeDocumentedGroup3210 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getMunicipio() { return stringValue(field("municipio")); }
 public MdfeDocumentedGroup3210 setMunicipio(String value) { put("municipio", Json.scalar(value)); return this; }
 public String getCodigoMunicipio() { return stringValue(field("codigo_municipio")); }
 public MdfeDocumentedGroup3210 setCodigoMunicipio(String value) { put("codigo_municipio", Json.scalar(value)); return this; }
}
