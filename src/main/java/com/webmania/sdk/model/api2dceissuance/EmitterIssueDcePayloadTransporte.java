package com.webmania.sdk.model.api2dceissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/dce-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueDcePayloadTransporte extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_transportadora", "modalidade");
 public EmitterIssueDcePayloadTransporte() { super(FIELDS); }
 public EmitterIssueDcePayloadTransporte(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueDcePayloadTransporteCnpjTransportadora getCnpjTransportadora() { return (field("cnpj_transportadora")).isNull() || (field("cnpj_transportadora")).isMissingNode() ? null : new EmitterIssueDcePayloadTransporteCnpjTransportadora(field("cnpj_transportadora")); }
 public EmitterIssueDcePayloadTransporte setCnpjTransportadora(EmitterIssueDcePayloadTransporteCnpjTransportadora value) { put("cnpj_transportadora", value == null ? null : value.toJson()); return this; }
 public String getModalidade() { return stringValue(field("modalidade")); }
 public EmitterIssueDcePayloadTransporte setModalidade(String value) { put("modalidade", Json.scalar(value)); return this; }
}
