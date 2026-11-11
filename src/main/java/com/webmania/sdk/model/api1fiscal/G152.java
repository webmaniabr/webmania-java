package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G152 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("certificado", "certificado_senha");
 public G152() { super(FIELDS); }
 public G152(JsonNode node) { super(node, FIELDS); }
 public String getCertificado() { return stringValue(field("certificado")); }
 public G152 setCertificado(String value) { put("certificado", Json.scalar(value)); return this; }
 public String getCertificadoSenha() { return stringValue(field("certificado_senha")); }
 public G152 setCertificadoSenha(String value) { put("certificado_senha", Json.scalar(value)); return this; }
}
