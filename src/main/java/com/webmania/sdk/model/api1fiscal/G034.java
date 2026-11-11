package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G034 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_ente_governamental", "percentual_redutor", "tipo_operacao_governamental", "dfes_anteriores");
 public G034() { super(FIELDS); }
 public G034(JsonNode node) { super(node, FIELDS); }
 public String getTipoEnteGovernamental() { return stringValue(field("tipo_ente_governamental")); }
 public G034 setTipoEnteGovernamental(String value) { put("tipo_ente_governamental", Json.scalar(value)); return this; }
 public G034PercentualRedutor getPercentualRedutor() { return (field("percentual_redutor")).isNull() || (field("percentual_redutor")).isMissingNode() ? null : new G034PercentualRedutor(field("percentual_redutor")); }
 public G034 setPercentualRedutor(G034PercentualRedutor value) { put("percentual_redutor", value == null ? null : value.toJson()); return this; }
 public String getTipoOperacaoGovernamental() { return stringValue(field("tipo_operacao_governamental")); }
 public G034 setTipoOperacaoGovernamental(String value) { put("tipo_operacao_governamental", Json.scalar(value)); return this; }
 public java.util.List<AccessKey> getDfesAnteriores() { return list(field("dfes_anteriores"), v -> (v).isNull() || (v).isMissingNode() ? null : new AccessKey(v)); }
 public G034 setDfesAnteriores(java.util.List<AccessKey> value) { put("dfes_anteriores", array(value, v -> v == null ? null : v.toJson())); return this; }
}
