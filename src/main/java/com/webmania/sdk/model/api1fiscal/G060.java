package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G060 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_servico", "regime_recolhimento", "forma_recolhimento");
 public G060() { super(FIELDS); }
 public G060(JsonNode node) { super(node, FIELDS); }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G060 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getRegimeRecolhimento() { return stringValue(field("regime_recolhimento")); }
 public G060 setRegimeRecolhimento(String value) { put("regime_recolhimento", Json.scalar(value)); return this; }
 public String getFormaRecolhimento() { return stringValue(field("forma_recolhimento")); }
 public G060 setFormaRecolhimento(String value) { put("forma_recolhimento", Json.scalar(value)); return this; }
}
