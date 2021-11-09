package com.zephyraft.dp._2structure._2bridge.notification;

import com.zephyraft.dp._2structure._2bridge.sender.MsgSender;

public class NormalNotification extends Notification {
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
