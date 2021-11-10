package com.zephyraft.dp._1creation._2factory._framework;

public class RateLimiter {

    private final RedisCounter redisCounter;

    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }

    public void test() {
        System.out.println("Hello World!");
    }

}
