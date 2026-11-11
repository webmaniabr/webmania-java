package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class IbsCbs211140Details extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("itens");
 public IbsCbs211140Details() { super(FIELDS); }
 public IbsCbs211140Details(JsonNode node) { super(node, FIELDS); }
 public java.util.List<IbsCbs211140DetailsItensItem> getItens() { return list(field("itens"), v -> (v).isNull() || (v).isMissingNode() ? null : new IbsCbs211140DetailsItensItem(v)); }
 public IbsCbs211140Details setItens(java.util.List<IbsCbs211140DetailsItensItem> value) { put("itens", array(value, v -> v == null ? null : v.toJson())); return this; }
}
