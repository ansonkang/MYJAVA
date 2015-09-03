package Test.Factory;

public class ChicagoStore extends PizzaStore {

	@Override
	Pizza createPizza(String strType) {
		// TODO Auto-generated method stub
		if (strType.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else {
			return null;
		}

	}

}
