package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviario extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("ciot", "condutor", "contratante", "lacres", "rntrc", "vale_pedagio", "veiculo_reboque", "veiculo_tracao", "combinacao_veicular", "pagamento_frete");
 public EmitterIssueMdfePayloadRodoviario() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviario(JsonNode node) { super(node, FIELDS); }
 public java.util.List<EmitterIssueMdfePayloadRodoviarioCiotItem> getCiot() { return list(field("ciot"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioCiotItem(v)); }
 public EmitterIssueMdfePayloadRodoviario setCiot(java.util.List<EmitterIssueMdfePayloadRodoviarioCiotItem> value) { put("ciot", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueMdfePayloadRodoviarioCondutorItem> getCondutor() { return list(field("condutor"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioCondutorItem(v)); }
 public EmitterIssueMdfePayloadRodoviario setCondutor(java.util.List<EmitterIssueMdfePayloadRodoviarioCondutorItem> value) { put("condutor", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueMdfePayloadRodoviarioContratanteItem> getContratante() { return list(field("contratante"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioContratanteItem(v)); }
 public EmitterIssueMdfePayloadRodoviario setContratante(java.util.List<EmitterIssueMdfePayloadRodoviarioContratanteItem> value) { put("contratante", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<String> getLacres() { return list(field("lacres"), v -> stringValue(v)); }
 public EmitterIssueMdfePayloadRodoviario setLacres(java.util.List<String> value) { put("lacres", array(value, v -> Json.scalar(v))); return this; }
 public String getRntrc() { return stringValue(field("rntrc")); }
 public EmitterIssueMdfePayloadRodoviario setRntrc(String value) { put("rntrc", Json.scalar(value)); return this; }
 public java.util.List<EmitterIssueMdfePayloadRodoviarioValePedagioItem> getValePedagio() { return list(field("vale_pedagio"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioValePedagioItem(v)); }
 public EmitterIssueMdfePayloadRodoviario setValePedagio(java.util.List<EmitterIssueMdfePayloadRodoviarioValePedagioItem> value) { put("vale_pedagio", array(value, v -> v == null ? null : v.toJson())); return this; }
 public java.util.List<EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem> getVeiculoReboque() { return list(field("veiculo_reboque"), v -> (v).isNull() || (v).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem(v)); }
 public EmitterIssueMdfePayloadRodoviario setVeiculoReboque(java.util.List<EmitterIssueMdfePayloadRodoviarioVeiculoReboqueItem> value) { put("veiculo_reboque", array(value, v -> v == null ? null : v.toJson())); return this; }
 public EmitterIssueMdfePayloadRodoviarioVeiculoTracao getVeiculoTracao() { return (field("veiculo_tracao")).isNull() || (field("veiculo_tracao")).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioVeiculoTracao(field("veiculo_tracao")); }
 public EmitterIssueMdfePayloadRodoviario setVeiculoTracao(EmitterIssueMdfePayloadRodoviarioVeiculoTracao value) { put("veiculo_tracao", value == null ? null : value.toJson()); return this; }
 public String getCombinacaoVeicular() { return stringValue(field("combinacao_veicular")); }
 public EmitterIssueMdfePayloadRodoviario setCombinacaoVeicular(String value) { put("combinacao_veicular", Json.scalar(value)); return this; }
 public java.util.List<MdfeFreightPaymentGroup> getPagamentoFrete() { return list(field("pagamento_frete"), v -> (v).isNull() || (v).isMissingNode() ? null : new MdfeFreightPaymentGroup(v)); }
 public EmitterIssueMdfePayloadRodoviario setPagamentoFrete(java.util.List<MdfeFreightPaymentGroup> value) { put("pagamento_frete", array(value, v -> v == null ? null : v.toJson())); return this; }
}
