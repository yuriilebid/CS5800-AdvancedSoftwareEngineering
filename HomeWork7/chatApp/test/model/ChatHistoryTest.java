package HomeWork7.chatApp.test.model;

import HomeWork7.chatApp.user.User;
import HomeWork7.chatApp.model.ChatHistory;
import HomeWork7.chatApp.model.Message;

import org.junit.jupiter.api.Test;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatHistoryTest {

    @Test
    void testAddMessage() {
        ChatHistory chatHistory = new ChatHistory();
        Message message = new Message("Alice", List.of("Bob"), "Hello Bob!");
        chatHistory.addMessage(message);

        assertEquals(message, chatHistory.getLastMessage());
    }

    @Test
    void testGetLastMessage() {
        ChatHistory chatHistory = new ChatHistory();
        assertNull(chatHistory.getLastMessage());

        Message message = new Message("Alice", List.of("Bob"), "Hello Bob!");
        chatHistory.addMessage(message);
        assertEquals("Hello Bob!", chatHistory.getLastMessage().getContent());
    }

    @Test
    void testIterator() {
        ChatHistory chatHistory = new ChatHistory();
        User bob = new User("Bob");

        Message message1 = new Message("Alice", List.of("Bob"), "Hi Bob!");
        Message message2 = new Message("Alice", List.of("Charlie"), "Hi Charlie!");

        chatHistory.addMessage(message1);
        chatHistory.addMessage(message2);

        Iterator<Message> iterator = chatHistory.iterator(bob);
        assertTrue(iterator.hasNext());
        assertEquals("Hi Bob!", iterator.next().getContent());
        assertFalse(iterator.hasNext());
    }
}
