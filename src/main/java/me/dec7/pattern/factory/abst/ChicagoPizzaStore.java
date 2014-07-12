package me.dec7.pattern.factory.abst;


public class ChicagoPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory inFactory = new ChicagoPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(inFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}
		else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(inFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}
		else if (type.equals("clam")) {
			pizza = new ClamPizza(inFactory);
			pizza.setName("Chicago Style Clam Pizza");
		}
		else if (type.equals("veggie")) {
			pizza = new VeggiePizza(inFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		}
		
		return pizza;
	}
	
}
