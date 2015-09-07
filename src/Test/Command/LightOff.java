package Test.Command;

public class LightOff implements InterCommand {
	Light light;

	public LightOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
