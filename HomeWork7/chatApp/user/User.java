package HomeWork7.chatApp.user;

import HomeWork7.chatApp.mediator.ChatServer;
import HomeWork7.chatApp.model.ChatHistory;
import HomeWork7.chatApp.model.Message;
import HomeWork7.chatApp.model.MessageMemento;

import java.util.List;
import java.util.Stack;

public class User {
    private final String name;
    private final ChatHistory chatHistory;
    private final Stack<MessageMemento> undoStack;
    private ChatServer chatServer;

    public User(String name) {
        this.name = name;
        this.chatHistory = new ChatHistory();
        this.undoStack = new Stack<>();
    }

    public void setChatServer(ChatServer chatServer) {
        this.chatServer = chatServer;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String content, List<String> recipients) {
        if (chatServer == null) {
            throw new IllegalStateException("User is not connected to a chat server");
        }
        Message message = new Message(name, recipients, content);
        chatServer.sendMessage(name, content, recipients);
        chatHistory.addMessage(message);
        undoStack.push(new MessageMemento(content, message.getTimestamp()));
    }

    public void receiveMessage(Message message) {
        chatHistory.addMessage(message);
        System.out.println(name + " received: " + message.getContent());
    }

    public void undoLastMessage() {
        if (!undoStack.isEmpty()) {
            MessageMemento memento = undoStack.pop();
            System.out.println(name + " undid message: " + memento.getContent());
        } else {
            System.out.println("No messages to undo.");
        }
    }

    public void blockUser(String username) {
        if (chatServer != null) {
            chatServer.blockUser(name, username);
        }
    }

    public ChatHistory getChatHistory() {
        return this.chatHistory;
    }
}
