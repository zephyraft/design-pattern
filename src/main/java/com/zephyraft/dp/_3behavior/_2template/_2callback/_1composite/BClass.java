package com.zephyraft.dp._3behavior._2template._2callback._1composite;

public class BClass {
    public void process(ICallback callback) {
        //...
        callback.methodToCallback();
        //...
    }
}
