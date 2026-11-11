package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112120Details extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("itens");
 public IbsCbs112120Details() { super(FIELDS); }
 public IbsCbs112120Details(JsonNode node) { super(node, FIELDS); }
 public java.util.List<IbsCbs112120DetailsItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new IbsCbs112120DetailsItensItem(v)); }
 public IbsCbs112120Details setItens(java.util.List<IbsCbs112120DetailsItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
}
