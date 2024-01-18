package com.soildKatas_Christmas.SolidKatas_Christmas.Count;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class LightCountImplTest {


    @Test
    public void testCountLightsWithEmptyGrid() {
        int[][] lights = new int[3][3];


        LightsCount lightsCountMock = mock(LightsCount.class);

        when(lightsCountMock.countLights(lights)).thenReturn(0);

        int result = lightsCountMock.countLights(lights);

        assertEquals(0, result);

        verify(lightsCountMock).countLights(lights);
    }

    @Test
    public void testCountLightsWithSomeLightsOn() {
        int[][] lights = {
                {1, 0, 1},
                {0, 1, 1},
                {1, 0, 0}
        };

        LightsCount lightsCountMock = mock(LightsCount.class);

        when(lightsCountMock.countLights(lights)).thenReturn(5);

        int result = lightsCountMock.countLights(lights);

        assertEquals(5, result);

        verify(lightsCountMock).countLights(lights);
    }

    @Test
    public void testCountLightsWithAllLightsOn() {
        int[][] lights = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        LightsCount lightsCountMock = mock(LightsCount.class);

        when(lightsCountMock.countLights(lights)).thenReturn(9);

        int result = lightsCountMock.countLights(lights);

        assertEquals(9, result);

        verify(lightsCountMock).countLights(lights);
    }
}
