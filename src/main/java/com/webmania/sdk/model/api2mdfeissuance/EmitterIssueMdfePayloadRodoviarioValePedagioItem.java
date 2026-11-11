package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadRodoviarioValePedagioItem extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cnpj_fornecedor", "cnpj_responsavel", "comprovante", "cpf_responsavel", "valor", "tipo");
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem() { super(FIELDS); }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem(JsonNode node) { super(node, FIELDS); }
 public String getCnpjFornecedor() { return stringValue(field("cnpj_fornecedor")); }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem setCnpjFornecedor(String value) { put("cnpj_fornecedor", Json.scalar(value)); return this; }
 public String getCnpjResponsavel() { return stringValue(field("cnpj_responsavel")); }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem setCnpjResponsavel(String value) { put("cnpj_responsavel", Json.scalar(value)); return this; }
 public String getComprovante() { return stringValue(field("comprovante")); }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem setComprovante(String value) { put("comprovante", Json.scalar(value)); return this; }
 public String getCpfResponsavel() { return stringValue(field("cpf_responsavel")); }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem setCpfResponsavel(String value) { put("cpf_responsavel", Json.scalar(value)); return this; }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItemValor getValor() { return (field("valor")).isNull() || (field("valor")).isMissingNode() ? null : new EmitterIssueMdfePayloadRodoviarioValePedagioItemValor(field("valor")); }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem setValor(EmitterIssueMdfePayloadRodoviarioValePedagioItemValor value) { put("valor", value == null ? null : value.toJson()); return this; }
 public String getTipo() { return stringValue(field("tipo")); }
 public EmitterIssueMdfePayloadRodoviarioValePedagioItem setTipo(String value) { put("tipo", Json.scalar(value)); return this; }
}
