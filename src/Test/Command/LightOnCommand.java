package Test.Command;

public class LightOnCommand implements InterCommand {
	Light ligth;

	public LightOnCommand(Light ligth) {
		this.ligth = ligth;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.ligth.on();
	}

}
