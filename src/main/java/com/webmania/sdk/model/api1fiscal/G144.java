package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G144 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_inicio", "data_final", "numero_inicio", "numero_final", "modelo", "relatorio", "separar_pdf", "status", "ordem", "url_notificacao");
 public G144() { super(FIELDS); }
 public G144(JsonNode node) { super(node, FIELDS); }
 public String getDataInicio() { return stringValue(field("data_inicio")); }
 public G144 setDataInicio(String value) { put("data_inicio", Json.scalar(value)); return this; }
 public String getDataFinal() { return stringValue(field("data_final")); }
 public G144 setDataFinal(String value) { put("data_final", Json.scalar(value)); return this; }
 public String getNumeroInicio() { return stringValue(field("numero_inicio")); }
 public G144 setNumeroInicio(String value) { put("numero_inicio", Json.scalar(value)); return this; }
 public String getNumeroFinal() { return stringValue(field("numero_final")); }
 public G144 setNumeroFinal(String value) { put("numero_final", Json.scalar(value)); return this; }
 public String getModelo() { return stringValue(field("modelo")); }
 public G144 setModelo(String value) { put("modelo", Json.scalar(value)); return this; }
 public String getRelatorio() { return stringValue(field("relatorio")); }
 public G144 setRelatorio(String value) { put("relatorio", Json.scalar(value)); return this; }
 public java.math.BigInteger getSepararPdf() { return integerValue(field("separar_pdf")); }
 public G144 setSepararPdf(java.math.BigInteger value) { put("separar_pdf", Json.scalar(value)); return this; }
 public String getStatus() { return stringValue(field("status")); }
 public G144 setStatus(String value) { put("status", Json.scalar(value)); return this; }
 public String getOrdem() { return stringValue(field("ordem")); }
 public G144 setOrdem(String value) { put("ordem", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G144 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
