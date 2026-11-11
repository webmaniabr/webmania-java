package com.webmania.sdk;

import java.time.Duration;

/** Processing waits require finite attempts/deadline and at least five seconds between completed exchanges. */
public record PollingOptions(int maxAttempts,Duration deadline,Duration interval) {
    public PollingOptions {
        if(maxAttempts<1 || maxAttempts>1000 || deadline==null || deadline.compareTo(Duration.ofMillis(1))<0 || deadline.compareTo(Duration.ofHours(1))>0 || interval==null || interval.compareTo(Duration.ofSeconds(5))<0 || interval.compareTo(Duration.ofHours(1))>0)throw new IllegalArgumentException("Invalid polling bounds");
    }
}
