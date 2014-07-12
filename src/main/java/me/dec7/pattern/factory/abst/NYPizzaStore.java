package me.dec7.pattern.factory.abst;


public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory inFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(inFactory);
			pizza.setName("NY Style Cheese Pizza");
		}
		else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(inFactory);
			pizza.setName("NY Style Pepperoni Pizza");
		}
		else if (type.equals("clam")) {
			pizza = new ClamPizza(inFactory);
			pizza.setName("NY Style Clam Pizza");
		}
		else if (type.equals("veggie")) {
			pizza = new VeggiePizza(inFactory);
			pizza.setName("NY Style Veggie Pizza");
		}
		
		return pizza;
	}
	

}
