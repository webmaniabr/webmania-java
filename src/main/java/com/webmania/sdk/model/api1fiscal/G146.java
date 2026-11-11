package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G146 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cep", "endereco", "numero", "complemento", "bairro", "cidade", "uf");
 public G146() { super(FIELDS); }
 public G146(JsonNode node) { super(node, FIELDS); }
 public String getCep() { return stringValue(field("cep")); }
 public G146 setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public G146 setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public G146 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public G146 setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public G146 setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public G146 setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public G146 setUf(String value) { put("uf", Json.scalar(value)); return this; }
}
