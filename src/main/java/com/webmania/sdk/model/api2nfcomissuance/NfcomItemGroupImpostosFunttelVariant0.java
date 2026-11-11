package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosFunttelVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "valor", "valor_base_calculo");
 public NfcomItemGroupImpostosFunttelVariant0() { super(FIELDS); }
 public NfcomItemGroupImpostosFunttelVariant0(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosFunttelVariant0Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfcomItemGroupImpostosFunttelVariant0Aliquota(field("aliquota")); }
 public NfcomItemGroupImpostosFunttelVariant0 setAliquota(NfcomItemGroupImpostosFunttelVariant0Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosFunttelVariant0Valor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new NfcomItemGroupImpostosFunttelVariant0Valor(field("valor")); }
 public NfcomItemGroupImpostosFunttelVariant0 setValor(NfcomItemGroupImpostosFunttelVariant0Valor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosFunttelVariant0ValorBaseCalculo getValorBaseCalculo() { return (field("valor_base_calculo")).isNull() || (field("valor_base_calculo")).isMissingNode() ? null : new NfcomItemGroupImpostosFunttelVariant0ValorBaseCalculo(field("valor_base_calculo")); }
 public NfcomItemGroupImpostosFunttelVariant0 setValorBaseCalculo(NfcomItemGroupImpostosFunttelVariant0ValorBaseCalculo value) { put("valor_base_calculo", value == null ? null : value.toJson()); return this; }
}
