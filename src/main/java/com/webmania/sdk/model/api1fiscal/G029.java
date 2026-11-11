package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G029 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("vencimento", "valor");
 public G029() { super(FIELDS); }
 public G029(JsonNode node) { super(node, FIELDS); }
 public String getVencimento() { return stringValue(field("vencimento")); }
 public G029 setVencimento(String value) { put("vencimento", Json.scalar(value)); return this; }
 public G029Valor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new G029Valor(field("valor")); }
 public G029 setValor(G029Valor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
