package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G069 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("icms", "ipi", "pis", "cofins", "issqn", "retencao_tributos", "importacao", "ibs_cbs");
 public G069() { super(FIELDS); }
 public G069(JsonNode node) { super(node, FIELDS); }
 public NfeIcms getIcms() { return (field("icms")).isNull() || (field("icms")).isMissingNode() ? null : new NfeIcms(field("icms")); }
 public G069 setIcms(NfeIcms value) { put("icms", value == null ? null : value.toJson()); return this; }
 public G092 getIpi() { return (field("ipi")).isNull() || (field("ipi")).isMissingNode() ? null : new G092(field("ipi")); }
 public G069 setIpi(G092 value) { put("ipi", value == null ? null : value.toJson()); return this; }
 public G093 getPis() { return (field("pis")).isNull() || (field("pis")).isMissingNode() ? null : new G093(field("pis")); }
 public G069 setPis(G093 value) { put("pis", value == null ? null : value.toJson()); return this; }
 public G094 getCofins() { return (field("cofins")).isNull() || (field("cofins")).isMissingNode() ? null : new G094(field("cofins")); }
 public G069 setCofins(G094 value) { put("cofins", value == null ? null : value.toJson()); return this; }
 public G095 getIssqn() { return (field("issqn")).isNull() || (field("issqn")).isMissingNode() ? null : new G095(field("issqn")); }
 public G069 setIssqn(G095 value) { put("issqn", value == null ? null : value.toJson()); return this; }
 public G096 getRetencaoTributos() { return (field("retencao_tributos")).isNull() || (field("retencao_tributos")).isMissingNode() ? null : new G096(field("retencao_tributos")); }
 public G069 setRetencaoTributos(G096 value) { put("retencao_tributos", value == null ? null : value.toJson()); return this; }
 public G097 getImportacao() { return (field("importacao")).isNull() || (field("importacao")).isMissingNode() ? null : new G097(field("importacao")); }
 public G069 setImportacao(G097 value) { put("importacao", value == null ? null : value.toJson()); return this; }
 public G100 getIbsCbs() { return (field("ibs_cbs")).isNull() || (field("ibs_cbs")).isMissingNode() ? null : new G100(field("ibs_cbs")); }
 public G069 setIbsCbs(G100 value) { put("ibs_cbs", value == null ? null : value.toJson()); return this; }
}
