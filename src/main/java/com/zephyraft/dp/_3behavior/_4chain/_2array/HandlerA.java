package com.zephyraft.dp._3behavior._4chain._2array;

public class HandlerA implements Handler {
    @Override
    public boolean doHandle() {
        boolean handled = false;
        System.out.println("handlerA doHandle");
        //...
        return handled;
    }
}
