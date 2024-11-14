package HomeWork6.textEditor.test;

import HomeWork6.textEditor.editor.Character;
import HomeWork6.textEditor.flyweight.FontSizeColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void testCharacterProperties() {
        FontSizeColor properties = new FontSizeColor("Arial", 12, "Red");
        Character character = new Character('A', properties);

        assertEquals('A', character.getCharacter());
        assertEquals("Arial", character.getProperties().getFont());
        assertEquals(12, character.getProperties().getSize());
        assertEquals("Red", character.getProperties().getColor());
    }
}

