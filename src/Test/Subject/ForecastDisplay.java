/**
 * 
 */
package Test.Subject;

/**
 * 天气预报布告板
 * @author wwj
 *
 */
public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;	//当前气压
	private float lastPressure;				//以往气压
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	public void display() {
		System.out.println("Forcast:");
		if(currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if(currentPressure == lastPressure) {
			System.out.println("more of the same");
		} else if(currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	
	public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

}

