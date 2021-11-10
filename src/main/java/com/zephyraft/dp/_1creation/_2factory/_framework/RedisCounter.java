package com.zephyraft.dp._1creation._2factory._framework;

public class RedisCounter {
    private final String ipAddress;
    private final int port;

    public RedisCounter(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }
}
