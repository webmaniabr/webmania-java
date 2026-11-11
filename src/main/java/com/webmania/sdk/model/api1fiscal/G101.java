package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G101 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "valor_devolvido");
 public G101() { super(FIELDS); }
 public G101(JsonNode node) { super(node, FIELDS); }
 public G101AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G101AliquotaDiferimento(field("aliquota_diferimento")); }
 public G101 setAliquotaDiferimento(G101AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public G101ValorDevolvido getValorDevolvido() { return (field("valor_devolvido")).isNull() || (field("valor_devolvido")).isMissingNode() ? null : new G101ValorDevolvido(field("valor_devolvido")); }
 public G101 setValorDevolvido(G101ValorDevolvido value) { put("valor_devolvido", value == null ? null : value.toJson()); return this; }
}
