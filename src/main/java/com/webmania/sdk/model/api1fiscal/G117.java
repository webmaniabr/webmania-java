package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G117 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_cfop", "bc_ipi", "valor_ipi");
 public G117() { super(FIELDS); }
 public G117(JsonNode node) { super(node, FIELDS); }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public G117 setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
 public G117BcIpi getBcIpi() { return (field("bc_ipi")).isNull() || (field("bc_ipi")).isMissingNode() ? null : new G117BcIpi(field("bc_ipi")); }
 public G117 setBcIpi(G117BcIpi value) { put("bc_ipi", value == null ? null : value.toJson()); return this; }
 public G117ValorIpi getValorIpi() { return (field("valor_ipi")).isNull() || (field("valor_ipi")).isMissingNode() ? null : new G117ValorIpi(field("valor_ipi")); }
 public G117 setValorIpi(G117ValorIpi value) { put("valor_ipi", value == null ? null : value.toJson()); return this; }
}
