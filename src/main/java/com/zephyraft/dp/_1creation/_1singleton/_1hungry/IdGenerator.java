package com.zephyraft.dp._1creation._1singleton._1hungry;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
