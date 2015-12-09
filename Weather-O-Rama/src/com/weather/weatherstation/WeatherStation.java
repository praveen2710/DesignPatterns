package com.weather.weatherstation;

import com.weather.display.CurrentConditionsDisplay;
import com.weather.subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData wc = new WeatherData();
		
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wc);
		
		
		wc.setMeasurements(80,65,39.4f);
		wc.setMeasurements(75,55,16.4f);
		wc.setMeasurements(84,76,43.4f);
	}
}
