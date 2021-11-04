package com.zephyraft.dp.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class DoubleCheckIdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    private static DoubleCheckIdGenerator instance;

    private DoubleCheckIdGenerator() {
    }

    public static DoubleCheckIdGenerator getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckIdGenerator.class) {
                if (instance == null) {
                    instance = new DoubleCheckIdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
