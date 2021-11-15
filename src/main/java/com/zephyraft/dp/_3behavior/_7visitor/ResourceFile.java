package com.zephyraft.dp._3behavior._7visitor;

public abstract class ResourceFile {

    protected String filepath;

    public ResourceFile(String filepath) {
        this.filepath = filepath;
    }

    abstract public void accept(Visitor visitor);
}
