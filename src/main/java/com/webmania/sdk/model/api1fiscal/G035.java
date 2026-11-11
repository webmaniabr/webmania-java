package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G035 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("referencia", "descricao", "icms", "ipi", "pis", "cofins", "issqn", "ibs_cbs", "informacoes_fisco", "informacoes_complementares");
 public G035() { super(FIELDS); }
 public G035(JsonNode node) { super(node, FIELDS); }
 public String getReferencia() { return stringValue(field("referencia")); }
 public G035 setReferencia(String value) { put("referencia", Json.scalar(value)); return this; }
 public String getDescricao() { return stringValue(field("descricao")); }
 public G035 setDescricao(String value) { put("descricao", Json.scalar(value)); return this; }
 public java.util.List<G037> getIcms() { return list(field("icms"), v -> (v).isNull() || (v).isMissingNode() ? null : new G037(v)); }
 public G035 setIcms(java.util.List<G037> value) { put("icms", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G045> getIpi() { return list(field("ipi"), v -> (v).isNull() || (v).isMissingNode() ? null : new G045(v)); }
 public G035 setIpi(java.util.List<G045> value) { put("ipi", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G046> getPis() { return list(field("pis"), v -> (v).isNull() || (v).isMissingNode() ? null : new G046(v)); }
 public G035 setPis(java.util.List<G046> value) { put("pis", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G047> getCofins() { return list(field("cofins"), v -> (v).isNull() || (v).isMissingNode() ? null : new G047(v)); }
 public G035 setCofins(java.util.List<G047> value) { put("cofins", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G048> getIssqn() { return list(field("issqn"), v -> (v).isNull() || (v).isMissingNode() ? null : new G048(v)); }
 public G035 setIssqn(java.util.List<G048> value) { put("issqn", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<G049> getIbsCbs() { return list(field("ibs_cbs"), v -> (v).isNull() || (v).isMissingNode() ? null : new G049(v)); }
 public G035 setIbsCbs(java.util.List<G049> value) { put("ibs_cbs", array(value, v -> v == null ? null : v.toJson())); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public G035 setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getInformacoesComplementares() { return stringValue(field("informacoes_complementares")); }
 public G035 setInformacoesComplementares(String value) { put("informacoes_complementares", Json.scalar(value)); return this; }
}
