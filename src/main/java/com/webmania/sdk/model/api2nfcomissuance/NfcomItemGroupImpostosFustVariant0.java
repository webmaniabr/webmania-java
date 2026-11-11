package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosFustVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "valor", "valor_base_calculo");
 public NfcomItemGroupImpostosFustVariant0() { super(FIELDS); }
 public NfcomItemGroupImpostosFustVariant0(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosFustVariant0Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfcomItemGroupImpostosFustVariant0Aliquota(field("aliquota")); }
 public NfcomItemGroupImpostosFustVariant0 setAliquota(NfcomItemGroupImpostosFustVariant0Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosFustVariant0Valor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new NfcomItemGroupImpostosFustVariant0Valor(field("valor")); }
 public NfcomItemGroupImpostosFustVariant0 setValor(NfcomItemGroupImpostosFustVariant0Valor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosFustVariant0ValorBaseCalculo getValorBaseCalculo() { return (field("valor_base_calculo")).isNull() || (field("valor_base_calculo")).isMissingNode() ? null : new NfcomItemGroupImpostosFustVariant0ValorBaseCalculo(field("valor_base_calculo")); }
 public NfcomItemGroupImpostosFustVariant0 setValorBaseCalculo(NfcomItemGroupImpostosFustVariant0ValorBaseCalculo value) { put("valor_base_calculo", value == null ? null : value.toJson()); return this; }
}
