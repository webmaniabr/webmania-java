package com.webmania.sdk.model.api2monitordocuments;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api2/monitor-documents.openapi.json; see contract-provenance.json. */
public final class MonitorDocumentMdfeRodoviarioValePedagio extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"anyOf\":[{\"type\":\"object\",\"properties\":{\"cnpj_fornecedor\":{\"type\":\"string\"},\"cnpj_responsavel\":{\"type\":\"string\"},\"numero_comprovante\":{\"type\":\"string\"},\"valor\":{\"type\":\"number\"}},\"additionalProperties\":true},{\"type\":\"array\",\"items\":{\"type\":\"object\",\"properties\":{\"cnpj_fornecedor\":{\"type\":\"string\"},\"cnpj_responsavel\":{\"type\":\"string\"},\"cpf_responsavel\":{\"type\":\"string\"},\"valor\":{\"type\":\"string\"},\"comprovante\":{\"type\":\"string\"}},\"additionalProperties\":true}}]}");
 public MonitorDocumentMdfeRodoviarioValePedagio(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("anyOf").path(0);
 public static MonitorDocumentMdfeRodoviarioValePedagio ofVariant0(MonitorDocumentMdfeRodoviarioValePedagioVariant0 value) { return new MonitorDocumentMdfeRodoviarioValePedagio(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); }
 public MonitorDocumentMdfeRodoviarioValePedagioVariant0 asVariant0() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioValePedagioVariant0(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("anyOf").path(1);
 public static MonitorDocumentMdfeRodoviarioValePedagio ofVariant1(java.util.List<MonitorDocumentMdfeRodoviarioValePedagioVariant1Item> value) { return new MonitorDocumentMdfeRodoviarioValePedagio(array(value, v -> v == null ? null : v.toJson())); }
 public boolean matchesVariant1() { return matchesVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); }
 public java.util.List<MonitorDocumentMdfeRodoviarioValePedagioVariant1Item> asVariant1() { JsonNode value = checkedVariant("api2/monitor-documents.openapi.json", SCHEMA, VARIANT_1); return list(value, v -> (v).isNull() || (v).isMissingNode() ? null : new MonitorDocumentMdfeRodoviarioValePedagioVariant1Item(v)); }
}
