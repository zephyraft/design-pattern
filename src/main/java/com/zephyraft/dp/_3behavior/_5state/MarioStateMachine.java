package com.zephyraft.dp._3behavior._5state;

public class MarioStateMachine {
    private IMario currentState;
    private int score;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SmallMario.getInstance();
    }

    public void obtainMushroom() {
        this.currentState.obtainMushroom(this);
    }

    public void obtainCape() {
        this.currentState.obtainCape(this);
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower(this);
    }

    public void meetMonster() {
        this.currentState.meetMonster(this);
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }

    public IMario getCurrentState() {
        return currentState;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
