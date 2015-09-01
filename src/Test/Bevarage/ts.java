package Test.Bevarage;

public class ts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bevarage b = new HouseBlend();
		b = new Mocha(b);
		System.out.println(b.getDescription() + ":" + b.cost());

		Bevarage b2 = new Espresso();
		b2 = new Mocha(b2);
		System.out.println(b2.getDescription() + ":" + b2.cost());
	}

}
