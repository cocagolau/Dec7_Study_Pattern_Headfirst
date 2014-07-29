package me.dec7.composite;

import java.util.Iterator;

public class Waitress {
	
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator cafeIterator = cafeMenu.createIterator();
		
		System.out.println("아침 메뉴");
		printMenu(pancakeIterator);
		
		System.out.println("점심 메뉴");
		printMenu(dinerIterator);
		
		System.out.println("저녁 메뉴");
		printMenu(cafeIterator);
	}

	private void printMenu(Iterator iterator) {
		
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			
			System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
		}
		
	}
	
	
}
