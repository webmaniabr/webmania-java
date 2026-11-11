package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioCiotItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_responsavel", "codigo_ciot", "cpf_responsavel");
 public EmitterIssueMdfePayloadRodoviarioCiotItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviarioCiotItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpjResponsavel() { return stringValue(field("cnpj_responsavel")); }
 public EmitterIssueMdfePayloadRodoviarioCiotItem setCnpjResponsavel(String value) { put("cnpj_responsavel", Json.scalar(value)); return this; }
 public String getCodigoCiot() { return stringValue(field("codigo_ciot")); }
 public EmitterIssueMdfePayloadRodoviarioCiotItem setCodigoCiot(String value) { put("codigo_ciot", Json.scalar(value)); return this; }
 public String getCpfResponsavel() { return stringValue(field("cpf_responsavel")); }
 public EmitterIssueMdfePayloadRodoviarioCiotItem setCpfResponsavel(String value) { put("cpf_responsavel", Json.scalar(value)); return this; }
}
