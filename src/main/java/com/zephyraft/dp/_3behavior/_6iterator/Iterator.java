package com.zephyraft.dp._3behavior._6iterator;

public interface Iterator<E> {
    boolean hasNext();

    // 或 E next(); currentItem去掉
    void next();
    E currentItem();
}
