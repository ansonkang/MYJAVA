package Test.Bevarage;

public class Mocha extends CondimentDecarator {
	Bevarage b;

	public Mocha(Bevarage b) {
		this.b = b;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return b.getDescription() + "+MOCHA";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + b.cost();
	}

}
