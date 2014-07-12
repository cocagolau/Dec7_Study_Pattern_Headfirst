package me.dec7.pattern.factory.abst;

public class GreekPizza extends Pizza {
	PizzaIngredientFactory inFactory;
	
	public GreekPizza (PizzaIngredientFactory inFactory) {
		this.inFactory = inFactory;
	}

	@Override
	void prepare() {
		System.out.println("Prepareing " + name);
		
		dough = inFactory.createDough();
		sauce = inFactory.createSauce();
		cheese = inFactory.createCheese();
		clam = inFactory.createClam();
		
	}
}
