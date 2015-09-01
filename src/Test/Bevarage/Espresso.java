package Test.Bevarage;

public class Espresso extends Bevarage {
	Bevarage b;

	public Espresso(Bevarage b) {
		this.b = b;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

	public Espresso() {
		description = "ESPRESSO";
	}
}
