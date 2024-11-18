package HomeWork7.chatApp.test.model;

import org.junit.jupiter.api.Test;
import HomeWork7.chatApp.model.MessageMemento;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageMementoTest {

    @Test
    void testMessageMementoCreation() {
        LocalDateTime now = LocalDateTime.now();
        MessageMemento memento = new MessageMemento("Test content", now);

        assertEquals("Test content", memento.getContent());
        assertEquals(now, memento.getTimestamp());
    }
}

