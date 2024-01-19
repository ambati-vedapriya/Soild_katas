package com.tddmicroexercises.solidKatas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TelemetryDiagnosisTest
{
    private TelemetryDiagnosis telemetryDiagnosticControl;
    private Connection telemetryClientMock;
    private Transfer transfer;


    @BeforeEach
    void setUp() {
        telemetryClientMock = mock(Connection.class);
        telemetryDiagnosticControl = new TelemetryDiagnosis();
    }

    @Test
    void getDiagnosticInfo_InitiallyNull() {
        assertNull(telemetryDiagnosticControl.getDiagnosticInfo());
    }

    @Test
    void setDiagnosticInfo() {
        telemetryDiagnosticControl.setDiagnosticInfo("Test Diagnostic Info");
        assertEquals("Test Diagnostic Info", telemetryDiagnosticControl.getDiagnosticInfo());
    }

    @Test
    void checkTransmission_SuccessfulTransmission() throws Exception {
        when(telemetryClientMock.getOnlineStatus()).thenReturn(true);
        when(transfer.receive()).thenReturn("Test Diagnostic Data");
        telemetryDiagnosticControl.checkTransmission();
        assertEquals("Test Diagnostic Data", telemetryDiagnosticControl.getDiagnosticInfo());
        verify(telemetryClientMock).disconnect();
        verify(transfer).send(Constants.DiagnosticChannelConnectionString);
        verify(transfer).receive();
    }

    @Test
    void checkTransmission_FailedConnection() {
        when(telemetryClientMock.getOnlineStatus()).thenReturn(false);
        assertThrows(Exception.class, () -> telemetryDiagnosticControl.checkTransmission());
        verify(telemetryClientMock).disconnect();
        verify(telemetryClientMock, times(3)).connect(Constants.DiagnosticChannelConnectionString);
        verify(transfer, never()).send(any());
        verify(transfer, never()).receive();
    }
}
