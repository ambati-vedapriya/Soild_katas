package com.tddmicroexercises.solidKatas;
import static com.tddmicroexercises.solidKatas.Constants.connectionEventsSimulator;

public class Connection  implements ConnectionInterface{
    private boolean onlineStatus;


    public boolean getOnlineStatus()
    {
        return onlineStatus;
    }


    @Override
    public void disconnect() {
        onlineStatus = false;
    }

    @Override
    public void connect(String telemetryServerConnectionString) {
        if (telemetryServerConnectionString == null || "".equals(telemetryServerConnectionString))
        {
            throw new IllegalArgumentException();
        }

        boolean success = connectionEventsSimulator.nextInt(10) <= 8;

        onlineStatus = success;

    }
}
