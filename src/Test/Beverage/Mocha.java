package Test.Beverage;

public class Mocha extends Beverage {
	Beverage b;

	public Mocha(Beverage b) {
		this.b = b;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return b.getDescription() + ",Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + b.cost();
	}

}
