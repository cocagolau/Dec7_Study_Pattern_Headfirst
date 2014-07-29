package me.dec7.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
	
	ArrayList<MenuItem> items;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public boolean hasNext() {
		
		if (this.position >= items.size() || items.get(position) == null) {
			
			return false;
			
		} else {
			
			return true;
			
		}
	}

	public Object next() {
		MenuItem menuItem = this.items.get(position++);
		
		return menuItem;
	
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
