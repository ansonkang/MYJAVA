package Test.Command;

public class LightOffCommand implements InterCommand {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Ligth is OFF");
	}

}
