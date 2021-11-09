package com.zephyraft.dp._2structure._2bridge.sender;

import java.util.List;

public class TelephoneMsgSender implements MsgSender {

    private final List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {

    }
}
