package com.zephyraft.dp._2struct._7flyweight._2editer;

import java.util.Objects;

public class CharacterStyle {
    private final Font font;
    private final int size;
    private final int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    public Font getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public int getColorRGB() {
        return colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterStyle that = (CharacterStyle) o;
        return size == that.size && colorRGB == that.colorRGB && Objects.equals(font, that.font);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, size, colorRGB);
    }
}
