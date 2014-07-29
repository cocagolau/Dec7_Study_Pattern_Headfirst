package me.dec7.pattern.factory.method.concretecreator;

import me.dec7.pattern.factory.method.concreteproduct.nystyle.NYStyleCheesePizza;
import me.dec7.pattern.factory.method.concreteproduct.nystyle.NYStyleClamPizza;
import me.dec7.pattern.factory.method.concreteproduct.nystyle.NYStylePepperoniPizza;
import me.dec7.pattern.factory.method.concreteproduct.nystyle.NYStyleVeggiePizza;
import me.dec7.pattern.factory.method.creator.PizzaStore;
import me.dec7.pattern.factory.method.product.Pizza;


public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		}
		else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		
		return pizza;
	}
	

}
