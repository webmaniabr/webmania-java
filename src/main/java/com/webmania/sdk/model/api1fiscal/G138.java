package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G138 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("chave", "uuid", "pagamento", "pagamentos", "ambiente", "evento", "url_notificacao");
 public G138() { super(FIELDS); }
 public G138(JsonNode node) { super(node, FIELDS); }
 public String getChave() { return stringValue(field("chave")); }
 public G138 setChave(String value) { put("chave", Json.scalar(value)); return this; }
 public String getUuid() { return stringValue(field("uuid")); }
 public G138 setUuid(String value) { put("uuid", Json.scalar(value)); return this; }
 public NfePaymentEventItem getPagamento() { return (field("pagamento")).isNull() || (field("pagamento")).isMissingNode() ? null : new NfePaymentEventItem(field("pagamento")); }
 public G138 setPagamento(NfePaymentEventItem value) { put("pagamento", value == null ? null : value.toJson()); return this; }
 public java.util.List<NfePaymentEventItem> getPagamentos() { return list(field("pagamentos"), v -> (v).isNull() || (v).isMissingNode() ? null : new NfePaymentEventItem(v)); }
 public G138 setPagamentos(java.util.List<NfePaymentEventItem> value) { put("pagamentos", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.math.BigInteger getAmbiente() { return integerValue(field("ambiente")); }
 public G138 setAmbiente(java.math.BigInteger value) { put("ambiente", Json.scalar(value)); return this; }
 public java.math.BigInteger getEvento() { return integerValue(field("evento")); }
 public G138 setEvento(java.math.BigInteger value) { put("evento", Json.scalar(value)); return this; }
 public String getUrlNotificacao() { return stringValue(field("url_notificacao")); }
 public G138 setUrlNotificacao(String value) { put("url_notificacao", Json.scalar(value)); return this; }
}
