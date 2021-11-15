package com.zephyraft.dp._3behavior._5state;

//所有状态类的接口
public interface IMario {
    State getName();
    // 事件
    void obtainMushroom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}
