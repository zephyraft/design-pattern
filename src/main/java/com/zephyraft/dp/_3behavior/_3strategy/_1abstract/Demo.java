package com.zephyraft.dp._3behavior._3strategy._1abstract;

public class Demo {

    private Strategy strategy;

    public Demo(Strategy strategy) {
        this.strategy = strategy;
    }

    public void bizWithStrategy() {
        // ...
        strategy.algorithmInterface();
        // ...
    }


    public static void main(String[] args) {
        // 运行时动态确定
        String type = "";

        Strategy strategy = StrategyFactory.getStrategy(type);
        final Demo demo = new Demo(strategy);
        demo.bizWithStrategy();
    }
}
