package HomeWork6.textEditor.editor;

import HomeWork6.textEditor.flyweight.FontSizeColor;
import HomeWork6.textEditor.flyweight.FontSizeColorFactory;
import java.io.*;

public class TextEditor {
    private Document document;

    public TextEditor() {
        this.document = new Document();
    }

    public void addCharacter(char character, String font, int size, String color) {
        FontSizeColor properties = FontSizeColorFactory.getFontSizeColor(font, size, color);
        document.addCharacter(new Character(character, properties));
    }

    public void saveDocument(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(document);
        }
    }

    public void loadDocument(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            document = (Document) in.readObject();
        }
    }

    public Document getDocument() {
        return document;
    }
}
