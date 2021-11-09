package com.zephyraft.dp._2structure._7flyweight._1game;

/**
 * 享元对象
 */
public class ChessPieceUnit {
    private final int id;
    private final String text;
    private final Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Color getColor() {
        return color;
    }

    public static enum Color {RED, BLACK}
}
