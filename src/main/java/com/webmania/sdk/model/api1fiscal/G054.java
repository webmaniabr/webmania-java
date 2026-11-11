package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G054 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento");
 public G054() { super(FIELDS); }
 public G054(JsonNode node) { super(node, FIELDS); }
 public G054AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G054AliquotaDiferimento(field("aliquota_diferimento")); }
 public G054 setAliquotaDiferimento(G054AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
}
