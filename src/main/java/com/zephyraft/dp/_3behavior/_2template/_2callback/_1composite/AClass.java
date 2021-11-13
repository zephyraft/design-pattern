package com.zephyraft.dp._3behavior._2template._2callback._1composite;

public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        //回调对象
        b.process(() -> System.out.println("Call back me."));
    }
}
