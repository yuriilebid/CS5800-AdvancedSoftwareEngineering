package Quiz1.test;

import Quiz1.BookShallowCopy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class Part2Test {

    @Test
    public void testShallowCopy() {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookShallowCopy original = new BookShallowCopy("Shallow Book", "Author A", chapters);
        BookShallowCopy clone = original.clone();
        original.getChapters().add("Chapter 3");

        assertEquals(original.getChapters(), clone.getChapters());
        assertTrue(clone.getChapters().contains("Chapter 3"));
    }
}
