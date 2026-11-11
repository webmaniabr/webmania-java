package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCancelCtePaymentLinkPayload extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "protocolo", "protocolo_vinculacao", "sequencia", "sequencia_vinculacao", "uuid");
 public EmitterCancelCtePaymentLinkPayload() { super(FIELDS); }
 public EmitterCancelCtePaymentLinkPayload(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public EmitterCancelCtePaymentLinkPayload setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public EmitterCancelCtePaymentLinkPayloadProtocolo getProtocolo() { return (field("protocolo")).isNull() || (field("protocolo")).isMissingNode() ? null : new EmitterCancelCtePaymentLinkPayloadProtocolo(field("protocolo")); }
 public EmitterCancelCtePaymentLinkPayload setProtocolo(EmitterCancelCtePaymentLinkPayloadProtocolo value) { put("protocolo", value == null ? null : value.toJson()); return this; }
 public String getProtocoloVinculacao() { return stringValue(field("protocolo_vinculacao")); }
 public EmitterCancelCtePaymentLinkPayload setProtocoloVinculacao(String value) { put("protocolo_vinculacao", Json.scalar(value)); return this; }
 public EmitterCancelCtePaymentLinkPayloadSequencia getSequencia() { return (field("sequencia")).isNull() || (field("sequencia")).isMissingNode() ? null : new EmitterCancelCtePaymentLinkPayloadSequencia(field("sequencia")); }
 public EmitterCancelCtePaymentLinkPayload setSequencia(EmitterCancelCtePaymentLinkPayloadSequencia value) { put("sequencia", value == null ? null : value.toJson()); return this; }
 public EmitterCancelCtePaymentLinkPayloadSequenciaVinculacao getSequenciaVinculacao() { return (field("sequencia_vinculacao")).isNull() || (field("sequencia_vinculacao")).isMissingNode() ? null : new EmitterCancelCtePaymentLinkPayloadSequenciaVinculacao(field("sequencia_vinculacao")); }
 public EmitterCancelCtePaymentLinkPayload setSequenciaVinculacao(EmitterCancelCtePaymentLinkPayloadSequenciaVinculacao value) { put("sequencia_vinculacao", value == null ? null : value.toJson()); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public EmitterCancelCtePaymentLinkPayload setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
}
