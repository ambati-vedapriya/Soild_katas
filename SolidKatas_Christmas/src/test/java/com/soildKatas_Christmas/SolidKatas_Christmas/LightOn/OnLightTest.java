package com.soildKatas_Christmas.SolidKatas_Christmas.LightOn;

import com.soildKatas_Christmas.SolidKatas_Christmas.lightOn.LightsOn;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightOn.OnLights;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnLightTest {

    @Test
    public void testTurnOnLights() {
        int[][] lights = new int[3][3];

        LightsOn onLights = new OnLights();

        onLights.turnOn(1, 1, 2, 2, lights);

        assertEquals(1, lights[1][1]);
        assertEquals(1, lights[1][2]);
        assertEquals(1, lights[2][1]);
        assertEquals(1, lights[2][2]);
    }

}
