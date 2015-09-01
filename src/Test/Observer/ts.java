package Test.Observer;

public class ts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData w = new WeatherData();
		CurrentConditionDisplay c = new CurrentConditionDisplay(w);
		w.set(1, 2);

	}

}
