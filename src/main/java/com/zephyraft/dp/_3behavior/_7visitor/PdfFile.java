package com.zephyraft.dp._3behavior._7visitor;

public class PdfFile extends ResourceFile {
    public PdfFile(String filepath) {
        super(filepath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
