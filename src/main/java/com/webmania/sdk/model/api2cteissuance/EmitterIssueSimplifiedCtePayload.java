package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueSimplifiedCtePayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ambiente", "modelo", "nfe_xml", "origem");
 public EmitterIssueSimplifiedCtePayload() { super(FIELDS); }
 public EmitterIssueSimplifiedCtePayload(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueSimplifiedCtePayloadAmbiente getAmbiente() { return (field("ambiente")).isNull() || (field("ambiente")).isMissingNode() ? null : new EmitterIssueSimplifiedCtePayloadAmbiente(field("ambiente")); }
 public EmitterIssueSimplifiedCtePayload setAmbiente(EmitterIssueSimplifiedCtePayloadAmbiente value) { put("ambiente", value == null ? null : value.toJson()); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public EmitterIssueSimplifiedCtePayload setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getNfeXml() { return stringValue(field("nfe_xml")); }
 public EmitterIssueSimplifiedCtePayload setNfeXml(String value) { put("nfe_xml", Json.scalar(value)); return this; }
 public String getOrigem() { return stringValue(field("origem")); }
 public EmitterIssueSimplifiedCtePayload setOrigem(String value) { put("origem", Json.scalar(value)); return this; }
}
