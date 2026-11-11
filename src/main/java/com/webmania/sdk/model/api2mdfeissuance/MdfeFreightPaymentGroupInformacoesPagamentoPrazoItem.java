package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("data_vencimento_parcela", "valor_parcela");
 public MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem() { super(FIELDS); }
 public MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem(JsonNode node) { super(node, FIELDS); }
 public String getDataVencimentoParcela() { return stringValue(field("data_vencimento_parcela")); }
 public MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem setDataVencimentoParcela(String value) { put("data_vencimento_parcela", Json.scalar(value)); return this; }
 public String getValorParcela() { return stringValue(field("valor_parcela")); }
 public MdfeFreightPaymentGroupInformacoesPagamentoPrazoItem setValorParcela(String value) { put("valor_parcela", Json.scalar(value)); return this; }
}
