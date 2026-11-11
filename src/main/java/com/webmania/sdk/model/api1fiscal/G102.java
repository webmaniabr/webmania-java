package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G102 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "valor_devolvido");
 public G102() { super(FIELDS); }
 public G102(JsonNode node) { super(node, FIELDS); }
 public G102AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G102AliquotaDiferimento(field("aliquota_diferimento")); }
 public G102 setAliquotaDiferimento(G102AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public G102ValorDevolvido getValorDevolvido() { return (field("valor_devolvido")).isNull() || (field("valor_devolvido")).isMissingNode() ? null : new G102ValorDevolvido(field("valor_devolvido")); }
 public G102 setValorDevolvido(G102ValorDevolvido value) { put("valor_devolvido", value == null ? null : value.toJson()); return this; }
}
