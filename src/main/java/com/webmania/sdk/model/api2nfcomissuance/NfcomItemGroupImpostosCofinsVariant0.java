package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosCofinsVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "situacao_tributaria", "valor", "valor_base_calculo");
 public NfcomItemGroupImpostosCofinsVariant0() { super(FIELDS); }
 public NfcomItemGroupImpostosCofinsVariant0(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosCofinsVariant0Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfcomItemGroupImpostosCofinsVariant0Aliquota(field("aliquota")); }
 public NfcomItemGroupImpostosCofinsVariant0 setAliquota(NfcomItemGroupImpostosCofinsVariant0Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfcomItemGroupImpostosCofinsVariant0 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public NfcomItemGroupImpostosCofinsVariant0Valor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new NfcomItemGroupImpostosCofinsVariant0Valor(field("valor")); }
 public NfcomItemGroupImpostosCofinsVariant0 setValor(NfcomItemGroupImpostosCofinsVariant0Valor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosCofinsVariant0ValorBaseCalculo getValorBaseCalculo() { return (field("valor_base_calculo")).isNull() || (field("valor_base_calculo")).isMissingNode() ? null : new NfcomItemGroupImpostosCofinsVariant0ValorBaseCalculo(field("valor_base_calculo")); }
 public NfcomItemGroupImpostosCofinsVariant0 setValorBaseCalculo(NfcomItemGroupImpostosCofinsVariant0ValorBaseCalculo value) { put("valor_base_calculo", value == null ? null : value.toJson()); return this; }
}
