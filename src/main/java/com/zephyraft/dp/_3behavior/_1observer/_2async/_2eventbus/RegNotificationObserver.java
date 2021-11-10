package com.zephyraft.dp._3behavior._1observer._2async._2eventbus;

import com.google.common.eventbus.Subscribe;
import com.zephyraft.dp._3behavior._1observer._help.NotificationService;
import com.zephyraft.dp._3behavior._1observer._help.RegObserver;

public class RegNotificationObserver {
    private final NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Subscribe
    public void onRegSuccess(Long uid) {
        // 发送站内信
        notificationService.sendInboxMessage(uid, "Welcome Register...");
    }
}
