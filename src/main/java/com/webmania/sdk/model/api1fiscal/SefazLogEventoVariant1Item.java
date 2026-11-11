package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class SefazLogEventoVariant1Item extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cStat", "xMotivo", "nProt");
 public SefazLogEventoVariant1Item() { super(FIELDS); }
 public SefazLogEventoVariant1Item(JsonNode node) { super(node, FIELDS); }
 public SefazLogEventoVariant1ItemCStat getCStat() { return (field("cStat")).isNull() || (field("cStat")).isMissingNode() ? null : new SefazLogEventoVariant1ItemCStat(field("cStat")); }
 public SefazLogEventoVariant1Item setCStat(SefazLogEventoVariant1ItemCStat value) { put("cStat", value == null ? null : value.toJson()); return this; }
 public String getXMotivo() { return stringValue(field("xMotivo")); }
 public SefazLogEventoVariant1Item setXMotivo(String value) { put("xMotivo", Json.scalar(value)); return this; }
 public String getNProt() { return stringValue(field("nProt")); }
 public SefazLogEventoVariant1Item setNProt(String value) { put("nProt", Json.scalar(value)); return this; }
}
