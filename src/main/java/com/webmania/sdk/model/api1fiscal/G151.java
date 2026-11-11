package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G151 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("nfse_rps_serie", "nfse_rps_numero", "cnae", "nfse_login", "nfse_password", "nfse_token", "regime_apuracao_sn", "regime_especial_nacional", "regime_especial_municipal", "nfse_lote_rps_numero", "nfse_rps_numero_dev");
 public G151() { super(FIELDS); }
 public G151(JsonNode node) { super(node, FIELDS); }
 public String getNfseRpsSerie() { return stringValue(field("nfse_rps_serie")); }
 public G151 setNfseRpsSerie(String value) { put("nfse_rps_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfseRpsNumero() { return integerValue(field("nfse_rps_numero")); }
 public G151 setNfseRpsNumero(java.math.BigInteger value) { put("nfse_rps_numero", Json.scalar(value)); return this; }
 public G151Cnae getCnae() { return (field("cnae")).isNull() || (field("cnae")).isMissingNode() ? null : new G151Cnae(field("cnae")); }
 public G151 setCnae(G151Cnae value) { put("cnae", value == null ? null : value.toJson()); return this; }
 public String getNfseLogin() { return stringValue(field("nfse_login")); }
 public G151 setNfseLogin(String value) { put("nfse_login", Json.scalar(value)); return this; }
 public String getNfsePassword() { return stringValue(field("nfse_password")); }
 public G151 setNfsePassword(String value) { put("nfse_password", Json.scalar(value)); return this; }
 public String getNfseToken() { return stringValue(field("nfse_token")); }
 public G151 setNfseToken(String value) { put("nfse_token", Json.scalar(value)); return this; }
 public String getRegimeApuracaoSn() { return stringValue(field("regime_apuracao_sn")); }
 public G151 setRegimeApuracaoSn(String value) { put("regime_apuracao_sn", Json.scalar(value)); return this; }
 public String getRegimeEspecialNacional() { return stringValue(field("regime_especial_nacional")); }
 public G151 setRegimeEspecialNacional(String value) { put("regime_especial_nacional", Json.scalar(value)); return this; }
 public String getRegimeEspecialMunicipal() { return stringValue(field("regime_especial_municipal")); }
 public G151 setRegimeEspecialMunicipal(String value) { put("regime_especial_municipal", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfseLoteRpsNumero() { return integerValue(field("nfse_lote_rps_numero")); }
 public G151 setNfseLoteRpsNumero(java.math.BigInteger value) { put("nfse_lote_rps_numero", Json.scalar(value)); return this; }
 public java.math.BigInteger getNfseRpsNumeroDev() { return integerValue(field("nfse_rps_numero_dev")); }
 public G151 setNfseRpsNumeroDev(java.math.BigInteger value) { put("nfse_rps_numero_dev", Json.scalar(value)); return this; }
}
