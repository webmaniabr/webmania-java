package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112110Details extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("indicador_quitacao");
 public IbsCbs112110Details() { super(FIELDS); }
 public IbsCbs112110Details(JsonNode node) { super(node, FIELDS); }
 public IbsCbs112110DetailsIndicadorQuitacao getIndicadorQuitacao() { return (field("indicador_quitacao")).isNull() || (field("indicador_quitacao")).isMissingNode() ? null : new IbsCbs112110DetailsIndicadorQuitacao(field("indicador_quitacao")); }
 public IbsCbs112110Details setIndicadorQuitacao(IbsCbs112110DetailsIndicadorQuitacao value) { put("indicador_quitacao", value == null ? null : value.toJson()); return this; }
}
