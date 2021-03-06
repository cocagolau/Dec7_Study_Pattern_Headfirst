package me.dec7.pattern.factory.abst;


public abstract class PizzaStore {
	
	Pizza orderPizza(String type) {
		
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);

}
