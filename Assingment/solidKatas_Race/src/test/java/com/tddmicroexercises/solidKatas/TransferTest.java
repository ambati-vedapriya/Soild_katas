package com.tddmicroexercises.solidKatas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TransferTest {

    @Test
    void sendValidMessage() {
        Transfer telemetryCommunication = new Transfer();
        telemetryCommunication.send("Test Message");
    }

    @Test
    void sendNullMessage() {
        Transfer telemetryCommunication = new Transfer();
        assertThrows(IllegalArgumentException.class, () -> telemetryCommunication.send(null));
    }

    @Test
    void sendDiagnosticMessage() {
        Transfer telemetryCommunication = new Transfer();
        telemetryCommunication.send(Constants.DIAGNOSTIC_MESSAGE);
        assertEquals(Constants.STATEMENT, telemetryCommunication.receive());
    }

    @Test
    void receiveNonEmptyMessage() {
        Transfer telemetryCommunication = new Transfer();
        String receivedMessage = telemetryCommunication.receive();
        assertTrue(receivedMessage.length() > 0);
    }

    @Test
    void receiveDiagnosticMessage() {
        Transfer telemetryCommunication = new Transfer();
        telemetryCommunication.send(Constants.DIAGNOSTIC_MESSAGE);
        String receivedMessage = telemetryCommunication.receive();
        assertEquals(Constants.STATEMENT, receivedMessage);
    }

}
