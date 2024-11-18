package HomeWork7.chatApp.iterator;

import HomeWork7.chatApp.model.Message;
import HomeWork7.chatApp.user.User;

import java.util.Iterator;
import java.util.List;

public class SearchMessageByUser implements Iterator<Message> {
    private final List<Message> messages;
    private final User userToSearchWith;
    private int currentIndex;

    public SearchMessageByUser(List<Message> messages, User userToSearchWith) {
        this.messages = messages;
        this.userToSearchWith = userToSearchWith;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < messages.size()) {
            Message message = messages.get(currentIndex);
            if (message.getSender().equals(userToSearchWith.getName()) ||
                    message.getRecipients().contains(userToSearchWith.getName())) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Message next() {
        return messages.get(currentIndex++);
    }
}
