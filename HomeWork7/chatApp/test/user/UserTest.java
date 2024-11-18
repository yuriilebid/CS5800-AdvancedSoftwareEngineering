package HomeWork7.chatApp.test.user;

import HomeWork7.chatApp.mediator.ChatServer;
import HomeWork7.chatApp.model.Message;
import HomeWork7.chatApp.user.User;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testSendMessage() {
        ChatServer server = new ChatServer();
        User alice = new User("Alice");
        User bob = new User("Bob");

        server.registerUser(alice);
        server.registerUser(bob);
        alice.sendMessage("Hi Bob!", List.of("Bob"));
        Message lastMessage = bob.getChatHistory().getLastMessage();
        assertEquals("Hi Bob!", lastMessage.getContent());
    }

    @Test
    void testReceiveMessage() {
        User bob = new User("Bob");
        Message message = new Message("Alice", List.of("Bob"), "Hi Bob!");

        bob.receiveMessage(message);
        assertEquals("Hi Bob!", bob.getChatHistory().getLastMessage().getContent());
    }

    @Test
    void testUndoLastMessage() {
        User alice = new User("Alice");

        alice.sendMessage("Test message", List.of("Bob"));
        alice.undoLastMessage();
        assertNull(alice.getChatHistory().getLastMessage());
    }
}
