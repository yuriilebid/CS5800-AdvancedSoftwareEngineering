package Quiz1.test;

import Quiz1.BookDeepCopy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class Part3Test {
    @Test
    public void testDeepCopy() {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookDeepCopy original = new BookDeepCopy("Deep Book", "Author B", chapters);
        BookDeepCopy clone = original.clone();
        original.getChapters().add("Chapter 3");

        assertNotEquals(original.getChapters(), clone.getChapters());
        assertFalse(clone.getChapters().contains("Chapter 3"));
    }
}

