package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cidade", "codigo_pais", "codigo_postal", "estado_provincia");
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior() { super(FIELDS); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior(JsonNode node) { super(node, FIELDS); }
 public String getCidade() { return stringValue(field("cidade")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getCodigoPostal() { return stringValue(field("codigo_postal")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior setCodigoPostal(String value) { put("codigo_postal", Json.scalar(value)); return this; }
 public String getEstadoProvincia() { return stringValue(field("estado_provincia")); }
 public EmitterIssueNfsePayloadRpsItemDestinatarioEnderecoEnderecoExterior setEstadoProvincia(String value) { put("estado_provincia", Json.scalar(value)); return this; }
}
