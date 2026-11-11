package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G103 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_diferimento", "percentual_devolvido", "valor_devolvido", "alc_zfm_cbs");
 public G103() { super(FIELDS); }
 public G103(JsonNode node) { super(node, FIELDS); }
 public G103AliquotaDiferimento getAliquotaDiferimento() { return (field("aliquota_diferimento")).isNull() || (field("aliquota_diferimento")).isMissingNode() ? null : new G103AliquotaDiferimento(field("aliquota_diferimento")); }
 public G103 setAliquotaDiferimento(G103AliquotaDiferimento value) { put("aliquota_diferimento", value == null ? null : value.toJson()); return this; }
 public G103PercentualDevolvido getPercentualDevolvido() { return (field("percentual_devolvido")).isNull() || (field("percentual_devolvido")).isMissingNode() ? null : new G103PercentualDevolvido(field("percentual_devolvido")); }
 public G103 setPercentualDevolvido(G103PercentualDevolvido value) { put("percentual_devolvido", value == null ? null : value.toJson()); return this; }
 public G103ValorDevolvido getValorDevolvido() { return (field("valor_devolvido")).isNull() || (field("valor_devolvido")).isMissingNode() ? null : new G103ValorDevolvido(field("valor_devolvido")); }
 public G103 setValorDevolvido(G103ValorDevolvido value) { put("valor_devolvido", value == null ? null : value.toJson()); return this; }
 public G104 getAlcZfmCbs() { return (field("alc_zfm_cbs")).isNull() || (field("alc_zfm_cbs")).isMissingNode() ? null : new G104(field("alc_zfm_cbs")); }
 public G103 setAlcZfmCbs(G104 value) { put("alc_zfm_cbs", value == null ? null : value.toJson()); return this; }
}
