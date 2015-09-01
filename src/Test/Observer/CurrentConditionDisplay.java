package Test.Observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
	Observable obs;
	private float temp;
	private float pressure;

	public CurrentConditionDisplay(Observable obs) {
		this.obs = obs;
		obs.addObserver(this);

	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData w = (WeatherData) o;
			this.temp = w.getTemp();
			this.pressure = w.getPressure();
			display();
		}
	}

	private void display() {
		System.out.println(temp + "|" + pressure);

	}

}
