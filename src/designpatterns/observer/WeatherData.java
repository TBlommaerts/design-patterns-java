package designpatterns.observer;

import java.util.*;

public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO
	}
	
	public void registerObserver(Observer o) {
		// TODO
	}
	
	public void removeObserver(Observer o) {
		// TODO
	}
	
	public void notifyObservers() {
		// TODO
	}
	
	public void measurementsChanged() {		
		// TODO
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {		
		// TODO
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