package com.tddmicroexercises.solidKatas;

public interface ConnectionInterface {
    void disconnect();

    void connect(String telemetryServerConnectionString);
}
