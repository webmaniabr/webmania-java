package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorManifestationStateVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo", "descricao", "manifestado", "automatica");
 public MonitorManifestationStateVariant0() { super(FIELDS); }
 public MonitorManifestationStateVariant0(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getCodigo() { return integerValue(field("codigo")); }
 public MonitorManifestationStateVariant0 setCodigo(java.math.BigInteger value) { put("codigo", Json.scalar(value)); return this; }
 public MonitorManifestationStateVariant0Descricao getDescricao() { return (field("descricao")).isNull() || (field("descricao")).isMissingNode() ? null : new MonitorManifestationStateVariant0Descricao(field("descricao")); }
 public MonitorManifestationStateVariant0 setDescricao(MonitorManifestationStateVariant0Descricao value) { put("descricao", value == null ? null : value.toJson()); return this; }
 public Boolean getManifestado() { return booleanValue(field("manifestado")); }
 public MonitorManifestationStateVariant0 setManifestado(Boolean value) { put("manifestado", Json.scalar(value)); return this; }
 public Boolean getAutomatica() { return booleanValue(field("automatica")); }
 public MonitorManifestationStateVariant0 setAutomatica(Boolean value) { put("automatica", Json.scalar(value)); return this; }
}
