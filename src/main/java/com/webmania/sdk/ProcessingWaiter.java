package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportRequest;
import com.webmania.sdk.model.api1fiscal.FiscalCreateOrPollReportResponse;
import com.webmania.sdk.model.api2monitordocuments.MonitorGetImportStatusRequest;
import com.webmania.sdk.model.api2monitordocuments.MonitorImportStatus;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/** Waits only for documented report/import processing; never retries issuance or cancellation. */
public final class ProcessingWaiter {
    private final WebmaniaClient client;
    ProcessingWaiter(WebmaniaClient client) { this.client=client; }
    public CompletableFuture<WaitResult<MonitorImportStatus>> monitorImportAsync(MonitorGetImportStatusRequest request,PollingOptions options) {
        return waitFor("monitorGetImportStatus",request,options,n->client.monitorGetImportStatusAsync(new MonitorGetImportStatusRequest(n)),r->r.data().getStatus());
    }
    public WaitResult<MonitorImportStatus> monitorImport(MonitorGetImportStatusRequest request,PollingOptions options) { return ClientCore.await(monitorImportAsync(request,options)); }
    /** The first exchange may create the report; every later exchange uses the exact same frozen payload. */
    public CompletableFuture<WaitResult<FiscalCreateOrPollReportResponse>> fiscalReportAsync(FiscalCreateOrPollReportRequest request,PollingOptions options) {
        ReportRedactionContext context=new ReportRedactionContext();
        return waitFor("fiscalCreateOrPollReport",request,options,n->client.reportPollAsync(new FiscalCreateOrPollReportRequest(n),context),r->r.data().toJson().path("status").asText());
    }
    public WaitResult<FiscalCreateOrPollReportResponse> fiscalReport(FiscalCreateOrPollReportRequest request,PollingOptions options) { return ClientCore.await(fiscalReportAsync(request,options)); }
    private <T> CompletableFuture<WaitResult<T>> waitFor(String operation,JsonModel request,PollingOptions options,Function<JsonNode,CompletableFuture<ApiResult<T>>> exchange,Function<ApiResult<T>,String> state) {
        if(request==null || options==null)return CompletableFuture.failedFuture(new ApiException(ApiException.Kind.VALIDATION,operation,0,false,null,null));
        JsonNode frozen=request.toJson();
        class Wait extends BoundedWorkflow<WaitResult<T>> {
            int attempts;ApiResult<T> last;
            Wait(){super(ProcessingWaiter.this.client,operation,options.deadline());}
            @Override synchronized void expire(){if(last!=null && !pendingExchange())complete(new WaitResult<>(last,attempts,WaitResult.Stop.DEADLINE));else super.expire();}
            void run(){exchange(()->exchange.apply(frozen),result->{
                attempts++;last=result;String status=state.apply(result);
                if(status.equals("concluido")){complete(new WaitResult<>(last,attempts,WaitResult.Stop.COMPLETE));return;}
                if(status.equals("invalido")){complete(new WaitResult<>(last,attempts,WaitResult.Stop.INVALID_STATE));return;}
                if(!status.equals("processando")){complete(new WaitResult<>(last,attempts,WaitResult.Stop.UNKNOWN_STATE));return;}
                if(attempts>=options.maxAttempts()){complete(new WaitResult<>(last,attempts,WaitResult.Stop.ATTEMPT_LIMIT));return;}
                later(options.interval(),this::run);
            });}
        }
        Wait task=new Wait();task.run();return task;
    }
}
