package com.zephyraft.dp._2struct._2bridge.sender;

import java.util.List;

public class EmailMsgSender implements MsgSender {

    private final List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {

    }
}
