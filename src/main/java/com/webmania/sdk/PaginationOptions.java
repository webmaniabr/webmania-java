package com.webmania.sdk;

import java.time.Duration;

/** Explicit aggregate bounds; no unbounded pagination is available. */
public record PaginationOptions(int maxPages,int maxItems,Duration deadline) {
    public PaginationOptions {
        if(maxPages<1 || maxPages>1000 || maxItems<1 || maxItems>100000 || deadline==null || deadline.compareTo(Duration.ofMillis(1))<0 || deadline.compareTo(Duration.ofHours(1))>0)throw new IllegalArgumentException("Invalid pagination bounds");
    }
}
