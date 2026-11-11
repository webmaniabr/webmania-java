package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G142 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "motivo", "nfce_referenciada");
 public G142() { super(FIELDS); }
 public G142(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G142 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public G142 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public String getMotivo() { return stringValue(field("motivo")); }
 public G142 setMotivo(String value) { put("motivo", Json.scalar(value)); return this; }
 public String getNfceReferenciada() { return stringValue(field("nfce_referenciada")); }
 public G142 setNfceReferenciada(String value) { put("nfce_referenciada", Json.scalar(value)); return this; }
}
