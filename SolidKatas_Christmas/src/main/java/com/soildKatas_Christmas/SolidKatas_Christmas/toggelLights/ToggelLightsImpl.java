package com.soildKatas_Christmas.SolidKatas_Christmas.toggelLights;

public class ToggelLightsImpl implements ToggleLights{
    @Override
    public void toggleLights(int x1, int y1, int x2, int y2,int lights[][]) {
        for(int i=x1; i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                lights[i][j]+=2;
            }
        }

    }
}
