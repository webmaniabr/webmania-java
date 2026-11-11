package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G079 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("quantidade_retencao", "aliquota_retencao", "percentual_reducao", "motivo_reducao", "quantidade_bc");
 public G079() { super(FIELDS); }
 public G079(JsonNode node) { super(node, FIELDS); }
 public G079QuantidadeRetencao getQuantidadeRetencao() { return (field("quantidade_retencao")).isNull() || (field("quantidade_retencao")).isMissingNode() ? null : new G079QuantidadeRetencao(field("quantidade_retencao")); }
 public G079 setQuantidadeRetencao(G079QuantidadeRetencao value) { put("quantidade_retencao", value == null ? null : value.toJson()); return this; }
 public G079AliquotaRetencao getAliquotaRetencao() { return (field("aliquota_retencao")).isNull() || (field("aliquota_retencao")).isMissingNode() ? null : new G079AliquotaRetencao(field("aliquota_retencao")); }
 public G079 setAliquotaRetencao(G079AliquotaRetencao value) { put("aliquota_retencao", value == null ? null : value.toJson()); return this; }
 public G079PercentualReducao getPercentualReducao() { return (field("percentual_reducao")).isNull() || (field("percentual_reducao")).isMissingNode() ? null : new G079PercentualReducao(field("percentual_reducao")); }
 public G079 setPercentualReducao(G079PercentualReducao value) { put("percentual_reducao", value == null ? null : value.toJson()); return this; }
 public String getMotivoReducao() { return stringValue(field("motivo_reducao")); }
 public G079 setMotivoReducao(String value) { put("motivo_reducao", Json.scalar(value)); return this; }
 public G079QuantidadeBc getQuantidadeBc() { return (field("quantidade_bc")).isNull() || (field("quantidade_bc")).isMissingNode() ? null : new G079QuantidadeBc(field("quantidade_bc")); }
 public G079 setQuantidadeBc(G079QuantidadeBc value) { put("quantidade_bc", value == null ? null : value.toJson()); return this; }
}
