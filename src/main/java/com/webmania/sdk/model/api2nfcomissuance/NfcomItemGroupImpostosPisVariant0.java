package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosPisVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota", "situacao_tributaria", "valor", "valor_base_calculo");
 public NfcomItemGroupImpostosPisVariant0() { super(FIELDS); }
 public NfcomItemGroupImpostosPisVariant0(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosPisVariant0Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfcomItemGroupImpostosPisVariant0Aliquota(field("aliquota")); }
 public NfcomItemGroupImpostosPisVariant0 setAliquota(NfcomItemGroupImpostosPisVariant0Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfcomItemGroupImpostosPisVariant0 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public NfcomItemGroupImpostosPisVariant0Valor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new NfcomItemGroupImpostosPisVariant0Valor(field("valor")); }
 public NfcomItemGroupImpostosPisVariant0 setValor(NfcomItemGroupImpostosPisVariant0Valor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosPisVariant0ValorBaseCalculo getValorBaseCalculo() { return (field("valor_base_calculo")).isNull() || (field("valor_base_calculo")).isMissingNode() ? null : new NfcomItemGroupImpostosPisVariant0ValorBaseCalculo(field("valor_base_calculo")); }
 public NfcomItemGroupImpostosPisVariant0 setValorBaseCalculo(NfcomItemGroupImpostosPisVariant0ValorBaseCalculo value) { put("valor_base_calculo", value == null ? null : value.toJson()); return this; }
}
