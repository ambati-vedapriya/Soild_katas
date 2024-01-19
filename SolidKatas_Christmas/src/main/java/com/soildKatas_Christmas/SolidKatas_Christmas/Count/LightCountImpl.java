package com.soildKatas_Christmas.SolidKatas_Christmas.Count;

public class LightCountImpl implements LightsCount{
    @Override
    public int countLights(int lights[][]) {
        int count=0;
        for (int i=0;i<lights.length;i++){
            for(int j=0;j<lights.length;j++){
                count+=lights[i][j];
            }
        }
        return count;

    }
}
