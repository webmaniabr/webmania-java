package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfcomPayloadFaturaVariant0 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("codigo_barras_fatura", "competencia_fatura", "data_periodo_final", "data_periodo_inicial", "data_vencimento", "numero_debito_automatico");
 public EmitterIssueNfcomPayloadFaturaVariant0() { super(FIELDS); }
 public EmitterIssueNfcomPayloadFaturaVariant0(JsonNode node) { super(node, FIELDS); }
 public String getCodigoBarrasFatura() { return stringValue(field("codigo_barras_fatura")); }
 public EmitterIssueNfcomPayloadFaturaVariant0 setCodigoBarrasFatura(String value) { put("codigo_barras_fatura", Json.scalar(value)); return this; }
 public String getCompetenciaFatura() { return stringValue(field("competencia_fatura")); }
 public EmitterIssueNfcomPayloadFaturaVariant0 setCompetenciaFatura(String value) { put("competencia_fatura", Json.scalar(value)); return this; }
 public String getDataPeriodoFinal() { return stringValue(field("data_periodo_final")); }
 public EmitterIssueNfcomPayloadFaturaVariant0 setDataPeriodoFinal(String value) { put("data_periodo_final", Json.scalar(value)); return this; }
 public String getDataPeriodoInicial() { return stringValue(field("data_periodo_inicial")); }
 public EmitterIssueNfcomPayloadFaturaVariant0 setDataPeriodoInicial(String value) { put("data_periodo_inicial", Json.scalar(value)); return this; }
 public String getDataVencimento() { return stringValue(field("data_vencimento")); }
 public EmitterIssueNfcomPayloadFaturaVariant0 setDataVencimento(String value) { put("data_vencimento", Json.scalar(value)); return this; }
 public String getNumeroDebitoAutomatico() { return stringValue(field("numero_debito_automatico")); }
 public EmitterIssueNfcomPayloadFaturaVariant0 setNumeroDebitoAutomatico(String value) { put("numero_debito_automatico", Json.scalar(value)); return this; }
}
