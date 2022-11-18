package be.intecbrussel;

import be.intecbrussel.Service.MessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class MessageServiceTest {

    private final MessageService messageService = new MessageService();
    @DisplayName("Testing MessageService.getAll()")
    @Test
    void testGetAll() {
        List<String> expected = new LinkedList<>();
        {
            for (int i = 0; i < 100; i++) {
                String formattedText = "Message: {" + "\n" +
                        "From: " + "sender" + i + "@mail.be" + "\n" +
                        "To: " + "receiver" + i + "@mail.be" + "\n" +
                        "Header: " + "header " + i + "\n" +
                        "Body" + "body " + i + "\n" + "}";
                expected.add(formattedText);
            }
        }
        var actual = messageService.getAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @DisplayName("Testing MessageService.getByFrom()")
    @Test
    void testGetByFrom(){

    }
    @DisplayName("Testing MessageService.send()")
    @Test
    void testSend(){
// VOEG JE CODE HIER TOE ...
    }


}
