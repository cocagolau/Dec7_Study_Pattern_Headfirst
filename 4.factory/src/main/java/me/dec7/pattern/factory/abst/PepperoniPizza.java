package me.dec7.pattern.factory.abst;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory inFactory;
	
	public PepperoniPizza (PizzaIngredientFactory inFactory) {
		this.inFactory = inFactory;
	}

	@Override
	void prepare() {
		System.out.println("Prepareing " + name);
		
		dough = inFactory.createDough();
		sauce = inFactory.createSauce();
		cheese = inFactory.createCheese();
		pepperoni = inFactory.createPepperoni();
		
	}
}
