package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadMultimodal extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cotm", "negociavel", "seguro");
 public EmitterIssueCtePayloadMultimodal() { super(FIELDS); }
 public EmitterIssueCtePayloadMultimodal(JsonNode node) { super(node, FIELDS); }
 public String getCotm() { return stringValue(field("cotm")); }
 public EmitterIssueCtePayloadMultimodal setCotm(String value) { put("cotm", Json.scalar(value)); return this; }
 public EmitterIssueCtePayloadMultimodalNegociavel getNegociavel() { return (field("negociavel")).isNull() || (field("negociavel")).isMissingNode() ? null : new EmitterIssueCtePayloadMultimodalNegociavel(field("negociavel")); }
 public EmitterIssueCtePayloadMultimodal setNegociavel(EmitterIssueCtePayloadMultimodalNegociavel value) { put("negociavel", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadMultimodalSeguro getSeguro() { return (field("seguro")).isNull() || (field("seguro")).isMissingNode() ? null : new EmitterIssueCtePayloadMultimodalSeguro(field("seguro")); }
 public EmitterIssueCtePayloadMultimodal setSeguro(EmitterIssueCtePayloadMultimodalSeguro value) { put("seguro", value == null ? null : value.toJson()); return this; }
}
