package com.zephyraft.dp._2struct._7flyweight._2editer;

public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public CharacterStyle getStyle() {
        return style;
    }

    public void setStyle(CharacterStyle style) {
        this.style = style;
    }
}
