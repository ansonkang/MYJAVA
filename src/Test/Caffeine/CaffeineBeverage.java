package Test.Caffeine;

public abstract class CaffeineBeverage {
	final void prepateRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boilling water");
	}
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}

}
