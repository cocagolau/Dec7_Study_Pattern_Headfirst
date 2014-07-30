package me.dec7.composite.composite.concrete;

import java.util.Iterator;

import me.dec7.composite.composite.Menu;
import me.dec7.composite.composite.concrete.iterator.DinerMenuIterator;
import me.dec7.composite.leaf.MenuItem;

public class DinerMenu extends Menu {
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu(String name, String description) {
		super(name, description);
	}
	

	private void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		
		if(numberOfItems > DinerMenu.MAX_ITEMS) {
			System.err.println("쏘리, 메뉴 꽉참");
			
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
			
		}
		
	}
	

	public Iterator createIterator() {
		
		return new DinerMenuIterator(menuItems);
	}
	
	
	
	
	
}
