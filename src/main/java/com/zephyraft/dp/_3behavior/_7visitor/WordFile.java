package com.zephyraft.dp._3behavior._7visitor;

public class WordFile extends ResourceFile {
    public WordFile(String filepath) {
        super(filepath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
