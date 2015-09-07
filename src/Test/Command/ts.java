package Test.Command;

public class ts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl r = new RemoteControl();
		String s = r.toString();
		System.out.println(s);
		InterCommand c = new NoCommand();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		r.setCommand(5, lightOnCommand, lightOffCommand);
		s = r.toString();
		System.out.println(s);
		r.onBtn(5);
		r.offBtn(5);
	}
}
