package me.dec7.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void print() {
		System.out.println("  " + this.getName());
		
		if (this.isVegetarian()) {
			System.out.println("(v)");
		}
		
		System.out.println(", " + this.getPrice() + "  -- " + this.getDescription());
	}

	@Override
	public Iterator createIterator() {
		
		return new NullIterator();
		
	}
	
	
	
	
	
	
	
	

}
