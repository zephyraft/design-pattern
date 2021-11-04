package com.zephyraft.dp.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class LazyIdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    private static LazyIdGenerator instance;

    private LazyIdGenerator() {
    }

    public static synchronized LazyIdGenerator getInstance() {
        if (instance == null) {
            instance = new LazyIdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
