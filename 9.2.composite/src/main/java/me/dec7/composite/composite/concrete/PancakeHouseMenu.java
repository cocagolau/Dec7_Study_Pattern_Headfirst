package me.dec7.composite.composite.concrete;

import java.util.ArrayList;
import java.util.Iterator;

import me.dec7.composite.composite.Menu;
import me.dec7.composite.leaf.MenuItem;

public class PancakeHouseMenu extends Menu {
	
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(String name, String description) {
		super(name, description);
	}


	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		this.menuItems.add(menuItem);
		
	}

	
	public Iterator createIterator() {
		
		return this.menuItems.iterator(); 
		
	}
	
	
}
