package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G150 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("dce_serie", "dce_numero", "dce_numero_dev", "tipo_emissor_dce", "numero_site_autorizador", "site_marketplace");
 public G150() { super(FIELDS); }
 public G150(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getDceSerie() { return integerValue(field("dce_serie")); }
 public G150 setDceSerie(java.math.BigInteger value) { put("dce_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getDceNumero() { return integerValue(field("dce_numero")); }
 public G150 setDceNumero(java.math.BigInteger value) { put("dce_numero", Json.scalar(value)); return this; }
 public java.math.BigInteger getDceNumeroDev() { return integerValue(field("dce_numero_dev")); }
 public G150 setDceNumeroDev(java.math.BigInteger value) { put("dce_numero_dev", Json.scalar(value)); return this; }
 public java.math.BigInteger getTipoEmissorDce() { return integerValue(field("tipo_emissor_dce")); }
 public G150 setTipoEmissorDce(java.math.BigInteger value) { put("tipo_emissor_dce", Json.scalar(value)); return this; }
 public java.math.BigInteger getNumeroSiteAutorizador() { return integerValue(field("numero_site_autorizador")); }
 public G150 setNumeroSiteAutorizador(java.math.BigInteger value) { put("numero_site_autorizador", Json.scalar(value)); return this; }
 public String getSiteMarketplace() { return stringValue(field("site_marketplace")); }
 public G150 setSiteMarketplace(String value) { put("site_marketplace", Json.scalar(value)); return this; }
}
