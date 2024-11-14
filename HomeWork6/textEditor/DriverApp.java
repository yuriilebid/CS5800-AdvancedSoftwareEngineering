package HomeWork6.textEditor;

import HomeWork6.textEditor.editor.TextEditor;
import java.io.IOException;

public class DriverApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addCharacter('H', "Arial", 12, "Red");
        editor.addCharacter('e', "Calibri", 14, "Blue");
        editor.addCharacter('l', "Verdana", 16, "Black");
        editor.addCharacter('o', "Arial", 12, "Red");
        editor.addCharacter('W', "Calibri", 14, "Blue");
        editor.addCharacter('o', "Verdana", 16, "Black");
        editor.addCharacter('r', "Arial", 12, "Red");
        editor.addCharacter('l', "Calibri", 14, "Blue");
        editor.addCharacter('d', "Verdana", 16, "Black");

        try {
            editor.saveDocument("HelloWorldCS5800.txt");
            System.out.println("Document saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
