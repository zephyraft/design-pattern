package com.zephyraft.dp._2structure._6composite._1filesystem;

public class File extends FileSystemNode {
    public File(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        java.io.File file = new java.io.File(path);
        return file.exists() ? 1 : 0;
    }

    @Override
    public long countSizeOfFiles() {
        java.io.File file = new java.io.File(path);
        return file.exists() ? file.length() : 0;
    }
}
