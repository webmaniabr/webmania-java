package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomDocumentedGroup1953 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("indicador_pre_pago", "indicador_cessao_meios_rede", "indicador_nota_entrada");
 public NfcomDocumentedGroup1953() { super(FIELDS); }
 public NfcomDocumentedGroup1953(JsonNode node) { super(node, FIELDS); }
 public NfcomDocumentedGroup1953IndicadorPrePago getIndicadorPrePago() { return (field("indicador_pre_pago")).isNull() || (field("indicador_pre_pago")).isMissingNode() ? null : new NfcomDocumentedGroup1953IndicadorPrePago(field("indicador_pre_pago")); }
 public NfcomDocumentedGroup1953 setIndicadorPrePago(NfcomDocumentedGroup1953IndicadorPrePago value) { put("indicador_pre_pago", value == null ? null : value.toJson()); return this; }
 public NfcomDocumentedGroup1953IndicadorCessaoMeiosRede getIndicadorCessaoMeiosRede() { return (field("indicador_cessao_meios_rede")).isNull() || (field("indicador_cessao_meios_rede")).isMissingNode() ? null : new NfcomDocumentedGroup1953IndicadorCessaoMeiosRede(field("indicador_cessao_meios_rede")); }
 public NfcomDocumentedGroup1953 setIndicadorCessaoMeiosRede(NfcomDocumentedGroup1953IndicadorCessaoMeiosRede value) { put("indicador_cessao_meios_rede", value == null ? null : value.toJson()); return this; }
 public NfcomDocumentedGroup1953IndicadorNotaEntrada getIndicadorNotaEntrada() { return (field("indicador_nota_entrada")).isNull() || (field("indicador_nota_entrada")).isMissingNode() ? null : new NfcomDocumentedGroup1953IndicadorNotaEntrada(field("indicador_nota_entrada")); }
 public NfcomDocumentedGroup1953 setIndicadorNotaEntrada(NfcomDocumentedGroup1953IndicadorNotaEntrada value) { put("indicador_nota_entrada", value == null ? null : value.toJson()); return this; }
}
