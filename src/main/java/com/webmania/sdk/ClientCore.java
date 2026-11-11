package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/** Shared lifecycle and transport implementation used by all generated operations. */
public abstract class ClientCore implements AutoCloseable {
    private final ClientConfig config;
    private final Credentials credentials;
    private final java.util.concurrent.ExecutorService workers;
    private final ScheduledExecutorService timer;
    private final java.util.Set<Call<?>> calls=ConcurrentHashMap.newKeySet();
    private volatile boolean closed;
    private final java.util.Set<BoundedWorkflow<?>> workflows=ConcurrentHashMap.newKeySet();
    final ScheduledExecutorService scheduler() { return timer; }
    final void track(BoundedWorkflow<?> task) { workflows.add(task);task.whenComplete((r,e)->workflows.remove(task));if(closed)task.abort(ApiException.Kind.CLOSED); }
    protected ClientCore(ClientConfig config,Credentials credentials) {
        this.config=java.util.Objects.requireNonNull(config);this.credentials=java.util.Objects.requireNonNull(credentials);
        var factory=(java.util.concurrent.ThreadFactory)r -> {Thread t=new Thread(r,"webmania-http");t.setDaemon(true);return t;};
        workers=new ThreadPoolExecutor(0,8,30,TimeUnit.SECONDS,new java.util.concurrent.SynchronousQueue<>(),factory,new ThreadPoolExecutor.AbortPolicy());
        timer=Executors.newSingleThreadScheduledExecutor(factory);
    }
    protected final <T> CompletableFuture<ApiResult<T>> executeAsync(String id,JsonModel request,Function<JsonNode,T> factory) { return start(id,request,factory,false); }
    protected final CompletableFuture<ApiResult<Download>> downloadAsync(String id,JsonModel request) { return start(id,request,null,true); }
    final CompletableFuture<ApiResult<com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportResponse>> reportPollAsync(com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest request,ReportRedactionContext context) {
        return start("fiscalCreateOrPollReport",request,com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportResponse::new,false,context);
    }
    private <T> CompletableFuture<ApiResult<T>> start(String id,JsonModel request,Function<JsonNode,T> factory,boolean binary) { return start(id,request,factory,binary,null); }
    private <T> CompletableFuture<ApiResult<T>> start(String id,JsonModel request,Function<JsonNode,T> factory,boolean binary,ReportRedactionContext reportContext) {
        long end=System.nanoTime()+config.deadline.toNanos();
        JsonNode metadata=Contract.operation(id);
        Call<T> call=new Call<>(id,!metadata.path("method").asText().equals("GET"));calls.add(call);
        call.whenComplete((r,e)->calls.remove(call));
        if(closed){call.fail(ApiException.Kind.CLOSED,0,false);return call;}
        if(!metadata.path("enabled").asBoolean()){call.fail(ApiException.Kind.CAPABILITY_DISABLED,0,false);return call;}
        try {
            if(request==null)throw new IllegalArgumentException();
            JsonNode input=request.toJson();Json.checkDepth(input,0);
            JsonNode op=Contract.operationSchema(metadata);JsonNode doc=Contract.document(metadata.path("module").asText());
            byte[] payload=input.has("body")?Json.bytes(input.get("body")):new byte[0];
            if(payload.length>config.maxRequestBytes){call.fail(ApiException.Kind.LIMIT,0,false);return call;}
            if(input.has("body"))((ObjectNode)input).set("body",Json.parse(payload));
            boolean mutation=businessMutation(op,input,metadata.path("method").asText());call.mutation=mutation;
            call.secrets=new Secrets(credentials,input);if(reportContext!=null)reportContext.apply(call.secrets);
            if(REPORT_DOWNLOADS.contains(id) || (binary && credentials.kind==Credentials.Kind.ANONYMOUS))for(JsonNode parameter:op.path("parameters"))if(parameter.path("in").asText().equals("path") && input.has(parameter.path("name").asText()))call.secrets.capability(input.get(parameter.path("name").asText()).asText());
            JsonNode referenceSchema=op.path("requestBody").path("content").path("application/json").path("schema");
            var selectors=com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();var bodySelectors=com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            for(String selector:new String[]{"ID","id","uuid","chave","key","fd","report","identifier"}) {
                if(input.path("body").has(selector) && Contract.declares(referenceSchema,selector,doc,0))bodySelectors.set(selector,input.path("body").get(selector));
                for(JsonNode parameter:op.path("parameters"))if(parameter.path("name").asText().equals(selector) && input.has(selector))selectors.set(selector,input.get(selector));
            }
            selectors.set("body",bodySelectors);call.reference=call.secrets.reference(selectors,credentials);
            if(!authorize(metadata,op)){call.fail(ApiException.Kind.AUTH_SCOPE,0,false);return call;}
            JsonNode bodySchema=op.path("requestBody").path("content").path("application/json").path("schema");
            if(op.path("requestBody").path("required").asBoolean() && !input.has("body"))throw new IllegalArgumentException();
            if(input.has("body")){if(bodySchema.isMissingNode())throw new IllegalArgumentException();Contract.validate(bodySchema,input.get("body"),doc);}
            String route=metadata.path("path").asText();StringBuilder query=new StringBuilder();var accepted=new java.util.HashSet<String>();accepted.add("body");
            for(JsonNode param:op.path("parameters")) {
                String name=param.path("name").asText();accepted.add(name);JsonNode value=input.get(name);
                if(value==null){if(param.path("required").asBoolean())throw new IllegalArgumentException();continue;}
                Contract.validate(param.path("schema"),value,doc);
                if(!value.isValueNode() || value.isNull())throw new IllegalArgumentException();
                String encoded=encode(value.asText());
                if(param.path("in").asText().equals("path"))route=route.replace("{"+name+"}",encoded);
                else if(param.path("in").asText().equals("query"))appendQuery(query,name,value.asText());
            }
            for(var property:input.properties())if(!accepted.contains(property.getKey()))throw new IllegalArgumentException();
            // The GET lookup selectors are mutually alternative; no empty selector query is sent.
            if(id.equals("nfeGetDocument") && java.util.stream.Stream.of("chave","uuid","ID","id").noneMatch(input::has))throw new IllegalArgumentException();
            if(route.indexOf('{')>=0)throw new IllegalArgumentException();
            if(credentials.kind==Credentials.Kind.DOCUMENT_TOKEN)appendQuery(query,"token",credentials.token);
            URI origin=config.origins.getOrDefault(metadata.path("module").asText(),URI.create(metadata.path("origin").asText()));
            String base=origin.toASCIIString();while(base.endsWith("/"))base=base.substring(0,base.length()-1);
            URI uri=URI.create(base+route+(query.length()>0?"?"+query:""));
            var headers=new java.util.HashMap<>(credentials.headers);headers.put("Accept",binary?"application/xml, application/pdf, application/zip, application/json, text/html":"application/json");
            long remaining=end-System.nanoTime();if(remaining<=0){call.fail(ApiException.Kind.TIMEOUT,0,false);return call;}
            var deadline=timer.schedule(()->call.abort(ApiException.Kind.TIMEOUT,false),remaining,TimeUnit.NANOSECONDS);
            call.whenComplete((r,e)->deadline.cancel(false));
            workers.execute(()->{
                if(!call.begin())return;
                try {
                    Wire.Response response=Wire.exchange(uri,metadata.path("method").asText(),headers,payload,config.maxResponseBytes,end,config.sslContext,call.transport,call);
                    if(call.stopping())return;
                    call.status=response.status();
                    if(response.status()>=300 && response.status()<400) {
                        call.redirect=RedirectTarget.from(response.headers().get("location"));
                    }
                    String media=response.headers().getOrDefault("content-type","").split(";",2)[0].strip().toLowerCase(java.util.Locale.ROOT);
                    JsonNode parsed=null;
                    boolean looksJson=media.equals("application/json") || media.endsWith("+json") || startsJson(response.body());
                    if(looksJson) {
                        try{parsed=Json.parse(response.body());}catch(IllegalArgumentException e){call.fail(ApiException.Kind.PROTOCOL,response.status(),mutation);return;}
                        call.secrets.observeResponse(parsed);if(reportContext!=null)reportContext.observe(parsed,call.secrets);if(call.reference!=null && call.secrets.contains(call.reference.value()))call.reference=null;call.correlation=call.secrets.correlation(response.headers().get("x-request-id"));call.details=ProviderDetails.from(parsed,call.secrets);
                        // A complete quota-report 4xx is a known rejection, not an
                        // uncertain business-200 result. Keep other operation policies intact.
                        if(REPORT_DOWNLOADS.contains(id) && response.status()>=400 && response.status()<500){call.fail(ApiException.Kind.HTTP,response.status(),false);return;}
                        // nfeDeleteTaxClasses answers HTTP 200 with one result per reference: an item error must not
                        // discard the other references' results. A root error and the schema check still apply.
                        boolean perReference=id.equals("nfeDeleteTaxClasses") && response.status()==200 && parsed.isArray();
                        if(perReference?parsed.has("error"):hasError(parsed)){call.fail(ApiException.Kind.API,response.status(),mutation);return;}
                    }
                    if(parsed==null)call.correlation=call.secrets.correlation(response.headers().get("x-request-id"));
                    if(response.status()>=300 && response.status()<400) {
                        if(binary && call.redirect!=null && op.path("responses").has(Integer.toString(response.status()))) {
                            @SuppressWarnings("unchecked") T redirectData=(T)new Download(call.redirect,protection(metadata));
                            call.complete(new ApiResult<>(redirectData,response.status(),call.correlation,mutation && call.sent,call.reference));
                        } else call.fail(ApiException.Kind.REDIRECT,response.status(),mutation && call.sent);
                        return;
                    }
                    if(response.status()<200 || response.status()>=300){call.fail(ApiException.Kind.HTTP,response.status(),mutation && response.status()>=500);return;}
                    T data;
                    if(binary) {
                        Download download;
                        if(parsed!=null) {
                            if(!validResponse(op,response.status(),"application/json",parsed,doc)){call.fail(ApiException.Kind.PROTOCOL,response.status(),mutation);return;}
                            download=new Download(parsed);
                        } else {
                            JsonNode content=responseContent(op,response.status());
                            if(!content.has(media)){call.fail(ApiException.Kind.PROTOCOL,response.status(),mutation);return;}
                            // Report-only tolerance: legacy CSV/XLSX reports are labeled text/xml.
                            Download.Kind kind=id.equals("fiscalDownloadReport") && media.equals("text/xml")?FileChecks.legacyReport(response.body()):FileChecks.inspect(media,response.body());
                            if(kind==null){call.fail(ApiException.Kind.PROTOCOL,response.status(),mutation);return;}
                            Download.Protection protection=protection(metadata);
                            download=new Download(response.body(),media,protection,kind);
                        }
                        @SuppressWarnings("unchecked") T cast=(T)download;data=cast;
                    } else {
                        if(parsed==null || !validResponse(op,response.status(),"application/json",parsed,doc)){call.fail(ApiException.Kind.PROTOCOL,response.status(),mutation);return;}
                        try{data=factory.apply(parsed);}catch(RuntimeException e){call.fail(ApiException.Kind.PROTOCOL,response.status(),mutation);return;}
                    }
                    call.complete(new ApiResult<>(data,response.status(),call.correlation));
                } catch(Wire.AmbiguousLocation e){call.fail(e.status>=300 && e.status<400?ApiException.Kind.REDIRECT:ApiException.Kind.TRANSPORT,e.status,mutation && call.sent);}
                catch(Wire.Limit e){call.fail(ApiException.Kind.LIMIT,call.status,mutation && call.sent);}
                catch(java.net.SocketTimeoutException e){call.fail(ApiException.Kind.TIMEOUT,call.status,mutation && call.sent);}
                catch(java.io.IOException | RuntimeException e){call.fail(ApiException.Kind.TRANSPORT,call.status,mutation && call.sent);}
                finally {call.finished();}
            });
        } catch(java.util.concurrent.RejectedExecutionException e){call.fail(ApiException.Kind.LIMIT,0,false);}
        catch(RuntimeException e){call.fail(ApiException.Kind.VALIDATION,0,false);}
        return call;
    }
    private static final java.util.Set<String> REPORT_DOWNLOADS=java.util.Set.of("fiscalDownloadReport","fiscalDownloadReportV2");
    private static final java.util.regex.Pattern REPORT_UUID=java.util.regex.Pattern.compile("[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}");
    /**
     * Downloads the {@code url} of a completed {@code fiscalCreateOrPollReport} through
     * {@code fiscalDownloadReportV2}. Only a URL on the configured report origin (default
     * {@code https://api.webmania.com.br}) whose path is the origin path plus {@code /relatorios/<uuid>}
     * is accepted; another host, user information, a scheme downgrade, query, fragment or a path
     * outside the prefix fails with VALIDATION before any credential is used. Redirects are never
     * followed. Reports of the legacy store keep using {@code fiscalDownloadReport}.
     */
    public final CompletableFuture<ApiResult<Download>> fiscalReportDownloadAsync(String url) {
        String uuid;
        try { uuid=reportUuid(url); } catch(RuntimeException e) { return CompletableFuture.failedFuture(new ApiException(ApiException.Kind.VALIDATION,"fiscalDownloadReportV2",0,false,null,null)); }
        var request=new com.webmania.sdk.model.api2reports.FiscalDownloadReportV2Request();
        request.setUuid(com.webmania.sdk.model.api2reports.ReportUuid.ofVariant0(uuid));
        return start("fiscalDownloadReportV2",request,null,true);
    }
    public final ApiResult<Download> fiscalReportDownload(String url) { return await(fiscalReportDownloadAsync(url)); }
    private String reportUuid(String url) {
        Json.checkText(url);
        URI candidate=URI.create(url);
        JsonNode metadata=Contract.operation("fiscalDownloadReportV2");
        URI origin=config.origins.getOrDefault(metadata.path("module").asText(),URI.create(metadata.path("origin").asText()));
        if(candidate.getRawUserInfo()!=null || candidate.getRawQuery()!=null || candidate.getRawFragment()!=null || candidate.getHost()==null)throw new IllegalArgumentException();
        if(!origin.getScheme().equals(candidate.getScheme()) || !origin.getHost().equalsIgnoreCase(candidate.getHost()) || origin.getPort()!=candidate.getPort())throw new IllegalArgumentException();
        String base=origin.getRawPath()==null?"":origin.getRawPath();while(base.endsWith("/"))base=base.substring(0,base.length()-1);
        String prefix=base+"/relatorios/";String path=candidate.getRawPath();
        if(path==null || !path.startsWith(prefix))throw new IllegalArgumentException();
        String uuid=path.substring(prefix.length());
        if(!REPORT_UUID.matcher(uuid).matches())throw new IllegalArgumentException();
        return uuid;
    }
    private Download.Protection protection(JsonNode metadata) { return switch(credentials.kind){case ANONYMOUS -> metadata.path("security").isEmpty()?Download.Protection.PUBLIC_CAPABILITY:Download.Protection.POSSIBLY_PASSWORD_PROTECTED;case DOCUMENT_TOKEN -> Download.Protection.DOCUMENT_TOKEN;default -> Download.Protection.AUTHENTICATED;}; }
    private static boolean businessMutation(JsonNode op,JsonNode input,String method) {
        // Primary api1/files x-retry-policy: this GET consumes bounded export quota.
        if(op.path("operationId").asText().equals("fiscalDownloadReport"))return true;
        JsonNode effect=op.path("x-operation-effects").path("business_mutation");
        if(effect.isBoolean())return effect.booleanValue();
        if(effect.isTextual())return switch(effect.asText()) {
            case "only_when_relatorio_is_present" -> input.path("body").has("relatorio") || input.path("body").path("filtros").has("relatorio");
            case "provider_status_refresh_when_atualizar_status_is_1" -> input.path("atualizar_status").asText().equals("1");
            default -> true;
        };
        return !method.equals("GET");
    }
    private boolean authorize(JsonNode metadata,JsonNode op) {
        JsonNode security=metadata.path("security");
        if(security.isEmpty())return credentials.kind==Credentials.Kind.ANONYMOUS;
        for(JsonNode mode:security) {
            if(mode.isEmpty() && credentials.kind==Credentials.Kind.ANONYMOUS)return true;
            if(mode.has("ConsumerKey") && credentials.kind==Credentials.Kind.COMPANY)return true;
            if(mode.has("ResellerConsumerKey") && credentials.kind==Credentials.Kind.RESELLER)return true;
            if(mode.has("IssuerBearer") && credentials.kind==Credentials.Kind.ISSUER)return true;
            if(mode.has("MonitorBearer") && credentials.kind==Credentials.Kind.MONITOR)return true;
            if(mode.has("FiscalFileCompanyBearer") && credentials.kind==Credentials.Kind.FILE_COMPANY)return true;
            if(mode.has("ReportCompanyBearer") && (credentials.kind==Credentials.Kind.FILE_COMPANY || credentials.kind==Credentials.Kind.ISSUER))return true;
            if((mode.has("DocumentToken") || mode.has("FiscalDocumentLinkToken")) && credentials.kind==Credentials.Kind.DOCUMENT_TOKEN)return true;
        }
        // API1 explicitly documents unauthenticated password-protected fiscal files.
        return credentials.kind==Credentials.Kind.ANONYMOUS && op.path("x-auth-origin-policy").has("unauthenticated");
    }
    private static JsonNode responseContent(JsonNode op,int status) {
        JsonNode response=op.path("responses").path(Integer.toString(status));
        if(response.isMissingNode())response=op.path("responses").path("2XX");
        return response.path("content");
    }
    private static boolean validResponse(JsonNode op,int status,String media,JsonNode value,JsonNode doc) {
        JsonNode schema=responseContent(op,status).path(media).path("schema");
        return !schema.isMissingNode() && Contract.validResponse(schema,value,doc);
    }
    private static boolean startsJson(byte[] bytes) { for(byte b:bytes){if(b==32 || b==9 || b==10 || b==13)continue;return b=='{' || b=='[';}return false; }
    private static boolean hasError(JsonNode node) { if(node.isObject()){if(node.has("error"))return true;for(JsonNode n:node)if(hasError(n))return true;}else if(node.isArray())for(JsonNode n:node)if(hasError(n))return true;return false; }
    private static String encode(String value) { Json.checkText(value);return URLEncoder.encode(value,StandardCharsets.UTF_8).replace("+","%20"); }
    private static void appendQuery(StringBuilder out,String name,String value) { if(out.length()>0)out.append('&');out.append(encode(name)).append('=').append(encode(value)); }
    protected static <T> T await(CompletableFuture<T> future) {
        try{return future.get();}catch(InterruptedException e){future.cancel(true);ApiException failure=future instanceof ContextFuture<?> contextual?contextual.failure(ApiException.Kind.CANCELLED):new ApiException(ApiException.Kind.CANCELLED,"interrupted",0,false,null,null);Thread.currentThread().interrupt();throw failure;}
        catch(java.util.concurrent.ExecutionException e){if(e.getCause() instanceof ApiException a)throw a;throw new ApiException(ApiException.Kind.TRANSPORT,"await",0,false,null,null);}
    }
    @Override public final void close() { closed=true;for(BoundedWorkflow<?> task:workflows)task.abort(ApiException.Kind.CLOSED);for(Call<?> call:calls)call.abort(ApiException.Kind.CLOSED,false);workers.shutdownNow();timer.shutdownNow(); }
    private static final class Call<T> extends ContextFuture<ApiResult<T>> implements Wire.Observer {
        final java.util.concurrent.atomic.AtomicReference<java.net.Socket> socket=new java.util.concurrent.atomic.AtomicReference<>();
        final Wire.Control transport=new Wire.Control(socket);final String id;volatile boolean mutation;
        volatile boolean sent;volatile int status;volatile Reference reference;volatile String correlation;volatile Secrets secrets;volatile ProviderDetails details;volatile RedirectTarget redirect;
        private boolean running;
        private ApiException.Kind stopped;
        private boolean nativeCancellation;
        private volatile boolean incompleteObservation;
        private ApiResult<T> result;
        private Throwable error;
        Call(String id,boolean mutation){this.id=id;this.mutation=mutation;}
        synchronized boolean begin(){if(isDone() || stopped!=null)return false;running=true;return true;}
        synchronized boolean stopping(){return stopped!=null || isDone();}
        public synchronized void sending()throws java.io.IOException {if(stopped!=null || isDone())throw new java.io.IOException();sent=true;}
        public void incomplete(){incompleteObservation=true;}
        public void complete(){incompleteObservation=false;}
        public void location(String value){secrets.observeLocation(value);if(reference!=null && secrets.contains(reference.value()))reference=null;}
        ApiException failure(ApiException.Kind kind){return new ApiException(kind,id,status,mutation && sent,incompleteObservation?null:reference,incompleteObservation?null:correlation,details,redirect);}
        void fail(ApiException.Kind kind,int status,boolean uncertain){completeExceptionally(new ApiException(kind,id,status,mutation && uncertain,reference,correlation,details,redirect));}
        @Override public synchronized boolean complete(ApiResult<T> value){if(isDone() || stopped!=null)return false;if(running){result=value;return true;}return super.complete(value);}
        @Override public synchronized boolean completeExceptionally(Throwable value){if(isDone() || stopped!=null)return false;if(running){error=value;return true;}return super.completeExceptionally(value);}
        void finished(){
            // Wire has already closed/reaped everything before public completion.
            Throwable failure;ApiResult<T> value;
            synchronized(this){
                running=false;
                if(stopped!=null){ApiException context=failure(stopped);error=nativeCancellation?new ApiCancellationException(context):context;}
                else if(error instanceof ApiException a && incompleteObservation)error=new ApiException(a.kind(),id,a.status(),a.outcomeUncertain(),null,null,a.details(),a.redirect());
                failure=error;value=result;
                notifyAll();
            }
            if(failure!=null)super.completeExceptionally(failure);else if(value!=null)super.complete(value);
        }
        boolean abort(ApiException.Kind kind,boolean nativeCancel){
            synchronized(this){if(isDone())return nativeCancel && isCancelled();if(stopped==null){stopped=kind;nativeCancellation=nativeCancel;}}
            transport.stop();
            boolean interrupted=false;Throwable failure;
            synchronized(this){
                while(running)try{wait();}catch(InterruptedException ignored){interrupted=true;}
                ApiException context=failure(stopped);failure=nativeCancellation?new ApiCancellationException(context):context;
            }
            super.completeExceptionally(failure);
            if(interrupted)Thread.currentThread().interrupt();return nativeCancel && isCancelled();
        }
        @Override public boolean cancel(boolean interrupt){return abort(ApiException.Kind.CANCELLED,true);}
    }
}
