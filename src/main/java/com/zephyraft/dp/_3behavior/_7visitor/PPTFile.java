package com.zephyraft.dp._3behavior._7visitor;

public class PPTFile extends ResourceFile {
    public PPTFile(String filepath) {
        super(filepath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
