package com.soildKatas_Christmas.SolidKatas_Christmas;

import com.soildKatas_Christmas.SolidKatas_Christmas.Count.LightCountImpl;
import com.soildKatas_Christmas.SolidKatas_Christmas.Count.LightsCount;
import com.soildKatas_Christmas.SolidKatas_Christmas.LightsGrid.LightsGrid;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightOn.LightsOn;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightOn.OnLights;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightsOff.LightsOff;
import com.soildKatas_Christmas.SolidKatas_Christmas.lightsOff.OffLights;
import com.soildKatas_Christmas.SolidKatas_Christmas.toggelLights.ToggelLightsImpl;
import com.soildKatas_Christmas.SolidKatas_Christmas.toggelLights.ToggleLights;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidKatasChristmasApplication {

	public static void main(String[] args) {
		LightsCount lightsCount = new LightCountImpl();
		LightsOn lightsOn = new OnLights();
		LightsOff lightsOff = new OffLights();
		ToggleLights toggleLights = new ToggelLightsImpl();

		int size = 1000;
		LightsGrid lightsGrid = new LightsGrid(size, lightsCount, lightsOff, lightsOn, toggleLights);

		int[][] lights = new int[size][size];
		lightsGrid.turnOn(0, 0, 0, 0, lights);
		lightsGrid.turnOff(0, 0, 0, 0, lights);
		lightsGrid.toggleLights(0, 0, 0, 0, lights);

		int lightsCountResult = lightsGrid.countLights(lights);
		System.out.println("Total lights: " + lightsCountResult);


	}

}
