package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_reducao", "documentos_referenciados", "ente", "tipo_operacao", "referencias_dfe");
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0() { super(FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0(JsonNode node) { super(node, FIELDS); }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao getAliquotaReducao() { return (field("aliquota_reducao")).isNull() || (field("aliquota_reducao")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao(field("aliquota_reducao")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0 setAliquotaReducao(NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0AliquotaReducao value) { put("aliquota_reducao", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados getDocumentosReferenciados() { return (field("documentos_referenciados")).isNull() || (field("documentos_referenciados")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados(field("documentos_referenciados")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0 setDocumentosReferenciados(NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0DocumentosReferenciados value) { put("documentos_referenciados", value == null ? null : value.toJson()); return this; }
 public JsonValue getEnte() { return (field("ente")).isNull() || (field("ente")).isMissingNode() ? null : new JsonValue(field("ente")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0 setEnte(JsonValue value) { put("ente", value == null ? null : value.toJson()); return this; }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0TipoOperacao getTipoOperacao() { return (field("tipo_operacao")).isNull() || (field("tipo_operacao")).isMissingNode() ? null : new NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0TipoOperacao(field("tipo_operacao")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0 setTipoOperacao(NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0TipoOperacao value) { put("tipo_operacao", value == null ? null : value.toJson()); return this; }
 public String getReferenciasDfe() { return stringValue(field("referencias_dfe")); }
 public NfcomItemGroupImpostosIbsCbsVariant0CompraGovernamentalVariant0 setReferenciasDfe(String value) { put("referencias_dfe", Json.scalar(value)); return this; }
}
