package Test.Command;

public class CeilingFansOn implements InterCommand {
	CeilingFans fans;

	public CeilingFansOn(CeilingFans fans) {
		this.fans = fans;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fans.hight();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fans.off();
	}

}
