package com.zephyraft.dp._3behavior._1observer._help;

import com.zephyraft.dp._3behavior._1observer._help.NotificationService;
import com.zephyraft.dp._3behavior._1observer._help.RegObserver;

public class RegNotificationObserver implements RegObserver {
    private final NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void onRegSuccess(long uid) {
        // 发送站内信
        notificationService.sendInboxMessage(uid, "Welcome Register...");
    }
}
