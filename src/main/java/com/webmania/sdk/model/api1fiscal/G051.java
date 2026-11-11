package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G051 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("classificacao", "aliquota_ibs", "aliquota_cbs");
 public G051() { super(FIELDS); }
 public G051(JsonNode node) { super(node, FIELDS); }
 public String getClassificacao() { return stringValue(field("classificacao")); }
 public G051 setClassificacao(String value) { put("classificacao", Json.scalar(value)); return this; }
 public G051AliquotaIbs getAliquotaIbs() { return (field("aliquota_ibs")).isNull() || (field("aliquota_ibs")).isMissingNode() ? null : new G051AliquotaIbs(field("aliquota_ibs")); }
 public G051 setAliquotaIbs(G051AliquotaIbs value) { put("aliquota_ibs", value == null ? null : value.toJson()); return this; }
 public G051AliquotaCbs getAliquotaCbs() { return (field("aliquota_cbs")).isNull() || (field("aliquota_cbs")).isMissingNode() ? null : new G051AliquotaCbs(field("aliquota_cbs")); }
 public G051 setAliquotaCbs(G051AliquotaCbs value) { put("aliquota_cbs", value == null ? null : value.toJson()); return this; }
}
