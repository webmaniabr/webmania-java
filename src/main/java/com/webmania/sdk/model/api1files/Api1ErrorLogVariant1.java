package com.webmania.sdk.model.api1files;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/files.openapi.json; see contract-provenance.json. */
public final class Api1ErrorLogVariant1 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cStat", "xMotivo");
 public Api1ErrorLogVariant1() { super(FIELDS); }
 public Api1ErrorLogVariant1(JsonNode node) { super(node, FIELDS); }
 public Api1ErrorLogVariant1CStat getCStat() { return (field("cStat")).isNull() || (field("cStat")).isMissingNode() ? null : new Api1ErrorLogVariant1CStat(field("cStat")); }
 public Api1ErrorLogVariant1 setCStat(Api1ErrorLogVariant1CStat value) { put("cStat", value == null ? null : value.toJson()); return this; }
 public String getXMotivo() { return stringValue(field("xMotivo")); }
 public Api1ErrorLogVariant1 setXMotivo(String value) { put("xMotivo", Json.scalar(value)); return this; }
}
