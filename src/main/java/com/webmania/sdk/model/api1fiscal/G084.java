package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G084 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "quantidade_bc");
 public G084() { super(FIELDS); }
 public G084(JsonNode node) { super(node, FIELDS); }
 public G084AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G084AliquotaDiferimento(field("aliquota_diferimento")); }
 public G084 setAliquotaDiferimento(G084AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public G084QuantidadeBc getQuantidadeBc() { return (field("quantidade_bc")).isNull() || (field("quantidade_bc")).isMissingNode() ? null : new G084QuantidadeBc(field("quantidade_bc")); }
 public G084 setQuantidadeBc(G084QuantidadeBc value) { put("quantidade_bc", value == null ? null : value.toJson()); return this; }
}
