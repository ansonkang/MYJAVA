package Test.Beverage;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b = new Espresso();
		System.out.println(b.getDescription() + ",$" + b.cost());

		b = new Mocha(b);// ����Mocha
		System.out.println(b.getDescription() + ",$" + b.cost());

		b = new Soy(b);// ����Soy
		System.out.println(b.getDescription() + ",$" + b.cost());
	}

}
