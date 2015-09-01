/**
 * 
 */
package Test.Subject;
/**
 * 观察者类实现观察者接口和显示板接口
 * @author wwj
 *
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weathderData;
	
	
	public CurrentConditionDisplay(Subject weathderData) {
		this.weathderData = weathderData;
		weathderData.registerObserver(this);		//注册
	}

	
	public void display() {
		System.out.println("Current coditions: " + temperature + "F degress and " + humidity + "% humidity");
	}

	
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}

