package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrictUnicodeTest {
 private static final String[] INVALID={"\ud800","\udc00","left\ud800right","\udc00\ud800"};
 private static void refused(String message,Runnable action){var e=assertThrows(IllegalArgumentException.class,action::run);assertEquals(message,e.getMessage());assertNull(e.getCause());}
 @Test void nativeStringBoundariesRejectBeforeEncodingAndPreserveValidScalars() {
  for(String value:INVALID){refused("Invalid Unicode text",()->Json.scalar(value));refused("Invalid Unicode text",()->Json.parse("{\"value\":\""+value+"\"}"));var origin=java.net.URI.create("https://example.invalid/"+value);refused("Invalid Unicode text",()->ClientConfig.builder().origin("api1/fiscal.openapi.json",origin));}
  for(String value:new String[]{"plain","\ufffd","\ud83d\ude00","left\ud83d\ude00\ufffdright"}){assertEquals(value,Json.scalar(value).textValue());assertEquals(value,Json.parse(Json.bytes(Json.scalar(value))).textValue());assertEquals(value,Json.parse("\""+value+"\"").textValue());assertDoesNotThrow(()->ClientConfig.builder().origin("api1/fiscal.openapi.json",java.net.URI.create("https://example.invalid/"+value)));}
 }
 @Test void escapedJsonStringsAndKeysRejectUnpairedUnits() {
  for(String escaped:new String[]{"\\ud800","\\udc00","\\ud800 \\udc00","\\udc00\\ud800"})for(String text:new String[]{"{\"value\":\""+escaped+"\"}","{\""+escaped+"\":\"value\"}"}){refused("Invalid JSON",()->Json.parse(text));refused("Invalid JSON",()->Json.parse(text.getBytes(StandardCharsets.UTF_8)));}
  assertEquals("\ud83d\ude00",Json.parse("\"\\ud83d\\ude00\"").textValue());assertEquals("\ufffd",Json.parse("\"\\ufffd\"").textValue());
  refused("Invalid JSON",()->Json.parse(new byte[]{'"',(byte)0xed,(byte)0xa0,(byte)0x80,'"'}));refused("Invalid JSON",()->Json.parse(new byte[]{'"',(byte)0xff,'"'}));
 }
 @Test void treeAndExtensionKeysRejectWithoutChangingCallerTree() {
  for(String invalid:INVALID){ObjectNode value=JsonNodeFactory.instance.objectNode().put("private",invalid);refused("Invalid Unicode text",()->new JsonValue(value));assertEquals(invalid,value.path("private").textValue());ObjectNode key=JsonNodeFactory.instance.objectNode().put(invalid,"private");refused("Invalid Unicode text",()->new JsonValue(key));assertTrue(key.has(invalid));var model=new com.webmania.sdk.model.api1fiscal.NfeCancelRequest();refused("Invalid Unicode text",()->model.extension(invalid,new JsonValue(Json.scalar("private"))));assertTrue(model.toJson().isEmpty());refused("Invalid Unicode text",()->new com.webmania.sdk.model.api2dceissuance.EmitterGetDceRequest().setIdentifier(invalid));}
 }
 private static final class Counting implements JsonSerializable {
  final AtomicInteger calls;final String value;final boolean key;
  Counting(AtomicInteger calls,String value,boolean key){this.calls=calls;this.value=value;this.key=key;}
  @Override public void serialize(JsonGenerator output,SerializerProvider provider)throws IOException {calls.incrementAndGet();if(key){output.writeStartObject();output.writeStringField(value,"private");output.writeEndObject();}else output.writeString(value);}
  @Override public void serializeWithType(JsonGenerator output,SerializerProvider provider,com.fasterxml.jackson.databind.jsontype.TypeSerializer type)throws IOException {serialize(output,provider);}
 }
 @Test void emittedCustomSerializerTextIsInspectedExactlyOnce() {
  for(boolean key:new boolean[]{false,true})for(String value:new String[]{"\ud800","\udc00","\ufffd","\ud83d\ude00"}){var calls=new AtomicInteger();var node=new POJONode(new Counting(calls,value,key));boolean invalid=Character.isSurrogate(value.charAt(0))&&value.length()==1;if(invalid)refused("JSON cannot be serialized",()->Json.bytes(node));else{JsonNode parsed=Json.parse(Json.bytes(node));assertEquals(key?"private":value,key?parsed.path(value).textValue():parsed.textValue());}assertEquals(1,calls.get());}
 }
 @Test void invalidEmittedRequestNeverDispatchesOrRetainsAReference()throws Exception {
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(peer.config("api1/fiscal.openapi.json"),Credentials.company("key","secret","access","access-secret"))){
   for(boolean key:new boolean[]{false,true}){var calls=new AtomicInteger();ObjectNode request=(ObjectNode)OperationSocketTest.FIXTURES.get("nfeCancelDocument").path("input").deepCopy();((ObjectNode)request.path("body")).set("private_extension",new POJONode(new Counting(calls,"\ud800",key)));var failure=OperationSocketTest.error(OperationSocketTest.invoke(client,"nfeCancelDocument",request));assertEquals(ApiException.Kind.VALIDATION,failure.kind());assertEquals("nfeCancelDocument",failure.operation());assertFalse(failure.outcomeUncertain());assertNull(failure.reference());assertNull(failure.getCause());assertEquals(1,calls.get());assertEquals(0,peer.requests.size());}
  }
 }
 @Test void responseStringsAndKeysRejectWithSanitizedProtocolContext()throws Exception {
  try(var peer=new SocketFixture(false);var client=new WebmaniaClient(peer.config("api1/fiscal.openapi.json"),Credentials.company("key","secret","access","access-secret"))){
   for(String json:new String[]{"{\"status\":\"online\",\"private\":\"\\ud800\"}","{\"status\":\"online\",\"\\udc00\":\"private\"}"}){peer.reply=SocketFixture.Reply.json(json);var failure=assertThrows(ApiException.class,()->client.nfeGetSefazStatus(new com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest()));assertEquals(ApiException.Kind.PROTOCOL,failure.kind());assertEquals("nfeGetSefazStatus",failure.operation());assertNull(failure.details());assertNull(failure.getCause());assertFalse(failure.outcomeUncertain());assertNull(failure.reference());}
   for(String value:new String[]{"\ufffd","\ud83d\ude00"}){peer.reply=SocketFixture.Reply.json("{\"status\":\"online\",\""+value+"\":\""+value+"\"}");assertEquals(200,client.nfeGetSefazStatus(new com.webmania.sdk.model.api1fiscal.NfeGetSefazStatusRequest()).status());}
   assertEquals(4,peer.requests.size());
  }
 }
 @Test void numericWriterAndCredentialPoliciesStaySeparate() {
  var big=java.math.BigInteger.TEN.pow(1100);byte[] bytes=Json.bytes(Json.scalar(big));assertEquals(big.toString(),new String(bytes,StandardCharsets.US_ASCII));refused("Invalid JSON",()->Json.parse(bytes));
  for(String value:new String[]{"1e-4096","1e4096"})assertEquals(0,new java.math.BigDecimal(value).compareTo(Json.parse(Json.bytes(Json.scalar(new java.math.BigDecimal(value)))).decimalValue()));
  for(String invalid:INVALID)refused("Invalid credential value",()->Credentials.documentToken(invalid));assertEquals("Credentials[redacted]",Credentials.monitor("literal-valid-token").toString());
 }
}
