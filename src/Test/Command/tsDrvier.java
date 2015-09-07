package Test.Command;

public class tsDrvier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl control = new RemoteControl();
		CeilingFans fans = new CeilingFans("kicthroom");
		Light light = new Light("WC");
		Light light2 = new Light("WC2");
		CeilingFansOn fansOn = new CeilingFansOn(fans);
		CeilingFansOff fansOff = new CeilingFansOff(fans);
		LightOn lightOn = new LightOn(light);
		LightOff lightOff = new LightOff(light);
		LightOn lightOn2 = new LightOn(light2);
		LightOff lightOff2 = new LightOff(light2);
		control.set(1, fansOn, fansOff);
		control.set(2, lightOn, lightOff);
		control.set(3, lightOn2, lightOff2);
		control.getString();

		control.off(1);
		System.out.println("--------------------");
		control.undo();
	}
}
