package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G148 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nfce_serie", "nfce_numero", "nfce_id_csc", "nfce_codigo_csc", "nfce_numero_dev", "nfce_id_csc_dev", "nfce_codigo_csc_dev", "informacoes_fisco");
 public G148() { super(FIELDS); }
 public G148(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getNfceSerie() { return integerValue(field("nfce_serie")); }
 public G148 setNfceSerie(java.math.BigInteger value) { put("nfce_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfceNumero() { return integerValue(field("nfce_numero")); }
 public G148 setNfceNumero(java.math.BigInteger value) { put("nfce_numero", Json.scalar(value)); return this; }
 public String getNfceIdCsc() { return stringValue(field("nfce_id_csc")); }
 public G148 setNfceIdCsc(String value) { put("nfce_id_csc", Json.scalar(value)); return this; }
 public String getNfceCodigoCsc() { return stringValue(field("nfce_codigo_csc")); }
 public G148 setNfceCodigoCsc(String value) { put("nfce_codigo_csc", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfceNumeroDev() { return integerValue(field("nfce_numero_dev")); }
 public G148 setNfceNumeroDev(java.math.BigInteger value) { put("nfce_numero_dev", Json.scalar(value)); return this; }
 public String getNfceIdCscDev() { return stringValue(field("nfce_id_csc_dev")); }
 public G148 setNfceIdCscDev(String value) { put("nfce_id_csc_dev", Json.scalar(value)); return this; }
 public String getNfceCodigoCscDev() { return stringValue(field("nfce_codigo_csc_dev")); }
 public G148 setNfceCodigoCscDev(String value) { put("nfce_codigo_csc_dev", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public G148 setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
}
