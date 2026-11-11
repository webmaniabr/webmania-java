package com.webmania.sdk.model.api2emitterreads;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/emitter-reads.openapi.json; see contract-provenance.json. */
public final class EmitterGetNfseProviderStatusRequest extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("todos_servicos");
 public EmitterGetNfseProviderStatusRequest() { super(FIELDS); }
 public EmitterGetNfseProviderStatusRequest(JsonNode node) { super(node, FIELDS); }
 public Boolean getTodosServicos() { return booleanValue(field("todos_servicos")); }
 public EmitterGetNfseProviderStatusRequest setTodosServicos(Boolean value) { put("todos_servicos", Json.scalar(value)); return this; }
}
