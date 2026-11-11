package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceCode extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "descricao", "id_cnae", "codigo_tributacao", "aliquota_sugerida");
 public NfseServiceCode() { super(FIELDS); }
 public NfseServiceCode(JsonNode node) { super(node, FIELDS); }
 public NfseServiceCodeCodigo getCodigo() { return (field("codigo")).isNull() || (field("codigo")).isMissingNode() ? null : new NfseServiceCodeCodigo(field("codigo")); }
 public NfseServiceCode setCodigo(NfseServiceCodeCodigo value) { put("codigo", value == null ? null : value.toJson()); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public NfseServiceCode setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public NfseServiceCodeIdCnae getIdCnae() { return (field("id_cnae")).isNull() || (field("id_cnae")).isMissingNode() ? null : new NfseServiceCodeIdCnae(field("id_cnae")); }
 public NfseServiceCode setIdCnae(NfseServiceCodeIdCnae value) { put("id_cnae", value == null ? null : value.toJson()); return this; }
 public NfseServiceCodeCodigoTributacao getCodigoTributacao() { return (field("codigo_tributacao")).isNull() || (field("codigo_tributacao")).isMissingNode() ? null : new NfseServiceCodeCodigoTributacao(field("codigo_tributacao")); }
 public NfseServiceCode setCodigoTributacao(NfseServiceCodeCodigoTributacao value) { put("codigo_tributacao", value == null ? null : value.toJson()); return this; }
 public NfseServiceCodeAliquotaSugerida getAliquotaSugerida() { return (field("aliquota_sugerida")).isNull() || (field("aliquota_sugerida")).isMissingNode() ? null : new NfseServiceCodeAliquotaSugerida(field("aliquota_sugerida")); }
 public NfseServiceCode setAliquotaSugerida(NfseServiceCodeAliquotaSugerida value) { put("aliquota_sugerida", value == null ? null : value.toJson()); return this; }
}
