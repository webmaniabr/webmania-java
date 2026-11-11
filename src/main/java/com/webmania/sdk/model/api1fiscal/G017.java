package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G017 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("indicador_importacao", "uf_origem", "percentual_originario");
 public G017() { super(FIELDS); }
 public G017(JsonNode node) { super(node, FIELDS); }
 public String getIndicadorImportacao() { return stringValue(field("indicador_importacao")); }
 public G017 setIndicadorImportacao(String value) { put("indicador_importacao", Json.scalar(value)); return this; }
 public String getUfOrigem() { return stringValue(field("uf_origem")); }
 public G017 setUfOrigem(String value) { put("uf_origem", Json.scalar(value)); return this; }
 public G017PercentualOriginario getPercentualOriginario() { return (field("percentual_originario")).isNull() || (field("percentual_originario")).isMissingNode() ? null : new G017PercentualOriginario(field("percentual_originario")); }
 public G017 setPercentualOriginario(G017PercentualOriginario value) { put("percentual_originario", value == null ? null : value.toJson()); return this; }
}
