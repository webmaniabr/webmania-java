package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_fim", "data_inicio", "numero");
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim getDataFim() { return (field("data_fim")).isNull() || (field("data_fim")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim(field("data_fim")); }
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0 setDataFim(EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataFim value) { put("data_fim", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataInicio getDataInicio() { return (field("data_inicio")).isNull() || (field("data_inicio")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataInicio(field("data_inicio")); }
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0 setDataInicio(EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0DataInicio value) { put("data_inicio", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero getNumero() { return (field("numero")).isNull() || (field("numero")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero(field("numero")); }
 public EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0 setNumero(EmitterIssueNfcomPayloadAssinanteVariant0ContratoVariant0Numero value) { put("numero", value == null ? null : value.toJson()); return this; }
}
