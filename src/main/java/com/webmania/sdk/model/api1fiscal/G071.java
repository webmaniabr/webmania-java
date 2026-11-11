package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G071 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_credito");
 public G071() { super(FIELDS); }
 public G071(JsonNode node) { super(node, FIELDS); }
 public G071AliquotaCredito getAliquotaCredito() { return (field("aliquota_credito")).isNull() || (field("aliquota_credito")).isMissingNode() ? null : new G071AliquotaCredito(field("aliquota_credito")); }
 public G071 setAliquotaCredito(G071AliquotaCredito value) { put("aliquota_credito", value == null ? null : value.toJson()); return this; }
}
