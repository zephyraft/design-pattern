package com.zephyraft.dp._3behavior._1observer._2async._2eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.zephyraft.dp._3behavior._1observer._help.NotificationService;
import com.zephyraft.dp._3behavior._1observer._help.PromotionService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        EventBus bus = new AsyncEventBus(executorService); // 异步非阻塞模式
//         EventBus bus = new EventBus(); // 同步阻塞模式
        bus.register(new RegNotificationObserver(new NotificationService()));
        bus.register(new RegPromotionObserver(new PromotionService()));

        UserService userService = new UserService(bus);
        userService.registerAndNotify("123", "456");

        safeShutdown(executorService);
    }

    private static void safeShutdown(ExecutorService executorService) {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }

}
