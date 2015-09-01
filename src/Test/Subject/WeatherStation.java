/**
 * 
 */
package Test.Subject;
/**
 * 测试类
 * @author wwj
 *
 */
public class WeatherStation {
	public static void main(String[] args) {
		//建立一个WeatherData对象
		WeatherData weatherData = new WeatherData();
		
		//第一个布告板
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(
				weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		// 模拟新的气象数据
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}

