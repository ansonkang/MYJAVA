package Test.Factory;

public class pizzaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoStore();

		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		Pizza pizza2 = chicagoStore.orderPizza("cheese");

		System.out.println(pizza.getName());
		System.out.println(pizza2.getName());

	}
}
