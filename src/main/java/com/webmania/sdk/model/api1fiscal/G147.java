package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G147 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nfe_serie", "nfe_numero", "nfe_numero_dev", "informacoes_fisco", "cnae_issqn");
 public G147() { super(FIELDS); }
 public G147(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getNfeSerie() { return integerValue(field("nfe_serie")); }
 public G147 setNfeSerie(java.math.BigInteger value) { put("nfe_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfeNumero() { return integerValue(field("nfe_numero")); }
 public G147 setNfeNumero(java.math.BigInteger value) { put("nfe_numero", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfeNumeroDev() { return integerValue(field("nfe_numero_dev")); }
 public G147 setNfeNumeroDev(java.math.BigInteger value) { put("nfe_numero_dev", Json.scalar(value)); return this; }
 public String getInformacoesFisco() { return stringValue(field("informacoes_fisco")); }
 public G147 setInformacoesFisco(String value) { put("informacoes_fisco", Json.scalar(value)); return this; }
 public String getCnaeIssqn() { return stringValue(field("cnae_issqn")); }
 public G147 setCnaeIssqn(String value) { put("cnae_issqn", Json.scalar(value)); return this; }
}
