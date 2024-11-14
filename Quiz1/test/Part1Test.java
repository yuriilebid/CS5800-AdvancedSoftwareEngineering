package Quiz1.test;

import Quiz1.Book;
import Quiz1.BookShallowCopy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class Part1Test {
    @Test
    public void testConstructor() {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        Book book = new Book("Test Book", "Author", chapters);
        assertEquals("Test Book", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals(chapters, book.getChapters());
    }

    @Test
    public void testSetters() {
        Book book = new Book("Initial Title", "Initial Author", new ArrayList<>());
        book.setTitle("New Title");
        book.setAuthor("New Author");

        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
    }

    @Test
    public void testToString() {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        Book book = new Book("Test Book", "Author", chapters);
        String expected = "Book{title='Test Book', author='Author', chapters=[Chapter 1]}";
        assertEquals(expected, book.toString());
    }

    @Test
    public void testCloneShallowCopy() throws CloneNotSupportedException {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        BookShallowCopy book = new BookShallowCopy("Test Book", "Author", chapters);
        BookShallowCopy clone = book.clone();

        assertNotNull(clone);
        assertEquals(book.getTitle(), clone.getTitle());
        assertEquals(book.getAuthor(), clone.getAuthor());
        assertEquals(book.getChapters(), clone.getChapters());
    }
}
