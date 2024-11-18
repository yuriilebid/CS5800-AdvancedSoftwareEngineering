package HomeWork7.chatApp.mediator;

import HomeWork7.chatApp.model.Message;
import HomeWork7.chatApp.user.User;

import java.util.*;

public class ChatServer {
    private final Map<String, User> registeredUsers;
    private final Map<String, Set<String>> blockedUsers;

    public ChatServer() {
        this.registeredUsers = new HashMap<>();
        this.blockedUsers = new HashMap<>();
    }

    public void registerUser(User user) {
        registeredUsers.put(user.getName(), user);
        user.setChatServer(this);
        blockedUsers.putIfAbsent(user.getName(), new HashSet<>());
    }

    public void unregisterUser(User user) {
        registeredUsers.remove(user.getName());
        blockedUsers.remove(user.getName());
    }

    public void sendMessage(String sender, String content, List<String> recipients) {
        for (String recipient : recipients) {
            User user = registeredUsers.get(recipient);
            if (user != null && !blockedUsers.getOrDefault(recipient, Collections.emptySet()).contains(sender)) {
                user.receiveMessage(new Message(sender, recipients, content));
            }
        }
    }

    public void blockUser(String blocker, String blockee) {
        blockedUsers.getOrDefault(blocker, new HashSet<>()).add(blockee);
        System.out.println(blocker + " blocked " + blockee);
    }
}
