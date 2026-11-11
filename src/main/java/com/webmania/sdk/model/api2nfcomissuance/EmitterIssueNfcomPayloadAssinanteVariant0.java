package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadAssinanteVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "contrato", "tipo", "tipo_servico");
 public EmitterIssueNfcomPayloadAssinanteVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadAssinanteVariant0(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadAssinanteVariant0Codigo getCodigo() { return (field("codigo")).isNull() || (field("codigo")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0Codigo(field("codigo")); }
 public EmitterIssueNfcomPayloadAssinanteVariant0 setCodigo(EmitterIssueNfcomPayloadAssinanteVariant0Codigo value) { put("codigo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadAssinanteVariant0Contrato getContrato() { return (field("contrato")).isNull() || (field("contrato")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0Contrato(field("contrato")); }
 public EmitterIssueNfcomPayloadAssinanteVariant0 setContrato(EmitterIssueNfcomPayloadAssinanteVariant0Contrato value) { put("contrato", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadAssinanteVariant0Tipo getTipo() { return (field("tipo")).isNull() || (field("tipo")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0Tipo(field("tipo")); }
 public EmitterIssueNfcomPayloadAssinanteVariant0 setTipo(EmitterIssueNfcomPayloadAssinanteVariant0Tipo value) { put("tipo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadAssinanteVariant0TipoServico getTipoServico() { return (field("tipo_servico")).isNull() || (field("tipo_servico")).isMissingNode() ? null : new EmitterIssueNfcomPayloadAssinanteVariant0TipoServico(field("tipo_servico")); }
 public EmitterIssueNfcomPayloadAssinanteVariant0 setTipoServico(EmitterIssueNfcomPayloadAssinanteVariant0TipoServico value) { put("tipo_servico", value == null ? null : value.toJson()); return this; }
}
