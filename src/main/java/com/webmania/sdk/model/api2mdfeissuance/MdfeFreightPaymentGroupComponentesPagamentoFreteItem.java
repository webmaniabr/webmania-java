package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class MdfeFreightPaymentGroupComponentesPagamentoFreteItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("tipo_componente", "valor_componente", "descricao_componente");
 public MdfeFreightPaymentGroupComponentesPagamentoFreteItem() { super(FIELDS); }
 public MdfeFreightPaymentGroupComponentesPagamentoFreteItem(JsonNode node) { super(node, FIELDS); }
 public MdfeFreightPaymentGroupComponentesPagamentoFreteItemTipoComponente getTipoComponente() { return (field("tipo_componente")).isNull() || (field("tipo_componente")).isMissingNode() ? null : new MdfeFreightPaymentGroupComponentesPagamentoFreteItemTipoComponente(field("tipo_componente")); }
 public MdfeFreightPaymentGroupComponentesPagamentoFreteItem setTipoComponente(MdfeFreightPaymentGroupComponentesPagamentoFreteItemTipoComponente value) { put("tipo_componente", value == null ? null : value.toJson()); return this; }
 public String getValorComponente() { return stringValue(field("valor_componente")); }
 public MdfeFreightPaymentGroupComponentesPagamentoFreteItem setValorComponente(String value) { put("valor_componente", Json.scalar(value)); return this; }
 public String getDescricaoComponente() { return stringValue(field("descricao_componente")); }
 public MdfeFreightPaymentGroupComponentesPagamentoFreteItem setDescricaoComponente(String value) { put("descricao_componente", Json.scalar(value)); return this; }
}
