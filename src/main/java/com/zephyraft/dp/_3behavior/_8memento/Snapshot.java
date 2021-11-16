package com.zephyraft.dp._3behavior._8memento;

public class Snapshot {
    private final String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
