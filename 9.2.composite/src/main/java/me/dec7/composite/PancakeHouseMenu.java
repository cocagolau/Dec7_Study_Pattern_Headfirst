package me.dec7.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements IMenu {
	
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<MenuItem>();
		
		addItem("k&B 팬케이크 세트", "스크램블 에드와 토스트를 곁들인 팬케이크", true, 2.99);
		addItem("레귤러 팬케이크 세트", "후라이, 소시지 팬케이크", false, 2.99);
		addItem("블루베리 팬케이크", "블루베리, 시럽 팬케이크", true, 3.29);
		addItem("와플", "와플, 취향에 따른 블루베리, 딸기 얹어라", true, 3.59);
		
		
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		this.menuItems.add(menuItem);
		
	}
	
//	public ArrayList<MenuItem> getMenuItems() {
//		
//		return this.menuItems;
//	}
	
	public Iterator createIterator() {
		
		return this.menuItems.iterator(); 
		
	}
	
	
}
