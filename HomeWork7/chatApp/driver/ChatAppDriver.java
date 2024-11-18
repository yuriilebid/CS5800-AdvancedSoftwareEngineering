package HomeWork7.chatApp.driver;

import HomeWork7.chatApp.mediator.ChatServer;
import HomeWork7.chatApp.user.User;

import java.util.Arrays;

public class ChatAppDriver {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        User ivan = new User("Ivan");
        User olga = new User("Olga");
        User sergey = new User("Sergey");
        User anna = new User("Anna");

        server.registerUser(ivan);
        server.registerUser(olga);
        server.registerUser(sergey);
        server.registerUser(anna);

        ivan.sendMessage("Hello, everybody!", Arrays.asList("Olga", "Sergey", "Anna"));
        olga.sendMessage("Hello, Ivan!", Arrays.asList("Ivan"));
        sergey.blockUser("Ivan");
        ivan.sendMessage("How are you doing, Sergey?", Arrays.asList("Sergey"));
        anna.sendMessage("I'm good!", Arrays.asList("Ivan", "Olga"));
        ivan.undoLastMessage();

        ivan.getChatHistory().iterator(olga).forEachRemaining(m -> System.out.println("Ivan<->Olga: " + m.getContent()));
        olga.getChatHistory().iterator(ivan).forEachRemaining(m -> System.out.println("Olga<->Ivan: " + m.getContent()));
    }
}
