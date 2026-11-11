package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G091 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_beneficio_fiscal", "aliquota", "valor");
 public G091() { super(FIELDS); }
 public G091(JsonNode node) { super(node, FIELDS); }
 public String getCodigoBeneficioFiscal() { return stringValue(field("codigo_beneficio_fiscal")); }
 public G091 setCodigoBeneficioFiscal(String value) { put("codigo_beneficio_fiscal", Json.scalar(value)); return this; }
 public G091Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G091Aliquota(field("aliquota")); }
 public G091 setAliquota(G091Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public G091Valor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new G091Valor(field("valor")); }
 public G091 setValor(G091Valor value) { put("valor", value == null ? null : value.toJson()); return this; }
}
