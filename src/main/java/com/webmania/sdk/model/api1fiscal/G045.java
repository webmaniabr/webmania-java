package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G045 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cenario", "tipo_pessoa", "situacao_tributaria", "codigo_enquadramento", "aliquota");
 public G045() { super(FIELDS); }
 public G045(JsonNode node) { super(node, FIELDS); }
 public String getCenario() { return stringValue(field("cenario")); }
 public G045 setCenario(String value) { put("cenario", Json.scalar(value)); return this; }
 public String getTipoPessoa() { return stringValue(field("tipo_pessoa")); }
 public G045 setTipoPessoa(String value) { put("tipo_pessoa", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G045 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getCodigoEnquadramento() { return stringValue(field("codigo_enquadramento")); }
 public G045 setCodigoEnquadramento(String value) { put("codigo_enquadramento", Json.scalar(value)); return this; }
 public G045Aliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new G045Aliquota(field("aliquota")); }
 public G045 setAliquota(G045Aliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
}
