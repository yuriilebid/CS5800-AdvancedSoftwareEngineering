package HomeWork7.chatApp.test.model;

import HomeWork7.chatApp.model.Message;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageTest {

    @Test
    void testMessageCreation() {
        Message message = new Message("Alice", Arrays.asList("Bob", "Charlie"), "Hello!");

        assertEquals("Alice", message.getSender());
        assertEquals(Arrays.asList("Bob", "Charlie"), message.getRecipients());
        assertEquals("Hello!", message.getContent());
        assertEquals(LocalDateTime.now().getDayOfYear(), message.getTimestamp().getDayOfYear());
    }
}

