package Test.Factory;

public abstract class PizzaStore {
	public Pizza orderPizza(String strType) {
		Pizza pizza;
		pizza = createPizza(strType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;

	}

	abstract Pizza createPizza(String strType);
}
