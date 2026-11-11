package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIcmsVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_icms", "codigo_cfop", "origem", "situacao_tributaria", "valor_base_calculo", "valor_icms");
 public NfcomItemGroupImpostosIcmsVariant0() { super(FIELDS); }
 public NfcomItemGroupImpostosIcmsVariant0(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosIcmsVariant0AliquotaIcms getAliquotaIcms() { return (field("aliquota_icms")).isNull() || (field("aliquota_icms")).isMissingNode() ? null : new NfcomItemGroupImpostosIcmsVariant0AliquotaIcms(field("aliquota_icms")); }
 public NfcomItemGroupImpostosIcmsVariant0 setAliquotaIcms(NfcomItemGroupImpostosIcmsVariant0AliquotaIcms value) { put("aliquota_icms", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIcmsVariant0CodigoCfop getCodigoCfop() { return (field("codigo_cfop")).isNull() || (field("codigo_cfop")).isMissingNode() ? null : new NfcomItemGroupImpostosIcmsVariant0CodigoCfop(field("codigo_cfop")); }
 public NfcomItemGroupImpostosIcmsVariant0 setCodigoCfop(NfcomItemGroupImpostosIcmsVariant0CodigoCfop value) { put("codigo_cfop", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIcmsVariant0Origem getOrigem() { return (field("origem")).isNull() || (field("origem")).isMissingNode() ? null : new NfcomItemGroupImpostosIcmsVariant0Origem(field("origem")); }
 public NfcomItemGroupImpostosIcmsVariant0 setOrigem(NfcomItemGroupImpostosIcmsVariant0Origem value) { put("origem", value == null ? null : value.toJson()); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfcomItemGroupImpostosIcmsVariant0 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public NfcomItemGroupImpostosIcmsVariant0ValorBaseCalculo getValorBaseCalculo() { return (field("valor_base_calculo")).isNull() || (field("valor_base_calculo")).isMissingNode() ? null : new NfcomItemGroupImpostosIcmsVariant0ValorBaseCalculo(field("valor_base_calculo")); }
 public NfcomItemGroupImpostosIcmsVariant0 setValorBaseCalculo(NfcomItemGroupImpostosIcmsVariant0ValorBaseCalculo value) { put("valor_base_calculo", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIcmsVariant0ValorIcms getValorIcms() { return (field("valor_icms")).isNull() || (field("valor_icms")).isMissingNode() ? null : new NfcomItemGroupImpostosIcmsVariant0ValorIcms(field("valor_icms")); }
 public NfcomItemGroupImpostosIcmsVariant0 setValorIcms(NfcomItemGroupImpostosIcmsVariant0ValorIcms value) { put("valor_icms", value == null ? null : value.toJson()); return this; }
}
