package com.zephyraft.dp._2structure._2bridge.notification;

import com.zephyraft.dp._2structure._2bridge.sender.MsgSender;

public abstract class Notification {
    MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
