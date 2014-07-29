package me.dec7.iterator;

import java.util.Iterator;

public class Waitress {
	
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
		System.out.println("아침 메뉴");
		printMenu(pancakeIterator);
		
		System.out.println("점심 메뉴");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			
			System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
		}
		
	}
	
	
}
