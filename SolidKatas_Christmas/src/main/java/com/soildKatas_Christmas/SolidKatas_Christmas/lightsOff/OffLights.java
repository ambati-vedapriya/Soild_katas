package com.soildKatas_Christmas.SolidKatas_Christmas.lightsOff;

public class OffLights implements  LightsOff{
    @Override
    public void turnOff(int x1, int y1, int x2, int y2,int[][] lights) {
        for(int i=x1; i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                lights[i][j]-=1;
            }
        }
        System.out.println("Turning off lights");

    }
}
