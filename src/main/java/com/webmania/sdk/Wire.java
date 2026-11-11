package com.webmania.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/** One HTTP/1.1 exchange on a fresh connection: no redirect, proxy, fallback or automatic retry. */
final class Wire {
    record Response(int status,Map<String,String> headers,byte[] body) { }
    static final class Limit extends IOException { }
    static final class AmbiguousLocation extends IOException {
        final int status;
        AmbiguousLocation(int status){this.status=status;}
    }
    interface Observer {
        void incomplete();
        void complete();
        void location(String value);
        void sending() throws IOException;
    }
    /** Request-owned transports. Native resolver work lives in a killable, reaped child; when no child can be started it runs
     *  in at most 16 daemon threads (RESOLVER_SLOTS), which a cancelled or expired call abandons but still counts. */
    static final class Control {
        private final java.util.concurrent.atomic.AtomicReference<Socket> socket;
        private Process resolver;
        private boolean stopped;
        Control(java.util.concurrent.atomic.AtomicReference<Socket> socket){this.socket=socket;}
        synchronized boolean stopped(){return stopped;}
        synchronized void socket(Socket value)throws IOException {if(stopped){value.close();throw new IOException();}socket.set(value);}
        synchronized void resolver(Process value)throws IOException {if(stopped){reap(value);throw new IOException();}resolver=value;}
        void stop(){Socket current;Process child;synchronized(this){stopped=true;current=socket.get();child=resolver;}if(current!=null)try{current.close();}catch(IOException ignored){}if(child!=null)reap(child);}
        void release(Process child){reap(child);synchronized(this){if(resolver==child)resolver=null;}}
        synchronized void release(Socket current){socket.compareAndSet(current,null);}
        private static void reap(Process child) {
            boolean interrupted=false;child.destroyForcibly();
            while(true)try{child.waitFor();break;}catch(InterruptedException ignored){interrupted=true;}
            if(interrupted)Thread.currentThread().interrupt();
        }
    }
    private static InetAddress resolve(String host,long end,Control control)throws IOException {
        if(host.equalsIgnoreCase("localhost"))return InetAddress.getByAddress(new byte[]{127,0,0,1});
        if(host.indexOf(':')>=0)return InetAddress.getByName(host);
        if(host.matches("[0-9]+(?:\\.[0-9]+){3}")) {
            String[] fields=host.split("\\.");byte[] bytes=new byte[4];
            for(int i=0;i<4;i++){if(fields[i].length()>3)throw new IOException();int n=Integer.parseInt(fields[i]);if(n>255)throw new IOException();bytes[i]=(byte)n;}
            return InetAddress.getByAddress(bytes);
        }
        // The class location comes from this SDK, never from a caller compiler or source helper. When the SDK is
        // not loaded from a plain JAR or directory (for example a nested JAR of an executable application
        // archive), the resolver child cannot be started and the in-process bounded resolver is used.
        String location=resolverLocation();
        if(location==null)return resolveInProcess(host,end,control);
        var builder=new ProcessBuilder(java.nio.file.Path.of(System.getProperty("java.home"),"bin","java").toString(),"-Xms8m","-Xmx16m","-XX:ActiveProcessorCount=1","-cp",location,ResolverMain.class.getName());
        builder.environment().clear();builder.redirectError(ProcessBuilder.Redirect.DISCARD);
        Process child=builder.start();
        try {
            control.resolver(child);
            try(var input=child.getOutputStream()){input.write(host.getBytes(StandardCharsets.US_ASCII));}
            boolean finished;
            try{finished=child.waitFor(remaining(end),java.util.concurrent.TimeUnit.MILLISECONDS);}catch(InterruptedException e){Thread.currentThread().interrupt();throw new IOException();}
            if(!finished)throw new java.net.SocketTimeoutException();
            if(control.stopped() || child.exitValue()!=0)throw new IOException();
            var output=new java.io.DataInputStream(child.getInputStream());int count=output.readInt();if(count<1 || count>64)throw new IOException();
            InetAddress first=null;
            for(int i=0;i<count;i++){int size=output.readInt();if(size!=4 && size!=16)throw new IOException();byte[] bytes=output.readNBytes(size);if(bytes.length!=size)throw new IOException();if(first==null)first=InetAddress.getByAddress(host,bytes);}
            if(output.read()!=-1)throw new IOException();return first;
        } finally {control.release(child);}
    }
    private static String resolverLocation() {
        try {
            var path=java.nio.file.Path.of(Wire.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            return java.nio.file.Files.isRegularFile(path) || java.nio.file.Files.isDirectory(path)?path.toString():null;
        } catch(java.net.URISyntaxException | RuntimeException e){return null;}
    }
    private static final java.util.concurrent.ThreadFactory RESOLVERS=r -> {Thread t=new Thread(r,"webmania-dns");t.setDaemon(true);return t;};
    /** In-process lookups running at once. An abandoned lookup keeps its slot until the OS resolver returns, so a hanging
     *  DNS cannot accumulate threads: once every slot is taken, a new lookup fails at once instead of starting another. */
    static final java.util.concurrent.Semaphore RESOLVER_SLOTS=new java.util.concurrent.Semaphore(16);
    /** Same contract as the resolver child: bounded by the call deadline and abandoned on cancellation. */
    static InetAddress resolveInProcess(String host,long end,Control control)throws IOException {
        if(!host.matches("[A-Za-z0-9._-]{1,253}"))throw new IOException();
        if(!RESOLVER_SLOTS.tryAcquire())throw new IOException();
        var result=new java.util.concurrent.CompletableFuture<InetAddress[]>();
        try{RESOLVERS.newThread(() -> {try{result.complete(InetAddress.getAllByName(host));}catch(Throwable e){result.completeExceptionally(e);}finally{RESOLVER_SLOTS.release();}}).start();}
        catch(Throwable e){RESOLVER_SLOTS.release();throw e;}
        while(true) {
            if(control.stopped())throw new IOException();
            long wait=Math.min(50,remaining(end));
            try {
                InetAddress[] addresses=result.get(wait,java.util.concurrent.TimeUnit.MILLISECONDS);
                if(addresses.length<1 || addresses.length>64)throw new IOException();
                return InetAddress.getByAddress(host,addresses[0].getAddress());
            } catch(java.util.concurrent.TimeoutException e) {
                // keep waiting: remaining(end) raises SocketTimeoutException once the call deadline passes
            } catch(java.util.concurrent.ExecutionException e){throw new IOException();}
            catch(InterruptedException e){Thread.currentThread().interrupt();throw new IOException();}
        }
    }
    static Response exchange(URI uri,String method,Map<String,String> headers,byte[] body,int limit,long end,SSLContext context,Control active,Observer observer) throws IOException {
        // Cancellation owns only the raw transport. SSLSocket.close() may wait
        // for peer TLS records, so it must never run on the cancelling caller.
        Socket transport=new Socket();Socket socket=transport;
        active.socket(transport);
        try {
            if(active.stopped())throw new IOException();
            String host=uri.getHost(); if(host.startsWith("["))host=host.substring(1,host.length()-1);
            int port=uri.getPort()>0?uri.getPort():(uri.getScheme().equals("https")?443:80);
            InetAddress address=resolve(host,end,active);
            if(active.stopped())throw new IOException();
            socket.connect(new InetSocketAddress(address,port),remaining(end));socket.setSoTimeout(remaining(end));
            if(uri.getScheme().equals("https")) {
                SSLContext tls=context;
                if(tls==null)try{tls=SSLContext.getDefault();}catch(java.security.NoSuchAlgorithmException e){throw new IOException();}
                SSLSocket secure=(SSLSocket)tls.getSocketFactory().createSocket(transport,host,port,true);
                socket=secure;
                var parameters=secure.getSSLParameters();parameters.setEndpointIdentificationAlgorithm("HTTPS");
                parameters.setProtocols(new String[]{"TLSv1.3","TLSv1.2"});secure.setSSLParameters(parameters);
                if(active.stopped())throw new IOException();
                secure.setSoTimeout(remaining(end));secure.startHandshake();
            }
            String target=uri.getRawPath();if(target==null || target.isEmpty())target="/";
            if(uri.getRawQuery()!=null)target+="?"+uri.getRawQuery();
            String hostHeader=uri.getHost()+(uri.getPort()>0?":"+uri.getPort():"");
            StringBuilder request=new StringBuilder(method+" "+target+" HTTP/1.1\r\nHost: "+hostHeader+"\r\nConnection: close\r\nAccept-Encoding: identity\r\nUser-Agent: webmania-java/0.1.0-preview.9\r\n");
            for(var entry:headers.entrySet())request.append(entry.getKey()).append(": ").append(entry.getValue()).append("\r\n");
            if(body.length>0)request.append("Content-Type: application/json\r\n");
            request.append("Content-Length: ").append(body.length).append("\r\n\r\n");
            var out=socket.getOutputStream();observer.sending();out.write(request.toString().getBytes(StandardCharsets.US_ASCII));out.write(body);out.flush();
            InputStream in=socket.getInputStream();int totalHeader=0;String line;int status;Map<String,String> received;
            int provisional=0;
            while(true) {
                line=readLine(in,8192,socket,end,observer);totalHeader+=line.length();
                if(!line.matches("HTTP/1\\.[01] [1-5][0-9]{2}( .*)?"))throw new IOException();
                observer.incomplete();
                status=Integer.parseInt(line.substring(9,12));received=new HashMap<>();
                while(!(line=readLine(in,8192,socket,end)).isEmpty()) {
                    int sep=line.indexOf(':');if(sep<1 || Character.isWhitespace(line.charAt(0)))throw new IOException();
                    String name=line.substring(0,sep).toLowerCase(java.util.Locale.ROOT);String value=line.substring(sep+1).strip();
                    if(name.equals("location"))observer.location(value);
                    totalHeader+=line.length();if(totalHeader>65536)throw new Limit();
                    if(!name.matches("[a-z0-9!#$%&'*+.^_`|~-]+"))throw new IOException();
                    if(name.equals("location") && received.containsKey(name))throw new AmbiguousLocation(status);
                    if(received.containsKey(name) && java.util.Set.of("content-length","transfer-encoding","content-type","content-encoding").contains(name))throw new IOException();
                    received.merge(name,value,(x,y)->x+","+y);
                }
                if(status>=200)break;
                if(status==101 || ++provisional>8)throw new IOException();
            }
            if(received.containsKey("content-encoding") && !received.get("content-encoding").equalsIgnoreCase("identity"))throw new IOException();
            if(received.containsKey("transfer-encoding") && received.containsKey("content-length"))throw new IOException();
            if(received.containsKey("transfer-encoding") && !received.get("transfer-encoding").equalsIgnoreCase("chunked"))throw new IOException();
            if(received.containsKey("content-length") && !received.get("content-length").matches("[0-9]{1,10}"))throw new IOException();
            observer.complete();
            ByteArrayOutputStream bytes=new ByteArrayOutputStream();
            if(status==204 || status==304) return new Response(status,Map.copyOf(received),new byte[0]);
            if(received.containsKey("transfer-encoding")) {
                observer.incomplete();
                while(true) {
                    String size=readLine(in,128,socket,end);int semi=size.indexOf(';');if(semi>=0)size=size.substring(0,semi);
                    if(!size.matches("[0-9A-Fa-f]{1,8}"))throw new IOException();
                    long count=Long.parseLong(size,16);if(count>limit-bytes.size())throw new Limit();
                    if(count==0){
                        var trailerNames=new java.util.HashSet<String>();
                        while(!(line=readLine(in,8192,socket,end)).isEmpty()) {
                            int sep=line.indexOf(':');
                            if(sep<1 || Character.isWhitespace(line.charAt(0)))throw new IOException();
                            String name=line.substring(0,sep).toLowerCase(java.util.Locale.ROOT);
                            if(name.equals("location"))observer.location(line.substring(sep+1).strip());
                            totalHeader+=line.length();if(totalHeader>65536)throw new Limit();
                            if(!name.matches("[a-z0-9!#$%&'*+.^_`|~-]+") || java.util.Set.of("content-length","transfer-encoding","content-type","content-encoding","host","authorization").contains(name))throw new IOException();
                            if(name.equals("location") && (!trailerNames.add(name) || received.containsKey(name)))throw new IOException();
                        }
                        observer.complete();
                        break;
                    }
                    copy(in,bytes,(int)count,socket,end);if(!readLine(in,2,socket,end).isEmpty())throw new IOException();
                }
            } else if(received.containsKey("content-length")) {
                String value=received.get("content-length");if(!value.matches("[0-9]{1,10}"))throw new IOException();
                long count=Long.parseLong(value);if(count>limit)throw new Limit();copy(in,bytes,(int)count,socket,end);
            } else {
                byte[] buffer=new byte[8192];int count;
                while(true){socket.setSoTimeout(remaining(end));count=in.read(buffer);if(count<0)break;if(count>limit-bytes.size())throw new Limit();bytes.write(buffer,0,count);}
            }
            return new Response(status,Map.copyOf(received),bytes.toByteArray());
        } finally {
            // The worker owns wrapper cleanup; closing raw TCP first makes
            // TLS cleanup independent of peer close_notify or pending input.
            try { transport.close(); }
            finally {
                try { if(socket!=transport)socket.close(); }
                finally { active.release(transport); }
            }
        }
    }
    private static void copy(InputStream in,ByteArrayOutputStream out,int size,Socket socket,long end)throws IOException {
        byte[] buffer=new byte[Math.min(8192,Math.max(1,size))];int left=size;
        while(left>0){socket.setSoTimeout(remaining(end));int n=in.read(buffer,0,Math.min(left,buffer.length));if(n<0)throw new IOException();out.write(buffer,0,n);left-=n;}
    }
    private static String readLine(InputStream in,int limit,Socket socket,long end)throws IOException {
        return readLine(in,limit,socket,end,null);
    }
    private static String readLine(InputStream in,int limit,Socket socket,long end,Observer started)throws IOException {
        ByteArrayOutputStream bytes=new ByteArrayOutputStream();int previous=-1;
        while(true){socket.setSoTimeout(remaining(end));int n=in.read();if(n<0)throw new IOException();if(started!=null){started.incomplete();started=null;}if(previous==13 && n==10){byte[] a=bytes.toByteArray();return new String(a,0,a.length-1,StandardCharsets.ISO_8859_1);}if(n==10 || (previous==13 && n!=10))throw new IOException();bytes.write(n);if(bytes.size()>limit)throw new Limit();previous=n;}
    }
    private static int remaining(long end)throws java.net.SocketTimeoutException {
        long n=end-System.nanoTime();if(n<=0)throw new java.net.SocketTimeoutException();return (int)Math.max(1,Math.min(Integer.MAX_VALUE,(n+999999)/1000000));
    }
    private Wire() { }
}
