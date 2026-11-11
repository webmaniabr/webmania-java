package com.webmania.sdk;

import com.fasterxml.jackson.databind.JsonNode;

/** Private protection context for one fiscal-report wait; never shared with imports or another workflow. */
final class ReportRedactionContext {
    private Secrets previous;
    synchronized void apply(Secrets current) { if(previous!=null)current.inheritProtections(previous); }
    synchronized void observe(JsonNode response,Secrets current) {
        // A fiscal-report UUID authorizes its public report download, unlike an ordinary fiscal/import UUID.
        JsonNode uuid=response.path("uuid");if(uuid.isTextual())current.capability(uuid.textValue());
        JsonNode url=response.path("url");if(url.isTextual())current.observeLocation(url.textValue());
        previous=current;
    }
}
