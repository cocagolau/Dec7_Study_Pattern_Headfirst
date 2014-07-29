package me.dec7.composite;

import java.util.Iterator;

public class DinerMenu implements Menu {
	
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		this.menuItems = new MenuItem[DinerMenu.MAX_ITEMS];
		
		addItem("채식주의자용 BLT", "통밀, 베이컨, 상추 등등", true, 2.99);
		addItem("BLT", "통밀 베이컨 토마토", false, 2.99);
		addItem("오늘의 스프", "감자 샐러드 곁들인 오늘의 스프", false, 3.29);
		addItem("핫도그", "사웤라우크 양념, 양파", false, 3.05);
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
	
//	public MenuItem[] getMunuItems() {
//		
//		return this.menuItems;
//	}
	
	public Iterator createIterator() {
		
		return new DinerMenuIterator(menuItems);
	}
	
	
	
	
	
}
