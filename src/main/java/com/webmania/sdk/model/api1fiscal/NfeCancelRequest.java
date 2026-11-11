package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeCancelRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "motivo", "nfce_referenciada");
 public NfeCancelRequest() { super(FIELDS); }
 public NfeCancelRequest(JsonNode node) { super(node, FIELDS); }
 public AccessKey getChave() { return (field("chave")).isNull() || (field("chave")).isMissingNode() ? null : new AccessKey(field("chave")); }
 public NfeCancelRequest setChave(AccessKey value) { put("chave", value == null ? null : value.toJson()); return this; }
 public Uuid getUuid() { return (field("uuid")).isNull() || (field("uuid")).isMissingNode() ? null : new Uuid(field("uuid")); }
 public NfeCancelRequest setUuid(Uuid value) { put("uuid", value == null ? null : value.toJson()); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public NfeCancelRequest setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public AccessKey getNfceReferenciada() { return (field("nfce_referenciada")).isNull() || (field("nfce_referenciada")).isMissingNode() ? null : new AccessKey(field("nfce_referenciada")); }
 public NfeCancelRequest setNfceReferenciada(AccessKey value) { put("nfce_referenciada", value == null ? null : value.toJson()); return this; }
}
