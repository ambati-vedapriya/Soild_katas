package com.soildKatas_Christmas.SolidKatas_Christmas.LightOff;

import com.soildKatas_Christmas.SolidKatas_Christmas.lightsOff.LightsOff;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightsOff.OffLights;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OffLightsTest {

    @Test
    public void testTurnOffLights() {
        int[][] lights = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        LightsOff offLights = new OffLights();

        offLights.turnOff(1, 1, 2, 2, lights);

        assertEquals(0, lights[1][1]);
        assertEquals(0, lights[1][2]);
        assertEquals(0, lights[2][1]);
        assertEquals(0, lights[2][2]);
    }
}
