package me.dec7.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);		
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return this.menuComponents.get(i);
	}

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public String getDescription() {
		
		return this.description;
	}

	@Override
	public void print() {
		System.out.println("\n" + this.getName() + ",  " + this.getDescription());
		System.out.println("---------------------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent mentComponent = iterator.next();
			mentComponent.print();
		}
	}

	@Override
	public Iterator createIterator() {
		
		return new CompositeIterator(menuComponents.iterator());
		
	}
	
	
	
	
}
