package Test.Factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String strType) {
		// TODO Auto-generated method stub
		if (strType.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else {
			return null;
		}
	}
}
