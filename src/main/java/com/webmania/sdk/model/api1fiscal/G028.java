package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G028 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("numero", "valor", "desconto", "valor_liquido");
 public G028() { super(FIELDS); }
 public G028(JsonNode node) { super(node, FIELDS); }
 public String getNumero() { return stringValue(field("numero")); }
 public G028 setNumero(String value) { put("numero", Json.scalar(value)); return this; }
 public G028Valor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new G028Valor(field("valor")); }
 public G028 setValor(G028Valor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public G028Desconto getDesconto() { return (field("desconto")).isNull() || (field("desconto")).isMissingNode() ? null : new G028Desconto(field("desconto")); }
 public G028 setDesconto(G028Desconto value) { put("desconto", value == null ? null : value.toJson()); return this; }
 public G028ValorLiquido getValorLiquido() { return (field("valor_liquido")).isNull() || (field("valor_liquido")).isMissingNode() ? null : new G028ValorLiquido(field("valor_liquido")); }
 public G028 setValorLiquido(G028ValorLiquido value) { put("valor_liquido", value == null ? null : value.toJson()); return this; }
}
