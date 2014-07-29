package me.dec7.template_method.beverage;

public abstract class CaffeineBeverageWithHook {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	boolean customerWantsCondiments() {
		
		return true;
	}

	abstract void brew();
	
	abstract void addCondiments();

	final void pourInCup() {
		System.out.println("차를 우려내는 중");
		
	}

	final void boilWater() {
		System.out.println("컵에 따르는 중");
		
	}
	

}