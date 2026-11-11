package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G047 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "tipo_pessoa", "situacao_tributaria", "aliquota");
 public G047() { super(FIELDS); }
 public G047(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public G047 setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public G047 setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G047 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public G047Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G047Aliquota(field("aliquota")); }
 public G047 setAliquota(G047Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
