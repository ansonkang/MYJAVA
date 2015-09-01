package Test.Caffeine;

public abstract class CaffeineBeverageWithHook {
	final void prepateRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}

	}
	


	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boilling water");
	}
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}
}
