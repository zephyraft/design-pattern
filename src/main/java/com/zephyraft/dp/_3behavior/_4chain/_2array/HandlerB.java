package com.zephyraft.dp._3behavior._4chain._2array;

public class HandlerB implements Handler {
    @Override
    public boolean doHandle() {
        boolean handled = false;
        System.out.println("handlerB doHandle");
        //...
        return handled;
    }
}
