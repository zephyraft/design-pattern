package com.zephyraft.dp._1creation._1singleton._3doublecheck;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    private static volatile IdGenerator instance;

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
