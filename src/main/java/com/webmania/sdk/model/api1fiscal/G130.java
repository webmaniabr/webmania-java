package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G130 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_previsao_entrega");
 public G130() { super(FIELDS); }
 public G130(JsonNode node) { super(node, FIELDS); }
 public String getDataPrevisaoEntrega() { return stringValue(field("data_previsao_entrega")); }
 public G130 setDataPrevisaoEntrega(String value) { put("data_previsao_entrega", Json.scalar(value)); return this; }
}
