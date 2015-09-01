/**
 * 
 */
package Test.Subject;
/**
 * 天气统计布告板
 * @author wwj
 *
 */
public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;;	//最大温度
	private float minTemp = 200;	//最小温度
	private float tempSum = 0.0f;	//统计温度和
	private int numReadings;		//统计温度次数
	private WeatherData weatherData;
	
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}


	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;
		
		if(temp > maxTemp) {
			maxTemp = temp;
		}
		if(temp < minTemp) {
			minTemp = temp;
		}
		
		display();
	}

}

