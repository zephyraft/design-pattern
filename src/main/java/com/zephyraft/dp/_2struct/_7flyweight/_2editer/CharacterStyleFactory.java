package com.zephyraft.dp._2struct._7flyweight._2editer;

import java.util.ArrayList;
import java.util.List;

public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}
