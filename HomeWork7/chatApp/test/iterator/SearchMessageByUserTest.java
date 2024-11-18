package HomeWork7.chatApp.test.iterator;

import HomeWork7.chatApp.model.Message;
import HomeWork7.chatApp.user.User;
import HomeWork7.chatApp.iterator.SearchMessageByUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchMessagesByUserTest {

    @Test
    void testSearchMessages() {
        User alice = new User("Alice");
        User bob = new User("Bob");

        Message message1 = new Message("Alice", List.of("Bob"), "Hi Bob!");
        Message message2 = new Message("Alice", List.of("Charlie"), "Hi Charlie!");

        SearchMessageByUser searcher = new SearchMessageByUser(List.of(message1, message2), bob);

        assertTrue(searcher.hasNext());
        Assertions.assertEquals("Hi Bob!", searcher.next().getContent());
    }
}
