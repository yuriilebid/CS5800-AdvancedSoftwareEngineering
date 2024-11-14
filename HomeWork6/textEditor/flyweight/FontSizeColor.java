package HomeWork6.textEditor.flyweight;

import java.io.Serializable;

public class FontSizeColor implements Serializable {
    private final String font;
    private final int size;
    private final String color;

    public FontSizeColor(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FontSizeColor that = (FontSizeColor) obj;
        return size == that.size && font.equals(that.font) && color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return font.hashCode() * 31 + size * 31 + color.hashCode();
    }
}
