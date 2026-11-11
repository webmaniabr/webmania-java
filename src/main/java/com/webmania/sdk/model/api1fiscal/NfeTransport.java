package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeTransport extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("volume", "especie", "peso_bruto", "peso_liquido", "marca", "numeracao", "lacres", "reboque", "entrega", "retirada", "cnpj", "razao_social", "ie", "cpf", "nome_completo", "endereco", "uf", "cidade", "cep", "placa", "uf_veiculo", "rntc", "seguro");
 public NfeTransport() { super(FIELDS); }
 public NfeTransport(JsonNode node) { super(node, FIELDS); }
 public String getVolume() { return stringValue(field("volume")); }
 public NfeTransport setVolume(String value) { put("volume", Json.scalar(value)); return this; }
 public String getEspecie() { return stringValue(field("especie")); }
 public NfeTransport setEspecie(String value) { put("especie", Json.scalar(value)); return this; }
 public NfeTransportPesoBruto getPesoBruto() { return (field("peso_bruto")).isNull() || (field("peso_bruto")).isMissingNode() ? null : new NfeTransportPesoBruto(field("peso_bruto")); }
 public NfeTransport setPesoBruto(NfeTransportPesoBruto value) { put("peso_bruto", value == null ? null : value.toJson()); return this; }
 public NfeTransportPesoLiquido getPesoLiquido() { return (field("peso_liquido")).isNull() || (field("peso_liquido")).isMissingNode() ? null : new NfeTransportPesoLiquido(field("peso_liquido")); }
 public NfeTransport setPesoLiquido(NfeTransportPesoLiquido value) { put("peso_liquido", value == null ? null : value.toJson()); return this; }
 public String getMarca() { return stringValue(field("marca")); }
 public NfeTransport setMarca(String value) { put("marca", Json.scalar(value)); return this; }
 public String getNumeracao() { return stringValue(field("numeracao")); }
 public NfeTransport setNumeracao(String value) { put("numeracao", Json.scalar(value)); return this; }
 public String getLacres() { return stringValue(field("lacres")); }
 public NfeTransport setLacres(String value) { put("lacres", Json.scalar(value)); return this; }
 public java.util.List<G025> getReboque() { return list(field("reboque"), v -> (v).isNull() || (v).isMissingNode() ? null : new G025(v)); }
 public NfeTransport setReboque(java.util.List<G025> value) { put("reboque", array(value, v -> v == null ? null : v.toJson())); return this; }
 public G026 getEntrega() { return (field("entrega")).isNull() || (field("entrega")).isMissingNode() ? null : new G026(field("entrega")); }
 public NfeTransport setEntrega(G026 value) { put("entrega", value == null ? null : value.toJson()); return this; }
 public G027 getRetirada() { return (field("retirada")).isNull() || (field("retirada")).isMissingNode() ? null : new G027(field("retirada")); }
 public NfeTransport setRetirada(G027 value) { put("retirada", value == null ? null : value.toJson()); return this; }
 public String getCnpj() { return stringValue(field("cnpj")); }
 public NfeTransport setCnpj(String value) { put("cnpj", Json.scalar(value)); return this; }
 public String getRazaoSocial() { return stringValue(field("razao_social")); }
 public NfeTransport setRazaoSocial(String value) { put("razao_social", Json.scalar(value)); return this; }
 public String getIe() { return stringValue(field("ie")); }
 public NfeTransport setIe(String value) { put("ie", Json.scalar(value)); return this; }
 public String getCpf() { return stringValue(field("cpf")); }
 public NfeTransport setCpf(String value) { put("cpf", Json.scalar(value)); return this; }
 public String getNomeCompleto() { return stringValue(field("nome_completo")); }
 public NfeTransport setNomeCompleto(String value) { put("nome_completo", Json.scalar(value)); return this; }
 public String getEndereco() { return stringValue(field("endereco")); }
 public NfeTransport setEndereco(String value) { put("endereco", Json.scalar(value)); return this; }
 public String getUf() { return stringValue(field("uf")); }
 public NfeTransport setUf(String value) { put("uf", Json.scalar(value)); return this; }
 public String getCidade() { return stringValue(field("cidade")); }
 public NfeTransport setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCep() { return stringValue(field("cep")); }
 public NfeTransport setCep(String value) { put("cep", Json.scalar(value)); return this; }
 public String getPlaca() { return stringValue(field("placa")); }
 public NfeTransport setPlaca(String value) { put("placa", Json.scalar(value)); return this; }
 public String getUfVeiculo() { return stringValue(field("uf_veiculo")); }
 public NfeTransport setUfVeiculo(String value) { put("uf_veiculo", Json.scalar(value)); return this; }
 public String getRntc() { return stringValue(field("rntc")); }
 public NfeTransport setRntc(String value) { put("rntc", Json.scalar(value)); return this; }
 public NfeTransportSeguro getSeguro() { return (field("seguro")).isNull() || (field("seguro")).isMissingNode() ? null : new NfeTransportSeguro(field("seguro")); }
 public NfeTransport setSeguro(NfeTransportSeguro value) { put("seguro", value == null ? null : value.toJson()); return this; }
}
