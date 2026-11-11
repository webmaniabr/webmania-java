package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G010 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("id_estrangeiro", "nome_estrangeiro", "cod_pais", "nome_pais", "endereco", "bairro", "numero", "complemento");
 public G010() { super(FIELDS); }
 public G010(JsonNode node) { super(node, FIELDS); }
 public String getIdEstrangeiro() { return stringValue(field("id_estrangeiro")); }
 public G010 setIdEstrangeiro(String value) { put("id_estrangeiro", Json.scalar(value)); return this; }
 public String getNomeEstrangeiro() { return stringValue(field("nome_estrangeiro")); }
 public G010 setNomeEstrangeiro(String value) { put("nome_estrangeiro", Json.scalar(value)); return this; }
 public String getCodPais() { return stringValue(field("cod_pais")); }
 public G010 setCodPais(String value) { put("cod_pais", Json.scalar(value)); return this; }
 public String getNomePais() { return stringValue(field("nome_pais")); }
 public G010 setNomePais(String value) { put("nome_pais", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public G010 setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getBairro() { return stringValue(field("bairro")); }
 public G010 setBairro(String value) { put("bairro", Json.scalar(value)); return this; }
 public String getNumero() { return stringValue(field("numero")); }
 public G010 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public String getComplemento() { return stringValue(field("complemento")); }
 public G010 setComplemento(String value) { put("complemento", Json.scalar(value)); return this; }
}
