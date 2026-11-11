package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G044 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("estado", "codigo_beneficio_fiscal", "aliquota");
 public G044() { super(FIELDS); }
 public G044(JsonNode node) { super(node, FIELDS); }
 public String getEstado() { return stringValue(field("estado")); }
 public G044 setEstado(String value) { put("estado", Json.scalar(value)); return this; }
 public String getCodigoBeneficioFiscal() { return stringValue(field("codigo_beneficio_fiscal")); }
 public G044 setCodigoBeneficioFiscal(String value) { put("codigo_beneficio_fiscal", Json.scalar(value)); return this; }
 public G044Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G044Aliquota(field("aliquota")); }
 public G044 setAliquota(G044Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
