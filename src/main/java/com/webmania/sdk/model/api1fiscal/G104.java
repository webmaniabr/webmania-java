package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G104 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_aplicacao", "numero_processo_suframa", "aliquota_efetiva_referencia", "valor_efetivo_referencia");
 public G104() { super(FIELDS); }
 public G104(JsonNode node) { super(node, FIELDS); }
 public String getTipoAplicacao() { return stringValue(field("tipo_aplicacao")); }
 public G104 setTipoAplicacao(String value) { put("tipo_aplicacao", Json.scalar(value)); return this; }
 public String getNumeroProcessoSuframa() { return stringValue(field("numero_processo_suframa")); }
 public G104 setNumeroProcessoSuframa(String value) { put("numero_processo_suframa", Json.scalar(value)); return this; }
 public G104AliquotaEfetivaReferencia getAliquotaEfetivaReferencia() { return (field("aliquota_efetiva_referencia")).isNull() || (field("aliquota_efetiva_referencia")).isMissingNode() ? null : new G104AliquotaEfetivaReferencia(field("aliquota_efetiva_referencia")); }
 public G104 setAliquotaEfetivaReferencia(G104AliquotaEfetivaReferencia value) { put("aliquota_efetiva_referencia", value == null ? null : value.toJson()); return this; }
 public G104ValorEfetivoReferencia getValorEfetivoReferencia() { return (field("valor_efetivo_referencia")).isNull() || (field("valor_efetivo_referencia")).isMissingNode() ? null : new G104ValorEfetivoReferencia(field("valor_efetivo_referencia")); }
 public G104 setValorEfetivoReferencia(G104ValorEfetivoReferencia value) { put("valor_efetivo_referencia", value == null ? null : value.toJson()); return this; }
}
