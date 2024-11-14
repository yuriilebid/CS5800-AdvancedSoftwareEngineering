package HomeWork6.textEditor.editor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Document implements Serializable {
    private final List<Character> characters;

    public Document() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }
}

