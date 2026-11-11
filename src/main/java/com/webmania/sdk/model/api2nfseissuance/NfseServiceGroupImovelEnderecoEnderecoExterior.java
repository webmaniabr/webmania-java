package com.webmania.sdk.model.api2nfseissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/nfse-issuance.openapi.json; see contract-provenance.json. */
public final class NfseServiceGroupImovelEnderecoEnderecoExterior extends JsonModel {
 private static final java.util.Set<String> FIELDS = java.util.Set.of("cidade", "codigo_pais", "codigo_postal", "estado_provincia");
 public NfseServiceGroupImovelEnderecoEnderecoExterior() { super(FIELDS); }
 public NfseServiceGroupImovelEnderecoEnderecoExterior(JsonNode node) { super(node, FIELDS); }
 public String getCidade() { return stringValue(field("cidade")); }
 public NfseServiceGroupImovelEnderecoEnderecoExterior setCidade(String value) { put("cidade", Json.scalar(value)); return this; }
 public String getCodigoPais() { return stringValue(field("codigo_pais")); }
 public NfseServiceGroupImovelEnderecoEnderecoExterior setCodigoPais(String value) { put("codigo_pais", Json.scalar(value)); return this; }
 public String getCodigoPostal() { return stringValue(field("codigo_postal")); }
 public NfseServiceGroupImovelEnderecoEnderecoExterior setCodigoPostal(String value) { put("codigo_postal", Json.scalar(value)); return this; }
 public String getEstadoProvincia() { return stringValue(field("estado_provincia")); }
 public NfseServiceGroupImovelEnderecoEnderecoExterior setEstadoProvincia(String value) { put("estado_provincia", Json.scalar(value)); return this; }
}
