package com.webmania.sdk;

import java.util.List;
import java.util.Map;

/** Credentials are service scoped; matching header names never imply interchangeable scopes. */
public final class Credentials {
    enum Kind { COMPANY, ISSUER, MONITOR, RESELLER, FILE_COMPANY, DOCUMENT_TOKEN, ANONYMOUS }
    final Kind kind;
    final Map<String,String> headers;
    final String token;
    private Credentials(Kind kind,Map<String,String> headers,String token) {
        this.kind=kind; this.headers=Map.copyOf(headers); this.token=token;
        for (String value : secrets()) if (value == null || value.isBlank() || value.length()>16384 || value.codePoints().anyMatch(c -> c < 32 || c > 126)) throw new IllegalArgumentException("Invalid credential value");
    }
    private static Credentials four(Kind kind,String key,String secret,String token,String tokenSecret) {
        if(key==null || secret==null || token==null || tokenSecret==null)throw new IllegalArgumentException("Invalid credential value");
        return new Credentials(kind,Map.of("X-Consumer-Key",key,"X-Consumer-Secret",secret,"X-Access-Token",token,"X-Access-Token-Secret",tokenSecret),null);
    }
    public static Credentials company(String key,String secret,String token,String tokenSecret) { return four(Kind.COMPANY,key,secret,token,tokenSecret); }
    public static Credentials reseller(String key,String secret,String token,String tokenSecret) { return four(Kind.RESELLER,key,secret,token,tokenSecret); }
    private static Credentials bearer(Kind kind,String token) { if(token==null || token.isBlank())throw new IllegalArgumentException("Invalid credential value");return new Credentials(kind,Map.of("Authorization","Bearer "+token),null); }
    public static Credentials issuer(String token) { return bearer(Kind.ISSUER,token); }
    public static Credentials monitor(String token) { return bearer(Kind.MONITOR,token); }
    public static Credentials fileCompany(String token) { return bearer(Kind.FILE_COMPANY,token); }
    public static Credentials documentToken(String token) { if(token==null || token.isBlank())throw new IllegalArgumentException("Invalid credential value");return new Credentials(Kind.DOCUMENT_TOKEN,Map.of(),token); }
    public static Credentials anonymousFile() { return new Credentials(Kind.ANONYMOUS,Map.of(),null); }
    List<String> secrets() {
        var values=new java.util.ArrayList<>(headers.values());
        for (String value : headers.values()) if (value.startsWith("Bearer ")) values.add(value.substring(7));
        if (token!=null) values.add(token); return List.copyOf(values);
    }
    @Override public String toString() { return "Credentials[redacted]"; }
}
