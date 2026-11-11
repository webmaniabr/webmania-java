package com.webmania.sdk.model.api2nfcomissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfcom-issuance.openapi.json; see contract-provenance.json. */
public final class CteFiscalResponseEventosPagamentoItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("evento", "codigo", "motivo", "protocolo_evento", "protocolo_cte", "protocolo_vinculacao", "data_evento", "n_seq_evento");
 public CteFiscalResponseEventosPagamentoItem() { super(FIELDS); }
 public CteFiscalResponseEventosPagamentoItem(JsonNode node) { super(node, FIELDS); }
 public CteFiscalResponseEventosPagamentoItemEvento getEvento() { return (field("evento")).isNull() || (field("evento")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemEvento(field("evento")); }
 public CteFiscalResponseEventosPagamentoItem setEvento(CteFiscalResponseEventosPagamentoItemEvento value) { put("evento", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseEventosPagamentoItemCodigo getCodigo() { return (field("codigo")).isNull() || (field("codigo")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemCodigo(field("codigo")); }
 public CteFiscalResponseEventosPagamentoItem setCodigo(CteFiscalResponseEventosPagamentoItemCodigo value) { put("codigo", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseEventosPagamentoItemMotivo getMotivo() { return (field("motivo")).isNull() || (field("motivo")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemMotivo(field("motivo")); }
 public CteFiscalResponseEventosPagamentoItem setMotivo(CteFiscalResponseEventosPagamentoItemMotivo value) { put("motivo", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseEventosPagamentoItemProtocoloEvento getProtocoloEvento() { return (field("protocolo_evento")).isNull() || (field("protocolo_evento")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemProtocoloEvento(field("protocolo_evento")); }
 public CteFiscalResponseEventosPagamentoItem setProtocoloEvento(CteFiscalResponseEventosPagamentoItemProtocoloEvento value) { put("protocolo_evento", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseEventosPagamentoItemProtocoloCte getProtocoloCte() { return (field("protocolo_cte")).isNull() || (field("protocolo_cte")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemProtocoloCte(field("protocolo_cte")); }
 public CteFiscalResponseEventosPagamentoItem setProtocoloCte(CteFiscalResponseEventosPagamentoItemProtocoloCte value) { put("protocolo_cte", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseEventosPagamentoItemProtocoloVinculacao getProtocoloVinculacao() { return (field("protocolo_vinculacao")).isNull() || (field("protocolo_vinculacao")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemProtocoloVinculacao(field("protocolo_vinculacao")); }
 public CteFiscalResponseEventosPagamentoItem setProtocoloVinculacao(CteFiscalResponseEventosPagamentoItemProtocoloVinculacao value) { put("protocolo_vinculacao", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseEventosPagamentoItemDataEvento getDataEvento() { return (field("data_evento")).isNull() || (field("data_evento")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemDataEvento(field("data_evento")); }
 public CteFiscalResponseEventosPagamentoItem setDataEvento(CteFiscalResponseEventosPagamentoItemDataEvento value) { put("data_evento", value == null ? null : value.toJson()); return this; }
 public CteFiscalResponseEventosPagamentoItemNSeqEvento getNSeqEvento() { return (field("n_seq_evento")).isNull() || (field("n_seq_evento")).isMissingNode() ? null : new CteFiscalResponseEventosPagamentoItemNSeqEvento(field("n_seq_evento")); }
 public CteFiscalResponseEventosPagamentoItem setNSeqEvento(CteFiscalResponseEventosPagamentoItemNSeqEvento value) { put("n_seq_evento", value == null ? null : value.toJson()); return this; }
}
