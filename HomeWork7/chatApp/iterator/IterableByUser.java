package HomeWork7.chatApp.iterator;

import HomeWork7.chatApp.model.Message;
import HomeWork7.chatApp.user.User;

import java.util.Iterator;

public interface IterableByUser {
    Iterator<Message> iterator(User userToSearchWith);
}
