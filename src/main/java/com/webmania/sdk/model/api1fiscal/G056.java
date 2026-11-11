package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G056 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_cnae", "codigo_servico", "local_prestacao", "cep_local_prestacao", "iss_retido");
 public G056() { super(FIELDS); }
 public G056(JsonNode node) { super(node, FIELDS); }
 public String getCodigoCnae() { return stringValue(field("codigo_cnae")); }
 public G056 setCodigoCnae(String value) { put("codigo_cnae", Json.scalar(value)); return this; }
 public String getCodigoServico() { return stringValue(field("codigo_servico")); }
 public G056 setCodigoServico(String value) { put("codigo_servico", Json.scalar(value)); return this; }
 public String getLocalPrestacao() { return stringValue(field("local_prestacao")); }
 public G056 setLocalPrestacao(String value) { put("local_prestacao", Json.scalar(value)); return this; }
 public String getCepLocalPrestacao() { return stringValue(field("cep_local_prestacao")); }
 public G056 setCepLocalPrestacao(String value) { put("cep_local_prestacao", Json.scalar(value)); return this; }
 public String getIssRetido() { return stringValue(field("iss_retido")); }
 public G056 setIssRetido(String value) { put("iss_retido", Json.scalar(value)); return this; }
}
