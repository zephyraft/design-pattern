package com.zephyraft.dp._3behavior._4chain._2array;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (Handler handler : handlers) {
            boolean handled = handler.doHandle();
            if (handled) {
                break;
            }
        }
    }
}
