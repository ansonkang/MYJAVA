package Test.Command;

public class Light {
	String strDesc;

	public Light(String strDesc) {
		this.strDesc = strDesc;
	}

	public void on() {
		System.out.println(strDesc + " Light is on!");
	}

	public void off() {
		System.out.println(strDesc + " Light is off!");
	}
}
