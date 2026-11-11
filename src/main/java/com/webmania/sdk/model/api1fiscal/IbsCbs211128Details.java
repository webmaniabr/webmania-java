package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211128Details extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("indicador_aceitacao");
 public IbsCbs211128Details() { super(FIELDS); }
 public IbsCbs211128Details(JsonNode node) { super(node, FIELDS); }
 public IbsCbs211128DetailsIndicadorAceitacao getIndicadorAceitacao() { return (field("indicador_aceitacao")).isNull() || (field("indicador_aceitacao")).isMissingNode() ? null : new IbsCbs211128DetailsIndicadorAceitacao(field("indicador_aceitacao")); }
 public IbsCbs211128Details setIndicadorAceitacao(IbsCbs211128DetailsIndicadorAceitacao value) { put("indicador_aceitacao", value == null ? null : value.toJson()); return this; }
}
