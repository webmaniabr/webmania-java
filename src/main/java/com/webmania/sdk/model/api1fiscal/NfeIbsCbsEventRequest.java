package com.webmania.sdk.model.api1fiscal;
import com.webmania.sdk.*;
import com.fasterxml.jackson.databind.JsonNode;
/** Generated from api1/fiscal.openapi.json; see contract-provenance.json. */
public final class NfeIbsCbsEventRequest extends JsonValue {
 private static final JsonNode SCHEMA = Json.parse("{\"oneOf\":[{\"$ref\":\"#/components/schemas/IbsCbs112110Request\"},{\"$ref\":\"#/components/schemas/IbsCbs112120Request\"},{\"$ref\":\"#/components/schemas/IbsCbs112130Request\"},{\"$ref\":\"#/components/schemas/IbsCbs112140Request\"},{\"$ref\":\"#/components/schemas/IbsCbs112150Request\"},{\"$ref\":\"#/components/schemas/IbsCbs211110Request\"},{\"$ref\":\"#/components/schemas/IbsCbs211124Request\"},{\"$ref\":\"#/components/schemas/IbsCbs211128Request\"},{\"$ref\":\"#/components/schemas/IbsCbs211130Request\"},{\"$ref\":\"#/components/schemas/IbsCbs211140Request\"},{\"$ref\":\"#/components/schemas/IbsCbs211150Request\"}],\"discriminator\":{\"propertyName\":\"cod_evento\"}}");
 public NfeIbsCbsEventRequest(JsonNode node) { super(node); }
 private static final JsonNode VARIANT_0 = SCHEMA.path("oneOf").path(0);
 public static NfeIbsCbsEventRequest ofVariant0(IbsCbs112110Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant0() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); }
 public IbsCbs112110Request asVariant0() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_0); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs112110Request(value); }
 private static final JsonNode VARIANT_1 = SCHEMA.path("oneOf").path(1);
 public static NfeIbsCbsEventRequest ofVariant1(IbsCbs112120Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant1() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); }
 public IbsCbs112120Request asVariant1() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_1); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs112120Request(value); }
 private static final JsonNode VARIANT_2 = SCHEMA.path("oneOf").path(2);
 public static NfeIbsCbsEventRequest ofVariant2(IbsCbs112130Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant2() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); }
 public IbsCbs112130Request asVariant2() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_2); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs112130Request(value); }
 private static final JsonNode VARIANT_3 = SCHEMA.path("oneOf").path(3);
 public static NfeIbsCbsEventRequest ofVariant3(IbsCbs112140Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant3() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); }
 public IbsCbs112140Request asVariant3() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_3); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs112140Request(value); }
 private static final JsonNode VARIANT_4 = SCHEMA.path("oneOf").path(4);
 public static NfeIbsCbsEventRequest ofVariant4(IbsCbs112150Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant4() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_4); }
 public IbsCbs112150Request asVariant4() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_4); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs112150Request(value); }
 private static final JsonNode VARIANT_5 = SCHEMA.path("oneOf").path(5);
 public static NfeIbsCbsEventRequest ofVariant5(IbsCbs211110Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant5() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_5); }
 public IbsCbs211110Request asVariant5() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_5); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs211110Request(value); }
 private static final JsonNode VARIANT_6 = SCHEMA.path("oneOf").path(6);
 public static NfeIbsCbsEventRequest ofVariant6(IbsCbs211124Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant6() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_6); }
 public IbsCbs211124Request asVariant6() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_6); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs211124Request(value); }
 private static final JsonNode VARIANT_7 = SCHEMA.path("oneOf").path(7);
 public static NfeIbsCbsEventRequest ofVariant7(IbsCbs211128Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant7() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_7); }
 public IbsCbs211128Request asVariant7() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_7); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs211128Request(value); }
 private static final JsonNode VARIANT_8 = SCHEMA.path("oneOf").path(8);
 public static NfeIbsCbsEventRequest ofVariant8(IbsCbs211130Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant8() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_8); }
 public IbsCbs211130Request asVariant8() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_8); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs211130Request(value); }
 private static final JsonNode VARIANT_9 = SCHEMA.path("oneOf").path(9);
 public static NfeIbsCbsEventRequest ofVariant9(IbsCbs211140Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant9() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_9); }
 public IbsCbs211140Request asVariant9() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_9); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs211140Request(value); }
 private static final JsonNode VARIANT_10 = SCHEMA.path("oneOf").path(10);
 public static NfeIbsCbsEventRequest ofVariant10(IbsCbs211150Request value) { return new NfeIbsCbsEventRequest(value == null ? null : value.toJson()); }
 public boolean matchesVariant10() { return matchesVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_10); }
 public IbsCbs211150Request asVariant10() { JsonNode value = checkedVariant("api1/fiscal.openapi.json", SCHEMA, VARIANT_10); return (value).isNull() || (value).isMissingNode() ? null : new IbsCbs211150Request(value); }
}
