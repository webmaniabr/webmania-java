package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class SefazLogEventoVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cStat", "xMotivo", "nProt");
 public SefazLogEventoVariant0() { super(FIELDS); }
 public SefazLogEventoVariant0(JsonNode node) { super(node, FIELDS); }
 public SefazLogEventoVariant0CStat getCStat() { return (field("cStat")).isNull() || (field("cStat")).isMissingNode() ? null : new SefazLogEventoVariant0CStat(field("cStat")); }
 public SefazLogEventoVariant0 setCStat(SefazLogEventoVariant0CStat value) { put("cStat", value == null ? null : value.toJson()); return this; }
 public String getXMotivo() { return stringValue(field("xMotivo")); }
 public SefazLogEventoVariant0 setXMotivo(String value) { put("xMotivo", Json.scalar(value)); return this; }
 public String getNProt() { return stringValue(field("nProt")); }
 public SefazLogEventoVariant0 setNProt(String value) { put("nProt", Json.scalar(value)); return this; }
}
