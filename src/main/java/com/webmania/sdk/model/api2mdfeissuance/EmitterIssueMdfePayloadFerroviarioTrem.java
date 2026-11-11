package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadFerroviarioTrem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_liberacao", "destino", "origem", "prefixo");
 public EmitterIssueMdfePayloadFerroviarioTrem() { super(FIELDS); }
 public EmitterIssueMdfePayloadFerroviarioTrem(JsonNode node) { super(node, FIELDS); }
 public String getDataLiberacao() { return stringValue(field("data_liberacao")); }
 public EmitterIssueMdfePayloadFerroviarioTrem setDataLiberacao(String value) { put("data_liberacao", Json.scalar(value)); return this; }
 public String getDestino() { return stringValue(field("destino")); }
 public EmitterIssueMdfePayloadFerroviarioTrem setDestino(String value) { put("destino", Json.scalar(value)); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterIssueMdfePayloadFerroviarioTrem setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
 public String getPrefixo() { return stringValue(field("prefixo")); }
 public EmitterIssueMdfePayloadFerroviarioTrem setPrefixo(String value) { put("prefixo", Json.scalar(value)); return this; }
}
