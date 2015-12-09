package com.weather.display;

import java.util.Observable;
import java.util.Observer;

import com.weather.subject.WeatherData;

public class ForecastDisplay implements Observer,DisplayElement {
	
	private Observable obs;
	private float temp;
	private float humidity;
	private float currpressure = 29.92f;
	private float lastPress;
	
	public ForecastDisplay(Observable ob) {
		this.obs = ob;
		obs.addObserver(this); 
	}
	
	@Override
	public void display() {
	
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData wc = (WeatherData) o;
			this.temp = wc.getTemperature();
			this.humidity = wc.getHumidity();
			this.currpressure = wc.getHumidity();
		}
		
	}

}
