package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfcomClassIcms extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("situacao_tributaria", "origem", "aliquota", "percentual_reducao", "aliquota_fcp", "codigo_cfop");
 public NfcomClassIcms() { super(FIELDS); }
 public NfcomClassIcms(JsonNode node) { super(node, FIELDS); }
 public String getSituacaoTributaria() { return stringValue(field("situacao_tributaria")); }
 public NfcomClassIcms setSituacaoTributaria(String value) { put("situacao_tributaria", Json.scalar(value)); return this; }
 public NfcomClassIcmsOrigem getOrigem() { return (field("origem")).isNull() || (field("origem")).isMissingNode() ? null : new NfcomClassIcmsOrigem(field("origem")); }
 public NfcomClassIcms setOrigem(NfcomClassIcmsOrigem value) { put("origem", value == null ? null : value.toJson()); return this; }
 public NfcomClassIcmsAliquota getAliquota() { return (field("aliquota")).isNull() || (field("aliquota")).isMissingNode() ? null : new NfcomClassIcmsAliquota(field("aliquota")); }
 public NfcomClassIcms setAliquota(NfcomClassIcmsAliquota value) { put("aliquota", value == null ? null : value.toJson()); return this; }
 public NfcomClassIcmsPercentualReducao getPercentualReducao() { return (field("percentual_reducao")).isNull() || (field("percentual_reducao")).isMissingNode() ? null : new NfcomClassIcmsPercentualReducao(field("percentual_reducao")); }
 public NfcomClassIcms setPercentualReducao(NfcomClassIcmsPercentualReducao value) { put("percentual_reducao", value == null ? null : value.toJson()); return this; }
 public NfcomClassIcmsAliquotaFcp getAliquotaFcp() { return (field("aliquota_fcp")).isNull() || (field("aliquota_fcp")).isMissingNode() ? null : new NfcomClassIcmsAliquotaFcp(field("aliquota_fcp")); }
 public NfcomClassIcms setAliquotaFcp(NfcomClassIcmsAliquotaFcp value) { put("aliquota_fcp", value == null ? null : value.toJson()); return this; }
 public String getCodigoCfop() { return stringValue(field("codigo_cfop")); }
 public NfcomClassIcms setCodigoCfop(String value) { put("codigo_cfop", Json.scalar(value)); return this; }
}
