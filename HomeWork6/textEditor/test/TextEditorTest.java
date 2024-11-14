package HomeWork6.textEditor.test;

import HomeWork6.textEditor.editor.TextEditor;
import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class TextEditorTest {
    @Test
    void testAddCharacter() {
        TextEditor editor = new TextEditor();

        editor.addCharacter('H', "Arial", 12, "Red");
        assertEquals(1, editor.getDocument().getCharacters().size());
    }

    @Test
    void testSaveAndLoadDocument() {
        TextEditor editor = new TextEditor();

        editor.addCharacter('H', "Arial", 12, "Red");
        try {
            String filename = "testDocument.txt";
            editor.saveDocument(filename);

            TextEditor loadedEditor = new TextEditor();
            loadedEditor.loadDocument(filename);

            assertEquals(1, loadedEditor.getDocument().getCharacters().size());
            new File(filename).delete();
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
}
