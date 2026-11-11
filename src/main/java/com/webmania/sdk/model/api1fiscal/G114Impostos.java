package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G114Impostos extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ibs_cbs");
 public G114Impostos() { super(FIELDS); }
 public G114Impostos(JsonNode node) { super(node, FIELDS); }
 public G114ImpostosIbsCbs getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G114ImpostosIbsCbs(field("ibs_cbs")); }
 public G114Impostos setIbsCbs(G114ImpostosIbsCbs value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
