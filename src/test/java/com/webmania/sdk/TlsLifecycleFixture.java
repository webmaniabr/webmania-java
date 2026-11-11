package com.webmania.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocket;

/** Real TLS peer that deliberately never sends close_notify. All server sockets are owned and joined. */
final class TlsLifecycleFixture implements AutoCloseable {
 enum Phase { HANDSHAKE, HEADERS, BODY, COMPLETE, EOF_HANDSHAKE, EOF_HEADERS, EOF_BODY, RACE }
 final Phase phase;
 final CountDownLatch reached=new CountDownLatch(1), finished=new CountDownLatch(1), complete=new CountDownLatch(1);
 final AtomicInteger accepted=new AtomicInteger(), requests=new AtomicInteger(), ended=new AtomicInteger();
 volatile String selectedProtocol,userAgent;
 private final byte[] payload;
 private final String protocol;
 private final ServerSocket listener;
 private final Set<Socket> sockets=ConcurrentHashMap.newKeySet();
 private final java.util.concurrent.ExecutorService executor=Executors.newCachedThreadPool(r->{var thread=new Thread(r,"tls-lifecycle-peer");thread.setDaemon(true);return thread;});
 private volatile boolean stopped;
 TlsLifecycleFixture(Phase phase,String protocol,byte[] payload)throws Exception {
  SocketFixture.tls();this.phase=phase;this.protocol=protocol;this.payload=payload;
  listener=new ServerSocket(0,50,java.net.InetAddress.getByName("127.0.0.1"));
  executor.execute(()->{while(!stopped)try{Socket raw=listener.accept();sockets.add(raw);accepted.incrementAndGet();executor.execute(()->serve(raw));}catch(IOException e){if(!stopped)throw new java.io.UncheckedIOException(e);}});
 }
 java.net.URI origin(){return java.net.URI.create("https://localhost:"+listener.getLocalPort());}
 private void serve(Socket raw) {
  SSLSocket tls=null;
  try {
   raw.setSoTimeout(5000);
   if(phase==Phase.HANDSHAKE || phase==Phase.EOF_HANDSHAKE){if(raw.getInputStream().read()<0)throw new IOException();if(phase==Phase.EOF_HANDSHAKE)raw.shutdownOutput();reached.countDown();observeRawEof(raw);return;}
   tls=(SSLSocket)SocketFixture.serverTls.getSocketFactory().createSocket(raw,"localhost",raw.getPort(),true);
   tls.setUseClientMode(false);tls.setEnabledProtocols(new String[]{protocol});tls.setSoTimeout(5000);tls.startHandshake();selectedProtocol=tls.getSession().getProtocol();
   var in=tls.getInputStream();line(in);int length=0;String header;
   while(!(header=line(in)).isEmpty()){if(header.toLowerCase(java.util.Locale.ROOT).startsWith("content-length:"))length=Integer.parseInt(header.substring(header.indexOf(':')+1).strip());if(header.toLowerCase(java.util.Locale.ROOT).startsWith("user-agent:"))userAgent=header.substring(header.indexOf(':')+1).strip();}
   if(in.readNBytes(length).length!=length)throw new IOException();requests.incrementAndGet();
   var out=tls.getOutputStream();
   if(phase==Phase.HEADERS){reached.countDown();observeRawEof(raw);return;}
   if(phase==Phase.EOF_HEADERS){out.write("HTTP/1.1 200 Fixture\r\nContent-Type:".getBytes(StandardCharsets.US_ASCII));out.flush();raw.shutdownOutput();reached.countDown();observeRawEof(raw);return;}
   int declared=phase==Phase.EOF_BODY?payload.length+1:payload.length;
   out.write(("HTTP/1.1 200 Fixture\r\nContent-Type: application/json\r\nContent-Length: "+declared+"\r\nConnection: close\r\n\r\n").getBytes(StandardCharsets.US_ASCII));
   if(phase==Phase.BODY || phase==Phase.RACE){out.write(payload,0,1);out.flush();reached.countDown();if(phase==Phase.BODY){observeRawEof(raw);return;}if(!complete.await(3,TimeUnit.SECONDS))throw new IOException();out.write(payload,1,payload.length-1);}
   else out.write(payload);
   out.flush();if(phase==Phase.EOF_BODY)raw.shutdownOutput();reached.countDown();observeRawEof(raw);
  }catch(IOException e){ /* EOF/reset is the expected proof of transport abort. */ }
  catch(InterruptedException e){Thread.currentThread().interrupt();}
  finally {
   try{raw.close();}catch(IOException ignored){}
   if(tls!=null)try{tls.close();}catch(IOException ignored){}
   sockets.remove(raw);ended.incrementAndGet();finished.countDown();
  }
 }
 private static void observeRawEof(Socket raw)throws IOException {
  // Read opaque TCP only: consuming a TLS close alert must not generate a reply.
  byte[] buffer=new byte[1024];while(raw.getInputStream().read(buffer)>=0){}
 }
 private static String line(java.io.InputStream in)throws IOException {
  var out=new ByteArrayOutputStream();int previous=-1;
  while(true){int value=in.read();if(value<0)throw new IOException();if(previous==13 && value==10){byte[] data=out.toByteArray();return new String(data,0,data.length-1,StandardCharsets.US_ASCII);}out.write(value);if(out.size()>65536)throw new IOException();previous=value;}
 }
 @Override public void close()throws IOException {
  stopped=true;listener.close();complete.countDown();for(Socket socket:sockets)socket.close();executor.shutdownNow();
  try{if(!executor.awaitTermination(1500,TimeUnit.MILLISECONDS))throw new AssertionError("TLS fixture worker did not terminate");}catch(InterruptedException e){Thread.currentThread().interrupt();throw new AssertionError("TLS fixture close interrupted",e);}
 }
}
