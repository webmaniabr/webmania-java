package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G083 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "aliquota_diferimento_fcp", "codigo_beneficio_reducao_bc", "motivo_desoneracao");
 public G083() { super(FIELDS); }
 public G083(JsonNode node) { super(node, FIELDS); }
 public G083AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G083AliquotaDiferimento(field("aliquota_diferimento")); }
 public G083 setAliquotaDiferimento(G083AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public G083AliquotaDiferimentoFcp getAliquotaDiferimentoFcp() { return (field("aliquota_diferimento_fcp")).isNull() || (field("aliquota_diferimento_fcp")).isMissingNode() ? null : new G083AliquotaDiferimentoFcp(field("aliquota_diferimento_fcp")); }
 public G083 setAliquotaDiferimentoFcp(G083AliquotaDiferimentoFcp value) { put("aliquota_diferimento_fcp", value == null ? null : value.toJson()); return this; }
 public String getCodigoBeneficioReducaoBc() { return stringValue(field("codigo_beneficio_reducao_bc")); }
 public G083 setCodigoBeneficioReducaoBc(String value) { put("codigo_beneficio_reducao_bc", Json.scalar(value)); return this; }
 public String getMotivoDesoneracao() { return stringValue(field("motivo_desoneracao")); }
 public G083 setMotivoDesoneracao(String value) { put("motivo_desoneracao", Json.scalar(value)); return this; }
}
