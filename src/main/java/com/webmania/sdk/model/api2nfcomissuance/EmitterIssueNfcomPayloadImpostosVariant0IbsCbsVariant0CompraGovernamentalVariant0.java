package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_reducao", "documentos_referenciados", "ente", "referencias_dfe", "tipo_operacao");
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao(field("aliquota_reducao")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0 setAliquotaReducao(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados getDocumentosReferenciados() { return (field("documentos_referenciados")).isNull() || (field("documentos_referenciados")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados(field("documentos_referenciados")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0 setDocumentosReferenciados(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados value) { put("documentos_referenciados", value == null ? null : value.toJson()); return this; }
 public JsonValue getEnte() { return (field("ente")).isNull() || (field("ente")).isMissingNode() ? null : new JsonValue(field("ente")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0 setEnte(JsonValue value) { put("ente", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0ReferenciasDfe getReferenciasDfe() { return (field("referencias_dfe")).isNull() || (field("referencias_dfe")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0ReferenciasDfe(field("referencias_dfe")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0 setReferenciasDfe(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0ReferenciasDfe value) { put("referencias_dfe", value == null ? null : value.toJson()); return this; }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0TipoOperacao getTipoOperacao() { return (field("tipo_operacao")).isNull() || (field("tipo_operacao")).isMissingNode() ? null : new EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0TipoOperacao(field("tipo_operacao")); }
 public EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0 setTipoOperacao(EmitterIssueNfcomPayloadImpostosVariant0IbsCbsVariant0CompraGovernamentalVariant0TipoOperacao value) { put("tipo_operacao", value == null ? null : value.toJson()); return this; }
}
