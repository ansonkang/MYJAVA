package Test.Command;

public class CeilingFans {
	int intHight = 3;
	int intMendium = 2;
	int intLow = 1;
	int intOff = 0;
	int speed;
	String strLocation;

	public CeilingFans(String strLocation) {
		this.strLocation = strLocation;
		speed = intOff;
	}

	public void hight() {
		speed = intHight;
		System.out.println(strLocation + " Fans is hight");
	}

	public void mendium() {
		speed = intMendium;
		System.out.println(strLocation + " Fans is mendium");
	}

	public void low() {
		speed = intLow;
		System.out.println(strLocation + " Fans is low");
	}

	public void off() {
		speed = 0;
		System.out.println(strLocation + " Fans is off");
	}

	public int getSpeed() {
		return speed;
	}

	public void undo() {
		if (speed > 0)
			speed = speed - 1;
		System.out.println(strLocation + " Fans speed is " + speed);
	}
}
