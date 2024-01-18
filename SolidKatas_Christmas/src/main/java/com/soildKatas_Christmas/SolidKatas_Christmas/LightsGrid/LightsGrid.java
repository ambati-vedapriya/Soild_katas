package com.soildKatas_Christmas.SolidKatas_Christmas.LightsGrid;

import com.soildKatas_Christmas.SolidKatas_Christmas.Count.LightsCount;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightOn.LightsOn;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightsOff.LightsOff;
import com.soildKatas_Christmas.SolidKatas_Christmas.toggelLights.ToggleLights;

public class LightsGrid implements Lights {
    int lights[][];

    private LightsCount lightsCount;
    private LightsOff lightsOff;
    private LightsOn lightsOn;
    private ToggleLights toggleLights;


//    public void initializeLightGrid(){
//        for (int i = 0; i < lights.length; i++) {
//            for (int j = 0; j < lights[i].length; j++) {
//                lights[i][j] = new Light();
//            }
//        }
//
//    }

    public LightsGrid(int size, LightsCount lightsCount, LightsOff lightsOff, LightsOn lightsOn, ToggleLights toggleLights) {

        lights = new int[size][size];
        this.lightsCount = lightsCount;
        this.lightsOff = lightsOff;
        this.lightsOn = lightsOn;
        this.toggleLights = toggleLights;

    }



    @Override
    public int countLights(int[][] lights) {
        return lightsCount.countLights(lights);
    }

    @Override
    public void turnOn(int x1, int y1, int x2, int y2, int[][] lights) {
        lightsOn.turnOn(x1,y1,x2,y2,lights);

    }

    @Override
    public void turnOff(int x1, int y1, int x2, int y2, int[][] lights) {
        lightsOff.turnOff(x1,y1,x2,y2,lights);

    }

    @Override
    public void toggleLights(int x1, int y1, int x2, int y2, int[][] lights) {
        toggleLights.toggleLights(x1,y1,x2,y2,lights);

    }


}