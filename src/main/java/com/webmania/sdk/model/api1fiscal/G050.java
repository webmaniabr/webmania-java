package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G050 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento");
 public G050() { super(FIELDS); }
 public G050(JsonNode node) { super(node, FIELDS); }
 public G050AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G050AliquotaDiferimento(field("aliquota_diferimento")); }
 public G050 setAliquotaDiferimento(G050AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
}
