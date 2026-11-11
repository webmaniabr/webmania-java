package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class CtePaymentEventsEventosPagamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("evento", "codigo", "motivo", "protocolo_evento", "protocolo_cte", "protocolo_vinculacao", "data_evento", "n_seq_evento");
 public CtePaymentEventsEventosPagamentoItem() { super(FIELDS); }
 public CtePaymentEventsEventosPagamentoItem(JsonNode node) { super(node, FIELDS); }
 public CtePaymentEventsEventosPagamentoItemEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemEvento(field("evento")); }
 public CtePaymentEventsEventosPagamentoItem setEvento(CtePaymentEventsEventosPagamentoItemEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public CtePaymentEventsEventosPagamentoItemCodigo getCodigo() { return (field("codigo")).isNull() || (field("codigo")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemCodigo(field("codigo")); }
 public CtePaymentEventsEventosPagamentoItem setCodigo(CtePaymentEventsEventosPagamentoItemCodigo value) { put("codigo", value == null ? null : value.toJson()); return this; }
 public CtePaymentEventsEventosPagamentoItemMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemMotivo(field("motivo")); }
 public CtePaymentEventsEventosPagamentoItem setMotivo(CtePaymentEventsEventosPagamentoItemMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public CtePaymentEventsEventosPagamentoItemProtocoloEvento getProtocoloEvento() { return (field("protocolo_evento")).isNull() || (field("protocolo_evento")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemProtocoloEvento(field("protocolo_evento")); }
 public CtePaymentEventsEventosPagamentoItem setProtocoloEvento(CtePaymentEventsEventosPagamentoItemProtocoloEvento value) { put("protocolo_evento", value == null ? null : value.toJson()); return this; }
 public CtePaymentEventsEventosPagamentoItemProtocoloCte getProtocoloCte() { return (field("protocolo_cte")).isNull() || (field("protocolo_cte")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemProtocoloCte(field("protocolo_cte")); }
 public CtePaymentEventsEventosPagamentoItem setProtocoloCte(CtePaymentEventsEventosPagamentoItemProtocoloCte value) { put("protocolo_cte", value == null ? null : value.toJson()); return this; }
 public CtePaymentEventsEventosPagamentoItemProtocoloVinculacao getProtocoloVinculacao() { return (field("protocolo_vinculacao")).isNull() || (field("protocolo_vinculacao")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemProtocoloVinculacao(field("protocolo_vinculacao")); }
 public CtePaymentEventsEventosPagamentoItem setProtocoloVinculacao(CtePaymentEventsEventosPagamentoItemProtocoloVinculacao value) { put("protocolo_vinculacao", value == null ? null : value.toJson()); return this; }
 public CtePaymentEventsEventosPagamentoItemDataEvento getDataEvento() { return (field("data_evento")).isNull() || (field("data_evento")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemDataEvento(field("data_evento")); }
 public CtePaymentEventsEventosPagamentoItem setDataEvento(CtePaymentEventsEventosPagamentoItemDataEvento value) { put("data_evento", value == null ? null : value.toJson()); return this; }
 public CtePaymentEventsEventosPagamentoItemNSeqEvento getNSeqEvento() { return (field("n_seq_evento")).isNull() || (field("n_seq_evento")).isMissingNode() ? null : new CtePaymentEventsEventosPagamentoItemNSeqEvento(field("n_seq_evento")); }
 public CtePaymentEventsEventosPagamentoItem setNSeqEvento(CtePaymentEventsEventosPagamentoItemNSeqEvento value) { put("n_seq_evento", value == null ? null : value.toJson()); return this; }
}
