package com.zephyraft.dp._2struct._4adapter._1class;

import com.zephyraft.dp._2struct._4adapter._help.Adaptee;
import com.zephyraft.dp._2struct._4adapter._help.ITarget;

public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        // 重新实现f2
    }

    @Override
    public void f3() {
        // ...
    }
}
