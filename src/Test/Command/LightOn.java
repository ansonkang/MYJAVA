package Test.Command;

public class LightOn implements InterCommand {
	Light light;

	public LightOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
