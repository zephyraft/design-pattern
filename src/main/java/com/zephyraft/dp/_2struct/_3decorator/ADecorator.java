package com.zephyraft.dp._2struct._3decorator;

public class ADecorator implements IA {

    private final IA a;

    public ADecorator(IA a) {
        this.a = a;
    }

    @Override
    public void f() {
        // 功能增强代码
        a.f();
        // 功能增强代码
    }
}
