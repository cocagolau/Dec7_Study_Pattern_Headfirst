package me.dec7.template_method.beverage.template;

public abstract class CaffeineBeverage {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract public void brew();
	
	abstract public void addCondiments();

	void pourInCup() {
		System.out.println("차를 우려내는 중");
		
	}

	void boilWater() {
		System.out.println("컵에 따르는 중");
		
	}
	

}