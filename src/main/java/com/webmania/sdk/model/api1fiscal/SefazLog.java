package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class SefazLog extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cStat", "xMotivo", "nProt", "tpAmb", "dhRecbto", "chNFe", "verAplic", "evento");
 public SefazLog() { super(FIELDS); }
 public SefazLog(JsonNode node) { super(node, FIELDS); }
 public SefazLogCStat getCStat() { return (field("cStat")).isNull() || (field("cStat")).isMissingNode() ? null : new SefazLogCStat(field("cStat")); }
 public SefazLog setCStat(SefazLogCStat value) { put("cStat", value == null ? null : value.toJson()); return this; }
 public String getXMotivo() { return stringValue(field("xMotivo")); }
 public SefazLog setXMotivo(String value) { put("xMotivo", Json.scalar(value)); return this; }
 public String getNProt() { return stringValue(field("nProt")); }
 public SefazLog setNProt(String value) { put("nProt", Json.scalar(value)); return this; }
 public SefazLogTpAmb getTpAmb() { return (field("tpAmb")).isNull() || (field("tpAmb")).isMissingNode() ? null : new SefazLogTpAmb(field("tpAmb")); }
 public SefazLog setTpAmb(SefazLogTpAmb value) { put("tpAmb", value == null ? null : value.toJson()); return this; }
 public String getDhRecbto() { return stringValue(field("dhRecbto")); }
 public SefazLog setDhRecbto(String value) { put("dhRecbto", Json.scalar(value)); return this; }
 public String getChNFe() { return stringValue(field("chNFe")); }
 public SefazLog setChNFe(String value) { put("chNFe", Json.scalar(value)); return this; }
 public String getVerAplic() { return stringValue(field("verAplic")); }
 public SefazLog setVerAplic(String value) { put("verAplic", Json.scalar(value)); return this; }
 public SefazLogEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new SefazLogEvento(field("evento")); }
 public SefazLog setEvento(SefazLogEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
}
