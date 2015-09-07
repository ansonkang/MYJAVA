package Test.Command;

public class RemoteControl {
	InterCommand[] onCommands;
	InterCommand[] offCommands;

	public RemoteControl() {
		onCommands = new InterCommand[7];
		offCommands = new InterCommand[7];
		InterCommand c = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = c;
			offCommands[i] = c;
		}
	}

	public void setCommand(int i, InterCommand onCommand,
			InterCommand offCommand) {
		onCommands[i] = onCommand;
		offCommands[i] = offCommand;
	}

	public void onBtn(int i) {
		onCommands[i].execute();
	}

	public void offBtn(int i) {
		offCommands[i].execute();
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("\n RemoteControl \n");
		for (int i = 0; i < onCommands.length; i++) {
			s.append("[" + i + "] onCommands: "
					+ onCommands[i].getClass().getName() + "  "
					+ "offCommands: " + offCommands[i].getClass().getName()
					+ "\n");
		}
		return s.toString();
	}
}
