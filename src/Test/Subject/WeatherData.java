/**
 * 
 */
package Test.Subject;


import java.util.ArrayList;

	/**
	 * WeatherData实现了Subject接口
	 * @author wwj
	 *
	 */
	public class WeatherData implements Subject {
		private ArrayList observers;	//用于记录观察者
		private float temperature;		//温度
		private float humidity;			//湿度
		private float pressure;			//压力
		

		public WeatherData() {
			observers = new ArrayList();
		}

		public void registerObserver(Observer o) {
			observers.add(o);
		}

		public void removeObserver(Observer o) {
			int i = observers.indexOf(o);
			if(i >= 0) {
				observers.remove(i);
			}
		}

		public void notifyObserver() {
			for(int i = 0; i < observers.size(); i++) {
				Observer observer = (Observer)observers.get(i);
				observer.update(temperature, humidity, pressure);
			}
		}
		
		public void measurementsChanged() {
			notifyObserver();
		}
		
		public void setMeasurements(float temperature, float humidity, float pressure) {
			this.temperature = temperature;
			this.humidity = humidity;
			this.pressure = pressure;
			measurementsChanged();
		}

	}
