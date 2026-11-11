package com.webmania.sdk;

/** Internal process entry point: one bounded hostname input, binary addresses only, no HTTP. */
public final class ResolverMain {
    private ResolverMain() { }
    public static void main(String[] arguments) {
        try {
            if(arguments.length!=0)System.exit(2);
            byte[] input=System.in.readNBytes(1025);
            if(input.length<1 || input.length>1024)System.exit(2);
            String host=new String(input,java.nio.charset.StandardCharsets.US_ASCII);
            if(!host.matches("[A-Za-z0-9._-]{1,253}"))System.exit(2);
            java.net.InetAddress[] addresses=java.net.InetAddress.getAllByName(host);
            if(addresses.length<1 || addresses.length>64)System.exit(2);
            var output=new java.io.DataOutputStream(System.out);output.writeInt(addresses.length);
            for(var address:addresses){byte[] bytes=address.getAddress();output.writeInt(bytes.length);output.write(bytes);}
            output.flush();
        } catch(java.io.IOException | RuntimeException ignored) { System.exit(2); }
    }
}
