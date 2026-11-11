package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueCtePayloadImpostosIcmsPartilha extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("aliquota_fcp_uf_destino", "aliquota_icms_interestadual", "aliquota_icms_uf_destino", "aliquota_icms_uf_origem", "base_calculo", "valor_icms_uf_remetente");
 public EmitterIssueCtePayloadImpostosIcmsPartilha() { super(FIELDS); }
 public EmitterIssueCtePayloadImpostosIcmsPartilha(JsonNode node) { super(node, FIELDS); }
 public EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaFcpUfDestino getAliquotaFcpUfDestino() { return (field("aliquota_fcp_uf_destino")).isNull() || (field("aliquota_fcp_uf_destino")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaFcpUfDestino(field("aliquota_fcp_uf_destino")); }
 public EmitterIssueCtePayloadImpostosIcmsPartilha setAliquotaFcpUfDestino(EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaFcpUfDestino value) { put("aliquota_fcp_uf_destino", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsInterestadual getAliquotaIcmsInterestadual() { return (field("aliquota_icms_interestadual")).isNull() || (field("aliquota_icms_interestadual")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsInterestadual(field("aliquota_icms_interestadual")); }
 public EmitterIssueCtePayloadImpostosIcmsPartilha setAliquotaIcmsInterestadual(EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsInterestadual value) { put("aliquota_icms_interestadual", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsUfDestino getAliquotaIcmsUfDestino() { return (field("aliquota_icms_uf_destino")).isNull() || (field("aliquota_icms_uf_destino")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsUfDestino(field("aliquota_icms_uf_destino")); }
 public EmitterIssueCtePayloadImpostosIcmsPartilha setAliquotaIcmsUfDestino(EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsUfDestino value) { put("aliquota_icms_uf_destino", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsUfOrigem getAliquotaIcmsUfOrigem() { return (field("aliquota_icms_uf_origem")).isNull() || (field("aliquota_icms_uf_origem")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsUfOrigem(field("aliquota_icms_uf_origem")); }
 public EmitterIssueCtePayloadImpostosIcmsPartilha setAliquotaIcmsUfOrigem(EmitterIssueCtePayloadImpostosIcmsPartilhaAliquotaIcmsUfOrigem value) { put("aliquota_icms_uf_origem", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsPartilhaBaseCalculo getBaseCalculo() { return (field("base_calculo")).isNull() || (field("base_calculo")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPartilhaBaseCalculo(field("base_calculo")); }
 public EmitterIssueCtePayloadImpostosIcmsPartilha setBaseCalculo(EmitterIssueCtePayloadImpostosIcmsPartilhaBaseCalculo value) { put("base_calculo", value == null ? null : value.toJson()); return this; }
 public EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente getValorIcmsUfRemetente() { return (field("valor_icms_uf_remetente")).isNull() || (field("valor_icms_uf_remetente")).isMissingNode() ? null : new EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente(field("valor_icms_uf_remetente")); }
 public EmitterIssueCtePayloadImpostosIcmsPartilha setValorIcmsUfRemetente(EmitterIssueCtePayloadImpostosIcmsPartilhaValorIcmsUfRemetente value) { put("valor_icms_uf_remetente", value == null ? null : value.toJson()); return this; }
}
