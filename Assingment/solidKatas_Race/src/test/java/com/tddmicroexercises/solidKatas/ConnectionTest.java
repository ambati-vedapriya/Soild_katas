package com.tddmicroexercises.solidKatas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class
ConnectionTest {
    @Test
    void getOnlineStatus_InitiallyOffline() {

        Connection telemetryClientConnection = new Connection();
        boolean onlineStatus = telemetryClientConnection.getOnlineStatus();
        assertFalse(onlineStatus);
    }

    @Test
    void connect_SuccessfulConnection() {

        Connection telemetryClientConnection = new Connection();
        telemetryClientConnection.connect("validConnectionString");
        assertTrue(telemetryClientConnection.getOnlineStatus());
    }

    @Test
    void connect_NullConnectionString_ThrowsIllegalArgumentException() {
        Connection telemetryClientConnection = new Connection();
        assertThrows(IllegalArgumentException.class, () -> telemetryClientConnection.connect(null));
    }

    @Test
    void connect_EmptyConnectionString_ThrowsIllegalArgumentException() {
        Connection telemetryClientConnection = new Connection();
        assertThrows(IllegalArgumentException.class, () -> telemetryClientConnection.connect(""));
    }

    @Test
    void disconnect_SetOffline() {
        Connection telemetryClientConnection = new Connection();
        telemetryClientConnection.connect("validConnectionString");
        telemetryClientConnection.disconnect();
        assertFalse(telemetryClientConnection.getOnlineStatus());
    }

}
