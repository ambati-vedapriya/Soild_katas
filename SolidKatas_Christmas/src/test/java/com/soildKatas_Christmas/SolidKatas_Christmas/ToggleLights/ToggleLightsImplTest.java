package com.soildKatas_Christmas.SolidKatas_Christmas.ToggleLights;

import com.soildKatas_Christmas.SolidKatas_Christmas.toggelLights.ToggelLightsImpl;
import com.soildKatas_Christmas.SolidKatas_Christmas.toggelLights.ToggleLights;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ToggleLightsImplTest {

    @Test
    public void testToggleLights() {
        int[][] lights = {
                {1, 0, 1},
                {0, 1, 1},
                {1, 0, 0}
        };

        ToggleLights toggleLightsImpl = new ToggelLightsImpl();

        toggleLightsImpl.toggleLights(1, 1, 2, 2, lights);

        assertEquals(3, lights[1][1]);
        assertEquals(3, lights[1][2]);
        assertEquals(2, lights[2][1]);
        assertEquals(2, lights[2][2]);
    }

}