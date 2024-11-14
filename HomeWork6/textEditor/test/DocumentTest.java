package HomeWork6.textEditor.test;

import HomeWork6.textEditor.editor.Character;
import HomeWork6.textEditor.editor.Document;
import HomeWork6.textEditor.flyweight.FontSizeColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    @Test
    void testAddCharacter() {
        Document document = new Document();
        Character character = new Character('A', new FontSizeColor("Arial", 12, "Red"));

        document.addCharacter(character);
        assertEquals(1, document.getCharacters().size());
        assertEquals('A', document.getCharacters().get(0).getCharacter());
    }
}

