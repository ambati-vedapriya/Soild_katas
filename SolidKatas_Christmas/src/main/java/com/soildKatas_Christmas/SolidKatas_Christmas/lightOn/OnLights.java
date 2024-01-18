package com.soildKatas_Christmas.SolidKatas_Christmas.lightOn;

public class OnLights implements LightsOn{

    @Override
    public void turnOn(int x1, int y1, int x2, int y2,int lights[][]) {
        for(int i=x1; i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                lights[i][j]+=1;
            }
        }


    }
}
