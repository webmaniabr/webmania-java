package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class NfcomPaymentEvent extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("evento", "codigo", "motivo", "protocolo_evento", "protocolo_nfcom", "protocolo_vinculacao", "data_evento", "n_seq_evento", "pagamento");
 public NfcomPaymentEvent() { super(FIELDS); }
 public NfcomPaymentEvent(JsonNode node) { super(node, FIELDS); }
 public NfcomPaymentEventEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new NfcomPaymentEventEvento(field("evento")); }
 public NfcomPaymentEvent setEvento(NfcomPaymentEventEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventCodigo getCodigo() { return (field("codigo")).isNull() || (field("codigo")).isMissingNode() ? null : new NfcomPaymentEventCodigo(field("codigo")); }
 public NfcomPaymentEvent setCodigo(NfcomPaymentEventCodigo value) { put("codigo", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new NfcomPaymentEventMotivo(field("motivo")); }
 public NfcomPaymentEvent setMotivo(NfcomPaymentEventMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventProtocoloEvento getProtocoloEvento() { return (field("protocolo_evento")).isNull() || (field("protocolo_evento")).isMissingNode() ? null : new NfcomPaymentEventProtocoloEvento(field("protocolo_evento")); }
 public NfcomPaymentEvent setProtocoloEvento(NfcomPaymentEventProtocoloEvento value) { put("protocolo_evento", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventProtocoloNfcom getProtocoloNfcom() { return (field("protocolo_nfcom")).isNull() || (field("protocolo_nfcom")).isMissingNode() ? null : new NfcomPaymentEventProtocoloNfcom(field("protocolo_nfcom")); }
 public NfcomPaymentEvent setProtocoloNfcom(NfcomPaymentEventProtocoloNfcom value) { put("protocolo_nfcom", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventProtocoloVinculacao getProtocoloVinculacao() { return (field("protocolo_vinculacao")).isNull() || (field("protocolo_vinculacao")).isMissingNode() ? null : new NfcomPaymentEventProtocoloVinculacao(field("protocolo_vinculacao")); }
 public NfcomPaymentEvent setProtocoloVinculacao(NfcomPaymentEventProtocoloVinculacao value) { put("protocolo_vinculacao", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventDataEvento getDataEvento() { return (field("data_evento")).isNull() || (field("data_evento")).isMissingNode() ? null : new NfcomPaymentEventDataEvento(field("data_evento")); }
 public NfcomPaymentEvent setDataEvento(NfcomPaymentEventDataEvento value) { put("data_evento", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventNSeqEvento getNSeqEvento() { return (field("n_seq_evento")).isNull() || (field("n_seq_evento")).isMissingNode() ? null : new NfcomPaymentEventNSeqEvento(field("n_seq_evento")); }
 public NfcomPaymentEvent setNSeqEvento(NfcomPaymentEventNSeqEvento value) { put("n_seq_evento", value == null ? null : value.toJson()); return this; }
 public NfcomPaymentEventPagamento getPagamento() { return (field("pagamento")).isNull() || (field("pagamento")).isMissingNode() ? null : new NfcomPaymentEventPagamento(field("pagamento")); }
 public NfcomPaymentEvent setPagamento(NfcomPaymentEventPagamento value) { put("pagamento", value == null ? null : value.toJson()); return this; }
}
