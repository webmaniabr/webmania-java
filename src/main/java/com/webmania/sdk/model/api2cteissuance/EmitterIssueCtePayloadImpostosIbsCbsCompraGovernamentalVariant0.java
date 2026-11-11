package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_reducao", "ente", "referencias_dfe", "tipo_operacao");
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0AliquotaReducao(field("aliquota_reducao")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0 setAliquotaReducao(EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public JsonValue getEnte() { return (field("ente")).isNull() || (field("ente")).isMissingNode() ? null : new JsonValue(field("ente")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0 setEnte(JsonValue value) { put("ente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe getReferenciasDfe() { return (field("referencias_dfe")).isNull() || (field("referencias_dfe")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe(field("referencias_dfe")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0 setReferenciasDfe(EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0ReferenciasDfe value) { put("referencias_dfe", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0TipoOperacao getTipoOperacao() { return (field("tipo_operacao")).isNull() || (field("tipo_operacao")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0TipoOperacao(field("tipo_operacao")); }
 public EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0 setTipoOperacao(EmitterIssueCtePayloadImpostosIbsCbsCompraGovernamentalVariant0TipoOperacao value) { put("tipo_operacao", value == null ? null : value.toJson()); return this; }
}
