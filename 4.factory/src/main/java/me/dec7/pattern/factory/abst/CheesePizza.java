package me.dec7.pattern.factory.abst;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory inFactory;
	
	public CheesePizza (PizzaIngredientFactory inFactory) {
		this.inFactory = inFactory;
	}

	@Override
	void prepare() {
		System.out.println("Prepareing " + name);
		
		dough = inFactory.createDough();
		sauce = inFactory.createSauce();
		cheese = inFactory.createCheese();
		
	}
}
