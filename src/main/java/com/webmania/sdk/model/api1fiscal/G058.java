package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G058 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cfps", "id_cnae", "situacao_tributaria", "iss_retido");
 public G058() { super(FIELDS); }
 public G058(JsonNode node) { super(node, FIELDS); }
 public java.util.List<G059> getCfps() { return list(field("cfps"), v -> (v).isNull() || (v).isMissingNode() ? null : new G059(v)); }
 public G058 setCfps(java.util.List<G059> value) { put("cfps", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getIdCnae() { return stringValue(field("id_cnae")); }
 public G058 setIdCnae(String value) { put("id_cnae", Json.scalar(value)); return this; }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public G058 setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public G058 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
}
