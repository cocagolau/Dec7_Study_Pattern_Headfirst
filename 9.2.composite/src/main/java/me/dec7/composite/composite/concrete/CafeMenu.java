package me.dec7.composite.composite.concrete;

import java.util.Hashtable;
import java.util.Iterator;

import me.dec7.composite.composite.Menu;
import me.dec7.composite.leaf.MenuItem;

public class CafeMenu extends Menu {

	Hashtable menuItems = new Hashtable();

	public CafeMenu(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
		
	}
	
	public Iterator createIterator() {
		
		return menuItems.values().iterator();
	}
	
	
}
