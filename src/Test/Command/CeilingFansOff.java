package Test.Command;

public class CeilingFansOff implements InterCommand {
	CeilingFans fans;

	public CeilingFansOff(CeilingFans fans) {
		this.fans = fans;
	}

	@Override
	public void execute() {
		fans.off();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fans.hight();
	}

}
