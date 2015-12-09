package com.weather.subject;

import java.util.ArrayList;
import java.util.Observable;

import com.weather.object.Observer;

/**
 * V1:
 * 
 * V2:
 * @author praveen
 *
 */
public class WeatherData /*implements Subject*/ extends Observable {
	
//	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
//		observers = new ArrayList<Observer>();
	}

//	@Override
//	public void registerObserver(Observer o) {
//		observers.add(o);
//	}

//	@Override
//	public void removeObserver(Observer o) {
//		//always check if present in list when removing from observer
//		int obsPos = observers.indexOf(o);
//		if(obsPos>0){
//			observers.remove(obsPos);
//		}
//	}

//	@Override
//	public void notifyObserver() {
//		for(Observer eachObserver:observers){
//			eachObserver.update(temperature,humidity,pressure);
//		}
//	}
	
	private void measurementsChanged() {
//		notifyObserver();
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		//abstracting notification from datacreation
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}



}
