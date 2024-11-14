package HomeWork6.textEditor.editor;

import HomeWork6.textEditor.flyweight.FontSizeColor;
import java.io.Serializable;

public class Character implements Serializable {
    private final char character;
    private final FontSizeColor properties;

    public Character(char character, FontSizeColor properties) {
        this.character = character;
        this.properties = properties;
    }

    public char getCharacter() {
        return character;
    }

    public FontSizeColor getProperties() {
        return properties;
    }
}
