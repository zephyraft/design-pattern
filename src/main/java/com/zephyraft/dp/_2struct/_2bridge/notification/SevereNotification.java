package com.zephyraft.dp._2struct._2bridge.notification;

import com.zephyraft.dp._2struct._2bridge.sender.MsgSender;

public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
