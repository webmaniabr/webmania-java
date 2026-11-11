package com.webmania.sdk;

import java.net.URI;
import java.time.Duration;
import java.util.Map;
import javax.net.ssl.SSLContext;

/** Immutable client settings. Origin overrides are explicit per contract module. */
public final class ClientConfig {
    final Duration deadline;
    final int maxRequestBytes;
    final int maxResponseBytes;
    final Map<String,URI> origins;
    final SSLContext sslContext;
    private ClientConfig(Builder b) { deadline=b.deadline;maxRequestBytes=b.maxRequestBytes;maxResponseBytes=b.maxResponseBytes;origins=Map.copyOf(b.origins);sslContext=b.sslContext; }
    public static Builder builder() { return new Builder(); }
    public static ClientConfig defaults() { return builder().build(); }
    public static final class Builder {
        private Duration deadline=Duration.ofSeconds(30);
        private int maxRequestBytes=8_388_608;
        private int maxResponseBytes=16_777_216;
        private final java.util.HashMap<String,URI> origins=new java.util.HashMap<>();
        private SSLContext sslContext;
        public Builder deadline(Duration value) { if (value==null || value.isNegative() || value.isZero() || value.compareTo(Duration.ofHours(1))>0) throw new IllegalArgumentException("Invalid deadline");deadline=value;return this; }
        public Builder maxRequestBytes(int value) { if (value<1 || value>67_108_864) throw new IllegalArgumentException("Invalid request limit");maxRequestBytes=value;return this; }
        public Builder maxResponseBytes(int value) { if (value<1 || value>67_108_864) throw new IllegalArgumentException("Invalid response limit");maxResponseBytes=value;return this; }
        public Builder origin(String module,URI origin) {
            Contract.document(module);
            if(origin!=null)Json.checkText(origin.toString());
            if (origin==null || origin.getHost()==null || origin.getUserInfo()!=null || origin.getQuery()!=null || origin.getFragment()!=null || !("https".equals(origin.getScheme()) || ("http".equals(origin.getScheme()) && java.util.Set.of("localhost","127.0.0.1","[::1]","::1").contains(origin.getHost())))) throw new IllegalArgumentException("Origin must be HTTPS or explicit loopback HTTP");
            String authority=origin.getRawAuthority(),host=origin.getHost();
            String suffix=authority.substring(host.length());
            if(!suffix.isEmpty() && (!suffix.matches(":[0-9]{1,5}") || origin.getPort()<1 || origin.getPort()>65535))throw new IllegalArgumentException("Invalid origin port");
            String path=origin.getRawPath();
            if(path!=null)for(String segment:path.split("/",-1)) {
                String decoded=segment.replaceAll("(?i)%2e",".");
                if(decoded.equals(".") || decoded.equals(".."))throw new IllegalArgumentException("Invalid origin path");
            }
            origins.put(module,origin);return this;
        }
        /** Explicit trust roots; hostname verification remains mandatory. */
        public Builder sslContext(SSLContext value) { sslContext=java.util.Objects.requireNonNull(value);return this; }
        public ClientConfig build() { return new ClientConfig(this); }
    }
    @Override public String toString() { return "ClientConfig[redacted origins]"; }
}
