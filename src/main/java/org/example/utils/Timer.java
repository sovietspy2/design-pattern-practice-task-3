package org.example.utils;

import java.time.Duration;
import java.time.Instant;

// DO NOT CHANGE THIS CLASS
public class Timer {

    private final Long limit;

    public Timer(Long limit) {
        this.limit = limit;
    }

    private final Instant start = Instant.now();

    public void stop() {
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();

        if (timeElapsed > limit) {
            throw new RuntimeException("The app is too slow! It took "
                    +timeElapsed+"ms to run but the limit is: "+limit+"ms");
        }

    }
}
