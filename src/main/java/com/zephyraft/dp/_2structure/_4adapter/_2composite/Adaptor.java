package com.zephyraft.dp._2structure._4adapter._2composite;

import com.zephyraft.dp._2structure._4adapter._help.Adaptee;
import com.zephyraft.dp._2structure._4adapter._help.ITarget;

public class Adaptor implements ITarget {
    private final Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa(); //委托给Adaptee
    }

    @Override
    public void f2() {
        //...重新实现f2()...
    }

    @Override
    public void f3() {
        // ...
    }
}
