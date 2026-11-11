package com.webmania.sdk.model.api2mdfeissuance;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/mdfe-issuance.openapi.json; see contract-provenance.json. */
public final class EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"type\":[\"number\",\"string\"],\"description\":\"Tipo da Unidade de Carga 1 - Container 2 - ULD 3 - Pallet 4 - Outros\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Tipo da Unidade de Carga 1 - Container 2 - ULD 3 - Pallet 4 - Outros\"}");
 public EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = Json.parse("{\"type\":\"number\",\"description\":\"Tipo da Unidade de Carga 1 - Container 2 - ULD 3 - Pallet 4 - Outros\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Tipo da Unidade de Carga 1 - Container 2 - ULD 3 - Pallet 4 - Outros\"}");
 public static EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo ofVariant0(java.math.BigDecimal value) { return new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo(Json.scalar(value)); }
 public boolean matchesVariant0() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); }
 public java.math.BigDecimal asVariant0() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_0); return decimalValue(value); }
 private static final JsonNode VARIANT_1 = Json.parse("{\"type\":\"string\",\"description\":\"Tipo da Unidade de Carga 1 - Container 2 - ULD 3 - Pallet 4 - Outros\",\"x-documented-size\":\"1\",\"x-documented-condition\":\"Tipo da Unidade de Carga 1 - Container 2 - ULD 3 - Pallet 4 - Outros\"}");
 public static EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo ofVariant1(String value) { return new EmitterIssueMdfePayloadDescarregamentoItemDocumentosFiscaisItemUnidadeTransporteItemUnidadeCargaItemTipo(Json.scalar(value)); }
 public boolean matchesVariant1() { return matchesVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); }
 public String asVariant1() { JsonNode value = checkedVariant("api2/mdfe-issuance.openapi.json", SCHEMA, VARIANT_1); return stringValue(value); }
}
