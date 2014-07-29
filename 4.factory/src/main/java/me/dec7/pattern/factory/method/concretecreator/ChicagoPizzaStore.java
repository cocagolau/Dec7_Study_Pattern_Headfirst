package me.dec7.pattern.factory.method.concretecreator;

import me.dec7.pattern.factory.method.concreteproduct.chicagostyle.ChicagoStyleCheesePizza;
import me.dec7.pattern.factory.method.concreteproduct.chicagostyle.ChicagoStyleClamPizza;
import me.dec7.pattern.factory.method.concreteproduct.chicagostyle.ChicagoStylePepperoniPizza;
import me.dec7.pattern.factory.method.concreteproduct.chicagostyle.ChicagoStyleVeggiePizza;
import me.dec7.pattern.factory.method.creator.PizzaStore;
import me.dec7.pattern.factory.method.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}
		else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		
		return pizza;
	}
	
}
