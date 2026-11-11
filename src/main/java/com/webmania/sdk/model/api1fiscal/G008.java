package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G008 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("calculo_impostos", "previa_danfe", "assincrono");
 public G008() { super(FIELDS); }
 public G008(JsonNode node) { super(node, FIELDS); }
 public Boolean getCalculoImpostos() { return booleanValue(field("calculo_impostos")); }
 public G008 setCalculoImpostos(Boolean value) { put("calculo_impostos", Json.scalar(value)); return this; }
 public Boolean getPreviaDanfe() { return booleanValue(field("previa_danfe")); }
 public G008 setPreviaDanfe(Boolean value) { put("previa_danfe", Json.scalar(value)); return this; }
 public Boolean getAssincrono() { return booleanValue(field("assincrono")); }
 public G008 setAssincrono(Boolean value) { put("assincrono", Json.scalar(value)); return this; }
}
