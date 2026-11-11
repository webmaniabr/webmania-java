package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G068 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj", "contato", "email", "telefone", "id_csrt", "csrt");
 public G068() { super(FIELDS); }
 public G068(JsonNode node) { super(node, FIELDS); }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public G068 setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getContato() { return stringValue(field("contato")); }
 public G068 setContato(String value) { put("contato", Json.scalar(value)); return this; }
 public String getEmail() { return stringValue(field("email")); }
 public G068 setEmail(String value) { put("email", Json.scalar(value)); return this; }
 public String getTelefone() { return stringValue(field("telefone")); }
 public G068 setTelefone(String value) { put("telefone", Json.scalar(value)); return this; }
 public String getIdCsrt() { return stringValue(field("id_csrt")); }
 public G068 setIdCsrt(String value) { put("id_csrt", Json.scalar(value)); return this; }
 public String getCsrt() { return stringValue(field("csrt")); }
 public G068 setCsrt(String value) { put("csrt", Json.scalar(value)); return this; }
}
