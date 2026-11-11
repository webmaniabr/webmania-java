package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class G023 extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("volume", "especie", "peso_bruto", "peso_liquido", "marca", "numeracao", "lacres", "reboque", "entrega", "retirada");
 public G023() { super(FIELDS); }
 public G023(JsonNode node) { super(node, FIELDS); }
 public String getVolume() { return stringValue(field("volume")); }
 public G023 setVolume(String value) { put("volume", Json.scalar(value)); return this; }
 public String getEspecie() { return stringValue(field("especie")); }
 public G023 setEspecie(String value) { put("especie", Json.scalar(value)); return this; }
 public G023PesoBruto getPesoBruto() { return (field("peso_bruto")).isNull() || (field("peso_bruto")).isMissingNode() ? null : new G023PesoBruto(field("peso_bruto")); }
 public G023 setPesoBruto(G023PesoBruto value) { put("peso_bruto", value == null ? null : value.toJson()); return this; }
 public G023PesoLiquido getPesoLiquido() { return (field("peso_liquido")).isNull() || (field("peso_liquido")).isMissingNode() ? null : new G023PesoLiquido(field("peso_liquido")); }
 public G023 setPesoLiquido(G023PesoLiquido value) { put("peso_liquido", value == null ? null : value.toJson()); return this; }
 public String getMarca() { return stringValue(field("marca")); }
 public G023 setMarca(String value) { put("marca", Json.scalar(value)); return this; }
 public String getNumeracao() { return stringValue(field("numeracao")); }
 public G023 setNumeracao(String value) { put("numeracao", Json.scalar(value)); return this; }
 public String getLacres() { return stringValue(field("lacres")); }
 public G023 setLacres(String value) { put("lacres", Json.scalar(value)); return this; }
 public java.util.List<G025> getReboque() { return list(field("reboque"), v -> (v).isNull() || (v).isMissingNode() ? null : new G025(v)); }
 public G023 setReboque(java.util.List<G025> value) { put("reboque", array(value, v -> v == null ? null : v.toJson())); return this; }
 public G026 getEntrega() { return (field("entrega")).isNull() || (field("entrega")).isMissingNode() ? null : new G026(field("entrega")); }
 public G023 setEntrega(G026 value) { put("entrega", value == null ? null : value.toJson()); return this; }
 public G027 getRetirada() { return (field("retirada")).isNull() || (field("retirada")).isMissingNode() ? null : new G027(field("retirada")); }
 public G023 setRetirada(G027 value) { put("retirada", value == null ? null : value.toJson()); return this; }
}
