package Test.Beverage;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b = new Espresso();
		System.out.println(b.getDescription() + ",$" + b.cost());

		b = new Mocha(b);// 增加Mocha
		System.out.println(b.getDescription() + ",$" + b.cost());

		b = new Soy(b);// 增加Soy
		System.out.println(b.getDescription() + ",$" + b.cost());
	}

}
