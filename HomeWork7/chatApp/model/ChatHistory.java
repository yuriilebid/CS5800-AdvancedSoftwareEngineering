package HomeWork7.chatApp.model;

import HomeWork7.chatApp.iterator.IterableByUser;
import HomeWork7.chatApp.user.User;
import HomeWork7.chatApp.iterator.SearchMessageByUser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatHistory implements IterableByUser {
    private final List<Message> messages;

    public ChatHistory() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public Message getLastMessage() {
        if (messages.isEmpty()) {
            return null;
        }
        return messages.get(messages.size() - 1);
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new SearchMessageByUser(messages, userToSearchWith);
    }
}
