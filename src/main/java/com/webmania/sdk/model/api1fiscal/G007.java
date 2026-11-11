package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G007 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("uf", "data", "cpf", "cnpj", "ie", "modelo", "serie", "numero");
 public G007() { super(FIELDS); }
 public G007(JsonNode node) { super(node, FIELDS); }
 public String getUf() { return stringValue(field("uf")); }
 public G007 setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getData() { return stringValue(field("data")); }
 public G007 setData(String value) { put("data", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public G007 setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public G007 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public G007 setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public G007 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getSerie() { return stringValue(field("serie")); }
 public G007 setSerie(String value) { put("serie", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public G007 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
}
