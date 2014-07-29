package me.dec7.template_method.beverage;

public abstract class CaffeineBeverage {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();

	void pourInCup() {
		System.out.println("차를 우려내는 중");
		
	}

	void boilWater() {
		System.out.println("컵에 따르는 중");
		
	}
	

}