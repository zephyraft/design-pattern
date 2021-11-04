package com.zephyraft.dp.singleton;

import java.util.concurrent.atomic.AtomicLong;

public enum EnumIdGenerator {
    INSTANCE;
    private final AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
