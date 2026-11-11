package com.webmania.sdk.model.api2cteissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/cte-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterCorrectCtePayloadAlteracoesItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("campo", "grupo", "item", "valor");
 public EmitterCorrectCtePayloadAlteracoesItem() { super(FIELDS); }
 public EmitterCorrectCtePayloadAlteracoesItem(JsonNode node) { super(node, FIELDS); }
 public String getCampo() { return stringValue(field("campo")); }
 public EmitterCorrectCtePayloadAlteracoesItem setCampo(String value) { put("campo", Json.scalar(value)); return this; }
 public String getGrupo() { return stringValue(field("grupo")); }
 public EmitterCorrectCtePayloadAlteracoesItem setGrupo(String value) { put("grupo", Json.scalar(value)); return this; }
 public EmitterCorrectCtePayloadAlteracoesItemItem getItem() { return (field("item")).isNull() || (field("item")).isMissingNode() ? null : new EmitterCorrectCtePayloadAlteracoesItemItem(field("item")); }
 public EmitterCorrectCtePayloadAlteracoesItem setItem(EmitterCorrectCtePayloadAlteracoesItemItem value) { put("item", value == null ? null : value.toJson()); return this; }
 public String getValor() { return stringValue(field("valor")); }
 public EmitterCorrectCtePayloadAlteracoesItem setValor(String value) { put("valor", Json.scalar(value)); return this; }
}
