package Test.Observer;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temp;
	private float pressure;

	public WeatherData() {

	}

	public void set(float temp, float pressure) {
		this.temp = temp;
		this.pressure = pressure;
		setChanged();
		notifyObservers();
	}

	public float getTemp() {
		return temp;
	}

	public float getPressure() {
		return pressure;
	}
}
