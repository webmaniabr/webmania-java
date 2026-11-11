package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs112130Details extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("itens");
 public IbsCbs112130Details() { super(FIELDS); }
 public IbsCbs112130Details(JsonNode node) { super(node, FIELDS); }
 public java.util.List<IbsCbs112130DetailsItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new IbsCbs112130DetailsItensItem(v)); }
 public IbsCbs112130Details setItens(java.util.List<IbsCbs112130DetailsItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
}
