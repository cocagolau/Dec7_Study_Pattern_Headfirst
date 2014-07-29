package me.dec7.composite;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

	Hashtable menuItems = new Hashtable();

	public CafeMenu() {
		addItem("베지버고와 에어프라이", "통일빵, 상추, 토마토 첨가된 버거", true, 3.99);
		addItem("오늘의 스프", "샐러드가 곁들여진 스프", false, 3.69);
		addItem("베리또", "통 핀토콩과 살사, 등 곁들여짐", true, 4.29);
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
		
	}
	
//	public Hashtable getItems() {
//		
//		return menuItems;
//	}

	public Iterator createIterator() {
		
		return menuItems.values().iterator();
	}
	
	
}
