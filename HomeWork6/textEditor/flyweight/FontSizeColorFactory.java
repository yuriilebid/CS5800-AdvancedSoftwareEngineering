package HomeWork6.textEditor.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontSizeColorFactory {
    private static final Map<FontSizeColor, FontSizeColor> flyweights = new HashMap<>();

    public static FontSizeColor getFontSizeColor(String font, int size, String color) {
        FontSizeColor key = new FontSizeColor(font, size, color);

        if (!flyweights.containsKey(key)) {
            flyweights.put(key, key);
        }
        return flyweights.get(key);
    }
}
