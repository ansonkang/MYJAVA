package Test.Command;

public class RemoteControl {
	InterCommand[] onCommands;
	InterCommand[] offCommands;
	InterCommand noCommand = new NoCommand();
	InterCommand unDo;

	public RemoteControl() {
		onCommands = new InterCommand[7];
		offCommands = new InterCommand[7];
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void set(int i, InterCommand onCommand, InterCommand offCommand) {
		onCommands[i] = onCommand;
		offCommands[i] = offCommand;
	}

	public void on(int i) {
		onCommands[i].execute();
		unDo = onCommands[i];
	}

	public void off(int i) {
		offCommands[i].execute();
		unDo = offCommands[i];
	}

	public void getString() {
		for (int i = 0; i < 7; i++) {
			System.out.println("[" + i + "]: "
					+ onCommands[i].getClass().getName() + " "
					+ offCommands[i].getClass().getName());
		}
	}

	public void doAll() {
		for (int i = 0; i < 7; i++) {
			onCommands[i].execute();
		}
	}

	public void CloseAll() {
		for (int i = 0; i < 7; i++) {
			offCommands[i].execute();
		}
	}

	public void undo() {
		// TODO Auto-generated method stub
		unDo.undo();

	}
}
