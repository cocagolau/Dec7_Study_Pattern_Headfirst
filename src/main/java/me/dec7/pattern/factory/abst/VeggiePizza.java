package me.dec7.pattern.factory.abst;


public class VeggiePizza extends Pizza {
	PizzaIngredientFactory inFactory;
	
	public VeggiePizza (PizzaIngredientFactory inFactory) {
		this.inFactory = inFactory;
	}

	@Override
	void prepare() {
		System.out.println("Prepareing " + name);
		
		dough = inFactory.createDough();
		sauce = inFactory.createSauce();
		cheese = inFactory.createCheese();
		veggies = inFactory.createVeggies();
		
	}
}
