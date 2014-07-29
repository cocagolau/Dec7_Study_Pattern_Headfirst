package me.dec7.pattern.factory.method.creator;

import me.dec7.pattern.factory.method.product.Pizza;


public abstract class PizzaStore {
	
	Pizza orderPizza(String type) {
		
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract public Pizza createPizza(String type);

}
