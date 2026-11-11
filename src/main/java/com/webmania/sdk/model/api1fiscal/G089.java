package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G089 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("pauta_fiscal");
 public G089() { super(FIELDS); }
 public G089(JsonNode node) { super(node, FIELDS); }
 public G089PautaFiscal getPautaFiscal() { return (field("pauta_fiscal")).isNull() || (field("pauta_fiscal")).isMissingNode() ? null : new G089PautaFiscal(field("pauta_fiscal")); }
 public G089 setPautaFiscal(G089PautaFiscal value) { put("pauta_fiscal", value == null ? null : value.toJson()); return this; }
}
