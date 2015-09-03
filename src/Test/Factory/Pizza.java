package Test.Factory;

import java.util.ArrayList;

public abstract class Pizza {
	String strName;
	String strDough;
	String strSauce;
	ArrayList arrToppings = new ArrayList();

	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Prepare" + strName);
		System.out.println("Tossing dough");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings:");
		for (int i = 0; i < arrToppings.size(); i++) {
			System.out.println("  " + arrToppings.get(i));
		}
	}

	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Bake for 25min at 350");
	}

	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cuting the pizza into digonal slices");
	}

	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return strName;
	}
}
