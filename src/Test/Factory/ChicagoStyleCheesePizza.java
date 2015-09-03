package Test.Factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		strName = "Chicago Style Deep Dish Cheese Pizza";
		strDough = "Extra Thick Crust Dough";
		strSauce = "Plum tomato Sauce";

		arrToppings.add("Shredded Mozzarella cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
