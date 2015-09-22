package Test.Tamplate;

public abstract class AbstracTamplate {
	final void made() {
		boillWater();
		add();
		inCup();
		if (getHood()) {
			addOther();
		}

	}

	private void boillWater() {
		// TODO Auto-generated method stub
		System.out.println("boillwater!");
	}

	private void inCup() {
		// TODO Auto-generated method stub
		System.out.println("in Cup!");
	}

	abstract void addOther();

	abstract void add();

	boolean getHood() {
		return false;
	}

}
