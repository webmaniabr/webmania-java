package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.webmania.sdk.model.api1fiscal.Decimal;
import com.webmania.sdk.model.api1fiscal.NfePaymentEventItemValorPagamento;
import com.webmania.sdk.model.api1fiscal.NfseServiceTaxClass;
import com.webmania.sdk.model.api1fiscal.NfseTaxClassProvider55;
import com.webmania.sdk.model.api2monitormanagement.MonitorCreateCompanyRequest;
import com.webmania.sdk.model.api2nfseissuance.NfseParameterRequirements;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TypedGetterTest {
 private static void refused(org.junit.jupiter.api.function.Executable action) {
  var error=assertThrows(IllegalStateException.class,action);assertNull(error.getCause());assertFalse(error.toString().contains("synthetic-private"));assertFalse(error.toString().contains("123.45"));
 }
 @Test void financialStringAndNumberBranchesNeverCoerceOrLoseDigits() {
  var text=NfePaymentEventItemValorPagamento.ofVariant0("123.45");assertTrue(text.matchesVariant0());assertFalse(text.matchesVariant1());assertEquals("123.45",text.asVariant0());refused(text::asVariant1);
  BigDecimal precise=new BigDecimal("9007199254740999.9900");var number=NfePaymentEventItemValorPagamento.ofVariant1(precise);assertFalse(number.matchesVariant0());assertTrue(number.matchesVariant1());assertEquals(precise,number.asVariant1());refused(number::asVariant0);assertEquals(Json.scalar(precise),number.toJson());
  var invalid=Decimal.ofVariant0("9007199254740999.9900");assertFalse(invalid.matchesVariant0());refused(invalid::asVariant0);assertEquals("9007199254740999.9900",invalid.toJson().textValue());
 }
 @Test void objectUnionUsesRequestedProviderConstraintsAndFormats() {
  JsonNode overlapping=Json.parse("{\"descricao\":\"synthetic-private\",\"tipo\":\"nfse\",\"local_prestacao\":\"1\"}");var allowed=new NfseServiceTaxClass(overlapping);assertTrue(allowed.matchesVariant0());assertTrue(allowed.matchesVariant1());assertEquals("nfse",allowed.asVariant0().getTipo());
  JsonNode input=overlapping.deepCopy();((com.fasterxml.jackson.databind.node.ObjectNode)input).put("codigo_tributacao_municipio",12);var tax=new NfseServiceTaxClass(input);assertFalse(tax.matchesVariant0());assertTrue(tax.matchesVariant1());refused(tax::asVariant0);assertEquals("1",tax.asVariant1().getLocalPrestacao());assertEquals(input,tax.toJson());
  var incomplete=new NfseTaxClassProvider55();assertNull(incomplete.getTipo());incomplete.setDescricao("synthetic-private");assertEquals("synthetic-private",incomplete.getDescricao());var union=NfseServiceTaxClass.ofVariant0(incomplete);assertFalse(union.matchesVariant0());refused(union::asVariant0);
  var uuid=com.webmania.sdk.model.api1fiscal.Uuid.ofVariant0("not-a-uuid-synthetic-private");assertFalse(uuid.matchesVariant0());refused(uuid::asVariant0);assertEquals("not-a-uuid-synthetic-private",uuid.toJson().textValue());
 }
 @Test void scalarFieldsRefuseWrongKindsAndPreserveFalseZeroAndNull() {
  for(String input:new String[]{"true","\"synthetic-private\"","{}","[]","1.5"}){var model=new MonitorCreateCompanyRequest(Json.parse("{\"categorias_download\":"+input+"}"));refused(model::getCategoriasDownload);}
  for(String input:new String[]{"0","\"false\"","{}","[]"}){var model=new MonitorCreateCompanyRequest(Json.parse("{\"dfe_retroativas\":"+input+"}"));refused(model::getDfeRetroativas);}
  for(String input:new String[]{"0","true","{}","[]"}){var model=new MonitorCreateCompanyRequest(Json.parse("{\"razao_social\":"+input+"}"));refused(model::getRazaoSocial);}
  var model=new MonitorCreateCompanyRequest(Json.parse("{\"categorias_download\":1.0,\"dfe_retroativas\":false,\"razao_social\":\"\"}"));assertEquals(BigInteger.ONE,model.getCategoriasDownload());assertEquals(Boolean.FALSE,model.getDfeRetroativas());assertEquals("",model.getRazaoSocial());model.setCategoriasDownload(BigInteger.ZERO);assertEquals(BigInteger.ZERO,model.getCategoriasDownload());
  var empty=new MonitorCreateCompanyRequest();assertFalse(empty.has("categorias_download"));assertNull(empty.getCategoriasDownload());empty.explicitNull("categorias_download");assertTrue(empty.has("categorias_download"));assertTrue(empty.isNull("categorias_download"));assertNull(empty.getCategoriasDownload());empty.omit("categorias_download");assertFalse(empty.has("categorias_download"));
 }
 @Test void listMapAndObjectReadsDoNotReplaceWrongValuesWithNullOrZero() {
  refused(()->new MonitorCreateCompanyRequest(Json.parse("{\"modelos_download\":[1,\"nfe\"]}")).getModelosDownload());refused(()->new MonitorCreateCompanyRequest(Json.parse("{\"modelos_download\":false}")).getModelosDownload());
  var request=new MonitorCreateCompanyRequest().setModelosDownload(java.util.Arrays.asList("nfe",null,"nfse"));assertEquals(java.util.Arrays.asList("nfe",null,"nfse"),request.getModelosDownload());assertThrows(UnsupportedOperationException.class,()->request.getModelosDownload().add("cte"));
  refused(()->new NfseParameterRequirements(Json.parse("{\"dynamic\":12}")).getEntry("dynamic"));var map=new NfseParameterRequirements().setEntry("campo-com-ç", "value");assertEquals("value",map.getEntry("campo-com-ç"));assertNull(map.getEntry("missing"));map.setEntry("nullable",null);assertTrue(map.has("nullable"));assertNull(map.getEntry("nullable"));
  assertThrows(IllegalArgumentException.class,()->new NfseTaxClassProvider55(Json.parse("{\"ibs_cbs\":\"synthetic-private\"}")).getIbsCbs());assertThrows(IllegalArgumentException.class,()->new NfseTaxClassProvider55((JsonNode)null));
 }
 @Test void arrayAndDiscriminatedOneOfViewsValidateTheirRequestedBranches() {
  var array=com.webmania.sdk.model.api1files.Api1ErrorError.ofVariant1(List.of("first","second"));assertTrue(array.matchesVariant1());assertFalse(array.matchesVariant0());assertEquals(List.of("first","second"),array.asVariant1());refused(array::asVariant0);var wrong=new com.webmania.sdk.model.api1files.Api1ErrorError(Json.parse("[1]"));assertFalse(wrong.matchesVariant1());refused(wrong::asVariant1);
  var event=new com.webmania.sdk.model.api1fiscal.NfeIbsCbsEventRequest(Json.parse("{\"chave\":\""+"0".repeat(44)+"\",\"ambiente\":2,\"cod_evento\":\"112110\"}"));assertTrue(event.matchesVariant0());assertFalse(event.matchesVariant4());assertEquals("112110",event.asVariant0().getCodEvento());refused(event::asVariant4);
  var date=new com.webmania.sdk.model.api1fiscal.NfeIbsCbsEventRequest(Json.parse("{\"chave\":\""+"0".repeat(44)+"\",\"ambiente\":2,\"cod_evento\":\"112150\",\"data_previsao_entrega\":\"invalid-date\"}"));assertFalse(date.matchesVariant4());refused(date::asVariant4);
 }
 @Test void compactDecimalsKeepHugeExponentsWhileIntegerExpansionIsBounded() {
  for(String text:new String[]{"1e-4000","1e4000","1e-100000000","1e100000000","1e-2147483647","1e2147483647","0e-2147483647","0e2147483647"}) {
   BigDecimal expected=new BigDecimal(text);var value=Decimal.ofVariant1(expected);assertTrue(value.matchesVariant1(),text);assertEquals(expected,value.asVariant1(),"typed read "+text);assertEquals(0,expected.compareTo(Json.parse(value.toJsonBytes()).decimalValue()),"numeric roundtrip "+text);
  }
  for(String text:new String[]{"1.0","1.0000","-12.000","0e-2147483647","0e2147483647"}) {var model=new MonitorCreateCompanyRequest(JsonNodeFactory.instance.objectNode().set("categorias_download",Json.scalar(new BigDecimal(text)))) ;assertEquals(new BigDecimal(text).signum()==0?BigInteger.ZERO:new BigDecimal(text).toBigIntegerExact(),model.getCategoriasDownload());}
  for(String text:new String[]{"1.5","-1.5","1e-4000","1e100000000"}){var model=new MonitorCreateCompanyRequest(JsonNodeFactory.instance.objectNode().set("categorias_download",Json.scalar(new BigDecimal(text))));refused(model::getCategoriasDownload);}
  var allowed=new MonitorCreateCompanyRequest(JsonNodeFactory.instance.objectNode().set("categorias_download",Json.scalar(new BigDecimal("1e999"))));assertEquals(1000,allowed.getCategoriasDownload().toString().length());
  BigInteger materialized=BigInteger.TEN.pow(1500);assertEquals(materialized,new MonitorCreateCompanyRequest().setCategoriasDownload(materialized).getCategoriasDownload());
  assertThrows(IllegalArgumentException.class,()->Json.parse("9".repeat(Json.MAX_NUMBER_LENGTH+1)));assertThrows(IllegalArgumentException.class,()->new MonitorCreateCompanyRequest(JsonNodeFactory.instance.objectNode().put("categorias_download",1.5d)));
 }
 @Test void integerExponentRefusalDoesNotAllocateItsExpandedValue() {
  var model=new MonitorCreateCompanyRequest(JsonNodeFactory.instance.objectNode().set("categorias_download",Json.scalar(new BigDecimal("1e100000000"))));refused(model::getCategoriasDownload);var counter=assertInstanceOf(com.sun.management.ThreadMXBean.class,java.lang.management.ManagementFactory.getThreadMXBean());counter.setThreadAllocatedMemoryEnabled(true);long before=counter.getThreadAllocatedBytes(Thread.currentThread().getId());refused(model::getCategoriasDownload);long allocated=counter.getThreadAllocatedBytes(Thread.currentThread().getId())-before;assertTrue(allocated<512*1024,"Unexpected expanded integer allocation "+allocated);
 }
 @Test void existingValidatorDivisibilityHandlesCompactExponentsExactly() {
  for(String divisor:new String[]{"0.01","0.03","2","3","5","10","0.125"})for(int coefficient=-30;coefficient<=30;coefficient++)for(int scale=-8;scale<=8;scale++) {
   BigDecimal value=BigDecimal.valueOf(coefficient,scale),multiple=new BigDecimal(divisor);var schema=JsonNodeFactory.instance.objectNode().put("type","number").set("multipleOf",Json.scalar(multiple));assertEquals(value.remainder(multiple).signum()==0,Contract.valid(schema,Json.scalar(value),schema,0),value+" / "+divisor);
  }
  for(String value:new String[]{"3e100000000","0e-2147483647","0e2147483647"}){var schema=Json.parse("{\"type\":\"number\",\"multipleOf\":0.03}");assertTrue(Contract.valid(schema,Json.scalar(new BigDecimal(value)),schema,0));}
  var schema=Json.parse("{\"type\":\"number\",\"multipleOf\":0.03}");assertFalse(Contract.valid(schema,Json.scalar(new BigDecimal("1e100000000")),schema,0));assertFalse(Contract.valid(schema,Json.scalar(new BigDecimal("1e-100000000")),schema,0));
 }
 @Test void nullableBranchesAndExplicitJsonRoundtripKeepShapeAndNoBeanPredicate()throws Exception {
  var value=new com.webmania.sdk.model.api1b2b.ResellerCompanyProcessedRequestsCpf(JsonNodeFactory.instance.nullNode());assertFalse(value.matchesVariant0());assertTrue(value.matchesVariant1());assertNull(value.asVariant1());refused(value::asVariant0);
  var request=new MonitorCreateCompanyRequest().setDfeRetroativas(false).setCategoriasDownload(BigInteger.ZERO).setRazaoSocial("synthetic-private");request.extension("campo-com-ç",JsonValue.fromJson(Json.parse("{\"future\":[false,0,null,{}]}")));var copy=new MonitorCreateCompanyRequest(Json.parse(request.toJsonBytes()));assertEquals(request.toJson(),copy.toJson());assertEquals(Boolean.FALSE,copy.getDfeRetroativas());assertEquals(BigInteger.ZERO,copy.getCategoriasDownload());assertEquals(request.extension("campo-com-ç").toJson(),copy.extension("campo-com-ç").toJson());assertFalse(copy.toString().contains("synthetic-private"));
  assertThrows(IllegalArgumentException.class,()->request.extension("razao_social",JsonValue.fromJson(Json.scalar("bad"))));assertThrows(IllegalArgumentException.class,()->request.extension("x".repeat(513),null));
  var mapper=new com.fasterxml.jackson.databind.ObjectMapper();var properties=mapper.getSerializationConfig().introspect(mapper.constructType(NfePaymentEventItemValorPagamento.class)).findProperties();assertTrue(properties.stream().noneMatch(p->p.getName().contains("Variant")));assertThrows(com.fasterxml.jackson.databind.exc.InvalidDefinitionException.class,()->mapper.writeValueAsString(NfePaymentEventItemValorPagamento.ofVariant0("1.00")));assertEquals("{}",mapper.copy().disable(com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS).writeValueAsString(NfePaymentEventItemValorPagamento.ofVariant0("1.00")));
  JsonNode nested=Json.scalar("leaf");for(int i=0;i<128;i++){var parent=JsonNodeFactory.instance.arrayNode();parent.add(nested);nested=parent;}assertNotNull(new JsonValue(nested));var tooDeep=JsonNodeFactory.instance.arrayNode();tooDeep.add(nested);assertThrows(IllegalArgumentException.class,()->new JsonValue(tooDeep));
 }
 @Test void everyGeneratedObjectScalarGetterUsesExactTypesAndKeepsLazyBuilders()throws Exception {
  var location=java.nio.file.Path.of(WebmaniaClient.class.getProtectionDomain().getCodeSource().getLocation().toURI());var classes=new java.util.ArrayList<String>();
  if(java.nio.file.Files.isDirectory(location)){try(var paths=java.nio.file.Files.walk(location.resolve("com/webmania/sdk/model"))){for(var path:paths.filter(p->p.toString().endsWith(".class")).toList())classes.add(location.relativize(path).toString().replace(java.io.File.separatorChar,'.').replaceAll("\\.class$",""));}}
  else try(var archive=new java.util.zip.ZipFile(location.toFile())){for(var item:archive.stream().filter(e->e.getName().startsWith("com/webmania/sdk/model/") && e.getName().endsWith(".class")).toList())classes.add(item.getName().replace('/','.').replaceAll("\\.class$",""));}
  assertEquals(3030,classes.size());int objects=0,scalars=0,predicates=0;
  for(String name:classes){Class<?> type=Class.forName(name);assertEquals(location,java.nio.file.Path.of(type.getProtectionDomain().getCodeSource().getLocation().toURI()));
   if(!JsonModel.class.isAssignableFrom(type)){for(var method:type.getDeclaredMethods())if(method.getName().startsWith("matchesVariant")){assertEquals(boolean.class,method.getReturnType());predicates++;}continue;}
   objects++;var constructor=type.getConstructor(JsonNode.class);var fields=type.getDeclaredField("FIELDS");fields.setAccessible(true);var wrong=JsonNodeFactory.instance.objectNode();for(Object field:(java.util.Set<?>)fields.get(null))wrong.set((String)field,JsonNodeFactory.instance.arrayNode());var invalid=constructor.newInstance(wrong);var empty=type.getConstructor().newInstance();
   for(var getter:type.getDeclaredMethods())if(getter.getName().startsWith("get") && getter.getParameterCount()==0 && List.of(String.class,Boolean.class,BigInteger.class,BigDecimal.class).contains(getter.getReturnType())) {
    scalars++;assertNull(getter.invoke(empty));var failure=assertThrows(java.lang.reflect.InvocationTargetException.class,()->getter.invoke(invalid));assertInstanceOf(IllegalStateException.class,failure.getCause());assertNull(failure.getCause().getCause());
    Object expected=getter.getReturnType()==String.class?"synthetic-private":getter.getReturnType()==Boolean.class?Boolean.FALSE:getter.getReturnType()==BigInteger.class?BigInteger.ZERO:new BigDecimal("9007199254740999.9900");var setter=type.getMethod("set"+getter.getName().substring(3),getter.getReturnType());assertSame(empty,setter.invoke(empty,expected));assertEquals(expected,getter.invoke(empty));setter.invoke(empty,new Object[]{null});assertNull(getter.invoke(empty));
   }
  }
  System.out.println("TYPED_GETTERS object_classes="+objects+" scalar_getters="+scalars+" matches_predicates="+predicates);assertEquals(1253,objects);assertEquals(4972,scalars);assertEquals(3873,predicates);
 }
}
