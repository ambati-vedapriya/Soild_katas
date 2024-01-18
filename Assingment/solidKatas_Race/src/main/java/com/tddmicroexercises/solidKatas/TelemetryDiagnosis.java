package com.tddmicroexercises.solidKatas;
import static  com.tddmicroexercises.solidKatas.Constants.*;

public class TelemetryDiagnosis implements TelemetryDiagnosisInterface{


    private ConnectionInterface connectionInterface;

    private TransferInterface transferInterface;

    private Connection connection;


    private String diagnosticInfo="";

    public String getDiagnosticInfo(){
        return diagnosticInfo;
    }

    public void setDiagnosticInfo(String diagnosticInfo){
        this.diagnosticInfo = diagnosticInfo;
    }



    @Override
    public void checkTransmission() throws Exception {


        connectionInterface.disconnect();

        int retryLeft = 3;
        while (connection.getOnlineStatus() == false && retryLeft > 0)
        {
            connectionInterface.connect(DiagnosticChannelConnectionString);
            retryLeft -= 1;
        }

        if(connection.getOnlineStatus() == false)
        {
            throw new Exception("Unable to connect.");
        }

        transferInterface.send(DIAGNOSTIC_MESSAGE);
        diagnosticInfo = transferInterface.receive();

    }
}
