package com.zephyraft.dp.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class HungryIdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    private static final HungryIdGenerator instance = new HungryIdGenerator();

    private HungryIdGenerator() {
    }

    public static HungryIdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
