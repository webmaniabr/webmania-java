package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompaniesRequest;
import com.webmania.sdk.model.api2monitorreads.MonitorListCompanyMunicipalitiesRequest;
import com.webmania.sdk.model.api2monitordocuments.MonitorListReportsRequest;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/** Offset pagination only for endpoints whose pinned contract exposes page/per_page. */
public final class MonitorPaginationHelper {
    private final WebmaniaClient client;
    MonitorPaginationHelper(WebmaniaClient client) { this.client=client; }
    public CompletableFuture<PageCollection<com.webmania.sdk.model.api2monitorreads.MonitorCompany>> companiesAsync(MonitorListCompaniesRequest request,PaginationOptions options) {
        return page("monitorListCompanies",request,options,n->client.monitorListCompaniesAsync(new MonitorListCompaniesRequest(n)),com.webmania.sdk.model.api2monitorreads.MonitorCompany::new);
    }
    public PageCollection<com.webmania.sdk.model.api2monitorreads.MonitorCompany> companies(MonitorListCompaniesRequest request,PaginationOptions options) { return ClientCore.await(companiesAsync(request,options)); }
    public CompletableFuture<PageCollection<com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityRegistration>> companyMunicipalitiesAsync(MonitorListCompanyMunicipalitiesRequest request,PaginationOptions options) {
        return page("monitorListCompanyMunicipalities",request,options,n->client.monitorListCompanyMunicipalitiesAsync(new MonitorListCompanyMunicipalitiesRequest(n)),com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityRegistration::new);
    }
    public PageCollection<com.webmania.sdk.model.api2monitorreads.MonitorMunicipalityRegistration> companyMunicipalities(MonitorListCompanyMunicipalitiesRequest request,PaginationOptions options) { return ClientCore.await(companyMunicipalitiesAsync(request,options)); }
    public CompletableFuture<PageCollection<com.webmania.sdk.model.api2monitordocuments.MonitorReport>> reportsAsync(MonitorListReportsRequest request,PaginationOptions options) {
        return page("monitorListReports",request,options,n->client.monitorListReportsAsync(new MonitorListReportsRequest(n)),com.webmania.sdk.model.api2monitordocuments.MonitorReport::new);
    }
    public PageCollection<com.webmania.sdk.model.api2monitordocuments.MonitorReport> reports(MonitorListReportsRequest request,PaginationOptions options) { return ClientCore.await(reportsAsync(request,options)); }
    private <P extends JsonValue,T> CompletableFuture<PageCollection<T>> page(String operation,JsonModel request,PaginationOptions options,Function<JsonNode,CompletableFuture<ApiResult<P>>> exchange,Function<JsonNode,T> itemFactory) {
        if(request==null || options==null)return CompletableFuture.failedFuture(new ApiException(ApiException.Kind.VALIDATION,operation,0,false,null,null));
        final ObjectNode frozen=(ObjectNode)request.toJson();
        try {
            var definition=Contract.operationSchema(Contract.operation(operation));var document=Contract.document(Contract.operation(operation).path("module").asText());var known=new java.util.HashSet<String>();
            for(JsonNode parameter:definition.path("parameters")){String name=parameter.path("name").asText();known.add(name);if(frozen.has(name))Contract.validate(parameter.path("schema"),frozen.get(name),document);else if(parameter.path("required").asBoolean())throw new IllegalArgumentException();}
            for(var field:frozen.properties())if(!known.contains(field.getKey()))throw new IllegalArgumentException();
        } catch(RuntimeException e){return CompletableFuture.failedFuture(new ApiException(ApiException.Kind.VALIDATION,operation,0,false,null,null));}

        final BigInteger first=frozen.has("page")?frozen.path("page").bigIntegerValue():BigInteger.ONE;
        final int size;
        try{size=frozen.has("per_page")?frozen.path("per_page").bigIntegerValue().intValueExact():50;if(first.signum()<1 || size<10 || size>200)throw new IllegalArgumentException();}
        catch(RuntimeException e){return CompletableFuture.failedFuture(new ApiException(ApiException.Kind.VALIDATION,operation,0,false,null,null));}
        class Pages extends BoundedWorkflow<PageCollection<T>> {
            final List<T> collected=new ArrayList<>();BigInteger current=first;int count;
            Pages(){super(MonitorPaginationHelper.this.client,operation,options.deadline());}
            void run(){
                ObjectNode input=frozen.deepCopy();input.set("page",Json.scalar(current));input.set("per_page",Json.scalar(BigInteger.valueOf(size)));
                exchange(()->exchange.apply(input),result->{
                    JsonNode meta=result.data().node.path("meta");BigInteger returned=meta.path("current_page").bigIntegerValue();BigInteger last=meta.path("last_page").bigIntegerValue();
                    if(!meta.path("current_page").isNumber() || !meta.path("last_page").isNumber() || !current.equals(returned) || last.signum()<0 || !meta.path("per_page").isNumber() || meta.path("per_page").decimalValue().compareTo(java.math.BigDecimal.valueOf(size))!=0)throw new IllegalArgumentException();
                    JsonNode batch=result.data().node.path("data");if(!batch.isArray() || batch.size()>size || (last.compareTo(current)>0 && batch.size()!=size))throw new IllegalArgumentException();int take=Math.min(batch.size(),options.maxItems()-collected.size());for(int index=0;index<take;index++)collected.add(itemFactory.apply(batch.get(index)));count++;
                    if(take<batch.size()){complete(new PageCollection<>(collected,count,PageCollection.Stop.ITEM_LIMIT,current,take));return;}
                    if(last.compareTo(current)<=0){complete(new PageCollection<>(collected,count,PageCollection.Stop.COMPLETE,null,0));return;}
                    BigInteger following=current.add(BigInteger.ONE);
                    if(collected.size()>=options.maxItems()){complete(new PageCollection<>(collected,count,PageCollection.Stop.ITEM_LIMIT,following,0));return;}
                    if(count>=options.maxPages()){complete(new PageCollection<>(collected,count,PageCollection.Stop.PAGE_LIMIT,following,0));return;}
                    current=following;later(java.time.Duration.ZERO,this::run);
                });
            }
        }
        Pages task=new Pages();task.run();return task;
    }
}
