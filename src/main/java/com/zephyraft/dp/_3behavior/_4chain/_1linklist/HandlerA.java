package com.zephyraft.dp._3behavior._4chain._1linklist;

public class HandlerA extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;
        System.out.println("handlerA doHandle");
        //...
        return handled;
    }
}
