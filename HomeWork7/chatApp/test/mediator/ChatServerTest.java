package HomeWork7.chatApp.test.mediator;

import HomeWork7.chatApp.user.User;
import HomeWork7.chatApp.mediator.ChatServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ChatServerTest {

    @Test
    void testSendMessage() {
        ChatServer server = new ChatServer();
        User alice = new User("Alice");
        User bob = new User("Bob");

        server.registerUser(alice);
        server.registerUser(bob);
        alice.sendMessage("Hi Bob!", List.of("Bob"));
        assertEquals("Hi Bob!", bob.getChatHistory().getLastMessage().getContent());
    }

    @Test
    void testBlockUser() {
        ChatServer server = new ChatServer();
        User alice = new User("Alice");
        User bob = new User("Bob");

        server.registerUser(alice);
        server.registerUser(bob);
        bob.blockUser("Alice");
        alice.sendMessage("Blocked?", List.of("Bob"));
        Assertions.assertNull(bob.getChatHistory().getLastMessage());
    }
}
