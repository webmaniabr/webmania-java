package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G076 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pauta_fiscal");
 public G076() { super(FIELDS); }
 public G076(JsonNode node) { super(node, FIELDS); }
 public G076PautaFiscal getPautaFiscal() { return (field("pauta_fiscal")).isNull() || (field("pauta_fiscal")).isMissingNode() ? null : new G076PautaFiscal(field("pauta_fiscal")); }
 public G076 setPautaFiscal(G076PautaFiscal value) { put("pauta_fiscal", value == null ? null : value.toJson()); return this; }
}
