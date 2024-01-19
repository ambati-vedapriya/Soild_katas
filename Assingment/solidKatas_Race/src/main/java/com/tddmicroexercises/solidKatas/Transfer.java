package com.tddmicroexercises.solidKatas;


import static com.tddmicroexercises.solidKatas.Constants.DIAGNOSTIC_MESSAGE;
import static com.tddmicroexercises.solidKatas.Constants.connectionEventsSimulator;
import static com.tddmicroexercises.solidKatas.Constants.*;
public class Transfer implements TransferInterface{

    private String diagnosticMessageResult = "";


    @Override
    public void send(String message) {
        if (message == null || "".equals(message))
        {
            throw new IllegalArgumentException();
        }

        if (message == DIAGNOSTIC_MESSAGE)
        {
            // simulate a status report
            diagnosticMessageResult =
                    STATEMENT;

            return;
        }
    }

    @Override
    public String receive() {
        String message;

        if (diagnosticMessageResult == null || "".equals(diagnosticMessageResult))
        {
            // simulate a received message (just for illustration - not needed for this exercise)
            message = "";
            int messageLength = connectionEventsSimulator.nextInt(50) + 60;
            for(int i = messageLength; i >=0; --i)
            {
                message += (char)connectionEventsSimulator.nextInt(40) + 86;
            }

        }
        else
        {
            message = diagnosticMessageResult;
            diagnosticMessageResult = "";
        }

        return message;
    }
}
