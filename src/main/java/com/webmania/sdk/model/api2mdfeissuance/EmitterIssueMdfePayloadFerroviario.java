package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadFerroviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("trem", "vagoes");
 public EmitterIssueMdfePayloadFerroviario() { super(FIELDS); }
 public EmitterIssueMdfePayloadFerroviario(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueMdfePayloadFerroviarioTrem getTrem() { return (field("trem")).isNull() || (field("trem")).isMissingNode() ? null : new EmitterIssueMdfePayloadFerroviarioTrem(field("trem")); }
 public EmitterIssueMdfePayloadFerroviario setTrem(EmitterIssueMdfePayloadFerroviarioTrem value) { put("trem", value == null ? null : value.toJson()); return this; }
 public java.util.List<EmitterIssueMdfePayloadFerroviarioVagoesItem> getVagoes() { return list(field("vagoes"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadFerroviarioVagoesItem(v)); }
 public EmitterIssueMdfePayloadFerroviario setVagoes(java.util.List<EmitterIssueMdfePayloadFerroviarioVagoesItem> value) { put("vagoes", array(value, v -> v == null ? null : v.toJson())); return this; }
}
