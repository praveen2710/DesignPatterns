package com.weather.display;

import java.util.Observable;

import com.weather.object.Observer;
import com.weather.subject.Subject;
import com.weather.subject.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, /*Observer*/java.util.Observer {
	Observable observable;
//	private Subject weatherData;
	private float temp;
	private float humidity;
	
	//we register the object from the object so that we have loose coupling
	public CurrentConditionsDisplay(/*Subject weatherData*/Observable oc) {
		this.observable= oc;
		observable.addObserver(this);
		//		this.weatherData = weatherData;
//		weatherData.registerObserver(this);
	}

//	@Override
//	public void update(float temperature, float humidity, float pressure) {
//		this.temp = temperature;
//		this.humidity = humidity;
//		display();
//	}

	@Override
	public void display() {
		System.out.println("Curent Conditions:"+ temp + "F and "+humidity+"% humid");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData wc = (WeatherData) o;
			this.temp = wc.getTemperature();
			this.humidity = wc.getHumidity();
			display();
			
		}
	}
	
}
