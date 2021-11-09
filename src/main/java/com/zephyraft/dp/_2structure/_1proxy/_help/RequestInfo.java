package com.zephyraft.dp._2structure._1proxy._help;

public class RequestInfo {

    private final String name;
    private final long castTime;
    private final long startTime;

    public RequestInfo(String name, long castTime, long startTime) {
        this.name = name;
        this.castTime = castTime;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "RequestInfo{" +
                "name='" + name + '\'' +
                ", castTime=" + castTime +
                ", startTime=" + startTime +
                '}';
    }
}
