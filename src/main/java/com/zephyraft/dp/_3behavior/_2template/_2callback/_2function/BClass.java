package com.zephyraft.dp._3behavior._2template._2callback._2function;

import java.util.function.Consumer;

public class BClass {
    // Supplier       ()    -> x
    // Consumer       x     -> ()
    // Callable       ()    -> x throws ex
    // Runnable       ()    -> ()
    // Function       x     -> y
    // BiFunction     x,y   -> z
    // Predicate      x     -> boolean
    // UnaryOperator  x1    -> x2
    // BinaryOperator x1,x2 -> x3
    public void process(Consumer<Void> callback) {
        //...
        callback.accept(null);
        //...
    }
}
