package Test.Beverage;

public class Soy extends CondimentDecorator {
	Beverage b;

	public Soy(Beverage b) {
		this.b = b;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .30 + b.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return b.getDescription() + ",Soy";
	}

}
