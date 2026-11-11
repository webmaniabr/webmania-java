package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** Interprets documented cross-field rules with an unambiguous local binding; provider/clock rules remain server-owned. */
final class ConditionalRules {
 static void validate(JsonNode schema,JsonNode value,JsonNode doc) {
  if(!check(schema,value,value,doc,List.of(),0))throw new IllegalArgumentException("Cross-field condition is not satisfied");
 }
 private static boolean check(JsonNode schema,JsonNode value,JsonNode root,JsonNode doc,List<String> path,int depth) {
  if(depth>256)return false;
  if(schema.has("$ref") && !check(doc.at(schema.path("$ref").asText().substring(1)),value,root,doc,path,depth+1))return false;
  for(JsonNode rule:schema.path("x-conditional-rules"))if(!rule(rule.asText(),value,root,path))return false;
  if(schema.has("if")) {
   String branch=Contract.valid(schema.get("if"),value,doc,0)?"then":"else";
   if(schema.has(branch) && !check(schema.get(branch),value,root,doc,path,depth+1))return false;
  }
  for(JsonNode branch:schema.path("allOf"))if(!check(branch,value,root,doc,path,depth+1))return false;
  for(String union:new String[]{"anyOf","oneOf"})if(schema.has(union)) {
   if(value.isMissingNode()) {
    // Requiredness annotations belong to the property even when its scalar alternative is omitted.
    for(JsonNode branch:schema.get(union))for(JsonNode rule:branch.path("x-conditional-rules"))if(!rule(rule.asText(),value,root,path))return false;
   } else {
    boolean matched=false;
    for(JsonNode branch:schema.get(union))if(Contract.valid(branch,value,doc,0) && check(branch,value,root,doc,path,depth+1)){matched=true;break;}
    if(!matched)return false;
   }
  }
  if(value.isObject() && schema.path("properties").has("data_inicial") && schema.path("properties").has("data_final") && value.hasNonNull("data_inicial") && value.hasNonNull("data_final")) {
   try{if(LocalDate.parse(value.path("data_final").asText()).isBefore(LocalDate.parse(value.path("data_inicial").asText())))return false;}catch(java.time.DateTimeException ignored){/* The schema validates date syntax. */}
  }
  if(value.isTextual() && schema.path("description").asText().contains("Numeric bounds apply")) {
   try {
    var number=Json.scalar(new BigDecimal(value.asText()));boolean numericBranch=false;boolean accepted=false;
    for(JsonNode branch:schema.path("anyOf"))if(branch.path("type").asText().equals("number") || branch.path("type").asText().equals("integer")){numericBranch=true;accepted|=Contract.valid(branch,number,doc,0);}
    if(numericBranch && !accepted)return false;
   }catch(NumberFormatException ignored){return false;}
  }
  if(value.isObject())for(var property:schema.path("properties").properties()) {
   var child=new ArrayList<>(path);child.add(property.getKey());
   if(!check(property.getValue(),value.path(property.getKey()),root,doc,child,depth+1))return false;
  }
  if(value.isArray() && schema.has("items"))for(int index=0;index<value.size();index++) {
   var child=new ArrayList<>(path);child.add(Integer.toString(index));if(!check(schema.get("items"),value.get(index),root,doc,child,depth+1))return false;
  }
  return true;
 }
 private static boolean rule(String rule,JsonNode value,JsonNode root,List<String> path) {
  int colon=rule.indexOf(':');if(colon<0)return true;String name=rule.substring(0,colon);String[] args=rule.substring(colon+1).split(",");if(args.length==0 || args[0].isEmpty())return true;
  JsonNode other=lookup(root,args[0],path);
  switch(name) {
   case "after_or_equal":
    // 'today' is evaluated by the server clock and is never guessed by the SDK.
    if(args[0].equals("today") || empty(value) || empty(other))return true;
    try{return !LocalDate.parse(value.asText()).isBefore(LocalDate.parse(other.asText()));}catch(java.time.DateTimeException e){return true;}
   case "lt":
    if(empty(value))return true;
    try{BigDecimal bound=args[0].matches("[+-]?[0-9]+(\\.[0-9]+)?")?new BigDecimal(args[0]):empty(other)?null:new BigDecimal(other.asText());return bound==null || new BigDecimal(value.asText()).compareTo(bound)<0;}catch(NumberFormatException e){return true;}
   // Required/prohibited rules are executed by the model-scoped if/then/allOf clauses.
   // The unscoped source annotations omit model exceptions (e.g. CT-e OS RNTRC).
   default:return true;
  }
 }
 private static boolean empty(JsonNode n) {return n.isMissingNode() || n.isNull() || (n.isTextual() && n.textValue().strip().isEmpty()) || (n.isContainerNode() && n.isEmpty());}
 private static JsonNode lookup(JsonNode root,String target,List<String> current) {
  String[] parts=target.split("\\.");JsonNode result=root;
  for(int i=0;i<parts.length;i++) {
   String part=parts[i];if(part.equals("*")){if(i>=current.size() || !current.get(i).matches("[0-9]+"))return MissingNode.getInstance();part=current.get(i);}
   if(result.isArray()){try{result=result.path(Integer.parseInt(part));}catch(NumberFormatException e){return MissingNode.getInstance();}}
   else result=result.path(part);
  }
  return result;
 }
 private ConditionalRules() { }
}
