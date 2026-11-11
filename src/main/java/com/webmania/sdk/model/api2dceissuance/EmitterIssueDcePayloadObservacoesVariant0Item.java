package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadObservacoesVariant0Item extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("campo", "texto");
 public EmitterIssueDcePayloadObservacoesVariant0Item() { super(FIELDS); }
 public EmitterIssueDcePayloadObservacoesVariant0Item(JsonNode node) { super(node, FIELDS); }
 public String getCampo() { return stringValue(field("campo")); }
 public EmitterIssueDcePayloadObservacoesVariant0Item setCampo(String value) { put("campo", Json.scalar(value)); return this; }
 public String getTexto() { return stringValue(field("texto")); }
 public EmitterIssueDcePayloadObservacoesVariant0Item setTexto(String value) { put("texto", Json.scalar(value)); return this; }
}
