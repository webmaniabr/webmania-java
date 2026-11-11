package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G149 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cte_serie", "cte_number", "cte_number_dev", "cte_os_serie", "cte_os_number", "cte_os_number_dev", "taf_cte_os", "registro_estadual_cte_os");
 public G149() { super(FIELDS); }
 public G149(JsonNode node) { super(node, FIELDS); }
 public java.math.BigInteger getCteSerie() { return integerValue(field("cte_serie")); }
 public G149 setCteSerie(java.math.BigInteger value) { put("cte_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteNumber() { return integerValue(field("cte_number")); }
 public G149 setCteNumber(java.math.BigInteger value) { put("cte_number", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteNumberDev() { return integerValue(field("cte_number_dev")); }
 public G149 setCteNumberDev(java.math.BigInteger value) { put("cte_number_dev", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteOsSerie() { return integerValue(field("cte_os_serie")); }
 public G149 setCteOsSerie(java.math.BigInteger value) { put("cte_os_serie", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteOsNumber() { return integerValue(field("cte_os_number")); }
 public G149 setCteOsNumber(java.math.BigInteger value) { put("cte_os_number", Json.scalar(value)); return this; }
 public java.math.BigInteger getCteOsNumberDev() { return integerValue(field("cte_os_number_dev")); }
 public G149 setCteOsNumberDev(java.math.BigInteger value) { put("cte_os_number_dev", Json.scalar(value)); return this; }
 public String getTafCteOs() { return stringValue(field("taf_cte_os")); }
 public G149 setTafCteOs(String value) { put("taf_cte_os", Json.scalar(value)); return this; }
 public String getRegistroEstadualCteOs() { return stringValue(field("registro_estadual_cte_os")); }
 public G149 setRegistroEstadualCteOs(String value) { put("registro_estadual_cte_os", Json.scalar(value)); return this; }
}
