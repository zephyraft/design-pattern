package com.zephyraft.dp._2structure._2bridge.notification;

import com.zephyraft.dp._2structure._2bridge.sender.MsgSender;

public class UrgencyNotification extends Notification {
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
