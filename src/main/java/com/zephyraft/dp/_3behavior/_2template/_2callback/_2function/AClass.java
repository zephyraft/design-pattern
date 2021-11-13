package com.zephyraft.dp._3behavior._2template._2callback._2function;

public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        //回调对象
        b.process((v) -> System.out.println("Call back me."));
    }
}
